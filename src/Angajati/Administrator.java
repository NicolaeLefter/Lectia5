package Angajati;

public class Administrator extends Director{
    private String responsabiliati;


  /*  public Administrator(String nume, int varsta, int aniExeprienta, String adresaDomociliu, double salariu) {
        super(nume, varsta, aniExeprienta, adresaDomociliu, salariu);
    }*/



    public String getResponsabiliati(){
        return responsabiliati;
    }
    public void setResponsabiliati(String responsabiliati){
        this.responsabiliati = responsabiliati;
    }
}
