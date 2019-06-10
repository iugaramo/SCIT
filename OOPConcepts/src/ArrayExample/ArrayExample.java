package ArrayExample;

public class ArrayExample {
    public static void main(String args[]){
        int[] numereIntregi=new int[10];
        numereIntregi[0]=5;
        numereIntregi[1]=10;
        numereIntregi[2]=8;

        //afisareNrPare(numereIntregi);
        //afisareNrImpare(numereIntregi);
        stergePrimulNumarImpar(numereIntregi);
    }

    private static void stergePrimulNumarImpar(int[] numereIntregi) {
        boolean aFostPrimulNrImparCitit=false;
        int[] copyArray=new int[10];
        int indexCopyArray=0;
        int primulNrImpar=0;

        for(int i=0;i<numereIntregi.length;i++) {
            System.out.println(numereIntregi[i]);
            System.out.println(copyArray[i]);
        }
        for(int i=0; i<numereIntregi.length;i++){
            if (numereIntregi[i]%2!=0){
                if(aFostPrimulNrImparCitit=false){
                    aFostPrimulNrImparCitit=true;
                    primulNrImpar=numereIntregi[i];
                }
                else {
                    copyArray[i]=numereIntregi[i];
                }
            } else { copyArray[i]=numereIntregi[i];

            }
            System.out.println(copyArray);
            /*if (!aFostPrimulNrImparCitit){
                copyArray[indexCopyArray]=numereIntregi[i];
                indexCopyArray++;
            }*/
        }
    }

    /*private static void afisareNrImpare(int[] numereIntregi) {
        int i=0;
        System.out.println("Afisare numere impare:");
        while (i<numereIntregi.length){
            if (numereIntregi[i]%2!=0){
                System.out.println(numereIntregi[i]);
            }
            i++;
        }
    }

    private static void afisareNrPare(int[] numereIntregi) {
        int i=0;
        System.out.println("Afisare numere pare:");
        while (i<numereIntregi.length){
            if (numereIntregi[i]%2==0){
                System.out.println(numereIntregi[i]);
            }
            i++;
        }
    }*/
}
