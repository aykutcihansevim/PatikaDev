import java.util.Scanner;

public class App {
         /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        double kg, boy, indeks;

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kg = input.nextDouble();
        indeks = kg /(boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);


        input.close();
    }
}
