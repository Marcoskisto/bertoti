
public class Calculadora {
	public static FacadeCalculoBase getCalculo(FuncionarioData func) {
		String setor = func.getSetor();
		if(setor == "vendasFisica") {
			return  new VendasFisica(func);
		}else if(setor == "televendas") {
			return new Televendas(func);
		}else if(setor == "vendasOnline") {
			return new VendasOnline(func);
		}else if(setor == "posVendas") {
			return new PosVendas(func);
		}else if(setor == "retencao") {
			return new Retencao(func);		
		}
		return null;
	}
}
