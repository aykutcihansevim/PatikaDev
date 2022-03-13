import java.util.Scanner;

public class App {
    /** @author Aykut Cihan Sevim - 2022 */

    static int FindFibonacciNumber(int nDigits) 
    {
        if(nDigits == 1 || nDigits == 2)
        {
            return 1;
        }
        return FindFibonacciNumber(nDigits-1) + FindFibonacciNumber(nDigits-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Serisi'nin kaçıncı sırasındaki sayı bulunacak :"); 
        int nDigits = input.nextInt();
        
        System.out.println("Fibonacci Serisi " + nDigits + ". Sıradaki Sayı : " + FindFibonacciNumber(nDigits));
        input.close();
    }
}
