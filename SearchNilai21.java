import java.util.Scanner;

public class SearchNilai21 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //input jumlah elemen array
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlMhs = input.nextInt();

        //Deklarasi array sesuai input
        int[] arrNilai = new int[jmlMhs];

        //input elemen array
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = input.nextInt();
        }

        //input nilai yang ingin dicari (key)
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();

        //mencari nilai key di dalam array
        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                break;
            }
        }

        //menampilkan hasil pencarian
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        input.close();
    }
}