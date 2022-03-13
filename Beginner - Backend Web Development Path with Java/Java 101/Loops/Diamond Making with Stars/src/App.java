public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {
        int n = 5;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= (n-i); j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= ((2*i)+1); k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i = (n-1); i > 0; i--)
        {
            for(int j = 0; j <= ((n-i)+1); j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= ((2*i)-1); k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
}
