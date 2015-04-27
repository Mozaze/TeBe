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
public class Keamanan {
  private String kokoh;
  private String kunci;
  private String jendela;
  private String kondisi;
  
  public void setkokoh(String kokoh){
   this.kokoh=kokoh;
  }

    /**
     * @return the kokoh
     */
    public String getKokoh() {
        return kokoh;
    }

    /**
     * @return the kunci
     */
    public String getKunci() {
        return kunci;
    }

    /**
     * @param kunci the kunci to set
     */
    public void setKunci(String kunci) {
        this.kunci = kunci;
    }

    /**
     * @return the jendela
     */
    public String getJendela() {
        return jendela;
    }

    /**
     * @param jendela the jendela to set
     */
    public void setJendela(String jendela) {
        this.jendela = jendela;
    }

    /**
     * @return the kondisi
     */
    public String getKondisi() {
        return kondisi;
    }

    /**
     * @param kondisi the kondisi to set
     */
    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
}
