import java.util.Scanner;

public class App {
         /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {

       int mat, fzk, kmy, trc, mzk;

       Scanner input = new Scanner(System.in);

       System.out.print("Matematik Notunuz: ");
       mat = input.nextInt();

       System.out.print("Fizik Notunuz: ");
       fzk = input.nextInt();

       System.out.print("Kimya Notunuz: ");
       kmy = input.nextInt();

       System.out.print("Türkçe Notunuz: ");
       trc = input.nextInt();

       System.out.print("Müzik Notunuz: ");
       mzk = input.nextInt();

       double toplam = 0;
       double ortalama;

       if(mat >= 0 & mat <= 100)
       {
            if(fzk >= 0 & fzk <= 100)
            {
                if(kmy >= 0 & kmy <= 100)
                {
                    if(trc >= 0 & trc <= 100)
                    {
                        if(mzk >= 0 & mzk <= 100)
                        {
                            toplam = mat + fzk + kmy + trc + mzk;
                        }
                        
                    }
                   
                }
                
            }
        }

        else if(fzk >= 0 & fzk <= 100)
        {
            if(kmy >= 0 & kmy <= 100)
                {
                    if(trc >= 0 & trc <= 100)
                    {
                        if(mzk >= 0 & mzk <= 100)
                        {
                            toplam = fzk + kmy + trc + mzk;
                        }
                    } 
                }
        }

        else if(kmy >= 0 & kmy <= 100)
        {
            if(trc >= 0 & trc <= 100)
            {
                if(mzk >= 0 & mzk <= 100)
                {
                    toplam = kmy + trc + mzk;
                }
            } 
        }

        else if(trc >= 0 & trc <= 100)
        {
            if(mzk >= 0 & mzk <= 100)
            {
                toplam = trc + mzk;
            }
        }

        else if(mzk >= 0 & mzk <= 100)
        {
            toplam = mzk;
        }

        else
        {
            toplam = 0;

        }

       


       ortalama = toplam / 5.0;
       
       

       System.out.println("Ortalamanız: " + ortalama);

       String gecmeDurumu = (ortalama > 55) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
       System.out.println(gecmeDurumu);

       input.close();
    }
}
