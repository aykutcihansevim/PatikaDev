import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int biggestNumber = 0, smallestNumber = 0, nCount;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        nCount = input.nextInt();

        for(int i = 1; i <= nCount; i++)
        {
            System.out.print(i + ". Sayıyı Giriniz: ");
            int num = input.nextInt();

            if(num > biggestNumber)
            {
                if(smallestNumber == 0)
                {
                    smallestNumber = num;
                }
                biggestNumber = num;
            }
            else if(num < smallestNumber)
            {
                if( biggestNumber == 0)
                {
                    biggestNumber = num;
                }
                smallestNumber = num;
            }
        }

        System.out.println("\nEn Büyük Sayı: " + biggestNumber +  "\nEn Küçük Sayı: " + smallestNumber );
        input.close();
    }
}
