public class App {
    /** @author Aykut Cihan Sevim - 2022 */
public static void main(String[] args) throws Exception {
    
        int begin = 2 , finish = 100 ;
        System.out.print("1 - 100 Arasındaki Asal Sayılar: ");
        for (int i = begin; i <= finish; i++)
        {
            boolean primeNumber = true;

            for (int j = 2; j <= (i/2); j++){
                if (i % j == 0) 
                {
                    primeNumber = false;
                    break;
                }
            }

            if (primeNumber)
            {
                System.out.print(i + " ");
            }
        }
    }
}