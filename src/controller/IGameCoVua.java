package controller;

import model.QuanCo;
import model.ViTri;

public interface IGameCoVua {
	public int trangThai(int nguoiChoi);

	public boolean vuaAnToan(int player, int viTriDau, int viTriCuoi);

	public boolean kiemTraChieuTuong(int player);

	public boolean totChieu(QuanCo vua);

	public boolean maChieu(QuanCo vua);

	public boolean vuaChieu(QuanCo vua);

	public boolean tuongChieu(QuanCo vua);

	public boolean xeChieu(QuanCo vua);

	public boolean hauChieu(QuanCo vua);

	public ViTri getViTri();

	public void setViTri(ViTri viTri);

	public QuanCo getVuaNguoi();

	public void setVuaNguoi(QuanCo vuaNguoi);

	public QuanCo getVuaMay();

	public void setVuaMay(QuanCo vuaMay);
}
