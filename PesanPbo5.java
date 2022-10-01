package AlCoffee;

public class PesanPbo5 {
  String nama, tipe, gula;
  Integer harga, qty;

  public PesanPbo5(String nama, Integer harga, Integer qty) {
    this.nama = nama;
    this.harga = harga;
    this.qty = qty;
  }

  public String getNama() {
    return nama;
  }

  public String getTipe() {
    return tipe;
  }

  public String getGula() {
    return gula;
  }

  public Integer getHarga() {
    return harga;
  }

  public Integer getQty() {
    return qty;
  }

}
