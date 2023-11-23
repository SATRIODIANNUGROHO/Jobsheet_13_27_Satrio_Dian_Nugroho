import java.util.Scanner;
public class Ucapan_27 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String NamaOrang = sc.nextLine();
        sc.close();
        return NamaOrang;
    }
    public static void main(String[] args) {
        String Nama = PenerimaUcapan();
        System.out.println("Thank You " + (Nama) + "\nMay The Force Be With You");
    }
}