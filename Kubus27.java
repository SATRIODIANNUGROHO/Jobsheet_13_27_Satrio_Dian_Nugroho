import java.util.Scanner;
public class Kubus27 {
    public static int HitungVolume(int pjg, int lbr, int tng) {
        int Vol = pjg * lbr * tng;
        return Vol;
    }
    public static int HitungLuasPermukaan(int a, int b, int c) {
        int LP = 2 * ((a * b) + (a * c) + (b * c));
        return LP;
    }
    public static void main(String[] args) {
        int p,l,t,Vol,LP;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Panjang Kubus\t : ");
        p = sc.nextInt();
        System.out.print("Masukkan Lebar Kubus\t : ");
        l = sc.nextInt();
        System.out.print("Masukkan Tinggi Kubus\t : ");
        t = sc.nextInt();

        Vol = HitungVolume(p, l, t);
        System.out.println("Volume Kubus Adalah " + (Vol));

        LP = HitungLuasPermukaan(p, l, t);
        System.out.println("Luas Permukaan Kubus Adalah " + (LP));
        sc.close();
    }
}