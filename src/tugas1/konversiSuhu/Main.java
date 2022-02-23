package tugas1.konversiSuhu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celcius;
        int pilihMenu;
        boolean loop = true;

        Scanner input = new Scanner(System.in);

        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius : ");

        celcius = input.nextDouble();
        Konversi konversi = new Konversi(celcius);

        do {
            System.out.println();
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");

            pilihMenu = input.nextInt();

            System.out.println();
            switch (pilihMenu) {
                case 1:
                    System.out.format("Suhu Dalam Celcius\t: %.1f °C\n", konversi.suhuCelcius());
                    System.out.format("Dalam Reamur\t\t: %.1f °R\n", konversi.suhuReamur());
                    System.out.format("Dalam Fahrenheit\t: %.1f °F\n", konversi.suhuFahrenheit());
                    System.out.format("Dalam Kelvin\t\t: %.2f K\n", konversi.suhuKelvin());

                    if (konversi.suhuCelcius() <= 0) {
                        System.out.println("Kondisi Air Beku.");
                    } else if (konversi.suhuCelcius() >= 100) {
                        System.out.println("kondisi Air Mendidih.");
                    } else {
                        System.out.println("Kondisi Air Normal.");
                    }
                    break;

                case 2:
                    System.out.println("Input Data");
                    System.out.println("----------");
                    System.out.print("Suhu Dalam Celcius : ");

                    celcius = input.nextDouble();
                    konversi.editCelcius(celcius);
                    break;

                case 3:
                    loop = false;
                    input.close();
                    break;

                default:
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi yang benar!");
                    break;
            }
        } while (loop);
    }
}
