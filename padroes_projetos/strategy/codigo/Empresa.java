import java.util.List;

public class Empresa {
	
	private Busca b;
	
	public void setB(Busca busca){
		b = busca;
	}
	
	public void realizarImpressao(List pEncontrados){
		
		b.imprimirBusca(pEncontrados);
		
	}

}
