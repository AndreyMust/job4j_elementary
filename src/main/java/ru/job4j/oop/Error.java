package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public  Error() {
    }

    public  Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + this.active);
        System.out.println("Status: " + this.status);
        System.out.println("Message: " + this.message);
    }

    public static void main(String[] args) {
        Error err = new Error();
        err.printInfo();
        Error err1 = new Error(true, 1, "Name not found");
        err1.printInfo();
        Error err2 = new Error(false, 222, "This name not found");
        err1.printInfo();
        Error err3 = new Error(true, 33, "The name does not exist ");
        err1.printInfo();

    }
}
