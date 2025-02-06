/**
 * La classe Menu rappresenta un menu con opzioni per la gestione di un ospedale.
 */
import java.util.Scanner;
import java.util.Vector;

public class Menu {
    public String inserimento, descrizione;
    
    static Vector<Menu> opzioniMenu = inizializzaMenu();
    
    /**
     * Costruttore della classe Menu.
     * 
     * @param inserimento Il valore di input per l'opzione di menu.
     * @param descrizione La descrizione dell'opzione di menu.
     */
    Menu(String inserimento, String descrizione) {
        this.inserimento = inserimento;
        this.descrizione = descrizione;
    }
    
    /**
     * Inizializza il menu con le varie opzioni disponibili.
     * 
     * @return Un vettore contenente le opzioni del menu.
     */
    private static Vector<Menu> inizializzaMenu() {
        Vector<Menu> menu = new Vector<>();
        menu.add(new Menu("-------ME", "NU-------"));
        menu.add(new Menu("1", "-Inserisci persona"));
        menu.add(new Menu("2", "-Togli persona"));
        menu.add(new Menu("3", "-Vedi persone"));
        menu.add(new Menu("4", "-Esci"));
        menu.add(new Menu("---------", "---------"));
        
        return menu;
    }
    
    /**
     * Mostra il menu stampando le opzioni disponibili.
     */
    public static void mostraMenu() {
        for (Menu opzione : opzioniMenu) {
            System.out.println(opzione.inserimento + opzione.descrizione);
        }
    }
    
    /**
     * Gestisce la scelta dell'utente ed esegue l'operazione corrispondente.
     * 
     * @param scelta   L'opzione scelta dall'utente.
     * @param ospedale L'oggetto Ospedale su cui operare.
     */
    public static void gestisciScelta(int scelta, Ospedale ospedale) {
        Scanner scanner = new Scanner(System.in);
        switch (scelta) {
            case 1:
                System.out.println();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Cognome: ");
                String cognome = scanner.nextLine();
                System.out.print("Età: ");
                int eta = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Codice gravità (verde/giallo/rosso): ");
                String codice = scanner.nextLine().toLowerCase();
                ospedale.aggiungiPersona(new Persona(nome, cognome, codice, eta, false));
                System.out.println();
                break;
            case 2:
                System.out.println();
                System.out.print("Nome: ");
                String Nome = scanner.nextLine();
                System.out.print("Cognome: ");
                String Cognome = scanner.nextLine();
                ospedale.rimuoviPaziente(Nome, Cognome);
                System.out.println();
                break;
            case 3:
                System.out.println();
                ospedale.visualizzaPersone();
                System.out.println();
                break;
            case 4:
                System.out.println();
                System.out.println("Uscita...");
                break;
            default:
                System.out.println("Scelta non valida.");
        }
    }
}
