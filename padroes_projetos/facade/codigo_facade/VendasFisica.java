
public class VendasFisica implements FacadeCalculoBase{

	private double fatorDeBonus = 0.15;
	private FuncionarioData func;
	
	public VendasFisica(FuncionarioData func) {
		// TODO Auto-generated constructor stub
		this.func = func;
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		
		return this.func.getSalario() * this.func.getProdutividade() * this.fatorDeBonus;
	}


	

}
