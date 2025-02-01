package bridge.io;

public class IOManager {
    private InputView inputView;
    private OutputView outputView;

    public IOManager() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public int convertBridgeSizeInputMode() {
        outputView.printAnnounceInputBridgeSize();
        while (true) {
            int bridgeSize = readBridgeSize();
            if(bridgeSize != -1) {
                return bridgeSize;
            }
        }
    }

    private int readBridgeSize() {
        int bridgeSize = -1;
        try {
            bridgeSize = inputView.readBridgeSize();
        } catch (IllegalArgumentException e) {
            outputView.printAnnounceInputErrorForBridgeSize();
        }
        return bridgeSize;
    }
}
