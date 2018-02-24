package ch.hslu.ad.sw1.ggT;

public class GGT {

    public static void main(String[] args){
        int grosseZahl = 21;
        int kleineZahl = 14;

        int ggt = calcGGT(grosseZahl, kleineZahl);

        System.out.println(ggt);
    }

    private static int calcGGT(int grosseZahl, int kleineZahl) {
        if(grosseZahl > kleineZahl){
            return calcGGT(grosseZahl - kleineZahl, kleineZahl);

        }
        else {
            if(grosseZahl < kleineZahl) {
                return calcGGT(grosseZahl, kleineZahl - grosseZahl);
            }
            else{
                return grosseZahl;
            }
        }
    }
}
