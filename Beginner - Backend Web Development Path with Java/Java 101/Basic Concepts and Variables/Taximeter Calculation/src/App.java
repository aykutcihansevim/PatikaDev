import java.util.Scanner;

public class App {
         /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double kmPrice = 2.20;
        double startPrice = 10.0;
        int km;
        double totalCost; 

        System.out.print("Kaç kilometre yol gittiniz? : ");
        km = input.nextInt();
        totalCost = (km*kmPrice) + startPrice;

        totalCost = (totalCost < 20) ? 20 : totalCost;

        System.out.println("Toplam Ücret: " + totalCost + "TL");

        input.close();

    }
}
