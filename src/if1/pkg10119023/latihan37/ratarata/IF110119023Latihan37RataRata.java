/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan37.ratarata;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : menghitung rata-rata nilai
 *
 */

/**
 * @param args the command line arguments
 */

import java.util.Scanner;
public class IF110119023Latihan37RataRata {

    
    public static int banyakMhs;
    public static int[] nilai;
    
    private static void inputNilai(){
        Scanner scan = new Scanner(System.in);
        for(int i = 1;i<=banyakMhs;i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai[i-1] = scan.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Banyak Mahasiswa : ");
        banyakMhs = scan.nextInt();
        nilai = new int[banyakMhs];
        inputNilai();
        
        RataRata r = new RataRata();
        r.hitungRataRata(nilai,banyakMhs);
        System.out.println("");
        System.out.println("Maka Rata-rata Nilainya adalah "+r.rataRata);
    }

}
