import java.util.Scanner;

public class App {
         /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        double fiyat;
        double kdvOrani;
        double kdvMiktari;
        double kdvliFiyat;

        System.out.println("Fiyat bilgisi giriniz: ");
        fiyat = input.nextDouble();

        kdvOrani = (fiyat <= 1000) ? 0.18 : 0.08;
        kdvMiktari = fiyat * kdvOrani;
        kdvliFiyat = fiyat + kdvMiktari;
        
        System.out.println("Ürün Fiyatı: " + fiyat+" TL" + "\n" + "Kdv Dahil Tutar: " + kdvliFiyat+" TL" + "\n" + "Kdv Tutarı: " + kdvMiktari+ " TL" + "\n" + "Kdv Oranı: " + kdvOrani);

        input.close();


    }
}
