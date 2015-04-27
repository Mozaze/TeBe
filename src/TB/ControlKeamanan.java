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
import java.util.Scanner;
public class ControlKeamanan {
    Scanner scan= new Scanner(System.in);
    Keamanan aman= new Keamanan();
    void cekkokoh(){
        System.out.print("masukkan kondisi bangunan:");
        aman.setKondisi(scan.next());
        System.out.println("/........................../");
        if(aman.getKondisi().equals("oke")){
            System.out.println("bangunan oke sip");
        }else{
            System.out.println("bangunan perlu renofasi");
        }
        System.out.println("/........................../");
    }
    
    
    void cekaman(){
        System.out.print("apakah kunci ada?:");
        aman.setKunci(scan.next());
        System.out.print("apakah jendela aman:");
        aman.setJendela(scan.next());
        System.out.println("/........................../");
        if(aman.getKunci().equals("ada")&&aman.getJendela().equals("aman")){
            System.out.println("keamanan oke sip");
        }else{
            System.out.println("rawan pencurian");
        }
        System.out.println("/........................../");
    }
    
    void deteksibahaya(){
        System.out.println("Deteksi bahaya");
        System.out.println("/........................../");
        if(aman.getKondisi().equals("oke")&&aman.getKunci().equals("ada")){
            System.out.println("bahaya teratasi");
        }else{
            System.out.println("banyak bahaya di ruangan itu");
        }
        System.out.println("/........................../");
    }
    
    
    
    
    
    public static void main(String [] args){
        ControlKeamanan oke = new ControlKeamanan();
        oke.cekkokoh();
        oke.cekaman();
        oke.deteksibahaya();
    }
    
}
