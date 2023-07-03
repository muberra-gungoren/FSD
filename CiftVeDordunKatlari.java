import java.util.Scanner;


public class CiftVeDordunKatlari {
    public static void main(String[] args) {


                int i,counter=0;
                Scanner input = new Scanner(System.in);
                do {
                    System.out.print("Sayiyi Giriniz: ");
                    i = input.nextInt();

                    if (i % 4 == 0){
                        counter += i;
                    }

                } while (i % 2 == 0);
                System.out.println("Sonuc: " + counter);
            }
        }


