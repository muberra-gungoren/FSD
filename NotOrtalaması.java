import java.util.Scanner;

public class NotOrtalaması {
    public static void main (String[] args) {
       // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

       // Scanner sınıfımızı tanımladık
        Scanner inp= new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.println("Matematik notunuzu giriniz: ");
        mat= inp.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik= inp.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya= inp.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce= inp.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih= inp.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik= inp.nextInt();

        int toplam = ( mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println(("Ortalamanız : "+ sonuc));


        String durum = (sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
    }
}


