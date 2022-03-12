import java.util.Random;
import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        
        // Random rnd = new Random();
        // int temp = rnd.nextInt(high-low) + low;
        // int low = -5;
        // int high = 35;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz : ");
        int temp = input.nextInt();

        String etkinlik;

        if(temp < 5)
        {
            etkinlik = "Kayak yapmaya gidebilirsiniz.";
        }
        else if(temp >= 5 & temp < 15)
        {
            etkinlik = "Sinemaya gidebilirsiniz.";
        }
        else if(temp >= 15 & temp <= 25)
        {
            etkinlik = "Pikniğe gidebilirsiniz.";
        }
        else
        {
            etkinlik = "Yüzmeye gidebilirsiniz.";
        }

        System.out.print("Hava sıcaklığı "+ temp + " derece. " + etkinlik);

        input.close();
    }
}
