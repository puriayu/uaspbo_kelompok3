/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentalsepedamotor;

/**
 *
 * @author Kelompok 3
 */
abstract class Motor {
  private String nama;
  private String merek;
  private int harga;

  public Motor(String nama, String merek, int harga) {
    this.nama = nama;
    this.merek = merek;
    this.harga = harga;
  }
   public abstract void info();

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getMerek() {
    return merek;
  }

  public void setMerek(String merek) {
    this.merek = merek;
  }

  public int getHarga() {
    return harga;
  }

  public void setHarga(int harga) {
    this.harga = harga;
  }
}

