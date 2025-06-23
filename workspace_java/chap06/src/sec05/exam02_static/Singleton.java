package sec05.exam02_static;

public class Singleton {
	
	Singleton singleton = null;

	private Singleton() {
	
	//Singleton getInstance() {
		
		if(this.singleton ==null) 
				this.singleton = new Singleton ();
				
			
			
	}

}
