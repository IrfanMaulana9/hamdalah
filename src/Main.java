import java.util.Random;
import java.util.Scanner;

class TebakAngka {
    public static void main(String[] args) {
        Random random = new Random();
        int nomorRahasia = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tebakan;
        int jumlahTebakan = 0;
        boolean tebakanBenar = false;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih sebuah angka antara 1 dan 100. Coba tebak!");

        while (!tebakanBenar) {
            System.out.print("Masukkan tebakan kamu!!!: ");
            tebakan = scanner.nextInt();
            jumlahTebakan++;

            if (tebakan < nomorRahasia) {
                System.out.println("Terlalu rendah! Coba lagi.");
            } else if (tebakan > nomorRahasia) {
                System.out.println("Terlalu tinggi! Coba lagi.");
            } else {
                tebakanBenar = true;
                System.out.println("Selamat! Anda berhasil menebak angka " + nomorRahasia + " dalam " + jumlahTebakan + " tebakan.");
            }
        }

        scanner.close();
    }
}