/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author Soldier Boy
 */
public class CuaHangResponse {

    private String Ma;
    private String Ten;
    private String DiaChi;
    private String ThanhPho;
    private String QuocGia;

    public CuaHangResponse() {
    }

    public CuaHangResponse(String Ma, String Ten, String DiaChi, String ThanhPho, String QuocGia) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.DiaChi = DiaChi;
        this.ThanhPho = ThanhPho;
        this.QuocGia = QuocGia;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho(String ThanhPho) {
        this.ThanhPho = ThanhPho;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    public String mdt() {
        if (QuocGia.equals("Việt Nam")) {
            return "84";
        } else if (QuocGia.equals("Trung Quốc")) {
            return "86";
        } else if (QuocGia.equals("Nhật Bản")) {
            return "81";
        }
        return "0";
    }
}
