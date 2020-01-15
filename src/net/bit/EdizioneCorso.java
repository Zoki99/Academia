package net.bit;

import java.util.List;

public class EdizioneCorso extends Corso {
    private int corso_id;
   

    public EdizioneCorso (){

    }

    public double costoOrario(Docenti d, int ore){
        return d.costoOrario() * ore;

    }


}
