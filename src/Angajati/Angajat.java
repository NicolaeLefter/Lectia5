package Angajati;

public class Angajat {
    private String nume;
    private int varsta;
    private int aniExeprienta;
    private String adresaDomociliu;
    private double salariu;

    public Angajat(){

    }


  /* public Angajat(String nume, int varsta, int aniExeprienta, String adresaDomociliu, double salariu){
        this.nume = nume;
        this.varsta = varsta;
        this.aniExeprienta = aniExeprienta;
        this.adresaDomociliu = adresaDomociliu;
        this.salariu = salariu;
    }*/
    public String getNume(){
        return nume;
    }
    public int getVarsta(){
        return  varsta;
    }
    public int getAniExeprienta(){
        return aniExeprienta;
    }
    public String getAdresaDomociliu(){
        return adresaDomociliu;
    }
    public double getSalariu(){
        return  salariu;
    }

    public void setNume( String nume){
        this.nume = nume;
    }
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    public void setAniExeprienta(int aniExeprienta){
        this.aniExeprienta = aniExeprienta;
    }
    public void setAdresaDomociliu( String adresaDomociliu){
        this.adresaDomociliu = adresaDomociliu;
    }
    public void setSalariu(double salariu){
        this.salariu = salariu;
    }
}
