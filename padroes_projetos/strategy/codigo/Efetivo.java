import java.util.List;
import java.util.LinkedList;

public class Efetivo {
	
	private List<Pessoa> lista;
	
	private Empresa empresa;
	
	public Efetivo(Empresa emp){
		lista = new LinkedList<Pessoa>();
		empresa = emp;
	}
	
	public void addColaborador(Pessoa p){
		lista.add(p);
	}
	
	public void buscar(Pessoa p){
		List l = new LinkedList();
		for(Object i : lista){
			Pessoa pessoa = (Pessoa)i;
			if(p.matches(pessoa)) l.add(pessoa); //aqui a ordem teve que ser invertida, ou seja, tive que chamar o matches de p, que eh passado como argumento e tem o atributo matches setado, e nao chamar o matches de prod, que eh o produto do estoque e nao tem o matches setado - pois se o matches de prod fosse chamado, daria NullPointer
		}
		empresa.realizarImpressao(l);
		
	}

}
