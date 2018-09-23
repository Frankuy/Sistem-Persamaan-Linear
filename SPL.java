import java.util.*;
import java.io.*;

class SPL {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1. Sistem Persamaan Linear");
		System.out.println("2. Interpolasi Polinom");
		System.out.println("3. Keluar");
		int menu = in.nextInt();

		while (menu != 3) {
			if (menu == 1) {
				System.out.println("1. Metode Eliminasi Gauss");
				System.out.println("2. Metode Eliminasi Gauss-Jordan");
				int submenu = in.nextInt();

				while (submenu != 1 && submenu != 2) {
					System.out.println("Masukkan salah");
					submenu = in.nextInt();
				}

				if (submenu == 1) {
					//CEK FILE EKSTERNAL
					Scanner hai = new Scanner(System.in);
					System.out.println("Masukkan direktori File Eksternal : ");
					String filename = hai.nextLine();

					if (!filename.equals("-")) {
						//File file = new File(filename);
						//BacaFILE(file, &M); //MASUKIN MASUKAN DARI FILE KE MATRIKS M
					}
					else {
						System.out.print("Baris : ");
						int m = in.nextInt();

						System.out.print("Kolom : ");
						int n = in.nextInt();

						Matriks M = new Matriks(m,n);
						M.BacaMATRIKS();
						M.TulisMATRIKS();
					}

					//JALANIN ELIMINASI GAUSS
					//ElimGauss(M, m, n, &arr, &solusi); arr adalah array float untuk menyimpan solusi, apakah ada solusi nya

					/* 
							//TulisSOLUSI(arr, solusi);
					*/
					
					//menu = 3;
				}
				else if (submenu == 2) {
					//JALANIN ELMINASI GAUSS-JORDAN

					menu = 3;
				} 
			}
			else if (menu == 2) {
				System.out.println("1. Metode Eliminasi Gauss");
				System.out.println("2. Metode Eliminasi Gauss-Jordan");
				int submenu = in.nextInt();

				while (submenu != 1 && submenu != 2) {
					System.out.println("Masukkan salah");
					submenu = in.nextInt();
				}

				if (submenu == 1) {
					//JALANIN ELIMINASI GAUSS

					menu = 3;
				}
				else if (submenu == 2) {
					//JALANIN ELMINASI GAUSS-JORDAN
					menu = 3;
				}
			}
			else {
				System.out.println("Masukkan salah");
				menu = in.nextInt();
			}
		}
	}	
}
