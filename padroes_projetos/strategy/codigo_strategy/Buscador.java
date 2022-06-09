import java.util.List;

public class Buscador {
	
	private Busca b;
	
	public void setB(Busca busca){
		b = busca;
	}
	
	public void realizarImpressao(List pEncontrados){
		
		b.imprimirBusca(pEncontrados);
		
	}

}
