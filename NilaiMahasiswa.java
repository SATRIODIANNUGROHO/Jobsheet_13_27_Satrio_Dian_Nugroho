import java.util.Scanner;
public class NilaiMahasiswa {
    static int[][] nilai = {
            {20, 19, 25, 20, 10, 0, 10},
            {30, 30, 40, 10, 15, 20, 25},
            {5, 0, 20, 25, 10, 5, 45},
            {50, 0, 7, 8, 0, 30, 60},
            {15, 10, 16, 15, 10, 10, 5}
    };
    static void inputData() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai " + getNamaMahasiswa(i) + " untuk Minggu ke " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }
    static void tampilkanNilai() {
        System.out.println("Data Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(getNamaMahasiswa(i) + "\t");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static int cariHariTertinggi() {
        int maxHari = 0;
        int maxNilai = nilai[0][0];

        for (int j = 1; j < nilai[0].length; j++) {
            int totalNilai = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalNilai += nilai[i][j];
            }

            if (totalNilai > maxNilai) {
                maxNilai = totalNilai;
                maxHari = j + 1;
            }
        }

        return maxHari;
    }
    static void tampilkanMahasiswaTertinggi() {
        int maxNilai = 0;
        int idxMahasiswa = 0;
        int idxMinggu = 0;

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > maxNilai) {
                    maxNilai = nilai[i][j];
                    idxMahasiswa = i;
                    idxMinggu = j + 1;
                }
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi:");
        System.out.println("Nama: " + getNamaMahasiswa(idxMahasiswa));
        System.out.println("Nilai: " + maxNilai);
        System.out.println("Minggu ke-: " + idxMinggu);
    }
    static String getNamaMahasiswa(int index) {
        String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        return namaMahasiswa[index];
    }

    public static void main(String[] args) {
        inputData();

        tampilkanNilai();

        int hariTertinggi = cariHariTertinggi();
        System.out.println("Hari keberapakah terdapat nilai tertinggi: " + hariTertinggi);

        tampilkanMahasiswaTertinggi();
    }
}