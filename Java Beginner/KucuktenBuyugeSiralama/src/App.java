import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberLimit, maxRange;

        System.out.print("Dizide kaç adet sayı bulunacak? " + "Yanıtınız :");
        numberLimit = input.nextInt();
        System.out.print("Dizide en büyük sayı kaç olabilir? " + "Yanıtınız :");
        maxRange = input.nextInt();

        while(maxRange < numberLimit)
        {
            System.out.println("En büyük sayı, dizide bulunacak sayı adetinden küçük olamaz. Lütfen geçerli değerler giriniz."); 
            System.out.println("Dizide kaç adet sayı bulunacak? :"+ "\n Yanıtınız :");
            numberLimit = input.nextInt();
            System.out.println("Dizide en büyük sayı kaç olabilir? :"+ "\n Yanıtınız :");
            maxRange = input.nextInt();
        };
        
      
        int[] numberArrayForSorting = getRandomNumbers(numberLimit,maxRange);
        System.out.println("Sıralanacak Sayılar : " +Arrays.toString(numberArrayForSorting));

        selectionSort(numberArrayForSorting);
        System.out.println("Küçükten Büyüğe Sıralı Sayılar : \n" +Arrays.toString(numberArrayForSorting));
    }

    /* selectionSort methodu ile rastgele olarak elde ettiğimiz sayı dizimizi, Selection Sort algoritması ile küçükten büyüğe sıralıyoruz. */
    private static void selectionSort(int[] arr){
        for (int i = 0; i<arr.length-1;i++) {
            int index = i;

            /*Dizideki en küçük sayıyı bulun ve bu işlemi kalan alt diziler için yineleyin. */
            for (int j = i+1; j<arr.length;j++){
                if (arr[j]<arr[index]){
                    index = j;
                }
            }

            /*En küçük sayı ile yer değiştirin. */
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;

            /*Değişiklik sonrası oluşan yeni diziyi yazdırın. */
            System.out.println(Arrays.toString(arr));
        }
    }

    
    /* getRandomNumbers methodu ile kaç adet olacağını ve maksimumum değerini belirlediğimiz, rastgele sayılardan olan bir dizi elde ediyoruz. */
    public static int[] getRandomNumbers(int numberLimit, int maxRange){

        Random rnd = new Random();

        int[] randomNumbers = new int[numberLimit];
        Set<Integer> usedNumbers = new HashSet<Integer>();

        for (int i=0;i<numberLimit;i++){
            int newRandom;
            do{
                newRandom = rnd.nextInt(maxRange+1);
            } while(usedNumbers.contains(newRandom));
            randomNumbers[i] = newRandom;
            usedNumbers.add(newRandom);
        }
        return randomNumbers;
    }

}
