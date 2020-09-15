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
public class Keramik {
    /* membuat atribut */
    public char merk;
    public double panjangKeramik; /*dalam meter*/
    public double pcs;
    public double lebarKeramik; /*dalam meter*/
    public double hargaPerBox;
    
    /* membuat methods*/
    
    public void totalHargaDibutuhkan(){
        double ButuhKeramik = 100 / ((this.panjangKeramik * this.lebarKeramik));
        double jumlahKeramik = Math.ceil(ButuhKeramik);
        double butuhBox = jumlahKeramik / this.pcs;
        double jumlahBox = Math.ceil(butuhBox);
        double totalHarga = this.hargaPerBox * jumlahBox;
        
     System.out.println("Merk keramik : " + this.merk);
     System.out.println("Jumlah Keramik yang dibutuhkan : " + jumlahKeramik + " biji");
     System.out.println("Jumlah box yang dibutuhkan : " + jumlahBox + " box");
     System.out.println("Total harga keramik : " + totalHarga + " rupiah");    
    }
}
