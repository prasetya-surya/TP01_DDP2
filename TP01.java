import java.util.Scanner;

public class TP01{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("\n  ____             _                 _____         _ _       \r\n" +
                " |  _ \\           | |               |  __ \\       | (_)      \r\n" +
                " | |_) |_   _ _ __| |__   __ _ _ __ | |__) |__  __| |_  __ _ \r\n" +
                " |  _ <| | | | '__| '_ \\ / _` | '_ \\|  ___/ _ \\/ _` | |/ _` |\r\n" +
                " | |_) | |_| | |  | | | | (_| | | | | |  |  __/ (_| | | (_| |\r\n" +
                " |____/ \\__,_|_|  |_| |_|\\__,_|_| |_|_|   \\___|\\__,_|_|\\__,_|\r\n" +
                "                                                             \r\n" +
                "                                                             ");
        System.out.println("=============================================================");
        System.out.println("============== Selamat datang di Burhanpedia! ===============");
        System.out.println("=============================================================");
        System.out.println();

        System.out.print("Masukkan stok awal: ");
        int stokSaatIni = scanner.nextInt();

        System.out.print("Masukkan harga barang: ");
        int hargaBarang = scanner.nextInt();

        System.out.print("Masukkan saldo awal: ");
        int saldoSaatIni = scanner.nextInt();

        System.out.println();

        while (true){
            System.out.println("Pilih menu");
            System.out.println("1. Penjual");
            System.out.println("2. Pembeli");
            System.out.println("3. Hari Selanjutnya");
            System.out.println("4. Keluar");

            System.out.println();

            System.out.print("Perintah : ");
            int pilihanMenu = scanner.nextInt();

            switch (pilihanMenu) {
                case 1:
                    while (true) {
                        System.out.println();
                        System.out.println("===== MENU PENJUAL =====");
                        System.out.println("1. Cek Stok");
                        System.out.println("2. Cek Harga Barang");
                        System.out.println("3. Tambah Stok");
                        System.out.println("4. Ubah Harga Barang");
                        System.out.println("5. Generate Voucher");
                        System.out.println("6. Kirim Barang");
                        System.out.println("7. Lihat Laporan Pendapatan");
                        System.out.println("8. Kembali ke menu utama");

                        System.out.println();
                        System.out.print("Perintah : ");
                        int pilihanMenuPenjual = scanner.nextInt();

                        switch (pilihanMenuPenjual) {
                            case 1:
                                System.out.println("==============================");
                                System.out.println("Stock saat ini = " + stokSaatIni);
                                System.out.println("==============================");
                                break;
                            case 2:
                                System.out.println("==============================");
                                System.out.println("Harga barang saat ini: " + hargaBarang);
                                System.out.println("==============================");
                                break;
                            case 3:
                                System.out.print("Masukkan jumlah stok yang ingin ditambah: ");
                                int tambahan = scanner.nextInt();
                                stokSaatIni = tambahStok(stokSaatIni, tambahan);
                                System.out.println("Stok berhasil ditambah! Stok saat ini: " + stokSaatIni);
                                break;
                            case 4:
                                System.out.print("Masukkan harga barang yang baru: ");
                                hargaBarang = scanner.nextInt();
                                System.out.println("Harga barang diperbarui: " + hargaBarang);
                                break;
                            case 5:
                                System.out.println("Membuat voucher...");
                                break;
                            case 6:
                                System.out.println("Mengirim barang...");
                                break;
                            case 7:
                                System.out.println("Menampilkan laporan pendapatan...");
                                break;
                            case 8:
                                break; // Keluar dari loop menu penjual**
                            default:
                                System.out.println("Pilihan tidak valid!");
                                break;
                        }
                        if (pilihanMenuPenjual == 8){
                            System.out.println();
                            break;
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println();
                        System.out.println("===== MENU PEMBELI =====");
                        System.out.println("1. Cek Saldo");
                        System.out.println("2. Top Up Saldo");
                        System.out.println("3. Cek Harga Barang");
                        System.out.println("4. Beli Barang");
                        System.out.println("5. Generate Voucher");
                        System.out.println("6. Lacak Barang");
                        System.out.println("7. Lihat Laporan Pengeluaran");
                        System.out.println("8. Kembali ke menu utama");

                        System.out.println();
                        System.out.print("Pilihan : ");
                        int pilihanMenuPembeli = scanner.nextInt();
                        switch (pilihanMenuPembeli) {
                            case 1:
                                System.out.println("==============================");
                                System.out.println("Saldo saat ini = " + saldoSaatIni);
                                System.out.println("==============================");
                                break;
                            case 2:
                                System.out.println("Masukkan jumlah saldo yang ingin ditambah: ");
                                int saldoTambahan = scanner.nextInt();
                                saldoSaatIni = tambahSaldo(saldoSaatIni, saldoTambahan);
                                System.out.println("Saldo berhasil ditambah! Saldo saat ini: " + saldoSaatIni);
                                break;
                            case 3:
                                System.out.println("==============================");
                                System.out.println("Harga barang saat ini: " + hargaBarang);
                                System.out.println("==============================");
                                break;
                            case 4:
                                System.out.print("Masukkan harga barang yang baru: ");
                                hargaBarang = scanner.nextInt();
                                System.out.println("Harga barang diperbarui: " + hargaBarang);
                                break;
                            case 5:
                                System.out.println("Membuat voucher...");
                                break;
                            case 6:
                                System.out.println("Mengirim barang...");
                                break;
                            case 7:
                                System.out.println("Menampilkan laporan pendapatan...");
                                break;
                            case 8:
                                break; // Keluar dari loop menu penjual**
                            default:
                                System.out.println("Pilihan tidak valid!");
                                break;
                        }
                        if (pilihanMenuPembeli == 8){
                            System.out.println();
                            break;
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("===========================================");
                    System.out.println("Terima kasih telah menggunakan Burhanpedia!");
                    System.out.println("===========================================");
                    break;
            }
            if (pilihanMenu == 4){
                break;
            }
        }

    }

    public static int tambahStok(int stokSaatIni, int tambahan){
        if (tambahan <= 0) {
            throw new IllegalArgumentException("Nominal tidak valid!");
        }
        return stokSaatIni + tambahan;
    }

    public static int tambahSaldo(int saldoSaatIni, int tambahan){
        if (tambahan <= 0) {
            throw new IllegalArgumentException("Nominal tidak valid!");
        }
        return saldoSaatIni + tambahan;
    }
}