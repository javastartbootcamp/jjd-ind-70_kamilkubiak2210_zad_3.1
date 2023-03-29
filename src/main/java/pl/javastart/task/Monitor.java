package pl.javastart.task;

public class Monitor {
    public String producer;
    public String model;
    public double screenDiagonal;
    public double refreshRate;

    public Monitor(String producer, String model, double screenDiagonal, double refreshRate) {
        this.producer = producer;
        this.model = model;
        this.screenDiagonal = screenDiagonal;
        this.refreshRate = refreshRate;
    }
}
