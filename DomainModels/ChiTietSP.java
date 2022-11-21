/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Soldier Boy
 */
public class ChiTietSP {

    private String Id;
    private String IdSP;
    private String IdNsx;
    private String IdMauSac;
    private String IdDongSP;
    private int NamBH;
    private String MoTa;
    private int SoLuongTon;
    private double GiaNhap;
    private double GiaBan;

    public ChiTietSP() {
    }

    public ChiTietSP(String Id, String IdSP, String IdNsx, String IdMauSac, String IdDongSP, int NamBH, String MoTa, int SoLuongTon, double GiaNhap, double GiaBan) {
        this.Id = Id;
        this.IdSP = IdSP;
        this.IdNsx = IdNsx;
        this.IdMauSac = IdMauSac;
        this.IdDongSP = IdDongSP;
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

    public String getIdSP() {
        return IdSP;
    }

    public void setIdSP(String IdSP) {
        this.IdSP = IdSP;
    }

    public String getIdNsx() {
        return IdNsx;
    }

    public void setIdNsx(String IdNsx) {
        this.IdNsx = IdNsx;
    }

    public String getIdMauSac() {
        return IdMauSac;
    }

    public void setIdMauSac(String IdMauSac) {
        this.IdMauSac = IdMauSac;
    }

    public String getIdDongSP() {
        return IdDongSP;
    }

    public void setIdDongSP(String IdDongSP) {
        this.IdDongSP = IdDongSP;
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
