import Angajati.*;
import Service.Afisare;

public class Main {
    public static void main(String[] args) {


        Director director = new Director();
        director.setNume("Mihai");
        director.setVarsta(40);
        director.setSalariu(20000);
        director.setAniExeprienta(15);
        director.setAdresaDomociliu("str.MihaiEminescu,mun.Chisinau");
        director.setDepartament("Proiectare");

        Administrator administrator = new Administrator();
        administrator.setNume("Andrei");
        administrator.setVarsta(30);
        administrator.setAdresaDomociliu("mun.Chisinau");
        administrator.setSalariu(7000);
        administrator.setAniExeprienta(3);
        administrator.setResponsabiliati("Verificarea lucrui si a angajatilor");

        Contabil contabil = new Contabil();
        contabil.setNume("Andreea");
        contabil.setVarsta(35);
        contabil.setModulLucru("La distanta");
        contabil.setResponsabiliati("Duce eveidenta financiara");
        contabil.setAdresaDomociliu("Orhei, strada Armeana 31");
        contabil.setSalariu(15000);
        contabil.setAniExeprienta(7);
        contabil.setDepartament("Proiectare");

        Secretar secretar = new Secretar();
        secretar.setNume("Daniela");
        secretar.setDepartament("Resurse umane");
        secretar.setVarsta(25);
        secretar.setSalariu(8000);
        secretar.setGraficLucru(5);
        secretar.setAniExeprienta(1);
        secretar.setResponsabiliati("Preluarea apelurilor telefonice");



        Afisare afisare = new Afisare();
        System.out.println("Date despre director!");
        afisare.afisareAngajati(director);
        System.out.println("Date despre administrator!");
        afisare.afisareAngajati(administrator);
        System.out.println("Date despre contabil!");
        afisare.afisareAngajati(contabil);
        System.out.println("Date despre secretar!");
        afisare.afisareAngajati(secretar);



    }
}
