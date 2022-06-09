
public class MatchesSalario implements Matches{

	public boolean matches(Pessoa prod1, Pessoa prod2){
		if(!(prod1.getSalario() == prod2.getSalario())) return false;
		return true;
	}
	
}
