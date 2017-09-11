package main;

import java.util.Random;

import chrono.Chrono;

public class Main {

	public static void main(String[] args) {
		
		Generateur g=new Generateur();
		int[] tab= g.generatonTabEntierEntreRandom(0, 30);
		System.out.println(g.afficheTableau(tab));
		
		Chrono c=new Chrono();
		Verifieur v=new Verifieur();
		Random r=new Random();
		int tmp;
		int idx1;
		int idx2;
		long i=0;
		c.start();
		while(!v.isInOrder(tab)){
			idx1=r.nextInt(tab.length);
			idx2=r.nextInt(tab.length);
			tmp=tab[idx1];
			tab[idx1]=tab[idx2];
			tab[idx2]=tmp;
			i++;
			System.out.println("Itération: "+i+" inversion de l'indice "+idx1+" val: "+tab[idx1]+" et "+idx2+" val: "+tab[idx2]);
		}
		c.stop();
		c.toString();
		System.out.println(g.afficheTableau(tab));
		System.out.println("nb Itérations: "+i);
	}

}
