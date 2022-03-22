
public class Teste {

	public static void main(String[] args) {
		
		Empresa b = new Empresa();
		MensagemEmail email = new MensagemEmail();
		MensagemSMS sms = new MensagemSMS();
		b.registerObserver(email);
		b.registerObserver(sms);
		
		Funcionario marilia = new Funcionario(250.0, "Auxiliar", 10);
		
		marilia.bancoHoras = b.adicionarHoras(marilia, 48.0);
		
		
		
		
	}
}
