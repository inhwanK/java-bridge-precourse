package bridge.io;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    /**
     * 다리의 길이를 입력받는다.
     * 다리 길이 입력 시 유효성 체크와 문자열 타입으로 입력된 다리 길이를 int로 반환할 책임을 가진다.
     */
    public int readBridgeSize(String bridgeSize) throws IllegalArgumentException {
        int size = parseSize(bridgeSize);
        return size;
    }

    private int parseSize(String bridgeSize) {
        int size = 0;
        try {
            size = Integer.parseInt(bridgeSize);
            validateBridgeSizeRange(size);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException();
        }
        return size;
    }

    private void validateBridgeSizeRange(int size) {
        if (size < 3 || size > 20) {
            throw new NumberFormatException();
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
