
public class Teste {
	
	public static void main(String[] args) {
		
		Thread conexaoA = new Thread(new ConexaoRotinaA());
        Thread conexaoB = new Thread(new ConexaoRotinaB());
        conexaoA.start();
        conexaoB.start();
        
   	}
	
	static class ConexaoRotinaA implements Runnable {
		@Override
		public void run() {
			SingletonConnectionSocket connectionData = SingletonConnectionSocket.getInstance("5000", "200.12.12.1");
			System.out.println(
					"Conexao da Rotina A: "+ connectionData.port + " - " + connectionData.ipAddress);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(
					"Conexao da Rotina A apos 0.5 segundos: "+ connectionData.port + " - " + connectionData.ipAddress);
		}
	}
	
	static class ConexaoRotinaB implements Runnable {
		@Override
		public void run() {
			SingletonConnectionSocket connectionData = SingletonConnectionSocket.getInstance("9999", "192.169.10.1");
			System.out.println(
					"Conexao da Rotina B: "+ connectionData.port + " - " + connectionData.ipAddress);
			
			SingletonConnectionSocket.setInstance("8080", "10.0.9.1");
			
			System.out.println(
					"Rotina B altera dados de conexão: "+ connectionData.port + " - " + connectionData.ipAddress);
		}
	}
}

