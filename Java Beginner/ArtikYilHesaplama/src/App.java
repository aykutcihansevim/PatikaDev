import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        int year;
        boolean remnant = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                {
                    remnant = true;
                }  
                else
                {
                    remnant = false;
                }   
            }
            else
            {
                remnant = true;
            }
        }
        else
        {
            remnant = false;
        }

       
        
        if(remnant)
        {
            System.out.println(year + " bir artık yıldır !");
        } 
        else
        {
            System.out.println(year + " bir artık yıldır değildir !");
        }

        input.close();
            
    }  
}
