package controller;

public class MenorController {
	public int calculaMenor(int vt[], int tamanho , int ultposicao) {
		//condiçao de parada
		if(tamanho == 0) {
			return ultposicao;
		}else {
			tamanho--;
			if(vt[tamanho]<ultposicao) {
				ultposicao = vt[tamanho];	
			}
		}
		return calculaMenor(vt,tamanho,ultposicao);

	}
}
