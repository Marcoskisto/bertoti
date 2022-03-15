import java.util.List;


public class BuscaRecursosHumanos implements Busca{
	
	public void imprimirBusca(List produtos){
		if(!produtos.isEmpty()){
			for(Object i : produtos){
				Pessoa prod = (Pessoa)i;
				System.out.println("Nome: "+prod.getNome());
				System.out.println("Setor: "+prod.getSetor());
				System.out.println("Cargo: "+prod.getCargo());
			}
		} else {
			System.out.println("Nenhum funcionario encontrado");
		}
		
		
	}

}
