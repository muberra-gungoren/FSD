import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double ArmutFiyati = 2.14;
        double ElmaFiyati = 3.67;
        double DomatesFiyati = 1.11;
        double MuzFiyati = 0.95;
        double PatlicanFiyati = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.println(input);

        System.out.println("Armut Kaç Kilo? : ");
        double armutKilo = input.nextDouble();

        System.out.println("Elma Kaç Kilo? : ");
        double elmaKilo = input.nextDouble();

        System.out.println("Domates Kaç Kilo? : ");
        double domatesKilo = input.nextDouble();

        System.out.println("Muz Kaç Kilo? : ");
        double muzKilo = input.nextDouble();

        System.out.println("Patlıcan Kaç Kilo? : ");
        double patlicanKilo = input.nextDouble();


        double toplamTutar = ((ArmutFiyati * armutKilo) + (ElmaFiyati * elmaKilo) + (DomatesFiyati * domatesKilo)+ (MuzFiyati * muzKilo) + (PatlicanFiyati * patlicanKilo));
        System.out.println(toplamTutar);


        System.out.println("Toplam tutar : "+ toplamTutar);





    }
}
