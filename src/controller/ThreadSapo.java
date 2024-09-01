/*4) Fazer uma aplicação de uma corrida de sapos, com 5 Threads, cada Thread
controlando 1 sapo. Deve haver um tamanho máximo para cada pulo do sapo (em metros)
e a distância máxima para que os sapos percorram. A cada salto, um sapo pode dar um salto de
0 até o tamanho máximo do salto (valor aleatório). Após dar um salto, a Thread, para cada sapo,
deve mostrar no console, qual foi o tamanho do salto e quanto
o sapo percorreu. Assim que o sapo percorrer a distância máxima, a Thread deve
apresentar que o sapo chegou e qual sua colocação.
Dica: O exercício deve ser resolvido todo em console, ou seja, como se estivesse sendo
narrado. Atenção para a forma de definir a ordem de chegada.
*/
package controller;

public class ThreadSapo extends Thread {
	
	private int distanciaPercorrida;
	private int distanciaTotal;
	private static int ranking;

	
	public ThreadSapo(int distanciaPercorrida, int distanciaTotal, int ranking) {
		this.distanciaPercorrida = distanciaPercorrida;
		this.distanciaTotal = distanciaTotal;
		this.ranking = ranking;
	}

	public void run() {
		int pulo = 0;
		int sapo = (int)threadId() - 28;
		while(distanciaPercorrida < distanciaTotal) {
			pulo = (int)((Math.random()* 10) + 1);
			distanciaPercorrida += pulo;
			System.out.println("Sapo #" + sapo + " pulou " + pulo + " metros. Distância total percorrida: " + distanciaPercorrida + " metros.\n");
			pulo = 0;
			
			if(distanciaPercorrida >= distanciaTotal) {
			
				ranking++;
				System.out.println("Sapo #" + sapo + " chegou em " + ranking + "º Lugar!!!!\n");
			}
				
				try {
	              sleep(1000);
	            } catch (InterruptedException e) {
	                System.err.println(e.getMessage());
	            }
		}
	}
}
