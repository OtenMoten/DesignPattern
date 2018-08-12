package Kompositum_Kiste;

public class Kompositum {

    public static void main(String[] args) {

        Schachtel schachtel_1 = new Schachtel(),
                schachtel_2 = new Schachtel(),
                schachtel_3 = new Schachtel(),
                schachtel_4 = new Schachtel();

        Dose dose_1 = new Dose(),
                dose_2 = new Dose(),
                dose_3 = new Dose();

        Kiste kiste_1 = new Kiste(),
                kiste_2 = new Kiste(),
                mainTruhe = new Kiste();

        kiste_1.legeRein(schachtel_1);
        kiste_1.legeRein(schachtel_2);
        kiste_2.legeRein(schachtel_3);
        kiste_2.legeRein(schachtel_4);
        kiste_2.legeRein(dose_1);
        kiste_2.legeRein(dose_2);
        kiste_2.legeRein(dose_3);

        mainTruhe.legeRein(kiste_1);
        mainTruhe.legeRein(kiste_2);

        mainTruhe.enthalte();

    }

}