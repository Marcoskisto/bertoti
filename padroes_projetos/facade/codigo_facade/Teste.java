import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		List<FuncionarioData> funcionarios = new ArrayList<FuncionarioData>();
		
		funcionarios.add(new FuncionarioData("vendasFisica", 2000, 0.8));
		funcionarios.add(new FuncionarioData("vendasOnline", 1900, 0.4));
		funcionarios.add(new FuncionarioData("televendas", 1500, 0.3));
		funcionarios.add(new FuncionarioData("posVendas", 2500, 0.1));
		funcionarios.add(new FuncionarioData("retencao", 1800, 0.7));
		
		for (FuncionarioData func: funcionarios) {
			FacadeCalculoBase calculo = Calculadora.getCalculo(func);
		
			System.out.println(
					"Bonus do funcionario de "+ func.getSetor() +" com salario de R$ "
					+ func.getSalario() +" e produtividade de "
					+ func.getProdutividade()*100 +"% : " + calculo.getBonus());
		}
	}	
}

