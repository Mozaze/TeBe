/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TB;

/**
 *
 * @author mozaze
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class ControlKebersihan {
    Kebersihan bersih = new Kebersihan();
    Scanner scan = new Scanner(System.in);
    void ceksirkulasi(){
        //bersih.setsirkulasi(JOptionPane.showInputDialog("masukkan jumlah sirkulasi"));
        //if(bersih.getsirkulasi().equals(bersih.getsirkulasi)>4){
            
        //}
        System.out.print("masukkan jumlah sirkulasi:");
        bersih.setsirkulasi(scan.nextInt());
        if(bersih.getsirkulasi()>4){
            System.out.println("sirkulasi oke!!");
        }else if(bersih.getsirkulasi()==4){
            System.out.println("sirkulasi lumayan");
        }else{
            System.out.println("sirkulasi buruk");
        }
    }
    
    void cahaya(){
        System.out.println("/-------------------------------------/");
        System.out.print("masukkan jumlah pencahayaan / lampu:");
        bersih.setpencahayaan(scan.nextInt());
        if(bersih.getpencahayaan()>=250){
            System.out.println("cahaya kurang");
        }else if(bersih.getpencahayaan()<=350){
            System.out.println("cahaya sesuai");
        }else{
            System.out.println("cahaya oke");
        }
    }
    
    void kelembapan(){
        System.out.println("/-------------------------------------/");
        System.out.print("masukkan intensitas kelembapan:");
        bersih.setlembab(scan.nextInt());
        if(bersih.getpencahayaan()>=70){
            System.out.println("kelembapan parah");
        }else if(bersih.getpencahayaan()==75){
            System.out.println("kelembapan rata-rata");
        }else{
            System.out.println("ruangan sesuai");
        }
    }
    
    
    void suhu(){
       System.out.println("/-------------------------------------/");
       System.out.print("berapa suhu nya:       ");
       bersih.setsuhu(scan.nextInt());
       if(bersih.getsuhu()<=25){
           System.out.println("sangat lembab");
       }else if(bersih.getsuhu()<=35){
           System.out.println("suhu sesuai");
       }else{
           System.out.println("suhu terlalu panas");
       }
    }
    public static void main(String [] args){
        ControlKebersihan k= new ControlKebersihan();
       k.ceksirkulasi();
       k.cahaya();
       k.kelembapan();
       k.suhu();
        
    }
}
