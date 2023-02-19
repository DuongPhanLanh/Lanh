package BT_1;

 import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.HashSet;
import java.util.Scanner;
 // import java.util.Set;

public class CauHoi {
	
	public  static void cau1() {
		float a, b, x ;
		System.out.println("Pt bac 1");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap a");
			a = sc.nextFloat();
			System.out.println("Nhap b");
			b = sc.nextFloat();
		}
		if(a==0 && b>=0) {
			System.out.println("Pt vo nghiem");
		}else if(a==0 && b==0){
			System.out.println("Pt vo so nghiem");
		}else if(a>0 && b>0){
			x = -b/a;
			System.out.println("Gia tri la: "+x);
		}
	}
	
	public static void cau2() {
		double a, b, c, x1, x2, D;
		System.out.println("Pt bac 2");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap a");
			a = sc.nextDouble();
			System.out.println("Nhap b");
			b = sc.nextDouble();
			System.out.println("Nhap c");
			c = sc.nextDouble();
		}
		
		D = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) {
			System.out.println("Nhap loi");
		} else {
			if (D < 0) {
				System.out.println("Pt vo nghiem");
			} else if (D == 0) {
				x1 = -b / (2 * a);
				System.out.println("Pt co nghiem kep la" + x1);
			} else {
				x1 = (-b - Math.sqrt(D)) / (2 * a);
				x2 = (-b + Math.sqrt(D)) / (2 * a);
				System.out.println("Pt co 2 ngiem la:");
				System.out.println("gia tri x1 la: " + x1);
				System.out.println("gia tri x2 la: "+ x2);
			}
		}
	}
	
	public static void cau3() {
		double soDien;
		System.out.println("Tinh tien dien");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("SoDien sua dung");
			soDien = sc.nextDouble();
		}
		if(soDien>0 && soDien<50) {
			double x1 = soDien*1000;
			System.out.println("Gia tien la: "+x1);
		}else if(soDien>50) {
			double x2 = soDien*1000 + (soDien-50) * 1200;
			System.out.println("Gia tien la: "+x2);
		}
	}
	
	 static boolean cau5(double x) {
		 double y = Math.sqrt(x);
	       return ((y - Math.floor(y)) == 0);      
	}
	 
	public static void cau6() {
		System.out.println("Diem trung binh ");
		double a, b, c, Hk;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap diem Toan: ");
			a = sc.nextDouble();
			System.out.println("Nhap diem Ly: ");
			b = sc.nextDouble();
			System.out.println("Nhap diem Hoa: ");
			c = sc.nextDouble();
		}
		Hk = (a+b+c)/3;
		if(Hk<5) {
			System.out.println("Kem");
		}else if(Hk>5 && Hk<7) {
			System.out.println("Trung Binh");
		}else if(Hk>7 && Hk<8) {
			System.out.println("Kha");
		}else if(Hk>8)  {
			System.out.println("Gioi");
		}else if(Hk>10 || Hk<0) {
			System.out.println("Diem bi nhap sai");
		}
	}
	
	public static void cau7() {
		int a, b, c;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap gia tri hang tram");
			a= sc.nextInt();
			System.out.println("Nhap gia tri hang chuc");
			b = sc.nextInt();
			System.out.println("Nha gia tri hang don vi");
			c = sc.nextInt();
		}
		switch (a) {
		case 1:
			System.out.println("Mot tram");
			break;
		case 2:
			System.out.println("Hai tram");
			break;
		case 3:
			System.out.println("Ba tram");
			break;
		case 4:
			System.out.println("Bon tram");
			break;
		case 5:
			System.out.println("Nam tram");
			break;
		case 6:
			System.out.println("Sau tram");
			break;
		case 7:
			System.out.println("Bay tram");
			break;
		case 8:
			System.out.println("Tam tram");
			break;
		case 9:
			System.out.println("Chin tram");
			break;
		case 0:
			System.out.println("khong tram");
			break;

		default:
			System.out.println("Nhap loi");
			break;
		}
		switch (b) {
		case 1:
			System.out.println("Muoi");
			break;
		case 2:
			System.out.println("Hai muoi");
			break;
		case 3:
			System.out.println("Ba muoi");
			break;
		case 4:
			System.out.println("Bon muoi");
			break;
		case 5:
			System.out.println("Nam muoi");
			break;
		case 6:
			System.out.println("Sau muoi");
			break;
		case 7:
			System.out.println("Bay muoi");
			break;
		case 8:
			System.out.println("Tam muoi");
			break;
		case 9:
			System.out.println("Chin muoi");
			break;
		case 0:
			System.out.println("le");
			break;

		default:
			System.out.println("Nhap loi");
			break;
		}
		switch (c) {
		case 1:
			System.out.println("Mot ");
			break;
		case 2:
			System.out.println("Hai ");
			break;
		case 3:
			System.out.println("Ba ");
			break;
		case 4:
			System.out.println("Bon ");
			break;
		case 5:
			System.out.println("Nam ");
			break;
		case 6:
			System.out.println("Sau ");
			break;
		case 7:
			System.out.println("Bay ");
			break;
		case 8:
			System.out.println("Tam ");
			break;
		case 9:
			System.out.println("Chin ");
			break;
		case 0:
			System.out.println("0");
			break;

		default:
			System.out.println("Nhap loi");
			break;
		}
		
	}
	
	public  static long cau8(int n) {
		long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }
	
	public static void cau9() {
		
		int n = 1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Cac so tu 1 den 9\n");
			System.out.println("Nhap so can xoa");
			n = sc.nextInt();
		}
		String[] arr = {"1", "2" , "3", "4", "5", "6", "7", "8", "9"};
      
        List<String> testList = new ArrayList<>(Arrays.asList(arr));
        
       
        System.out.println("Dong Array chua mang:\n"+ testList); 

        switch (n) {
		case 1: {
			testList.remove(0);
			break;
		}
		case 2: {
			testList.remove(1);
			break;
		}
		case 3: {
			testList.remove(2);
			break;
		}
		case 4: {
			testList.remove(3);
			break;
		}
		case 5: {
			testList.remove(4);
			break;
		}
		case 6: {
			testList.remove(5);
			break;
		}
		case 7: {
			testList.remove(6);
			break;
		}
		case 8: {
			testList.remove(7);
			break;
		}
		case 9: {
			testList.remove(8);
			break;
		}
		case 10: {
			testList.remove(9);
			break;
		}
		default:
			System.out.println("Nhap du lieu sai\n");
		}
        
        System.out.println("Xoa phan tu thu n da nhap trong ArrayList:\n"+ testList);  
        arr = testList.toArray(new String[0]);
        
        
        System.out.println("Mang ket qua :\n"+Arrays.toString(arr));
	}
	public static void cau10() {
		int m, n;
	    int soPhanTu0 = 0;      
	    int soPhanTuKhac0 = 0;  
	    try (Scanner sc = new Scanner(System.in)) {
			do {
			    System.out.println("Nhap so dong: ");
			    m = sc.nextInt();
			    System.out.println("Nhap so cot: ");
			    n = sc.nextInt();
			} while (m < 1 || n < 1);
			   
			int A[][] = new int[m][n];
			     
			System.out.println("Nhap cac phan tu ma tran");
			for (int i = 0; i < m; i++) {
			    for (int j = 0; j < n; j++) {
			        System.out.print("A[" + i + "," + j + "] = ");
			        A[i][j] = sc.nextInt();
			    }
			}
			     
			System.out.println("Ma tran vua nhap la: ");
			for (int i = 0; i < m; i++) {
			    for (int j = 0; j < n; j++) {
			        System.out.print(A[i][j] + "\t");
			    }
			    System.out.println("\n");
			}
			
			for (int i = 0; i < m; i++) {
			    for (int j = 0; j < n; j++) {
			        if (A[i][j] == 0) {
			            soPhanTu0++;
			        } else {
			            soPhanTuKhac0++;
			        }
			   }
		}
		}
	         
	    if (soPhanTu0 > soPhanTuKhac0) {
	        System.out.println("La ma tran doi xung");
	    } else {
	        System.out.println("Ko phai la ma tran doi xung");
	    }

	}
	
	public static void main(String[] args) {
		int luaChon = 0;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("--------");	
				System.out.println("MENU");
				System.out.println("1.Pt bac nhat");
				System.out.println("2.Pt bac 2");
				System.out.println("3.kiem tra tien dien");
				System.out.println("4.Quay lai MENU");
				System.out.println("5.kiem tra so chinh phuong");
				System.out.println("6.xet loai hoc sinh");
				System.out.println("7.nhap 1 so nguyen 3 nguyen to");
				System.out.println("8.tinh giai thua so nguyen");
				System.out.println("9.xoa phan tu x neu co");
				System.out.println("10.bai toan nhap vao ma tran doi xung cho do thi vo huong co trong so");
				System.out.println("0.Thoat khoi chuong trinh");
				
				luaChon = sc.nextInt();
				sc.nextLine();
				
				if(luaChon==1) {
					cau1();
					break;
					
					
				}else if(luaChon==2) {
					cau2();
					break;
					
				}else if(luaChon==3) {
					cau3();
					break;
					
				}else if(luaChon==4) {
					System.out.println("Tro ve MENU");
				}else if(luaChon==5) {
					System.out.println("Nhap so nguyen n");
					int n = sc.nextInt();
					if(cau5(n)) {
						System.out.println(n+" la so chinh phuong");
						break;
						
					}else {
						System.out.println(n+" ko la so chinh phuong");
						break;
						
					}
				}else if(luaChon==6) {
					cau6();
					break;
				}else if(luaChon==7) {
					cau7();
					break;
				}else if(luaChon==8) {
					System.out.println("Nhap n so nguyen");
					int n = sc.nextInt();
				while (true) {
					System.out.println("Giai thua la: "+CauHoi.cau8(n));
					 n++;
					 break;
					}
				}else if(luaChon==9) {
					cau9();
					break;
				}else if(luaChon==10) {
					cau10();
					break;
				}
			}while(luaChon != 0);
		}
	}
	}

		
		
		
		
		
		
