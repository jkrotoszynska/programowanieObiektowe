package com.company;

public class Main {

    public static void main(String[] args) {
	SystemAudioSpecyficzny sas = new SystemAudioSpecyficzny();
	sas.odtwarzaj();
	sas.nagrywaj();
	sas.odtwarzajRadio();
	sas.wylacz();

	// Inne możliwości
//    OdtwarzaczAudio OdtwarzaczAudio = sas;
//    OdtwarzaczAudio.odtwarzaj();
//
//    NagrywarkaAudio NagrywarkaAudio = sas;
//    NagrywarkaAudio.nagrywaj();
//
//    OdtwarzaczRadio OdtwarzaczRadio = sas;
//    OdtwarzaczRadio.odtwarzajRadio();
//
//    SystemAudio SystemAudio = sas;
//    SystemAudio.odtwarzaj();
//    SystemAudio.nagrywaj();

    }
}

interface OdtwarzaczAudio{
    void odtwarzaj();
}

interface NagrywarkaAudio{
    void nagrywaj();
}

interface OdtwarzaczRadio{
    void odtwarzajRadio();
}

interface SystemAudio extends OdtwarzaczAudio, NagrywarkaAudio{

}

abstract class SystemAudioPodstawowy implements SystemAudio, OdtwarzaczRadio{
    public void odtwarzaj(){
        System.out.println("odtwarzaj audio");
    }
    public void nagrywaj(){
        System.out.println("nagrywaj audio");
    }
}

class SystemAudioSpecyficzny extends SystemAudioPodstawowy{
    @Override
    public void odtwarzajRadio(){
        System.out.println("odtwarzaj Radio");
    }

    public void wylacz(){
        System.out.println("Wyłącz");
    }
}