
// Product Interface
interface Document {
    void open();
}

// Concrete Products
class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document...");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document...");
    }
}

// Creator
abstract class DocumentFactory {
    public abstract Document createDocument();
}

// Concrete Creators
class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

public class FactoryMethodPatternDemo {
    public static void main(String[] args) {
        DocumentFactory factory = new WordDocumentFactory();
        Document doc = factory.createDocument();
        doc.open();

        factory = new PdfDocumentFactory();
        doc = factory.createDocument();
        doc.open();
    }
}
