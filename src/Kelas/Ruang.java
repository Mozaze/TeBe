/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

/**
 *
 * @author mozaze
 */
import java.util.Scanner;
public class Ruang {
    private int panjang;
    private int lebar;
    private int jmlpintu;
    private int jmljendela;
   // private int jml_pintu;
    int luas;
    int rasio;
    
    Scanner scan =new Scanner(System.in);

    public void setpanjang(int panjang){
        this.panjang=panjang;
    }
    public int getpanjang(){
        return panjang;
    }
    
    public void setlebar(int lebar){
        this.lebar=lebar;
    }
    public int getlebar(){
        return lebar;
    }
    
    public void setjmlpintu(int jmlpintu){
        this.jmlpintu=jmlpintu;
    }
    public int getjmlpintu(){
        return jmlpintu;
    }
    
    public void jmljendela(int jmljendela){
        this.jmljendela=jmljendela;
    }
    public int getjmljendela(){
        return jmljendela;
    }
    
    void masuk(){
        System.out.println("masukkan panjang:");
        setpanjang (scan.nextInt());
        System.out.println("masukkan lebar:");
        setlebar (scan.nextInt());
        System.out.println("masukkan jml_kursi:");
        setjmlpintu (scan.nextInt());
    }
    
    double luaskel(){
        luas=panjang*lebar;
        System.out.println("hasil :"+luas);
    return 0;
    }
    
    double rasiokel(){
        rasio=luas*jmlpintu;
        System.out.println("hasil rasio:"+rasio);
    return 0;
    }
    
        
    

   // private void setlebar(int nextInt) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    
    
    
}
