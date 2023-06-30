package watch;

public interface Subject {
    void watch(Observer obs);
    void detach(Observer obs);

    void notify(String message);
}
