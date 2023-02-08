import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer concrete_observer) {
        observers.add(concrete_observer);
    }

    @Override
    public void removeObserver(Observer concrete_observer) {
        observers.remove(concrete_observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }



}
