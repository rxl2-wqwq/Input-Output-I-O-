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
public class LatihanB {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan sebuah kalimat: ");
        String kata = reader.readLine(); // Baris ini yang berpotensi error
        
        if (kata != null && !kata.trim().isEmpty()) {
            String[] kalimat = kata.split("\\s+");
            System.out.println("Jumlah kata: " + kalimat.length);
        } else {
            System.out.println("Jumlah kata: 0");
        }
    }
}
