package OOPConcepts;

public class Main {
    public static void main(String args[]){
        Persoana persoana1=new Persoana();
        //persoana1.nume="Ana";
        //persoana1.prenume="Popescu";
        persoana1.setNume("Ana");
        persoana1.setPrenume("Popescu");
        System.out.println("*************Persoana 1**************");
        System.out.println(persoana1.getNume());
        System.out.println(persoana1.getPrenume());

        Persoana persoana2=new Persoana();
        persoana2.setNume("Ion");
        persoana2.setPrenume("Creanga");
        System.out.println("*************Persoana 2**************");
        System.out.println(persoana2.getNume());
        System.out.println(persoana2.getPrenume());

        Adresa adresaPersoana3=new Adresa("Henri Barbuse",4);
        Persoana persoana3=new Persoana("Mihai", "V",adresaPersoana3);
        System.out.println(persoana3.getNume());
        System.out.println(persoana3.getPrenume());
        System.out.println(persoana3.getAdresa().getNumeStrada()+" "+persoana3.getAdresa().getNumarStrada());
    }

}
