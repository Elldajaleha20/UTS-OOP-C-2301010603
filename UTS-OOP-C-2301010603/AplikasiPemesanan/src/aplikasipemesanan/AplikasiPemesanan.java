/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasipemesanan;

/**
 *
 * @author Elda
 */

import java.util.Scanner;

public class AplikasiPemesanan {

    static Scanner input = new Scanner(System.in);
    static Pemesanan[] data = new Pemesanan[100];
    static int count = 0;

    public static void main(String[] args) {
       int pilih;
        do {
            System.out.println("\n==== MENU APLIKASI ====");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Tampilkan Pesanan");
            System.out.println("3. Ubah Pesanan");
            System.out.println("4. Hapus Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    tambahPesanan();
                    break;
                case 2:
                    tampilPesanan();
                    break;
                case 3:
                    ubahPesanan();
                    break;
                case 4:
                    hapusPesanan();
                    break;
                    case 5:
                    System.out.println("Terima kasih...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
    
    static void tambahPesanan() {
        System.out.print("Masukkan ID: ");
        int id = input.nextInt();
        input.nextLine(); // bersihin enter
        System.out.print("Masukkan Nama Makanan: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jumlah: ");
        int jumlah = input.nextInt();

        data[count] = new Pesanan(id, nama, jumlah);
        count++;
        System.out.println("Pesanan berhasil ditambahkan!");
        }

    static void tampilPesanan() {
        if (count == 0) {
            System.out.println("Belum ada pesanan.");
        } else {
            for (int i = 0; i < count; i++) {
                data[i].tampilPesanan();
            }
        }
    }
    static void ubahPesanan() {
        System.out.print("Masukkan ID pesanan yang ingin diubah: ");
        int id = input.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (data[i].getId() == id) {
                input.nextLine();
                System.out.print("Masukkan Nama baru: ");
                String nama = input.nextLine();
                System.out.print("Masukkan Jumlah baru: ");
                int jumlah = input.nextInt();

                data[i].setNama(nama);
                data[i].setJumlah(jumlah);
                System.out.println("Pesanan berhasil diubah.");
                found = true;
                break;
    }
}
        if (!found) {
            System.out.println("Pesanan tidak ditemukan.");
            }
    }

    static void hapusPesanan() {
        System.out.print("Masukkan ID pesanan yang ingin dihapus: ");
        int id = input.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (data[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[count - 1] = null;
                count--;
                System.out.println("Pesanan berhasil dihapus.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Pesanan tidak ditemukan.");
        }
    }

    private static class Pemesanan {

        public Pemesanan() {
        }

        private void tampilPesanan() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private int getId() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setNama(String nama) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setJumlah(int jumlah) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class Pesanan extends Pemesanan {

        public Pesanan(int id, String nama, int jumlah) {
        }
    }
}
