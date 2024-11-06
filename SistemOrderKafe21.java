import java.util.Scanner;

public class SistemOrderKafe21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah pesanan dari pengguna
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();  // Membersihkan newline

        // Membuat array untuk menyimpan nama dan harga pesanan
        String[] namaPesanan = new String[jumlahPesanan];
        int [] hargaPesanan = new int[jumlahPesanan];

        // Menginput pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = input.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = input.nextInt();
            input.nextLine();  // Membersihkan newline setelah input harga
        }

        // Menampilkan daftar pesanan dan menghitung total biaya
        System.out.println("\n--- Daftar Pesanan ---");
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
            totalBiaya += hargaPesanan[i];
        }

        // Menampilkan total biaya
        System.out.println("\nTotal biaya: Rp" + totalBiaya);
    }
}