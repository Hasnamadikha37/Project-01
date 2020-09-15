/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memilihkeramik;

/**
 *
 * @author hasna_madikha
 */
public class MemilihKeramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik A = new Keramik();
        A.merk = 'A';
        A.panjangKeramik = 0.3;
        A.lebarKeramik = 0.3;
        A.pcs = 10;
        A.hargaPerBox = 54000;
        A.totalHargaDibutuhkan();
        
        Keramik B = new Keramik();
        B.merk = 'B';
        B.panjangKeramik = 0.4;
        B.lebarKeramik = 0.4;
        B.pcs = 5;
        B.hargaPerBox = 65000;
        B.totalHargaDibutuhkan();
        
        Keramik C = new Keramik();
        C.merk = 'C';
        C.panjangKeramik = 0.4;
        C.lebarKeramik = 0.3;
        C.pcs = 8;
        C.hargaPerBox = 60000;
        C.totalHargaDibutuhkan();
               
    }
    
}
