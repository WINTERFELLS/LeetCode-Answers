package seu.Andre.test;

import java.util.Scanner;

public class Main {
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		if (a[0].length != b.length) {
			return null;
		}
		double[][] c = new double[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
	/* ��ӡһ������ */
	public static void printMatrix(double[][] c) {
		if (c != null) {
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[0].length; j++) {
					System.out.printf("%-8.1f", c[i][j]); // ����1λС��;
				}
				System.out.println();
			}
		} else {
			System.out.println("��Ч");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input m=");
		int m = input.nextInt();
		System.out.println("Input n=");
		int n = input.nextInt();
		System.out.println("Input k=");
		int k = input.nextInt();
		double[][] a = new double[m][n]; // ����һ��m*n�ľ���
		double[][] b = new double[n][k]; // ����һ��n*k�ľ���
		System.out.println("��������������������a:");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = input.nextDouble();
		System.out.println("��������������������b:");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < k; j++)
				b[i][j] = input.nextDouble();
		double[][] c = multiplyMatrix(a, b);
		System.out.println("Matrix a:");
		printMatrix(a); // ��ӡa
		System.out.println("Matrix b:");
		printMatrix(b); // ��ӡb
		System.out.println("Matrix c:");
		printMatrix(c); // ��ӡc
		input.close();
	}
}
