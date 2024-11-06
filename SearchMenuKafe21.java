import java.util.Scanner;

public class SearchMenuKafe21 {
    public static void main(String[] args) {
        // Daftar menu makanan
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        Scanner scanner = new Scanner(System.in);

        // Meminta nama makanan yang ingin dicari dari pengguna
        System.out.print("Masukkan nama makanan/minuman yang ingin Anda cari: ");
        String makananDicari = scanner.nextLine();

        // Mencari makanan menggunakan metode linear search
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) { // Mengabaikan huruf besar/kecil
                ditemukan = true;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (ditemukan) {
            System.out.println("Makanan/minuman \"" + makananDicari + "\" tersedia di menu.");
        } else {
            System.out.println("Maaf, makanan/minuman \"" + makananDicari + "\" tidak ada di menu.");
        }
    }
}