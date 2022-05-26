
public class Televendas implements FacadeCalculoBase {
	
	private double fatorDeBonus = 0.4;
	private FuncionarioData func;
	
	public Televendas(FuncionarioData func) {
		// TODO Auto-generated constructor stub
		this.func = func;
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return this.func.getSalario() * this.func.getProdutividade() * this.fatorDeBonus;
	}
}
