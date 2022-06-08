	
public class Pessoa {
	
	private String nome;
	private double salario;
	private String setor;
	private String cargo;
	private Matches matches;
	
	public Pessoa(String nome, double salario, String setor, String cargo){
		this.nome = nome;
		this.salario = salario;
		this.setor = setor;
		this.cargo = cargo;
	}
	
	public Pessoa(String nome, double salario, String setor, String cargo, Matches matches){
		this.nome = nome;
		this.salario = salario;
		this.setor = setor;
		this.cargo = cargo;
		this.matches = matches;
	}
	
	public String getNome(){
		return nome;
	}
	
	public double getSalario(){
		return salario;
	}
	
	public String getSetor(){
		return setor;
	}
	
	public String getCargo(){
		return cargo;
	}
	
	public void setMatches(Matches matches){
		this.matches = matches;
	}
	
	public boolean matches(Pessoa pessoa){
		if(matches.matches(pessoa, this)) return true;
		return false;
		
	}

}
