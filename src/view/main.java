package view;

import java.util.Random;

import controller.MenorController;

public class main {
	public static void main(String[] args) {
		Random gerador = new Random();
		int vt[] = new int[gerador.nextInt(5)+1];
		int tamanho = vt.length;
		for(int i =0; i<tamanho;i++) {
			vt[i]=gerador.nextInt(10)+1;
			System.out.print(vt[i]+",");
		}
		MenorController m = new MenorController();
		int ultvalor = vt[tamanho-1];
		ultvalor = m.calculaMenor(vt, tamanho, ultvalor);
		System.out.println("Menor valor:"+ultvalor);
	}
}
