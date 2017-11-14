import java.rmi.*;

public class StockExchangeServer {
    public static void main(String args[]) {
        try{
            StockExchangeImpl stockExchangeImpl = new StockExchangeImpl();
            String localhost = "192.168.0.102";
            Naming.rebind("rmi://" + localhost + "/Stock", stockExchangeImpl);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
        }
    }
}