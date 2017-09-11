package main;

import java.util.ArrayList;
import java.util.Random;

public class Generateur {
	public Generateur(){
		
	}
	
	public int[] generationTabEntierEntre(int debut, int fin){
		
		int [] res = new int [fin-debut];
		for(int i=0;i<res.length;i++){
			res[i]=debut+i;
		}
		return res;
		
	}
	
	public int[] generatonTabEntierEntreRandom(int debut, int fin){
		int [] res = new int [fin-debut];
		ArrayList<Integer> listeNombres=new ArrayList<Integer>();
		ArrayList<Integer> listeIndex=new ArrayList<Integer>();
		for(int i=0;i<res.length;i++){
			listeNombres.add(debut+i);
			listeIndex.add(i);
		}
		Random r=new Random();
		while(listeNombres.size()>0){
			int indexchoisi=r.nextInt(listeIndex.size());
			res[listeIndex.get(indexchoisi)]=listeNombres.get(0);
			listeIndex.remove(indexchoisi);
			listeNombres.remove(listeNombres.get(0));
		}
		return res;
	}
	
	public String afficheTableau(int [] tab){
		String res="";
		for(int i=0;i<tab.length;i++){
			res+=i+" : "+tab[i]+"\n";
		}
		return res;
	}
	
}
