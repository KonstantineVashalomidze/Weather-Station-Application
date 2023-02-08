public interface Subject {
    void registerObserver(Observer concrete_observer);
    void removeObserver(Observer concrete_observer);
    void notifyObservers();
}
