package bodymassindex;

import java.util.Scanner;

// kilo/ (boy/100)*2
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {

            System.out.print("Lutfen Kilonuzu giriniz :");
            int kilo = scanner.nextInt();
            System.out.print("Lutfen boyunuzu cm cinsinden giriniz (Ornegin 160) :");

            float boy = scanner.nextFloat();
            float oran = (float) (kilo / Math.pow((boy / 100), 2));

            System.out.println("Vucut kitle endeksiniz: " + oran);

            if (oran < 15) {
                System.out.println("Cok ciddi derecede dusuk kilolu");
            } else if (15 < oran && oran < 16) {
                System.out.println("Ciddi derecede dusuk kilolu");
            } else if (16 < oran && oran < 18.5) {
                System.out.println("Dusuk kilolu");
            } else if (18.5 < oran && oran < 25) {
                System.out.println("Normal saglikli");
            } else if (25 < oran && oran < 30) {
                System.out.println("Fazla kilolu");
            } else if (30 < oran && oran < 35) {
                System.out.println("1. dereceden fazla kilolu");
            } else if (35 < oran && oran < 40) {
                System.out.println("Ciddi obez");
            } else {
                System.out.println("Cok ciddi Obez");

            }
            System.out.println();

        }
    }

}
