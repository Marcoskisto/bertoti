
public class MensagemEmail implements Observer{
	
	public void update(double horas){
		
		display(horas);
		
	}
	
	public void display(double horas){
		
		System.out.println("Email automatico");
		System.out.println("Seu banco de horas acumulou: "+ horas);
	}

}
