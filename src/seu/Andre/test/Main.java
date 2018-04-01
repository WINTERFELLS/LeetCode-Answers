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
	/* 打印一个矩阵 */
	public static void printMatrix(double[][] c) {
		if (c != null) {
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[0].length; j++) {
					System.out.printf("%-8.1f", c[i][j]); // 保留1位小数;
				}
				System.out.println();
			}
		} else {
			System.out.println("无效");
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
		double[][] a = new double[m][n]; // 定义一个m*n的矩阵
		double[][] b = new double[n][k]; // 定义一个n*k的矩阵
		System.out.println("输入连续的数构成数组a:");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = input.nextDouble();
		System.out.println("输入连续的数构成数组b:");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < k; j++)
				b[i][j] = input.nextDouble();
		double[][] c = multiplyMatrix(a, b);
		System.out.println("Matrix a:");
		printMatrix(a); // 打印a
		System.out.println("Matrix b:");
		printMatrix(b); // 打印b
		System.out.println("Matrix c:");
		printMatrix(c); // 打印c
		input.close();
	}
}
