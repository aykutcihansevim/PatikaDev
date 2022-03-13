import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int a;
        double harmonicSeries = 0.0;

        System.out.print("Sayı Giriniz : ");
        a = input.nextInt();

        for (double i = 1; i<=a; i++)
        {
            harmonicSeries += (1/i);
        }

        System.out.print(a + " Sayısının Harmonik Serisi : " + harmonicSeries);
        input.close();
    }
}
