import java.util.Scanner;
public class Percobaan627 {
    public static int HitungLuas(int pjg, int lbr) {
        int Luas = pjg * lbr;
        return Luas;
    }
    public static int HitungVolume(int tinggi, int a, int b) {
        int Volume = HitungLuas(a, b) * tinggi;
        return Volume;
    }
    public static void main(String[] args) {
        int p,l,t,L,Vol;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Panjang : ");
        p = sc.nextInt();
        System.out.print("Masukkan Lebar : ");
        l = sc.nextInt();
        System.out.print("Masukkan Tinggi : ");
        t = sc.nextInt();

        L = HitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + (L));

        Vol = HitungVolume(p, l, t);
        System.out.println("Volume balok adalah " + (Vol));
        sc.close();
    }
}