/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan37.ratarata;

/**
 *
 * @author Muhammad Farhan R 
 */
public class RataRata {
    public double rataRata;
    
    public void hitungRataRata(int[] nilai,int mhs){
        int totalNilai = 0;
        for (int i = 1;i<=mhs;i++){
            totalNilai = totalNilai+nilai[i-1];
        }
        rataRata = (double)totalNilai/mhs;
    }
}
