
public class Teste {
	
	public static void main(String[] args) {
		
		
		Buscador tabajara = new Buscador();
		tabajara.setB(new BuscaFinanceiro());
		
		Efetivo e = new Efetivo(tabajara);
		inicializarEfetivo(e);
		
		
		e.buscar(new Pessoa("maria", 5000.00, "Operacoes", "encarregado", new MatchesSalario()));
		
		tabajara.setB(new BuscaRecursosHumanos());
		
		System.out.println("-----------------------------");
		
		
		e.buscar(new Pessoa("maria", 1000.00, "Operacoes", "encarregado", new MatchesNome()));
		
	}
	
	public static void inicializarEfetivo(Efetivo efetivo){
		efetivo.addColaborador(new Pessoa("maria", 1800.0, "Transporte","auxiliar"));
		efetivo.addColaborador(new Pessoa("josé", 5000.0, "Vendas", "gerente"));
		efetivo.addColaborador(new Pessoa("ausira", 8500.0, "Diretoria", "chefe"));
	}

}
