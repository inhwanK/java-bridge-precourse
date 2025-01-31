package bridge.io;

import camp.nextstep.edu.missionutils.Console;

public class IOManager {
    private InputView inputView;
    private OutputView outputView;

    public IOManager() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    private String startIO() {
        System.out.println("다리 길이를 입력해주세요.");
        return Console.readLine();
    }

    public int readBridgeSize() {
        String bridgeSizeInput = startIO();
        int bridgeSize = -1;
        try {
            bridgeSize = inputView.readBridgeSize(bridgeSizeInput);
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
        }
        return bridgeSize;
    }
}
