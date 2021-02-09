import java.util.HashMap;
import java.util.Scanner;

public class Harf {
    public static void main(String[] args) {
        int i;
        int sonuc = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Harf değerlerinin toplamını hesaplamak istediğiniz kelimeyi giriniz : ");
        String kelime = input.nextLine();
        kelime = kelime.toLowerCase();
        System.out.println("Kelimeniz : " + kelime);
        String[] dizi = kelime.split("");

        HashMap<String, Integer> alfabe = new HashMap<String, Integer>();
        alfabe.put("a", 1);
        alfabe.put("b", 2);
        alfabe.put("c", 3);
        alfabe.put("ç", 4);
        alfabe.put("d", 5);
        alfabe.put("e", 6);
        alfabe.put("f", 7);
        alfabe.put("g", 8);
        alfabe.put("ğ", 9);
        alfabe.put("h", 10);
        alfabe.put("ı", 11);
        alfabe.put("i", 12);
        alfabe.put("j", 13);
        alfabe.put("k", 14);
        alfabe.put("l", 15);
        alfabe.put("m", 16);
        alfabe.put("n", 17);
        alfabe.put("o", 18);
        alfabe.put("ö", 19);
        alfabe.put("p", 20);
        alfabe.put("r", 21);
        alfabe.put("s", 22);
        alfabe.put("ş", 23);
        alfabe.put("t", 24);
        alfabe.put("u", 25);
        alfabe.put("ü", 26);
        alfabe.put("v", 27);
        alfabe.put("y", 28);
        alfabe.put("z", 29);
        for (i = 0; i < dizi.length; i++) {
            if (alfabe.containsKey(dizi[i])) {
                System.out.println(alfabe.get(dizi[i]));
                sonuc += alfabe.get(dizi[i]);
            }


        }
        System.out.println("Yazdığınız kelimenin harflerinin değerlerinin toplamı : " + sonuc);
    }
}
