import java.util.Scanner;

public class App {
         /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {

       int mat, fzk, kmy, trc, trh, mzk;

       Scanner input = new Scanner(System.in);

       System.out.print("Matematik Notunuz: ");
       mat = input.nextInt();

       System.out.print("Fizik Notunuz: ");
       fzk = input.nextInt();

       System.out.print("Kimya Notunuz: ");
       kmy = input.nextInt();

       System.out.print("Türkçe Notunuz: ");
       trc = input.nextInt();

       System.out.print("Tarih Notunuz: ");
       trh = input.nextInt();

       System.out.print("Müzik Notunuz: ");
       mzk = input.nextInt();

       int toplam = mat+fzk+kmy+trc+trh+mzk;
       double ortalama = toplam / 6.0;

       System.out.println("Ortalamanız: " + ortalama);

       String gecmeDurumu = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
       System.out.println(gecmeDurumu);

       input.close();
    }
}
