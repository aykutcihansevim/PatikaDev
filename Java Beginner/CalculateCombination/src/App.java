import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        long result;

        System.out.print("İlk kümenin eleman sayısını giriniz : ");
        int n = input.nextInt();
        int nFac = 1;

        System.out.print("İkinci kümenin eleman sayısını giriniz : ");
        int r = input.nextInt();
        int rFac = 1;

        int nr = n-r;
        int nrFac = 1;

        for(int i =1; i<=n; i++)
        {
            nFac = nFac * i;
        }

        for(int i =1; i<=r; i++)
        {
            rFac = rFac * i;
        }

        for(int i =1; i<=nr; i++)
        {
            nrFac = nrFac * i;
        }

        result = nFac / (rFac * nrFac);

        System.out.print("C(n,r) = " + result);
        input.close();
    }
}
