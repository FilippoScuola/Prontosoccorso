/**
 * Classe Ospedale che gestisce i pazienti in base alla gravità del loro stato di salute.
 * I pazienti vengono suddivisi in tre categorie: codice rosso, codice giallo e codice verde.
 */
import java.util.Vector;

public class Ospedale {
    
    /**
     * Vettori che rappresentano le liste di pazienti suddivisi per codice di priorità.
     */
    Vector<Persona> cRosso = new Vector<>(); // Lista per codice rosso (emergenza massima)
    Vector<Persona> cGiallo = new Vector<>(); // Lista per codice giallo (urgenza intermedia)
    Vector<Persona> cVerde = new Vector<>(); // Lista per codice verde (urgenza minore)

    /**
     * Metodo per aggiungere un paziente alla lista corrispondente al suo codice di priorità.
     * 
     * @param p L'oggetto Persona da aggiungere.
     */
    public void aggiungiPersona(Persona p) {
        switch (p.getCodice().toLowerCase()) { // Converte il codice in minuscolo per evitare errori di maiuscole/minuscole
            case "verde":
                cVerde.add(p);
                break;
            case "giallo":
                cGiallo.add(p);
                break;
            case "rosso":
                cRosso.add(p);
                break;
        }
    }

    /**
     * Metodo per rimuovere un paziente dalle liste in base al nome e al cognome.
     * Se il paziente esiste in una delle liste, viene rimosso.
     * 
     * @param nome Nome del paziente da rimuovere.
     * @param cognome Cognome del paziente da rimuovere.
     */
    public void rimuoviPaziente(String nome, String cognome) {
        for (int i = 0; i < cVerde.size(); i++) {
            Persona p = cVerde.get(i);
            if (p.getNome().equals(nome) && p.getCognome().equals(cognome)) {
                cVerde.remove(i);
                return;
            }
        }
        for (int i = 0; i < cGiallo.size(); i++) {
            Persona p = cGiallo.get(i);
            if (p.getNome().equals(nome) && p.getCognome().equals(cognome)) {
                cGiallo.remove(i);
                return;
            }
        }
        for (int i = 0; i < cRosso.size(); i++) {
            Persona p = cRosso.get(i);
            if (p.getNome().equals(nome) && p.getCognome().equals(cognome)) {
                cRosso.remove(i);
                return;
            }
        }
    }

    /**
     * Metodo per visualizzare i pazienti suddivisi per codice di priorità.
     * Stampa in console l'elenco dei pazienti per ogni codice.
     */
    public void visualizzaPersone() {
        System.out.println("CODICE ROSSO");
        for (Persona p : cRosso) {
            System.out.println(p);
        }
        System.out.println();
        
        System.out.println("CODICE GIALLO");
        for (Persona p : cGiallo) {
            System.out.println(p);
        }
        System.out.println();
        
        System.out.println("CODICE VERDE");
        for (Persona p : cVerde) {
            System.out.println(p);
        }
    }
}
