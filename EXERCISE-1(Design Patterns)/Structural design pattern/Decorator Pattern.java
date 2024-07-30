// Component Interface
interface GUIComponent {
    void draw();
}

// Concrete Component
class TextBox implements GUIComponent {
    public void draw() {
        System.out.println("Drawing TextBox");
    }
}

// Decorator
abstract class ComponentDecorator implements GUIComponent {
    protected GUIComponent component;

    public ComponentDecorator(GUIComponent component) {
        this.component = component;
    }

    public void draw() {
        component.draw();
    }
}

// Concrete Decorators
class BorderDecorator extends ComponentDecorator {
    public BorderDecorator(GUIComponent component) {
        super(component);
    }

    public void draw() {
        super.draw();
        System.out.println("Adding Border");
    }
}

class ScrollDecorator extends ComponentDecorator {
    public ScrollDecorator(GUIComponent component) {
        super(component);
    }

    public void draw() {
        super.draw();
        System.out.println("Adding Scroll");
    }
}

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        GUIComponent textBox = new TextBox();
        GUIComponent decoratedTextBox = new BorderDecorator(new ScrollDecorator(textBox));

        decoratedTextBox.draw();
    }
}
