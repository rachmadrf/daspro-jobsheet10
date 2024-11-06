import java.util.Scanner;

public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int countLulus = 0;
        int countTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        double rata2Lulus = (countLulus > 0) ? totalLulus / countLulus : 0;
        double rata2TidakLulus = (countTidakLulus > 0) ? totalTidakLulus / countTidakLulus : 0;

        System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rata2TidakLulus);
    }
}
