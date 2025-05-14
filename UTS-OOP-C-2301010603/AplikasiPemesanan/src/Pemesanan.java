/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elda
 */
public class Pemesanan {
    private int id;
    private String nama;
    private int jumlah;

    // Constructor kosong
    public Pemesanan() {
    }

    // Constructor dengan parameter
    public Pemesanan(int id, String nama, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.jumlah = jumlah;
    }

    // Method untuk menampilkan pesanan
    public void tampilPesanan() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Jumlah: " + jumlah);
    }

    // Getter dan Setter (Access Modifier)
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

    

