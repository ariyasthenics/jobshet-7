import java.util.Scanner;

public class ParkirKendaraan16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        double total = 0;

        do {
            System.out.println("Masukkan kendaraan ");
            System.out.println("Mobil = 1");
            System.out.println("Motor = 2");
            System.out.println("keluar = 0");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Parkir berapa jam ? ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan kamu salah, tolong masukkan lagi");
            }

        } while (jenis != 0);
        System.out.println("Total pendapatan " + total);
        sc.close();
    }
}
