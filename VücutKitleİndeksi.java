import java.util.Scanner;

public class VücutKitleİndeksi {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner input = new Scanner(System.in);
        System.out.println(input);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double Boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu (kg) giriniz : ");
        double Kilo = input.nextDouble();

        double Kitleİndeksi = (Kilo  / Boy * Boy);

        System.out.println("Vücut kitle indeksiniz : " + Kitleİndeksi);



    }
}
