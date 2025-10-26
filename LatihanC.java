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
import java.util.*;
public class LatihanC {
    public static void main(String[] args) {
        Map<String, Integer> frekuensiKata = new HashMap<>();
        try {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            String baris;
            while ((baris = reader.readLine()) != null) {
                String barisBersih = baris.toLowerCase().replace(".", "")   
                                                        .replace(",", "")   
                                                        .replace("!", "")   
                                                        .replace("?", "");  

                String[] kataArray = barisBersih.split(" ");

                for (String kata : kataArray) {
                    if (kata.isEmpty()) {
                        continue; // Lanjut ke kata berikutnya
                    }
                    if (frekuensiKata.containsKey(kata)) {
                        int jumlahLama = frekuensiKata.get(kata);
                        frekuensiKata.put(kata, jumlahLama + 1);
                    } else {
                        frekuensiKata.put(kata, 1);
                    }
                }
            }
            reader.close(); // tutup reader 
            FileWriter fileWriter = new FileWriter("count.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (Map.Entry<String, Integer> entri : frekuensiKata.entrySet()) {
                writer.write(entri.getKey() + ":" + entri.getValue());
                writer.newLine(); // Pindah ke baris baru
            }

            writer.close(); // Tutup writer 

            System.out.println("Proses berhasil! Hasil ada di file count.txt");

        } catch (IOException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
