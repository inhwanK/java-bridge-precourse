package bridge.manager;

import bridge.BridgeMaker;
import bridge.BridgeRandomNumberGenerator;
import bridge.io.IOManager;
import bridge.io.InputView;

import java.io.IOException;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private IOManager ioManager;
    private BridgeMaker bridgeMaker;

    public BridgeGame() {
        this.ioManager = new IOManager();
        this.bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
    }

    // 다리 길이를 입력 받을 준비
    // 입력된 다리길이를 BridgeMaker에게 전달
    public void readyForMakeBridge() {

        // input 모드
        int bridgeSize = ioManager.readBridgeSize();
        System.out.println("Bridge size: " + bridgeSize);
        // MakeBridge 호출
        bridgeMaker.makeBridge(bridgeSize);
        System.out.println("Bridge created");
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void move() {
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}
