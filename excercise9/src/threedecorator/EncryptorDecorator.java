package threedecorator;

public class EncryptorDecorator extends SendDataServiceDecorator {
    public EncryptorDecorator(SendDataService wrappedService) {
        super(wrappedService);
    }

    @Override
    public void sendData(String data) {
        // Simulate encryption
        String encryptedData = DataEncryptor.encrypt(data);
        super.sendData(encryptedData);
    }
}
