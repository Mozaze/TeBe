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
public class TesRuang {
    public static void main(String [] zaze){
        Ruang[] kelas=new Ruang[3];
        for(int b=0;b<kelas.length;b=b+1){
            kelas[b]=new Ruang();
            kelas[b].masuk();
            kelas[b].luaskel();
            kelas[b].rasiokel();  
        }
    }
    
}
