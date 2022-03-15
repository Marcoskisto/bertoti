
public class Teste {
	
	public static void main(String[] args) {
		
		
		Empresa tabajara = new Empresa();
		tabajara.setB(new BuscaFinanceiro());
		
		Efetivo e = new Efetivo(tabajara);
		inicializarEfetivo(e);
		
		
		e.buscar(new Pessoa("maria", 1000.00, "Operacoes", "encarregado", new Matches1()));
		
		tabajara.setB(new BuscaRecursosHumanos());
		
		System.out.println("-----------------------------");
		
		
		e.buscar(new Pessoa("maria", 1000.00, "Operacoes", "encarregado", new Matches2()));
		
	}
	
	public static void inicializarEfetivo(Efetivo efetivo){
		efetivo.addColaborador(new Pessoa("maria", 1800.0, "Transporte","auxiliar"));
		efetivo.addColaborador(new Pessoa("maria", 5000.0, "Vendas", "gerente"));
		efetivo.addColaborador(new Pessoa("maria", 8500.0, "Diretoria", "chefe"));
	}

}
