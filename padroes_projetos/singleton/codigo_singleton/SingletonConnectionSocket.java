
public class SingletonConnectionSocket {
	  // The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile SingletonConnectionSocket instance;

    public String port;
    public String ipAddress;

    private SingletonConnectionSocket(String port, String ipAddress) {
        this.port = port;
        this.ipAddress = ipAddress;
    }

    public static SingletonConnectionSocket getInstance(String port, String ipAddress) {
       
    	SingletonConnectionSocket result = instance;
        if (result != null) {
            return result;
        }
        synchronized(SingletonConnectionSocket.class) {
            if (instance == null) {
                instance = new SingletonConnectionSocket(port, ipAddress);
            }
            return instance;
        }
    }
    
    public static void setInstance(String port, String ipAddress) {
    	instance.port = port;
    	instance.ipAddress = ipAddress;
    }
}