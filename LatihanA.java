/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;

/**
 *
 * @author Bravo 15
 */
import java.util.*;
public class LatihanA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bilangan pertama: "); 
        int bilangan1 = input.nextInt();

        System.out.print("bilangan kedua: ");
        int bilangan2 = input.nextInt();
        int jumlah = bilangan1 + bilangan2;

        System.out.println("Jumlahnya adalah: " + jumlah);
        input.close();
    }
}
