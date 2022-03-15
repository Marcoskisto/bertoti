import java.util.List;


public class BuscaFinanceiro implements Busca{
	
	public void imprimirBusca(List pessoas){
		
		if(!pessoas.isEmpty()){
			for(Object i : pessoas){
				Pessoa pessoa = (Pessoa)i;
				System.out.println("Nome: "+pessoa.getNome());
				System.out.println("Prateleira: "+pessoa.getSalario());
			}
		} else {
			System.out.println("Nenhum funcionario encontrado");
		}
		
	}

}
