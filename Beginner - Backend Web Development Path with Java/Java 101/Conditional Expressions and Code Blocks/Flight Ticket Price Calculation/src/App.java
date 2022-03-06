import java.util.Scanner;


public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        
        int distance, age;
        byte tripType;
        double totalCost = 0, discountedCost = 0, discountAmount = 0;
        double pricePerKm = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tripType = input.nextByte();


        while(tripType < 1 || tripType > 2 || age < 1 || distance < 1)
        {
            System.out.println("Hatalı Veri Girdiniz !");
            System.out.print("Mesafeyi km türünden giriniz : ");
            distance = input.nextInt();
            System.out.print("Yaşınızı giriniz : ");
            age = input.nextInt();
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            tripType = input.nextByte();
        }


        totalCost = distance * pricePerKm * tripType;
        totalCost = discountCheck(age, totalCost, discountedCost, discountAmount, tripType);
        

        System.out.print("Toplam Tutar = " + totalCost + " TL");
        input.close();
    }

    private static double discountCheck(double age, double totalCost, double discountedCost, double discountAmount, byte tripType){
        
        if(tripType == 1)
        {
            if(age < 12)
            {
                discountAmount = (totalCost / 2);
                totalCost = totalCost - discountAmount;
                discountedCost = totalCost;
                totalCost = discountedCost;
            }
            else if(age >= 12 & age <= 24)
            {
                discountAmount = (totalCost * 0.10);
                totalCost = totalCost - discountAmount;
                discountedCost = totalCost;
                totalCost = discountedCost;
            }
            else if(age > 65)
            {
                discountAmount = (totalCost * 0.30);
                totalCost = totalCost - discountAmount;
                discountedCost = totalCost;
                totalCost = discountedCost;
            }
            else
            {
                totalCost = totalCost;
            }
        }
        else
        {
            if(age < 12)
            {
                discountAmount = (totalCost / 2);
                totalCost = totalCost - discountAmount;
                discountedCost = totalCost - (totalCost * 0.20) ;
                totalCost = discountedCost;
            }
            else if(age >= 12 & age <= 24)
            {
                discountAmount = (totalCost * 0.10);
                totalCost = totalCost - discountAmount;
                discountedCost = totalCost - (totalCost * 0.20) ;
                totalCost = discountedCost;
            }
            else if(age > 65)
            {
                discountAmount = (totalCost * 0.30);
                totalCost = totalCost - discountAmount;
                discountedCost = totalCost - (totalCost * 0.20) ;
                totalCost = discountedCost;
            }
            else
            {
                totalCost = totalCost - (totalCost * 0.20);
            }
        }

        return totalCost;

       
    }
}
