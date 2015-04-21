/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leb;

/**
 *
 * @author mozaze
 */
public class Buku {
  private String nama;
  private String judul;
  private int jml_hal;
  
  public void setnama(String nama){
     this.nama=nama;
  }
  public String getnama(){
      return nama;
  }
  
  public void setjudul(String judul){
      this.judul=judul;
  }
  public String getjudul(){
      return judul;
  }
  
  public void getjml_hal(int jml_hal){
      this.jml_hal=jml_hal;
  }
  public int getjml_hal(){
      return jml_hal;
  }
}
