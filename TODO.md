## 다리 건너기 미션 todo
- 요구사항을 보고 문제를 작은 단위로 나누는 연습하기
- 기능 요구 사항을 구체적인 알고리즘으로 작게 쪼개기
- 작은 단위로 나눠서 실행하다가, 막히거나 문제가 생기면 더 작은 단위로 계속 나누기

## todo

1. 존재하는 클래스와 각 클래스 역할 정리하기
    - Application main 메서드 
    - BridgeGame  (파라미터와 반환 타입 변경 가능) 
      - 다리 건너기 게임을 관리하는 클래스, 칸 이동, 다시하기 메서드가 존재
    - BridgeMaker (필드, 메서드 시그니처 변경 불가) 
      - 다리 생성 역할, 다리 길이 입력받아 생성하는 메서드가 존재
    - BridgeNumberGenerator (generate() 메서드 활용해서 랜덤 값 추출, 코드 변경 불가) 
      - 랜덤 값 추출용 인터페이스
    - BridgeRandomNumberGenerator (generate() 메서드 활용해서 랜덤 값 추출, 코드 변경 불가) 
      - 랜덤 값 추출용 클래스
    - InputView (인자와 반환 타입 변경 가능) 
      - 사용자 입력 받는 역할 다리길이, 이동할 칸, 다시 시작 여부를 받음
    - OutputView (인자와 반환 타입 변경 가능) 
      - 진행 상황과 결과 출력 현재까지 이동한 다리의 상태, 최종 결과 출력


2. 각 클래스 역할을 고려해 패키지 분리하기
3. 클래스 간의 협력을 대략 그려보기
    - InputView <> BridgeMaker
    - BridgeMaker <> BridgeGame
    - BridgeNumberGenerator, BridgeRandomNumberGenerator <> BridgeMaker
    - BridgeGame <> OutputView

4. 기능 개발 todo 정리하기

- 게임 시작 [x]
  - 게임 시작 메시지 출력 [x]
- 게임 시작 환경 구축 (BridgeGame)
  - InputView, BridgeMaker, Bridge 초기화 [x]
  - 다리 길이 입력 (InputView) 
    - 표준 입력 객체 초기화 (BufferedReader) [x] 
    - 다리 길이 입력 메시지 출력 [x]
    - 다리 길이 유효성 체크 [x]
      - Illegal 예외 던지기 [x]
      - 예외 메시지 출력하기 [x]
    - BridgeGame에서 InputView 제거하기 [x]
      - IOManager 클래스로 의존성 변경 [x]
      - InputView에서 표준 출력 코드 OutputView로 옮기기 [x]
    - 잘못된 입력이 들어올 경우, 다시 입력 가능하도록 설계하기 [x]
  - 입력받은 다리 길이를 BridgeMaker에게 전달 [x]
  - BridgeMaker가 생성한 다리를 반환 받아 저장 [x]
  
  
  
- 다리 이동 요구사항 정리하기
  - 이동할 칸 선택
    - 이동할 칸 입력받기 [x]
      - 유효성 체크하기 [x]  
  
  - 이동 로직 설계하기
    - 한칸 맞줬을 경우
      - 전체 성공인지 확인 [x]
        - 전체 성공이면 '전체 성공했을 경우'로 이동 [x]
        - 한칸만 성공이면 '이동 로직'으로 이동 [x]
    - 전체 성공했을 경우
      - 결과 출력하기
      - 시도 횟수 출력하기
    - 실패했을 경우
      - 다시 시도할지 여부 입력받기
        - 다시 시도할 경우 다리 초기화하기
  
  - 이동 결과 출력


- 이동 칸 선택
- 이동 결과 출력
- 다시 시도 여부 입력
- 최종 결과 출력
- 성공 여부 출력
- 시도 횟수 출력

### 추가된 요구 사항

- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
    - 함수(또는 메서드)가 한 가지 일만 잘하도록 구현한다.
- 메서드의 파라미터 개수는 최대 3개까지만 허용한다.
- 아래 있는 `InputView`, `OutputView`, `BridgeGame`, `BridgeMaker`, `BridgeRandomNumberGenerator` 클래스의 요구사항을 참고하여 구현한다.
    - 각 클래스의 제약 사항은 아래 클래스별 세부 설명을 참고한다.
    - 이외 필요한 클래스(또는 객체)와 메서드는 자유롭게 구현할 수 있다.
    - `InputView` 클래스에서만 `camp.nextstep.edu.missionutils.Console` 의 `readLine()` 메서드를 이용해 사용자의 입력을 받을 수 있다.
    - `BridgeGame` 클래스에서 `InputView`, `OutputView` 를 사용하지 않는다
