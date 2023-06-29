
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int year;

        System.out.print("Yılı Giriniz: ");
        year = inp.nextInt();

        if (!(year%400 == 0)){
            if (!(year%100 == 0)){
                if(year%4 == 0){
                    System.out.println(" Bir Artık yıldır! ");
                }
                else
                    System.out.println(" Bir Artık Yıl Değildir! ");
            }
            else
                System.out.println(" Bir Artık Yıl Değildir! ");
        }
        else
            System.out.println("Bir Artık Yıldır! ");



    }
}
