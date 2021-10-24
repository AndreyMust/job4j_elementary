package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery batteryOne = new Battery(45);
        Battery batteryTwo = new Battery(35);
        System.out.println("Заряд батареи 1: " + batteryOne.load);
        System.out.println("Заряд батареи 2: " + batteryTwo.load);
        System.out.println("Идет Перезарядка...");
        batteryOne.exchange(batteryTwo);
        System.out.println("Перезарядка Завершена.");
        System.out.println("Заряд батареи 1: " + batteryOne.load);
        System.out.println("Заряд батареи 2: " + batteryTwo.load);
    }
}
