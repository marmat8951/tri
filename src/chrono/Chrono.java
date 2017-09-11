package chrono;

public class Chrono {

	private long hdeb=-1;
	private long hfin=-1;
	
	public void start(){
		hdeb=System.nanoTime();
		hfin=-1;
	}
	
	public void stop(){
		hfin=System.nanoTime();
	}
	public String toString(){
		if(hdeb<0){
			return "Chrono non démaré";
		}else if(hfin<0){
			return "Chrono non arreté. Temps actuel: "+(System.nanoTime()-hdeb)+" ns";
		}else{
			return hfin-hdeb+" ns";
		}
		
	}
}
