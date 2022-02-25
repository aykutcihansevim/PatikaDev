import java.util.Scanner;

public class App {
         /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        byte choice;

        System.out.print("İlk Sayıyı Giriniz : ");
        number1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        number2 = input.nextInt();

        System.out.println("1 - Toplama \n2 - Çıkarma \n3 - Çarpma \n4 - Bölme");
        System.out.print("Seçiminiz : ");
        choice = input.nextByte();
        if(choice <= 0 || choice > 4)
        {
            System.out.println("Lütfen geçerli bir seçim yapınız.");
            System.out.print("Seçiminiz : ");
            choice = input.nextByte();   
        }

        System.out.print("\n\n");

        switch (choice) {
            case 1:
                System.out.println("Toplama İşlemi Sonucu : " + (number1+number2));
                break;
            case 2:
            System.out.println("Çıkarma İşlemi Sonucu : " + (number1-number2));
                break;
            case 3:
            System.out.println("Çarpma İşlemi Sonucu : " + (number1*number2));
                break;
            case 4:
                if(choice == 4 && number2 != 0)
                {
                    if(number2 > number1)
                    {
                        double n1 = number1;
                        double n2 = number2;
                        System.out.println("Bölme İşlemi Sonucu : " + (n1/n2));
                        break;
                    }
                    else
                    {
                        System.out.println("Bölme İşlemi Sonucu : " + (number1/number2));
                        break;
                    }
                    
                }
                else{
                    System.out.println("Herhangi bir sayı 0'a bölünemez.");
                    break;
                }
            default:
            System.out.println("Hatalı seçim yaptınız. Tekrar deneyiniz.");
                
        }
    }
}
