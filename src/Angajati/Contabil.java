package Angajati;

public class Contabil extends  Administrator{

    private String modulLucru;
   /* public Contabil(String nume, int varsta, int aniExeprienta, String adresaDomociliu, double salariu) {
        super(nume, varsta, aniExeprienta, adresaDomociliu, salariu);
    }*/

    public String getModulLucru(){
        return modulLucru;
    }
    public void setModulLucru(String modulLucru){
        this.modulLucru = modulLucru;
    }


}
