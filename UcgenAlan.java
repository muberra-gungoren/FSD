import java.util.Scanner;
public class UcgenAlan {
    public static void main (String[] args) {
        // Değişkenlerimizi oluşturalım
        double a, b, c;


        // Kullanıcıdan verilerimizi alalım
        Scanner input = new Scanner(System.in) ;
        System.out.println("1. kenarı giriniz: ");
        a = input.nextDouble();
        System.out.println("2. kenarı giriniz: ");
        b = input.nextDouble();
        System.out.println("3. kenarı giriniz: ");
        c = input.nextDouble();

        double yariCevre = (a + b + c) / 2;
        double alan = Math.sqrt(yariCevre * (yariCevre - a) * (yariCevre - b) * (yariCevre - c));
        System.out.println(" üçgenin Alanı: "+ alan);


    }
}
