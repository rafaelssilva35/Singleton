package pessoa;

public class Pessoa {

	private static Pessoa instance;
	private Pessoa(){}
	
	public static Pessoa getInstance() {
		if(instance == null) {
			synchronized (Pessoa.class) {
				if(instance == null) {
					instance = new Pessoa(); 
				}
			}
		}
		
		return instance;
	}
	
}
