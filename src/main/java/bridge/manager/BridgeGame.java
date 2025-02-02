package bridge.manager;

import bridge.BridgeMaker;
import bridge.BridgeRandomNumberGenerator;
import bridge.io.IOManager;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private IOManager ioManager;
    private BridgeMaker bridgeMaker;
    private int index;
    private List<String> bridge;
    private boolean success;
    private int tryCount;

    public BridgeGame() {
        this.ioManager = new IOManager();
        this.bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
        this.index = 0;
        this.success = false;
    }

    public BridgeGame(int tryCount) {
        this.ioManager = new IOManager();
        this.bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
        this.index = 0;
        this.success = false;
        this.tryCount = tryCount;
    }

    // 다리 길이를 입력 받을 준비
    // 입력된 다리길이를 BridgeMaker에게 전달
    public void setUpBridge() {
        int bridgeSize = ioManager.convertBridgeSizeInputMode();
        bridge = bridgeMaker.makeBridge(bridgeSize);
    }

    public void play() {
        boolean correct = true;
        while (correct || index < bridge.size()) {
            String direction = ioManager.readMovingDirection();
            if (!move(direction)) {
                correct = false;
            }
        }
        handleGameResultWithRetryOption(correct);
    }

    public void handleGameResultWithRetryOption(boolean correct) {
        if(correct && index == bridge.size()) {
            success = true;
            finish();
            return;
        }
        retry();
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(String direction) {
        // 방향 비교하기
        if (checkDirection(direction)) { // 맞을 경우
            // correct 결과 출력
            return true;
        }
        // 틀릴 경우
        return false;
    }

    private boolean checkDirection(String direction) {
        if (bridge.get(index).equals(direction)) {
            index++;
            return true;
        }
        return false;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
        // retry 여부 입력받기
            // R, BridgeGame 초기화
            // Q, 현재 결과 출력
    }

    public void finish() {
        if(success) {
            // 결과 출력
            // 시도 횟수 출력
            return;
        }
        // 결과 출력
        // 시도 횟수 출력
    }
}
