import java.util.Scanner;
public class UcapanTerimaKasih_27 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String NamaOrang = sc.nextLine();
        sc.close();
        return NamaOrang;
    }
    public static void UcapanTerimaKasih() {
        String Nama = PenerimaUcapan();
        System.out.println("Thank You " + (Nama) + " For Being The Best Teacher In The World.\n" + 
        "You Inspired In Me a Love For Learning And Made Me Feel Like I Could Ask You Anything");
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "May The Force Be With You";
        UcapanTambahan(ucapan);
    }
}