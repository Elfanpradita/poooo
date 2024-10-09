package PraktikumPBO.Sesi4;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        int faktorial = 1;
        int i = angka;

        // Looping while untuk menghitung faktorial
        while (i > 0) {
            faktorial *= i; // Kalikan faktorial dengan nilai saat ini
            i--; // Kurangi nilai
        }

        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);

        // Menutup scanner
        input.close();
    }
}