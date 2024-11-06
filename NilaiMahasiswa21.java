import java.util.Scanner;

public class NilaiMahasiswa21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan banyaknya nilai mahasiswa yang akan diinput
        System.out.print("Masukkan jumlah nilai mahasiswa yang akan diinput: ");
        int jumlahNilai = input.nextInt();

        int[] nilaiMahasiswa = new int[jumlahNilai];

        // Memasukkan setiap nilai mahasiswa
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        // Menghitung nilai rata-rata
        int totalNilai = 0;
        for (int nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }
        double rataRata = (double) totalNilai / jumlahNilai;

        // Mencari nilai tertinggi dan terendah
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];

        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        // Menampilkan hasil akhir
        System.out.println("\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        // Menampilkan semua nilai yang telah dimasukkan
        System.out.println("Nilai mahasiswa yang telah dimasukkan:");
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }

        input.close();
    }
}