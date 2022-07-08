package de.rhistel;

public class Main {

    public static void main(String[] args) {
        System.out.println("HelloWorld");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
