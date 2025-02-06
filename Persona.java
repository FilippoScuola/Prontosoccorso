/**
 * La classe Persona rappresenta un individuo con attributi personali
 * come nome, cognome, codice identificativo, età e stato di visita.
 */
public class Persona {
    private String nome, cognome, codice;
    private int eta;
    private boolean visitata;

    /**
     * Costruttore della classe Persona.
     * 
     * @param nome    Il nome della persona.
     * @param cognome Il cognome della persona.
     * @param codice  Il codice identificativo della persona.
     * @param eta     L'età della persona.
     * @param visitata Indica se la persona è stata visitata.
     */
    public Persona(String nome, String cognome, String codice, int eta, boolean visitata) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.eta = eta;
        this.visitata = visitata;
    }

    /**
     * Restituisce il nome della persona.
     * 
     * @return Il nome della persona.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Restituisce il cognome della persona.
     * 
     * @return Il cognome della persona.
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Restituisce l'età della persona.
     * 
     * @return L'età della persona.
     */
    public int getEta() {
        return eta;
    }

    /**
     * Restituisce il codice identificativo della persona.
     * 
     * @return Il codice della persona.
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Verifica se la persona è stata visitata.
     * 
     * @return True se la persona è stata visitata, altrimenti false.
     */
    public boolean isVisitato() {
        return visitata;
    }

    /**
     * Imposta lo stato di visita della persona.
     * 
     * @param visitata True se la persona è stata visitata, altrimenti false.
     */
    public void setVisitata(boolean visitata) {
        this.visitata = visitata;
    }

    /**
     * Restituisce una rappresentazione testuale della persona.
     * 
     * @return Una stringa contenente nome, cognome, età, codice e stato di visita.
     */
    @Override
    public String toString() {
        return nome + " | " + cognome + " | " + eta + " | " + codice + " | " + visitata;
    }
}
