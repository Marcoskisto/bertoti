
public class Matches1 implements Matches{

	public boolean matches(Pessoa prod1, Pessoa prod2){
		if(!prod1.getSetor().equals(prod2.getSetor())) return false;
		return true;
	}
	
}
