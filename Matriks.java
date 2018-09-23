import java.util.*;

class Matriks {
	private int baris;
	private int kolom;
	private double[][] M;

	/* GETTER */
	public int GetBaris() {
		return baris;
	}
	public int GetKolom() {
		return kolom;
	}
	public double GetElmt(int m, int n) {
		return M[m][n];
	}

	/* SETTER */
	public void SetBaris(int x) {
		this.baris = x;
	}
	public void SetKolom(int y) {
		this.kolom = y;
	}
	public void SetElmt(int x, int y, double z) {
		this.M[x][y] = z;
	}

	/* KONSTRUKTOR */
	Matriks(int m, int n) {
		this.SetBaris(m);
		this.SetKolom(n);
		M = new double[m+1][n+1];
	}

	/* I/O */
	public void BacaMATRIKS() { //Baca Matriks dari keyboard
		Scanner in = new Scanner(System.in);
		for (int i = 1; i<=this.GetBaris(); i++) {
			for (int j = 1; j<=this.GetKolom(); j++) {
				double x = in.nextDouble();
				SetElmt(i,j,x);
			}
		} 
	} 

	public void TulisSOLUSI() {
		double[] TabSOLUSI = new double[this.GetKolom()];

		int i;
		for (i = 1; i < this.GetKolom(); i++) {
			TabSOLUSI[i] = 999;
		}

		double sum = 0;
		int n = 0;
		for (i = this.GetBaris(); i>=1; i--) {
			for (int j = 1; j<=this.GetKolom(); j++) {
				if (this.GetElmt(i,j) == 1) {
					n = j;
					sum = this.GetElmt(i,this.GetKolom());
				}
				else 
					if (j != this.GetKolom()) {
						sum -= this.GetElmt(i,j)*TabSOLUSI[j];
					}
			}
			TabSOLUSI[n] = sum;
		}

		for (i = 1; i < this.GetKolom(); i++) {
			System.out.println("X" + i + "=" + TabSOLUSI[i]);
		}
	}

	public void TulisMATRIKS() { //Baca Matriks dari keyboard
		for (int i = 1; i<=this.GetBaris(); i++) {
			for (int j = 1; j<=this.GetKolom(); j++) {
				System.out.print(this.GetElmt(i,j) + " ");
			}
			System.out.println("");
		} 
	} 
}