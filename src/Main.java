import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Membaca kata pertama untuk menentukan soal mana yang dijalankan
        if (!sc.hasNext()) return;
        String menu = sc.next();

        if (menu.equals("Soal1")) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int hasil = a + b;
            // Cek overflow: jika tanda hasil tidak logis dibandingkan input
            if (((a ^ hasil) & (b ^ hasil)) < 0) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(hasil);
            }

        } else if (menu.equals("Soal2")) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            float fSum = (float) x + (float) y;
            double dSum = x + y;
            // Menghitung selisih absolut presisi
            double diff = Math.abs((double) fSum - dSum);
            System.out.printf("%.6f%n", diff);

        } else if (menu.equals("Soal3")) {
            int n = sc.nextInt();
            Integer a = n;
            Integer b = a;
            a = a + 1; // Membuat objek baru, b tetap di nilai lama
            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        } else if (menu.equals("Soal4")) {
            String s = sc.next();
            String a = s;
            String b = new String(s);
            a = a + "X"; // String bersifat immutable, 'a' jadi objek baru
            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        } else if (menu.equals("Soal5")) {
            int i = Integer.parseInt(sc.next());
            double d = Double.parseDouble(sc.next());
            boolean b = Boolean.parseBoolean(sc.next());
            double res = i * d;
            if (!b) res *= -1;
            System.out.printf("%.2f%n", res);
        }
    }
}