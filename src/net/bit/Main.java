package net.bit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Docenti a = new Interni();
        Docenti b = new Interni();
        Docenti c = new Interni();
        Docenti d = new Esterno();
        Docenti e = new Esterno();

        EdizioneCorso ed = new EdizioneCorso();
        System.out.println(ed.costoOrario(a, 6));
        System.out.println(ed.costoOrario(b, 6));
        System.out.println(ed.costoOrario(c, 6));
        System.out.println(ed.costoOrario(d, 6));
        System.out.println(ed.costoOrario(e, 6));
*/

        EdizioneCorso ed = new EdizioneCorso();
        Docenti[] lista_docenti = new Docenti[5];
        for (int i = 0; i<5; i++){
            double r = Math.random();
            if(r <= 0.5){
                lista_docenti[i] = new Interni();
            }
            else{
                lista_docenti[i] = new Esterno();
            }
            System.out.println(ed.costoOrario(lista_docenti[i], 6));
        }
    }
}
