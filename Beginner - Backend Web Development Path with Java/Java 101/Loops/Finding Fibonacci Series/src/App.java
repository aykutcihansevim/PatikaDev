import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int nCount;
        int a = 0, b = 1, c = 0;

        System.out.print("Eleman Sayısını Giriniz: ");
        nCount = input.nextInt();

        System.out.print(nCount + " Elemanlı Fibonacci Serisi : ");

        for(int i = 1; i <= nCount;i++){
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
        
        input.close();
    }
}
