# 조별과제

> 1인당 최소 1개 이상의 클래스를 작성 (실행 클래스 및 VO클래스는 개수에 산정하지 않음.)

## 은행

### 시나리오 만들기 샘플

- 시나리오
  은행은 계좌를 관리한다.
  은행은 계좌를 등록한다.
  은행은 계좌번호로 계좌를 찾을 수 있다.
  은행은 계좌의 소유자명으로 계좌를 찾을 수 있다.
  은행은 모든 계좌의 목록을 볼 수 있다.
  계좌는 소유자명, 계좌번호, 잔고로 구성된다.
  계좌는 입금,출금 기능과 잔고확인 기능이 있다.
  계좌에서 잔액의 변화가 있을 때마다 입출금 명세에 기록된다.
  입출금 명세는 거래일자, 거래시간, 입금/출금, 금액, 잔액으로 구성된다.

### 기능

은행은 계좌를 발급해 준다.

- 1인 1계좌를 원칙으로 하며, 추가로 발급을 요청할 경우 오류 메시지를 출력
- 계좌번호는 개인의 휴대폰 번호로 생성해 준다.
- 비밀번호는 4자리

은행은 계좌를 관리한다.

- 은행은 계좌를 조회할 때는 이름과 주민번호를 입력하여 조회할 수 있다.
- 출력 시 주민등록번호 뒷자리는 2**\*\*** 와 같이 표시한다.
- 은행은 입금을 요청받았을 때 계좌번호와 금액을 입력받는다.
- 은행은 출금을 요청받았을 때 이름, 주민번호, 계좌번호(쩐화번호), 비밀번호를 입력받아 원하는 금액을 출력한다.

- 은행은 원화에서 달러/엔/위한화로 환전을 요구할 떄 환전+환전수수료를 계산해 준다.
- 은행은 달러/엔/위안화에서 원화로 환전을 요구할 떄 환전+환전수수료를 계산해 준다.
- 은행은 이름, 계좌번호, 비밀번호를 인증한 사용자에게 공인인증서를 발급해 준다.
- 은행은 이름, 계좌번호, 비밀번호를 인증한 사용자에게 신권 지폐로 교환해 준다.

### 기타

- 적금통장을 만들려면 개월 수도 필요하겠군.
- 적금통장을 만들려면 1인 1계좌 원칙 설계를 달리 바꿔야 할 텐데
- 1인 1계좌 원칙 설계를 하지 않으면 배열을 구성해야 하며, 배열 구성 시 설계가 복잡해질 수 있음.

### Class

계좌발급

- 이름
- 주민등록번호
- 휴대폰번호
- 비밀번호

계좌 관리

- 휴대폰번호




### VO

소유자

- 이름
- 주민등록번호
- 휴대폰번호
-

통장