import java.util.Scanner;
public class Kdv{
    public static void Kdv (String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz : ");
        tutar =  input.nextDouble();

        kdvTutar = tutar + kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv'siz Tutar : "+ tutar);
        System.out.println("Kdv Oranı : "+ kdvOran);
        System.out.println("KDV tutarı: "+ kdvTutar);
        System.out.println("Kdv'li Tutarı : "+ kdvliTutar);

        double kdvOrani = (tutar > 1000) ? 0.08 : 0.18;
        double kdvTutari = tutar * kdvOrani;


    }
}
