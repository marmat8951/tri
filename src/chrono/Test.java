package chrono;

public class Test {

	public static void main(String[] args) {
		Chrono c1=new Chrono();
		c1.start();
		for(long i=1;i<1000000000;i++){
			
		}
		c1.stop();
		Chrono c2=new Chrono();
		c2.start();
		for(long i=1000000000; i>0;i--){
			
		}
		c2.stop();
		
		System.out.println("C1: "+c1);
		System.out.println("C2: "+c2);
		
		
	}

}
