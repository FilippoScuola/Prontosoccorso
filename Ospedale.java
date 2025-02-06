import java.util.Vector;
class Ospedale{
    
    Vector<Persona> cRosso = new Vector<>();
    Vector<Persona> cGiallo = new Vector<>();
    Vector<Persona> cVerde = new Vector<>();

    public void aggiungiPersona(Persona p){
        switch (p.getCodice().toLowerCase()) {
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

    public void rimuoviPaziente(String nome, String cognome){
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

    public void visualizzaPersone(){
        System.out.println("CODICE ROSSO");
        for(Persona p : cRosso){
            System.out.println(p);
        }
        System.out.println();
        System.out.println("CODICE GIALLO");
        for(Persona p : cGiallo){
            System.out.println(p);
        }
        System.out.println();
        System.out.println("CODICE VERDE");
        for(Persona p : cVerde){
            System.out.println(p);
        }
    }
}