import java.util.Scanner;
public class KafeDoWhile16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        String namaPelanggan;
        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.next();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan.");
                break;
            }
            System.out.println("jumlah kopi");
            kopi = sc.nextInt();
            System.out.println("jumlah teh");
            teh = sc.nextInt();
            System.out.println("jumlah roti");
            roti = sc.nextInt();
            double totalharga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar" + totalharga);
        } while (true);
        System.out.println("Semua transaksi selesai. ");
    }
}
