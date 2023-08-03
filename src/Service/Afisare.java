package Service;

import Angajati.*;

public class Afisare {

    public void afisareAngajati(Angajat angajat){
        System.out.println("Numele angajatului este: " +angajat.getNume());
        System.out.println("Varsta angajatului este: " + angajat.getVarsta());
        System.out.println("Experienta angajatului este: " + angajat.getAniExeprienta());
        System.out.println("Adresa de domiciliu a angajatului este: " + angajat.getAdresaDomociliu());
        System.out.println("Salariu angajatului este: " + angajat.getSalariu());
    }
}
