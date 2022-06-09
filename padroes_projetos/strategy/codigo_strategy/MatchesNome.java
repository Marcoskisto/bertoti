
public class MatchesNome implements Matches{

	public boolean matches(Pessoa prod1, Pessoa prod2){
		if(!prod1.getNome().equals(prod2.getNome())) return false;
		return true;
	}
	
}
