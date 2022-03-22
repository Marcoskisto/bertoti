import java.util.ArrayList;


public class Empresa implements Subject{
	
	private ArrayList<Observer> observers;
	private Funcionario funcionario;
	
	public Empresa(){
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(double horasAcumuladas){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(horasAcumuladas);
		}
	}
	
	public double adicionarHoras(Funcionario funcionario, double horas){
		
		funcionario.bancoHoras = funcionario.bancoHoras + horas;
		
		notifyObservers(funcionario.bancoHoras);
		return funcionario.bancoHoras;
		
	}

}
