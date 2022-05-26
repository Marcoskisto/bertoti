
public class VendasOnline implements FacadeCalculoBase {
	
	private double fatorDeBonus = 0.3;
	private FuncionarioData func;
	
	public VendasOnline(FuncionarioData func) {
		// TODO Auto-generated constructor stub
		this.func = func;
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		
		return this.func.getSalario() * this.func.getProdutividade() * this.fatorDeBonus;
	}

}
