import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        
        int c;
        int divisibleTotal = 0;
        int divisibleCount = 0;
        int divisibleAverage;

        Scanner input = new Scanner(System.in);


        System.out.print("Sayı giriniz : ");
        c = input.nextInt();

        for(int i = 0; i <= c; i++ )
        {
            if(i > 0)
            {
                if(i % 3 == 0 && i % 4 == 0)
                {
                    divisibleTotal += i;
                    divisibleCount += 1;
                }
            }
        }

        divisibleAverage = (divisibleTotal / divisibleCount);
        System.out.print(c +"Dahil olmak üzere bu değere kadar, üçe ve dörde tam olarak bölünebilen sayıların ortalaması : ");
        System.out.println(divisibleAverage);

        input.close();
    }
}
