package smetanasps.cz;

public class BankovniUcet {
    private final String cisloUctu;
    private String jmenoMajitele;
    private double stavUctu;

    public BankovniUcet(String cisloUctu, String jmenoMajitele, double stavUctu) {
        this.cisloUctu = cisloUctu;
        this.jmenoMajitele = jmenoMajitele;
        this.stavUctu = stavUctu;

    }

    public void vypisInfo(){
        System.out.println("Číslo účtu: " + cisloUctu);
        System.out.println("Jméno majitele: " + jmenoMajitele);
        System.out.println("Stav účtu:: " + stavUctu);

    }


}
