import java.util.Scanner;

public class DaireDilimiAlan {
    public static void main(String[] args) {
         double r, a, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println(input);

        System.out.println("yarıçapı (r) girin: ");
        //r = input.nextDouble();
        double yaricap = input.nextDouble();

        System.out.println("merkez açısını (a) girin: ");
        //a = input.nextDouble();
        double merkezacisi = input.nextDouble();

        double Pi = 3.14;
        double alan = ( Pi * (yaricap * yaricap) * merkezacisi ) / 360;

        System.out.println(" Daire diliminin alanı: "+ alan);








    }
}
