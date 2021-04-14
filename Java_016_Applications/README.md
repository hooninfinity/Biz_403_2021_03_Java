# 데이터 파일에 저장하기
* 변수, 배열, 객체에 저장되어 있는 데이터는 프로젝트가 실행되는 동안에만 저장된 값을 유지한다.
* 변수, 배열, 객체는 주기억장치(RAM)에 저장이 되고, 주기억장치는 반도체 메모리로 휘발성 성질을 갖는다.
* 휘발성 성질을 갖는 메모리는 전원이 유지되는 동안에만 값을 저장하고 있다.
* 데이터를 입력하여 어떤 연산을 수행할때, 연산을 수행할때마다 데이터를 입력하여 처리한다면 매우 불편할 것이다.
* 입력된 데이터를 보조기억장치(HDD, SDD, USB)에 저장해두면 프로젝트가 종료되거나 컴퓨터가 종료되어도 그 데이터를 보존할 수 있다.
* 보조기억장치(storage)에 데이터를 저장하는 것을 영속성 유지 라고 한다.
* 영속성 유지란 한번 저장된 데이터는 언제든지 다시 재생하여 사용할 수 있도록 하는 것을 말한다.
* 가장 쉬운 방법은 파일에 저장하는 것이고, 가장 좋은 방법은 DataBase에 저장하는 것이다.

## 컴퓨터 파일
1. Text 파일과 BIN(Binary, 이진)파일이 있다.
2. Text 파일은 윈도우의 메모장, Sublime Text와 같은 도구를 사용하여 파일을 열었을 때 내용을 어려움 없이 읽을 수 있는 파일

3. BIN파일은 이미지, 사진, 동영상, 음악, HWP, XLS, PPT 등의 파일들을 메모장으로 열었을 때 내용이 깨짐현상이 있어 정확히 읽을 수 없는 파일

4. Text 파일은 내용이 ASCII 코드값으로 변환되어 저장되는 파일
5. BIN 파일은 파일마다 독특한 방법으로 저장이 되고 모든 내용이 이진수들의 나열로 저장된다.

6. FileWriter, PrintWriter 는 Text 파일을 만들고 Text 방식으로 저장하는데 사용하는 클래스다.

7. FileReader, BufferedReader는 Text 파일을 읽어서 컴퓨터 메모리로 가져올 때 사용하는 클래스다.