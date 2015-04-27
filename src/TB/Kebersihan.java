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
public class Kebersihan {
  private int sirkulasi;
  private int pencahayaan;
  private int lembab;
  private int suhu;
  
  public void setsirkulasi(int sirkulasi){
      this.sirkulasi=sirkulasi;
  }
  public int getsirkulasi(){
      return sirkulasi;
  }
  
  public void setpencahayaan(int pencahayaan){
      this.pencahayaan=pencahayaan;
  }
  public int getpencahayaan(){
      return pencahayaan;
  }
  
  public void setlembab(int lembab){
      this.lembab=lembab;
  }
  public int getlembab(){
      return lembab;
  }
  
  public void setsuhu(int suhu){
      this.suhu=suhu;
  }
  public int getsuhu(){
      return suhu;
  }
}
