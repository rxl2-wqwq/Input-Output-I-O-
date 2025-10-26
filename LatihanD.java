/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;

/**
 *
 * @author Bravo 15
 */
import java.io.*;
public class LatihanD {
    public static void main(String[] args) {
        FileInputStream fileMasuk = null;
        FileOutputStream fileKeluar = null;
        try {
            fileMasuk = new FileInputStream("sumber.png");
            fileKeluar = new FileOutputStream("tujuan.png");
            int dataByte;
            System.out.println("Mulai menyalin file");
            while ((dataByte = fileMasuk.read()) != -1) {
                fileKeluar.write(dataByte);
            }
            System.out.println("File berhasil disalin!");
        } catch (IOException e) {
            // Jika terjadi error saat membaca atau menulis, tampilkan pesan
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            try {
                if (fileMasuk != null) {
                    fileMasuk.close();
                }
                if (fileKeluar != null) {
                    fileKeluar.close();
                }
            } catch (IOException e) {
                System.out.println("Gagal menutup file: " + e.getMessage());
            }
        }
    }
}
