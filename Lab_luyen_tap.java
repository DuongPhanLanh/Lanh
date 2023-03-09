package Lab_luyen_tap;

public class Hoa_Qua {
	private double giaBan;
	private double can;
	private int Ngay;
	private double soLuong;
	private String xuatXu;
	private String tenHoaQua;
	
	
	
	public Hoa_Qua(double giaBan, double can, int ngay, double soLuong, String xuatXu, String tenHoaQua) {
//		super();
		this.giaBan = giaBan;
		this.can = can;
		Ngay = ngay;
		this.soLuong = soLuong;
		this.xuatXu = xuatXu;
		this.tenHoaQua = tenHoaQua;
	}
	
	


	public double getGiaBan() {
		return giaBan;
	}




	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}




	public double getCan() {
		return can;
	}




	public void setCan(double can) {
		this.can = can;
	}




	public int getNgay() {
		return Ngay;
	}




	public void setNgay(int ngay) {
		Ngay = ngay;
	}




	public double getSoLuong() {
		return soLuong;
	}




	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}




	public String getXuatXu() {
		return xuatXu;
	}




	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}




	public String getTenHoaQua() {
		return tenHoaQua;
	}




	public void setTenHoaQua(String tenHoaQua) {
		this.tenHoaQua = tenHoaQua;
	}




	public double GiaBanKg() {
		return this.giaBan/this.can;
	}
	
}

package Lab_luyen_tap;

public class Qua_Cam extends Hoa_Qua {

	public Qua_Cam(double giaBan, double can, int ngay, double soLuong, String xuatXu, String tenHoaQua) {
		super(giaBan, can, ngay, soLuong, xuatXu, tenHoaQua);
		// TODO Auto-generated constructor stub
	}

}
package Lab_luyen_tap;

public class Cam_Cao_Phong extends Qua_Cam {

	public Cam_Cao_Phong(double giaBan, double can, int ngay, double soLuong, String xuatXu, String tenHoaQua) {
		super(giaBan, can, ngay, soLuong, xuatXu, "Cam Cao Phong");
		// TODO Auto-generated constructor stub
	}
}

package Lab_luyen_tap;

public class Cam_Sanh extends Qua_Cam {

	public Cam_Sanh(double giaBan, double can, int ngay, double soLuong, String xuatXu, String tenHoaQua) {
		super(giaBan, can, ngay, soLuong, xuatXu, "Cam Sanh");
		// TODO Auto-generated constructor stub
	}
}

package Lab_luyen_tap;

public class Qua_Tao extends Hoa_Qua {

	public Qua_Tao(double giaBan, double can, int ngay, double soLuong, String xuatXu, String tenHoaQua) {
		super(giaBan, can, ngay, soLuong, xuatXu, tenHoaQua);
		// TODO Auto-generated constructor stub
	}

}

package Lab_luyen_tap;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String color, boolean filler, double radius) {
		super(color, filler);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	// Dien tich
	public double getArea() {
		return Math.PI*Math.pow(this.radius, 2);
	}
	// Chu vi
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}

package Lab_luyen_tap;

public class Rectangle extends Shape {
	private double width;
	private double  length;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(String color, boolean filler, double width, double length) {
		super(color, filler);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	// Dien tich
		public double getArea() {
			return this.width*this.length;
		}
	// Chu vi
		public double getPerimeter() {
			return (this.width+this.length)*2;
		}

		@Override
		public String toString() {
			return "Rectangle [width=" + width + ", length=" + length + "]";
		}
		
}

package Lab_luyen_tap;

public class Shape {
	private String color = "red";
	private boolean filler = true;
	
	public Shape() {
		
	}
	public Shape(String color, boolean filler) {
//		super();
		this.color = color;
		this.filler = filler;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFiller() {
		return filler;
	}
	public void setFiller(boolean filler) {
		this.filler = filler;
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + ", filler=" + filler + "]";
	}
}

package Lab_luyen_tap;

public class Square extends Rectangle {

	
	public Square() {
		
	}
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filler) {
		// super(side, side, color, filler);
	}
	public double getSide() {
		return getWidth();
	}
	public void setSide(double side) {
		setWidth(side);
		setLength(side);
	}
	public void setWidth(double width) {
		setSide(width);
	}
	public void setLength(double length) {
		setSide(length);
		
	}
	@Override
	public String toString() {
		return "Square [getSide()=" + getSide() + ", getWidth()=" + getWidth() + ", getLength()=" + getLength()
				+ ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + ", toString()=" + super.toString()
				+ ", getColor()=" + getColor() + ", isFiller()=" + isFiller() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}

package Lab_luyen_tap;

public class text0 {
	public static void main(String[] args) {
		Cam_Cao_Phong ccp = new Cam_Cao_Phong(230000, 10, 10, 9, "Binh Duong", null);
		Qua_Tao ct = new Qua_Tao(299999, 20, 20, 8, "ha Noi", "Tao Xanh");
		
		System.out.println(ct.getNgay());
		
		System.out.println(ccp.getTenHoaQua());
		System.out.println(ccp.GiaBanKg());
		
		// phan hinh vuong thi em chay ko duoc
		Square sq = new Square();
		Rectangle re = new Rectangle(20, 30);
		System.out.println(re.getArea());
		System.out.println(sq.getSide());
	}
}
