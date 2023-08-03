package Angajati;

public class Secretar extends Administrator{
 /*   public Secretar(String nume, int varsta, int aniExeprienta, String adresaDomociliu, double salariu) {
        super(nume, varsta, aniExeprienta, adresaDomociliu, salariu);
    }*/

    private int graficLucru;



    public int getGraficLucru(){
        return graficLucru;
    }
    public void setGraficLucru(int graficLucru){
        this.graficLucru = graficLucru;
    }
}
