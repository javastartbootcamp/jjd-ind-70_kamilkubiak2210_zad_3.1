package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("Asus", "VG248QG", 24, 165);
        Monitor monitor2 = new Monitor("Acer", "V206HQL", 19.5, 60);
        System.out.println("Monitor: " + monitor1.producer + " " + monitor1.model + ", przekątna ekranu: " + monitor1.screenDiagonal
                + "\", częstotliwość odświeżania ekranu: " + monitor1.refreshRate + "Hz");
        System.out.println("Monitor: " + monitor2.producer + " " + monitor2.model + ", przekątna ekranu: " + monitor2.screenDiagonal
                + "\", częstotliwość odświeżania ekranu: " + monitor2.refreshRate + "Hz");

    }
}
