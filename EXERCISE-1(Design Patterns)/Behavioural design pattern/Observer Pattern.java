// Observable (Subject)
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

// Observer
interface Observer {
    void update(int temperature);
}

// Concrete Observers
class PhoneDisplay implements Observer {
    public void update(int temperature) {
        System.out.println("Phone Display: Temperature is now " + temperature + " degrees.");
    }
}

class WebDisplay implements Observer {
    public void update(int temperature) {
        System.out.println("Web Display: Temperature is now " + temperature + " degrees.");
    }
}

public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        WebDisplay webDisplay = new WebDisplay();

        station.addObserver(phoneDisplay);
        station.addObserver(webDisplay);

        station.setTemperature(25);
        station.setTemperature(30);
    }
}
