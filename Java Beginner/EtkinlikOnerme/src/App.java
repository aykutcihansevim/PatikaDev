import java.util.Random;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        
        Random rnd = new Random();

        int low = -5;
        int high = 35;
        int temp = rnd.nextInt(high-low) + low;
        String etkinlik;

        if(temp < 5)
        {

            etkinlik = "Kayak yapmaya gidebilirsiniz.";
        }
        else if(temp >= 5 & temp < 15)
        {
            etkinlik = "Sinemaya gidebilirsiniz.";
        }
        else if(temp >= 15 & temp < 25)
        {
            etkinlik = "Pikniğe gidebilirsiniz.";
        }
        else
        {
            etkinlik = "Yüzmeye gidebilirsiniz.";
        }

        System.out.print("Hava sıcaklığı "+ temp + " derece. " + etkinlik);

    }
}
