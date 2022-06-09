
public class FuncionarioData {
	 // The field must be declared volatile so that double check lock would work
    // correctly.
	public String setor;
    public double salario;
    // percentual do quantitativo de atendimentos pela qtd de vendas
    public double produtividade; 
    
    public FuncionarioData(String setor, double salario, double produtividade) {
    	this.setor = setor;
    	this.salario = salario;
    	this.produtividade = produtividade;
    }
  
	public String getSetor(){
    	return this.setor;
    }
    public double getSalario() {
    	return this.salario;
    }
    public double getProdutividade() {
    	return this.produtividade;
    }
    
    

}