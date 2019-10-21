package principal;

import pessoa.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = Pessoa.getInstance();
		Pessoa pessoa2 = Pessoa.getInstance();
		
		System.out.println(pessoa1.hashCode());
		System.out.println(pessoa2.hashCode());
	}

}
