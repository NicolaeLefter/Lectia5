package Angajati;

public class Director extends Angajat {
    private String departament;
public Director(){

}
 /*  public Director(String nume, int varsta, int aniExeprienta, String adresaDomociliu, double salariu) {
        super(nume, varsta, aniExeprienta, adresaDomociliu, salariu);
    }*/


    public String getDepartament(){
        return departament;
    }
    public void setDepartament(String departament){
        this.departament = departament;
    }

}
