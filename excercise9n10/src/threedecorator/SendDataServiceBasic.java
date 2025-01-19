package threedecorator;

public class SendDataServiceBasic implements SendDataService {
    private String serverAddress;

    public SendDataServiceBasic(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    @Override
    public void sendData(String data) {
        System.out.println("Sending Data: " + data + " to server: " + serverAddress);
    }
}
