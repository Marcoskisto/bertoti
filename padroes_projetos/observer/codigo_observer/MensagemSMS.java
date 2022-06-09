
public class MensagemSMS implements Observer{
	
	public void update(double horas){
		
		display(horas);
		
	}
	
	public void display(double horas){
		
		System.out.println("SMS automatico");
		System.out.println("Seu banco de horas acumulou: " + horas);
	}

}
