import java.util.Scanner;

public class NilaiMahasiswaMod {
    static int[][] nilai;
    static String[] namaMahasiswa;

    static void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        System.out.print("Masukkan jumlah minggu/tugas: ");
        int jumlahMinggu = sc.nextInt();

        nilai = new int[jumlahMahasiswa][jumlahMinggu];
        namaMahasiswa = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc.next();

            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Masukkan nilai " + namaMahasiswa[i] + " untuk Minggu ke " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilkanNilai() {
        System.out.println("Data Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(namaMahasiswa[i] + "\t");
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
        System.out.println("Nama: " + namaMahasiswa[idxMahasiswa]);
        System.out.println("Nilai: " + maxNilai);
        System.out.println("Minggu ke-: " + idxMinggu);
    }

    public static void main(String[] args) {
        inputData();

        tampilkanNilai();

        int hariTertinggi = cariHariTertinggi();
        System.out.println("Hari keberapakah terdapat nilai tertinggi: " + hariTertinggi);

        tampilkanMahasiswaTertinggi();
    }
}