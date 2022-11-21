/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author Soldier Boy
 */
public class ChiTietSPResponse {

    private String Id;
    private int NamBH;
    private String MoTa;
    private int SoLuongTon;
    private double GiaNhap;
    private double GiaBan;

    public ChiTietSPResponse() {
    }

    public ChiTietSPResponse(String Id, int NamBH, String MoTa, int SoLuongTon, double GiaNhap, double GiaBan) {
        this.Id = Id;
        this.NamBH = NamBH;
        this.MoTa = MoTa;
        this.SoLuongTon = SoLuongTon;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getNamBH() {
        return NamBH;
    }

    public void setNamBH(int NamBH) {
        this.NamBH = NamBH;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    public double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }
}
