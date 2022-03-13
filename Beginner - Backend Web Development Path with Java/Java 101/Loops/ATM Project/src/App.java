import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int remainingTrial = 3, balance = 0, selection, amount;
        while (remainingTrial > 0) 
        {
            System.out.print("Kullanıcı Adı : ");
            userName = input.nextLine();
            System.out.print("Şifre : ");
            password = input.nextLine();

            switch (userName) {
                case "acs":
                    switch (password) {
                        case "2022":
                            System.out.println("Merhaba " + userName.toUpperCase() + " Patika.dev Bankasına Hoşgeldiniz! " );
                            do {
                                PrintBankMenu();
                                System.out.print("\nYapmak istediğiniz işlemi seçiniz : ");
                                selection = input.nextInt();

                                while(selection < 1 || selection > 4)
                                {
                                    PrintBankMenu();
                                    System.out.print("\nYapmak istediğiniz işlemi seçiniz : ");
                                    selection = input.nextInt();
                                }

                                switch (selection) {
                                    case 1:
                                        System.out.print("\nYatırmak İstediğiniz Miktar : ");
                                        amount = input.nextInt();
                                        balance += amount;

                                        System.out.println("Para yatırma işleminiz başarı ile gerçekleşmiştir.");
                                        System.out.println("Yeni Bakiyeniz : " + balance);
                                        break;

                                    case 2:
                                        System.out.print("\nÇekmek İstediğiniz Miktar : ");
                                        amount = input.nextInt();
                        
                                        while(amount > balance)
                                        {
                                            System.out.println("Bakiye yetersiz. Lütfen tekrar miktar giriniz.");
                                            System.out.println("Çekmek İstediğiniz Miktar : ");
                                            amount = input.nextInt();
                                        }
                        
                                        balance -= amount;
                        
                                        System.out.println("Para çekme işleminiz başarı ile gerçekleşmiştir.");
                                        System.out.println("Yeni Bakiyeniz : " + balance);
                                        break;

                                    case 3:
                                        System.out.println("\nBakiyeniz : " + balance);
                                        break;

                                    case 4:
                                        System.out.println("\nTekrar görüşmek üzere " + userName.toUpperCase());
                                        System.exit(0);
                                        break;

                                }
                            } while (selection != 4);
                            System.exit(0);
                            
                        default:
                            remainingTrial--;
                            System.out.println("\nHatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                            System.out.println("Kalan hakkınız :" + remainingTrial);
                            break;
                    }
                    break;
                default:
                    remainingTrial--;
                    System.out.println("\nHatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız :" + remainingTrial);
            }
            switch (remainingTrial) {

                case 0:
                    System.out.println("\n"+"Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    System.exit(0);
                    break;
            }
         
        }
        input.close();
    }

    private static void PrintBankMenu()
    {
        System.out.println("\nYapılabilecek İşlemler");
        System.out.println("\n1. Para Yatırma");
        System.out.println("2. Para Çekme");
        System.out.println("3. Bakiye Sorgulama");
        System.out.println("4. Çıkış");
    }
}