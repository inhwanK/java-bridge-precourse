package bridge;

import bridge.manager.BridgeGame;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        // TODO: 프로그램 구현
        System.out.println("다리 건너기 게임을 시작합니다.");
        BridgeGame gameManager = new BridgeGame();
        gameManager.readyForMakeBridge();

    }
}
