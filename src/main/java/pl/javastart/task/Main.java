package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.producer = "Asus";
        monitor1.model = "VG248QG";
        monitor1.screenDiagonal = 24;
        monitor1.refreshRate = 165;
        Monitor monitor2 = new Monitor();
        monitor2.producer = "Acer";
        monitor2.model = "V206HQL";
        monitor2.screenDiagonal = 19.5;
        monitor2.refreshRate = 60;
        System.out.println("Monitor: " + monitor1.producer + " " + monitor1.model + ", przekątna ekranu: " + monitor1.screenDiagonal
                + "\", częstotliwość odświeżania ekranu: " + monitor1.refreshRate + "Hz");
        System.out.println("Monitor: " + monitor2.producer + " " + monitor2.model + ", przekątna ekranu: " + monitor2.screenDiagonal
                + "\", częstotliwość odświeżania ekranu: " + monitor2.refreshRate + "Hz");

    }
}
