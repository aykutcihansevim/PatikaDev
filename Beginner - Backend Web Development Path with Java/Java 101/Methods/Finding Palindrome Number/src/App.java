import java.util.Scanner;

public class App {
    /** @author Aykut Cihan Sevim - 2022 */

    static String isPalindrome(int number) 
    {
        int temporaryNumber = number, reverseNumber = 0, lastNumber;
        String result;

        while (temporaryNumber > 0 )  
        {
            lastNumber = temporaryNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temporaryNumber /= 10;
        }

        if (number == reverseNumber) 
        {
            result = number + " palindrom sayıdır.";
            return result;
        }
        else 
        {
            result = number + " palindrom sayı değildir.";
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Palindrom kontrolü için sayı giriniz : "); 
        int number = input.nextInt();
        
        System.out.println(isPalindrome(number));
        input.close();
    }
}
