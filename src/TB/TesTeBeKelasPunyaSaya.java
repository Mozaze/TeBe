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
//import java.awt.Dimension;
public class TesTeBeKelasPunyaSaya {
    public static void main(String [] zaze){
        ControlKebersihan bersihsekali= new ControlKebersihan();
        bersihsekali.inputcahaya();
        bersihsekali.inputsirkulasi();
        bersihsekali.inputlembab();
        bersihsekali.inputsuhu();
        bersihsekali.cahaya();
        bersihsekali.ceksirkulasi();
        bersihsekali.kelembapan();
        bersihsekali.suhu();
         System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        ControlKeamanan amansekali= new ControlKeamanan();
        amansekali.inputkokoh();
        amansekali.inputkokoh();
        amansekali.cekkokoh();
        amansekali.cekaman();
        amansekali.deteksibahaya();
        
        
        
        
    }
}
