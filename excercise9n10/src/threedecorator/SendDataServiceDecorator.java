package threedecorator;

public abstract class SendDataServiceDecorator implements SendDataService {
    protected SendDataService wrappedService;

    public SendDataServiceDecorator(SendDataService wrappedService) {
        this.wrappedService = wrappedService;
    }

    @Override
    public void sendData(String data) {
        wrappedService.sendData(data);
    }
}
