import java.util.Scanner;

public class App {
         /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double armutPrice = 2.14, elmaPrice = 3.67, domatesPrice = 1.11, muzPrice = 0.95, patlicanPrice = 5.00;
        int kg;
        double totalCost = 0.0;

        System.out.print("Armut kaç kilo? : ");
        kg = input.nextInt();
        totalCost += armutPrice * kg;
        System.out.print("Elma kaç kilo? : ");
        kg = input.nextInt();
        totalCost += elmaPrice * kg;
        System.out.print("Domates kaç kilo? : ");
        kg = input.nextInt();
        totalCost += domatesPrice * kg;
        System.out.print("Muz kaç kilo? : ");
        kg = input.nextInt();
        totalCost += muzPrice * kg;
        System.out.print("Patlıcan kaç kilo? : ");
        kg = input.nextInt();
        totalCost += patlicanPrice * kg;

        System.out.println("Toplam Tutar : " + totalCost + " TL");

        input.close();
    }
}
