import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args){
        int birthdate;
        String zodiac = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        birthdate = input.nextInt();

        while(birthdate >= Math.pow(2, 31) || birthdate < 1)
        {
            System.out.println("Hatalı Veri Girdiniz !");
            System.out.print("Doğum Yılınızı Giriniz : ");
            birthdate = input.nextInt();
        }

        zodiac = calculateChineseZodiac(birthdate, zodiac);
        
        System.out.print("Çin Zodyağı Burcunuz : "+ zodiac);
        input.close();
    }


    private static String calculateChineseZodiac(int birthdate, String zodiac){
        
        switch(birthdate % 12){
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek"; 
                break;           
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;

        }
       
        return zodiac;
       
    }


}

