
public class Retencao implements FacadeCalculoBase {
	
	private double fatorDeBonus = 0.3;
	private FuncionarioData func;
	
	public Retencao(FuncionarioData func) {
		this.func = func;
	}
	
	@Override
	public double getBonus() {

		return this.func.getSalario() * this.func.getProdutividade() * this.fatorDeBonus;
	}

}
