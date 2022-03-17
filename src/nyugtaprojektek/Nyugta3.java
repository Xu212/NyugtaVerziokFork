package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/
public class Nyugta3 {

    public static void main(String[] args) {
        String csillagok = alakzatsorozat("*", 20);
        alakzatkiiratas(csillagok);
        System.out.printf("%14s\n", "Nyugta 3");
        alakzatkiiratas(csillagok);
        
        final String HUF = "Ft";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        penzkiiratas("Tétel1", tetel1, HUF);
        penzkiiratas("Tétel2", tetel2, HUF);
        penzkiiratas("Tétel3", tetel3, HUF);

        String duplaVonal = alakzatsorozat("=", 20);
        alakzatkiiratas(HUF);
        
        int osszesen = tetel1 + tetel2 + tetel3;
        penzkiiratas("Összesen", osszesen, HUF);
        
        String szaggatottVonal = alakzatsorozat("-", 20);
        alakzatkiiratas(HUF);
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        penzkiiratas("Szervízdíj", osszesen, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        System.out.println(duplaVonal);
        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        System.out.println(szaggatottVonal);
        
        alakzatkiiratas("");
        String rovidVonal = alakzatsorozat("_", 7);
        alakzatkiiratas(rovidVonal);
        String rovidVonalValaszto = "      ";
        alakzatkiiratas(rovidVonalValaszto);
        alakzatkiiratas(rovidVonal);
        alakzatkiiratas(" Dátum");
        alakzatkiiratas(rovidVonalValaszto);
        alakzatkiiratas("   Név");
        
        alakzatkiiratas(csillagok);
        alakzatkiiratas("        CÉG");
        alakzatkiiratas(csillagok);
    }
    private static void penzkiiratas(String str, int osszeg, String penznem){
        System.out.printf("%10s:  %5d %s\n", str, osszeg, penznem);
    }
    private static void alakzatkiiratas(String str){
        System.out.println(str);
    }
    private static String alakzatsorozat(String alakzat, int hanydb){
        String alakzatlanc = "";
        for (int i = 0; i < hanydb; i++) {
            alakzatlanc += alakzat;
        }
    return alakzatlanc;
    }
}