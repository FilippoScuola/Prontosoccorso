class Persona{
    private String nome,cognome,codice;
    private int eta;
    private boolean visitata;

    public Persona(String nome, String cognome, String codice, int eta, boolean visitata){
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.eta = eta;
        this.visitata = visitata;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public String getCodice() {
        return codice;
    }

    public boolean isVisitato(){
        return visitata;
    }

    public void setVisitata(boolean visitata) {
        this.visitata = visitata;
    }

    public String toString(){
        return nome + " | " + cognome + " | " + eta + " | " + codice + " | " + visitata;
    }
}