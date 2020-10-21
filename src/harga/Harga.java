/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harga;
import java.util.Scanner;
/**
 *
 * @author GAMES
 */
public class Harga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int nomor,a,b,total_harga,bayar,kembalian;
   
   
    
    Scanner input = new Scanner (System.in);
    
   System.out.println("<<Hasil Belanja>>");
   System.out.print("nomor transaksi : ");
   nomor = input.nextInt();
   System.out.print("harga barang 1 :Rp.");
   a = input.nextInt();
   System.out.print("harga barang 2 :Rp.");
   b = input.nextInt();
   total_harga = a+b;
   System.out.print("total harga :Rp." + total_harga );
   
   
   
   System.out.print("total pembayaran :Rp.");
   bayar = input.nextInt();
   
   
   
   kembalian = bayar - total_harga;
   System.out.print("Kembalian :Rp." + kembalian);
   //bawah 
   
   System.out.println("***************************");
   System.out.println("total harga :Rp. "+ total_harga);
   System.out.println("total pembayaran : Rp." + bayar);
   System.out.println("kembalian : Rp." + kembalian);
   
   
   
   
   
   
   
   
   
   
    
 
    
    
    
  
    
 
    
    
    
 
    
    
    
            
            
    }
    
       
        
   
        
}
