import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */

        private static void PrintCalculatorMenu()
        {
            System.out.println("\nYapılabilecek İşlemler");
            System.out.println("\n1. Toplama İşlemi");
            System.out.println("2. Çıkarma İşlemi");
            System.out.println("3. Çarpma İşlemi");
            System.out.println("4. Bölme işlemi");
            System.out.println("5. Üslü Sayı Hesaplama");
            System.out.println("6. Faktoriyel Hesaplama");
            System.out.println("7. Mod Alma");
            System.out.println("8. Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("0. Çıkış");
        }
    
        static void Addition(int a, int b) 
        {
            System.out.println("Sonuç : " + (a + b));
        }
    
        static void Subtraction(int a, int b) {
            System.out.println("Sonuç : " + (a - b));
        }
    
        static void Multiplication(int a, int b) {
            if(a == 0 || b == 0)
            {
                System.out.println("Bir sayının 0 ile çarpımı daima 0'dır.");
            }
            else
            {
                System.out.println("Sonuç : " + (a * b));
            }
            
        }
    
        static void Dividing(int a, int b) {
            if(b == 0)
            {
                System.out.println("Hiçbir sayı 0'a bölünemez!");
            }
            else if(a == 0)
            {
                System.out.println("0'ın herhangi bir sayıya bölümü daima 0'dır.");
            }
            else if(a == 0 && b == 0)
            {
                System.out.println("Tanımsız!");
            }
            else 
            {
                System.out.println("Sonuç : " + (a / b));
            }
            
        }
    
        static void ExponentialCalculation(int a, int b) {
            int result = 1;
            for(int n = 0; n<b; n++) 
            {
                result *= a;
            }

            System.out.println("Sonuç : " + result);
        }
    
        static void FactorialCalculation(int a) {
            int result = 1;
            for(int n = a; n>1; n--) 
            {
                result *= n;
            }
            System.out.println("Sonuç : " + result);
        }
    
        static void ModeRetrieval(int a, int b) {
            System.out.println("Sonuç : "+ (a % b));
        }
    
        static void RectangleAreaAndCircumferenceCalculation(int a, int b) {
            System.out.println("Alan : "+(a * b) + " Çevre : " + (2*(a + b)));
        }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int selection, a, b;

        do
        {
            PrintCalculatorMenu();
            System.out.print("\nYapmak istediğiniz işlemi seçiniz : ");
            selection = input.nextInt();

            switch (selection) {
                case 1:
                    System.out.print("1. Sayı: ");
                    a = input.nextInt();
                    System.out.print("2. Sayı: ");
                    b = input.nextInt();
                    Addition(a,b);
                    break;
                case 2 :
                    System.out.print("1. Sayı: ");
                    a = input.nextInt();
                    System.out.print("2. Sayı: ");
                    b = input.nextInt();
                    Subtraction(a,b);
                    break;
                case 3:
                    System.out.print("1. Sayı: ");
                    a = input.nextInt();
                    System.out.print("2. Sayı: ");
                    b = input.nextInt();
                    Multiplication(a,b);
                    break;

                case 4:
                    System.out.print("Bölünen Sayı : ");
                    a = input.nextInt();
                    System.out.print("Bölen Sayı : ");
                    b = input.nextInt();
                    Dividing(a,b);
                    break;
                case 5:
                    System.out.print("Taban değeri giriniz : ");
                    a = input.nextInt();
                    System.out.print("Üs değeri giriniz : ");
                    b = input.nextInt();
                    ExponentialCalculation(a,b);
                    break;

                case 6:
                    System.out.print("Faktöriyeli hesaplanacak olan sayıyı giriniz : ");
                    a = input.nextInt();
                    FactorialCalculation(a);
                    break;

                case 7:
                    System.out.print("Büyük sayıyı giriniz : ");
                    a = input.nextInt();
                    System.out.print("Küçük sayıyı giriniz : ");
                    b = input.nextInt();
                    ModeRetrieval(a,b);
                    break;
                case 8:
                    System.out.print("Kısa kenarı giriniz : ");
                    a = input.nextInt();
                    System.out.print("Uzun kenarı giriniz : ");
                    b = input.nextInt();
                    RectangleAreaAndCircumferenceCalculation(a,b);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
                }
    
             
        }while (selection != 0);
        
        System.exit(0);
        input.close();
    }


}


