import java.util.Vector;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ospedale ospedale = new Ospedale();
        int scelta;
        
        do {
            Menu.mostraMenu();
            System.out.println("Scelta: ");
            scelta = scanner.nextInt();
            Menu.gestisciScelta(scelta, ospedale);
        } while (scelta != 4);

        scanner.close();
    }
}