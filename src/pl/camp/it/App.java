package pl.camp.it;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class App {
    public static void main(String[] args) throws InterruptedException {
        /*try(Scanner scanner = new Scanner(System.in)) {
            int[] a = new int[4];
            //a[10] = 5;
        } catch (ArrayIndexOutOfBoundsException mojWyjatek) {
            System.err.println("Nie udało się i koniec !!");
        } finally {
            System.out.println("dzieje się zawsze !!");
        }*/

        metoda();
    }

    public static void metoda() throws InterruptedException {
        metoda2();
    }

    public static void metoda2() throws InterruptedException {
        metoda3();
    }

    public static void metoda3() throws InterruptedException {
        Thread.sleep(2000);
    }
}
