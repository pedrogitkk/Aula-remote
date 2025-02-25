
public class ClassePincipal {

	public static void main(String[] args) {
		Pessoa objetoPedro = new Pessoa();
		
		objetoPedro.atributoNome = "Pedro";
		objetoPedro.atributoIdade = 24;
		objetoPedro.atributoRenda = 1000.00f;
		objetoPedro.atributoTrabalhando = true;
		
		
		Pessoa objetoMatheus = new Pessoa();
		
		objetoMatheus.atributoNome = "Matheus";
		objetoMatheus.atributoIdade = 22;
		objetoMatheus.atributoRenda = 1000.00f;
		objetoMatheus.atributoTrabalhando = true;
		
		
		System.out.println(objetoPedro.atributoNome);
		System.out.println(objetoMatheus.atributoNome);
		
		int variavel = objetoPedro.enviarNumero();
		
		
		objetoPedro.imprimirValor();
		
	}

}
