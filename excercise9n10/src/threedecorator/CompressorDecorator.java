package threedecorator;

public class CompressorDecorator extends SendDataServiceDecorator {
    public CompressorDecorator(SendDataService wrappedService) {
        super(wrappedService);
    }

    @Override
    public void sendData(String data) {
        // Simulate compression
        String compressedData = DataCompressor.compress(data);
        super.sendData(compressedData);
    }
}
