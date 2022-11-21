/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Soldier Boy
 */
public class NhanVien {
    private String Id;
    private String Ma;
    private String Ten;
    private String TenDem;
    private String Ho;
    private String GioiTinh;
    private String NgaySinh;
    private String DiaChi;
    private String SDT;
    private String MatKhau;
    private String IdCH;
    private String IdCV;
    private String IdGuiBC;
    private String TrangThai;

    public NhanVien(String Id, String Ma, String Ten, String TenDem, String Ho, String GioiTinh, String NgaySinh, String DiaChi, String SDT, String MatKhau, String IdCH, String IdCV, String IdGuiBC, String TrangThai) {
        this.Id = Id;
        this.Ma = Ma;
        this.Ten = Ten;
        this.TenDem = TenDem;
        this.Ho = Ho;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.MatKhau = MatKhau;
        this.IdCH = IdCH;
        this.IdCV = IdCV;
        this.IdGuiBC = IdGuiBC;
        this.TrangThai = TrangThai;
    }

    public NhanVien() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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

    public String getTenDem() {
        return TenDem;
    }

    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getIdCH() {
        return IdCH;
    }

    public void setIdCH(String IdCH) {
        this.IdCH = IdCH;
    }

    public String getIdCV() {
        return IdCV;
    }

    public void setIdCV(String IdCV) {
        this.IdCV = IdCV;
    }

    public String getIdGuiBC() {
        return IdGuiBC;
    }

    public void setIdGuiBC(String IdGuiBC) {
        this.IdGuiBC = IdGuiBC;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
}
