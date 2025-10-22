import java.util.Scanner;
public class TugasTiket1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int jmlTiket;
        double totalPendapatan = 0;
        double totaljualTiket = 0;
        String lanjut = "ya";
        do {
            System.out.println("Beli Berapaaa: ");
            jmlTiket = sc.nextInt();
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket kamuu tidak BENERRRR masukkan lagi ");
                continue;
            }
            double diskon = 0;
            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            }
            double totalHarga = jmlTiket * hargaTiket;
            double totalBayar = totalHarga - (totalHarga * diskon);
            totalPendapatan += totalBayar;
            totaljualTiket+= jmlTiket;

            System.out.println("Jumlah tiket     = " + jmlTiket);
            System.out.println("Harga per tiket  = Rp " + hargaTiket);
            System.out.println("Total harga      = Rp " + totalHarga);
            System.out.println("Diskon           = " + (diskon * 100) + "%");
            System.out.println("Total yang dibayar: Rp " + totalBayar);
            System.out.println("Nambah lagi gakkk (ya/tidak): ");
            lanjut = sc.next();

        } while (lanjut.equalsIgnoreCase("ya"));
        System.out.println("tiket terjual = " + totaljualTiket);
        System.out.println("7pendapatan    = Rp " + totalPendapatan);
        sc.close();
        }
    } 
