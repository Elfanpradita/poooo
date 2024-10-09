package PraktikumPBO.Sesi4;

import java.util.Scanner;

// Program SWITCH
public class LampuLalulintas {
    public static void main(String[] args) {
        // Membuat Variabel dan Scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        // Mengambil Input
        System.out.print("Inputkan Nama Warna: ");
        lampu = scan.nextLine();

        switch (lampu.toLowerCase()) { // Menambahkan toLowerCase untuk menangani input yang tidak peka terhadap huruf besar/kecil
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, Silakan Jalan!");
                break;
            default:
                System.out.println("Warna Lampu Salah");
        }

        // Menutup scanner
        scan.close();
    }
}