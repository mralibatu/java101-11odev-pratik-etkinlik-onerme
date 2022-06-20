import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sicaklik;

        System.out.println("Hava sicakligini giriniz : ");
        sicaklik = girdi.nextInt();

        if (sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz!");
        } else if (sicaklik > 5 && sicaklik < 15) {
            System.out.println("Sinema zamanı!");
        } else if (sicaklik > 15 && sicaklik < 25) {
            System.out.println("Piknik time!");
        } else if (sicaklik > 25) {
            System.out.println("Alın mayoları!");
        }

    }
}
