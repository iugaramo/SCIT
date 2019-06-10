package OOPConcepts;

public class Persoana {
    private String nume;
    private String prenume;
    private long cnp;
    private Adresa adresa;  //alta clasa


    public Persoana(){
        this.nume="Ana";
        this.prenume="Popescu";
    }

    public Persoana(String numeValoare, String prenumeValoare, Adresa adresa){
        this.nume=numeValoare;
        this.prenume=prenumeValoare;
        this.adresa=adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume.toUpperCase();
    }

    public String getPrenume() {
        //String result="Prenumele este:"+prenume;
        return "Prenumele este:"+prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public Adresa getAdresa() {
        return adresa;
    }
}
