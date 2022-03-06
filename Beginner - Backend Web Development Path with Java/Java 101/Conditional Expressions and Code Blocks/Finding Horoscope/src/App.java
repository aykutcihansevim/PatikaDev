import java.util.Scanner;
 

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğdunuz ay(1-12) : ");
        month = input.nextInt();
        System.out.print("Doğdunuz gün(1-31) : ");
        day = input.nextInt();
       
        while(month < 1 || month > 12 || day < 1 || day > 31)
        {
            System.out.println("Geçersiz bir tarih girdiniz. Lütfen doğum tarihinizi tekrar giriniz." + "\n");
            System.out.print("Doğdunuz ay(1-12) : ");
            month = input.nextInt();
            System.out.print("Doğdunuz gün(1-31) : ");
            day = input.nextInt();
        }

        // Koç Burcu : 21 Mart - 20 Nisan
        if(month == 3)
        {
            if(day >= 21)
            System.out.print("Burcunuz : KOÇ");
            else
            System.out.print("Burcunuz : BALIK");
        }
        // Boğa Burcu : 21 Nisan - 21 Mayıs
        else if(month == 4)
        {
            if(day >= 21)
            System.out.print("Burcunuz : BOĞA");
            else
            System.out.print("Burcunuz : KOÇ");
        }
        // İkizler Burcu : 22 Mayıs - 22 Haziran
        else if(month == 5)
        {
            if(day >= 22)
            System.out.print("Burcunuz : İKİZLER");
            else
            System.out.print("Burcunuz : BOĞA");
        }
        // Yengeç Burcu : 23 Haziran - 22 Temmuz
        else if(month == 6)
        {
            if(day >= 23)
            System.out.print("Burcunuz : YENGEÇ");
            else
            System.out.print("Burcunuz : İKİZLER");
        }
        // Aslan Burcu : 23 Temmuz - 22 Ağustos
        else if(month == 7)
        {
            if(day >= 23)
            System.out.print("Burcunuz : ASLAN");
            else
            System.out.print("Burcunuz : YENGEÇ");
        } 
        // Başak Burcu : 23 Ağustos - 22 Eylül
        else if(month == 8)
        {
            if(day >= 23)
            System.out.print("Burcunuz : BAŞAK");
            else
            System.out.print("Burcunuz : ASLAN");
        } 
        // Terazi Burcu : 23 Eylül - 22 Ekim
        else if(month == 9)
        {
            if(day >= 23)
            System.out.print("Burcunuz : TERAZİ");
            else
            System.out.print("Burcunuz : BAŞAK");
        }   
        // Akrep Burcu : 23 Ekim - 21 Kasım
        else if(month == 10)
        {
            if(day >= 23)
            System.out.print("Burcunuz : AKREP");
            else
            System.out.print("Burcunuz : TERAZİ");
        } 
        // Yay Burcu : 22 Kasım - 21 Aralık
        else if(month == 11)
        {
            if(day >= 22)
            System.out.print("Burcunuz : YAY");
            else
            System.out.print("Burcunuz : AKREP");
        }  
        // Oğlak Burcu : 22 Aralık - 21 Ocak
        else if(month == 12)
        {
            if(day >= 22)
            System.out.print("Burcunuz : OĞLAK");
            else
            System.out.print("Burcunuz : YAY");
        }
        // Kova Burcu : 22 Ocak - 19 Şubat
        else if(month == 1)
        {
            if(day >= 22)
            System.out.print("Burcunuz : KOVA");
            else
            System.out.print("Burcunuz : OĞLAK");
        }
        // Balık Burcu : 20 Şubat - 20 Mart
        else if(month == 2)
        {
            if(day >= 20)
            System.out.print("Burcunuz : BALIK");
            else
            System.out.print("Burcunuz : KOVA");
        }

        input.close();
    }
}
