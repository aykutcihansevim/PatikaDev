import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int num, dividingNumbers = 0;

        System.out.print("Bir sayı giriniz : ");
        num = input.nextInt();

        for (int i = 1; i < num; i++) 
            {
                if (num % i == 0) 
                {
                    dividingNumbers += i;       
                }
            }

            if (dividingNumbers == num) 
            {
                System.out.println(num + " Mükemmel sayıdır.");
            } 
            else 
            {
                System.out.println(num + " Mükemmel sayı değildir.");
            }
   
        input.close();
    
}}
