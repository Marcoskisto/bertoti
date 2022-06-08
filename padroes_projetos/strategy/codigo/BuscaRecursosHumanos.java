import java.util.List;


public class BuscaRecursosHumanos implements Busca{
	
	public void imprimirBusca(List pessoas){
		if(!pessoas.isEmpty()){
			for(Object i : pessoas){
				Pessoa pessoa = (Pessoa)i;
				System.out.println("Nome: "+pessoa.getNome());
				System.out.println("Setor: "+pessoa.getSetor());
				System.out.println("Cargo: "+pessoa.getCargo());
			}
		} else {
			System.out.println("Nenhum funcionario encontrado");
		}
		
		
	}

}
