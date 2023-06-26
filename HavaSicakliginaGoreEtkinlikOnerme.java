/*Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/



import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık derecesini girin: ");
        int temperature = scanner.nextInt();

        if (temperature < 5) {
            System.out.println("Kayak yapmayı öneririm.");
        } else if (temperature >= 5 && temperature < 10) {
            System.out.println("Sinemaya gitmeyi öneririm.");
        } else if (temperature >= 10 && temperature < 15) {
            System.out.println("Sinemaya gitmeyi öneririm.");
            System.out.println("Piknik yapmayı da öneririm.");
        } else if (temperature >= 15 && temperature < 25) {
            System.out.println("Piknik yapmayı öneririm.");
        } else {
            System.out.println("Yüzmeye gitmeyi öneririm.");
        }

        scanner.close();
    }
}


