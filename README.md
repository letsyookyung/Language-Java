Java
---

<details>
<summary> 1. 완전 기초 프로그래밍 강좌 </summary>

 - 강의 : https://www.youtube.com/watch?v=A74TOX803D0
 - naming conventions : https://www.freecodecamp.org/news/programming-naming-conventions-explained/

⭐️ Contents ⭐️
<details>
<summary>1) Hello World </summary>
- 
</details>

<details>
<summary>2) Variables</summary>
</details>

<details>
<summary>3) Data Types</summary>

- primitive types
  - boolean type
    - boolean
  - numeric type
    - byte
    - short
    - int
    - long
    - double
    - float
  - text type
    - char 
- reference types=non-primitive types(아래 더 자세히)
  - array
  - enum
  - class
  - interface
</details>

<details>
<summary>4) Operators</summary>
  
  - arithmetic operators
  - logical operators
  - relational operators
  - incremental/decremental operators

</details>

<details>
<summary> 5) Strings</summary>
  
  - char/String
  - String/ new String
  - String.format()
  - string.length()
  - string.isEmpty()
  - string.toUpperCase() / toLowerCase()
  - string == string2 
  - string.equals(string2) => value만 체크, equalsIgnoreCase()
  - string.replace("a","b")
  - string.contains("a") => boolean
  
</details>

<details>
<summary> 6) User Inputs</summary>
 
 - Scanner 00 = new Scanner(System.in) / scanner.close()
 - line -> int -> line 이런식 + <enter> 가 이 전 buffer에 남아있어, 뒤에 해당 변수를 사용하면 적용됨.
   - solve1) cleans up the input buffer in the middle of logic
   - solve2) get inputs as string types and then convert into whatever you want.
   - 
</details>

<details>
<summary> 7) Conditional Statements</summary>

 - if 
 - else if
 - else

</details>

<details>
<summary> 8) Switch Cases</summary>

 - switch "keyword" - case "dd" + if-else도 섞어씀
 - break 반드시 넣어야 모든 case를 타지 않음

</details>

<details>
<summary> 9) Arrays</summary>

 - import java.util.Arrays
 - char vowels[] = new char[5] = char vowels[] = {1,2,3,4,5}
 - Arrays.toString
 - Arrays.sort
 - Arrays.searching
 - Arrays.fill
 - copy
   - copy by reference : =
   - copy by value : Arrays.copyOf, copyOfRange
 - Arrays.equals(A,B)

</details>

<details>
<summary> 10) For Loops / While Loops / Dp...While Loops</summary>

 - for (initializer, for문에 진입하는 condition, undate) { 내용 }
 - initializer, while (condition) {내용, update}

</details>


<details>
<summary> 11) ArrayLists</summary>
 
 - ArrayList is wrapper class of primitive reference types.
 - ex) ArrayList<Integer> numbers = new ArrayList<Integer>(); 
 - numbers.add()
 - numbers.remove()
 - numbers.set()
 - numbers.clear()
 - numbers.size()
 - numbers.sort()
 - numbers.contains()
 - numbers.forEach() : 람다 같은
 - numbers.isEmpty()

</details>

<details>
<summary> 12) HashMaps</summary>

 - 딕셔너리와 같이 key, value를 갖음 
 - ex) HashMap<String, Integer> examScores = new HashMap<String, Integer>();
 - examScores.put()
 - examScores.get()
 - examScores.putIfAbsent()
 - examScores.replace()
 - examScores.clear()
 - examScores.size()
 - examScores.remove()
 - examScores.containsKey(), containsValue()
 - examScores.isEmpty()
 - examScores.forEach()

</details>

<details>
<summary> 13) Object Oriented Programming (detail study of OOP is on notion page) </summary>

</details>

<details>
<summary> 14) 참조 </summary>

- <img src="images/reference1.png" width="30%" height="30%"/> <img src="images/reference2.png" width="30%" height="30%"/>



 - 복사 vs 참조
 - 참조는 기본형 데이터 타입 외의 데이터 타입이라고 볼 수 있음

</details>

<details>
<summary> 15) 제너릭 </summary>

- <img src="images/generic1.png" width="70%" height="70%"/>
- <img src="images/generic2.png" width="70%" height="70%"/>


</details>

<details>
<summary> 16) collections framework (feat. ArrayList, Hashmap) </summary>

- 자바에서 컬렉션 프레임워크(collection framework)란 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합을 의미합니다.  
즉, 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것입니다. 이러한 컬렉션 프레임워크는 자바의 인터페이스(interface)를 사용하여 구현됩니다.

- <img src="images/collections1.png" width="70%" height="70%"/>
- <img src="images/collections2.png" width="70%" height="70%"/>


</details>


</details>

---


<details>
<summary>2. 객체 지향 프로그래밍 강좌 </summary>

 - 강의 : https://opentutorials.org/course/1223
 - garbage collection 관련 좋은글 : https://d2.naver.com/helloworld/1329


⭐️ Contents ⭐️
<details>
<summary>1) 메소드 </summary>

- 사용하는 이유: 재활용/코드량줄고/유지보수 편함
- parameter(매개변수) : 입력을 위한 매개변수(파라미터), 입력값을 주기 위한
- 인자 : 입력값 argument
- return / return 나오면 메소드는 끝남
  - public static String numbering(int init, int limit) {}
    - String은 numbering return값의 타입
    - String[] => 문자열인 배
  - public statid void main (~~)
    - void는 return이 없다는뜻
  
</details>

<details>
<summary>2) 객체 지향 프로그래밍이란?  </summary>

- 객체는 그냥 변수와 메소드를 그룹핑한
- <img src="images/object.png" width="50%" height="50%"/>
- 객체 지향 프로그래밍 교육은 1) 설계 2) 문법
  1) 설계 란?
  - 복잡함 속에서 필요한 관점만을 추출하는 행위를 추상화라고 하며, 프로그램을 만든다는 것은 소프트웨어의 추상화라고 할 수 있다.
  - <img src="images/abstract.png" width="50%" height="50%"/>

  2) 문법 
  - 부품화(=분류) : 어디에서든 재활용이 가능하도록 하는거, 객체를 잘 만든다는것, 정답은 없고 적합한 것을 찾아내야 됨
  - 은닉화, 캡슐화 : 제대로 된 부품이라면, 그것이 어떻게 만들어졌는지 모르는 사람도 사용하는 방법만 알면 쓸 수 있어야함.
    - 내부의 동작 방법을 단단한 케이스(=객체) 안으로 숨기고, 사용자에게는 그 부품의 사용방법만을 노출 시키는 것
  - 인터페이스 : 부품과 부품을 서로 교환 할 수 있어야 한다. (ex 모니터-키포드 바꾸기 케이블의 규격이 같아서 가능할 수 있음)
</details>

<details>
<summary>3) 클래스와 인스턴스 그리고 객체 </summary>

- 객체 를 만들기 위해서 class(설계도):메소드의 정의/  instance(제품)
- 변수 = state, 메소드 = behave
- 메소드화 
  - 로직이 커지고, 내용이 복잡해지면, => 메소드를 사용해도 문제가 생김 막 섞임
- 객체화
  - 경우에 따라 sum도 하고, avg하고 싶을 때가 있음
  - ex) 계산기 객체를 만들고 싶음
  - 인스턴스 만듬
- this = instance 자신

</details>

<details>
<summary>4) 클래스 member, 인스턴스 member </summary>

- 객체도 구성원이 있다. 바로바로
  - 변수
  - 메소드
  - 
- 클래스의 member
  - 클래스 변수 (static field) 
    - static을 맴버(변수,메소드) 앞에 붙이면 클래스의 맴버가 된다.
    - 인스턴스에 따라서 변하지 않는 값이 필요한 경우
    - 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
    - 값의 변경 사항을 모든 인스턴스가 공유해야하는 경우이 된다는 => 모든 메소드/인스턴스에서 동일하게 쓸 수 있는것
      - static이 없는건, instance의 변수임
  - 클래스 메소드
    - 인스턴스가 등장하지 않고, 클래스의 메소드로
      - public static void sum(~){}
  - 인스턴스 메소드는 클래스 멤버에 접근 할 수 있다.
  - 클래스 메소드는 인스턴스 멤버에 접근 할 수 없다.(아직 생성되지 않은 거에 접근하려는거니깐)
- Static 영역에 할당된 메모리는 모든 인스턴스(객체)가 공유하여 하나의 멤버를 어디서든지 참조할 수 있는 장점을 가지지만 Garbage Collector의 관리 영역 밖에 존재하기에 Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재하게 됩니다. 그렇기에 Static을 너무 남발하게 되면 만들고자 하는 시스템 성능에 악영향을 줄 수 있습니다.
- 정적 메소드는 클래스가 메모리에 올라갈 때 정적 메소드가 자동적으로 생성됩니다. 그렇기에 정적 메소드는 인스턴스를 생성하지 않아도 호출을 할 수 있습니다. 정적 메소드는 유틸리티 함수를 만드는데 유용하게 사용됩니다.

</details>

<details>
<summary>5) 유효범위 </summary>

- 유효범위 = scope
- 클래스 중심으로의 유효범위
  - 메소드 안에서 선언된 변수는 메소드 안에서만 유효함
  - 디렉토리 / 파일명, 하나의 디렉토리에는 동일한 파일명이 없게됨
  - 선언 했을 때의 범위가 결정
    - 전역 변수 (클래스 범위) global variable
    - 지역 변수 (메소드 범위) local variable
  - 클래스 아래에서 선언된 변수는 클래스 전역에 영향을 미치지만 메소드 내에서 선언된 변수는 클래스 아래에서 선언된 변수보다 우선순위가 높다고 할 수 있다.
  - 정적 static/lexical scope : 사용되는 시점에서의 유효범위를 사용하는 것이 아니라 정의된 시점에서 유효범위를 사용하는 것이다. 
- 인스턴스 중심의 유효범위
  - 클래스랑 똑같지만, this에 대한 키워드에 대한 이해가 필요


</details>

<details>
<summary>6) 초기화와 생성자  </summary>

- 어떤일을 하기 전에 준비하는 것 = 초기화
- 초기화 기능 = 생성자(constructor)
- constructor , 클래스가 생성될 때 자동으로 클래스와 똑같은 이름을 가지고 있는 생성가 실행되도록 약속
- 어떤것보다 제일 먼저 실행되도록, 초기화 작업을 하게 되는거
- 값을 반환하지 않는다.

</details>

<details>
<summary>7) 상속 </summary>

- 끊임없이 상속이 가능

</details>

<details>
<summary>8) 상속과 생성자  </summary>

- 생성자가 없으면 (인자를 받지 않는)기본 생성자로 생성
- (인자를 받는)생성자가 있으면 기본 생성자를 생성하지 않음
- 인스턴스화된 객체에서도 생성자가 있고, 상위 클래스에서도 생성자가 있으면 => 에러남
- 상위 클라스와 하위 클라스의 같은 생성자가 있다면? super(~~~), super는 부모 클라스를 의미함(부모클래스의 생성자)
- 메소드를 받는건 super.avg() 이런걸 가져와도 된다 동시에 필요한걸 추가할 수도 있음


</details>

<details>
<summary>9) Overriding  </summary>

- 메소드 이름 동일
- 매개변수, 데이터 타입, 리턴값 모두 동일
- 부모 클라스의 메소드를 물려받긴 했지만, 자식 클라스 필요에 따라 재정의하여 사용한다.
- 하위 클래스에서 상의 클래스와 동일한 메소드를 정의하면 부모 클래스로부터 물려 받은 기본 동작 방법을 변경하는 효과를 갖게 된다. 기본동작은 폭넓게 적용되고, 예외적인 동작은 더 높은 우선순위를 갖게하고 있다.하위 클래스에서 상의 클래스와 동일한 메소드를 정의하면 부모 클래스로부터 물려 받은 기본 동작 방법을 변경하는 효과를 갖게 된다. 기본동작은 폭넓게 적용되고, 예외적인 동작은 더 높은 우선순위를 갖게하고 있다.
- 오버라이딩의 조건
  - 부모 클라스의 메소드의 형태 (형태를 정의하는 사항들=메소드의 서명) 모두 같아야됨
    - 메소드의 이름
    - 매개변수 숫자/데이터타입/순서
    - 메소드 리턴 타입 

</details>

<details>
<summary>10) Overloading  </summary>

- 메소드 이름 동일 
- 매개변수 개수, 데이터 타입 다름
- 리턴값만 다르면 안됨
- 매개변수의 수에 따라서 메소드의 이름이 달라지는 것은 왠지 깔끔한 방법이 아님 -> 같은 이름의 메소드이지만 매개변수의 조건에 따라 여러개 중에 선택되서 실행됨
- 오버로딩의 조건
  - return값의 데이터 타입이 같아야됨
  - 메소드의 이름 같고, 매개변수는 다르고, 리턴값이 같아야됨?
  - 메소드의 반환값은 메소드를 호출하는 시점에서 전달되지 않는 정보이기 때문에 오버로딩의 대상이 될 수 없다.
  
- <img src="images/over.png" width="90%" height="90%"/>
</details>

<details>
<summary>11) Class path  </summary>

- 컴파일 할 때 찾을 때까지 자바가 알아서 찾아옴, 기본적으로는 현재 디렉토리에서 서치함
- ex) java -classpath ".:lib" ClasspathDemo2
- ex) java -classpath "lib" ClasspathDemo2
- 환경변수 : 운영체제에 지정하는 변수로


</details>

<details>
<summary>12) Package  </summary>

- 하나의 클래스 안에서 같은 이름의 클래스들을 사용하기 위한
- 이름의 충돌을 해소하기 위해
- 컴파일 
  - javac src/org/opentutorials/javatutorials/packages/example3/*.java -d bin
- 로드된 패키지들 안에 같은 클래스명이 존재하면? -> 아래와 같이 함
  - public class D {
    public static void main(String[] args) {
    org.opentutorials.javatutorials.packages.example2.B b = new org.opentutorials.javatutorials.packages.example2.B();
    }
    }
</details>

<details>
<summary>13) API와 API문서 보는 법  </summary>

- ex) System.out.println(1);
  - 지금까지 무수히 많은 예제에서 사용했던 코드다. 이것이 화면에 어떤 내용을 출력하는 것이라는 건 이미 알고 있다. 하지만 도대체 우리가 정의한 적이 없는 이 명령은 무엇일까?를 생각해볼 때가 왔다. 문법적으로 봤을 때 println은 메소드가 틀림없다. 그런데 메소드 앞에 Sytem.out이 있다. System은 클래스이고 out은 그 클래스의 필드(변수)이다. 이 필드가 메소드를 가지고 있는 것은 이 필드 역시 객체라는 것을 알 수 있다. 그리고 System을 인스턴스화한적이 없음에도 불구하고 필드 out에 접근할 수 있는 것은 out이 static이라는 것을 암시한다.
- java.lang : 자바 프로그래밍을 위한 가장 기본적인 패키지와 클래스를 포함하고 있다.
- java.util : 프로그램을 제어하기 위한 클래스와 데이터를 효율적으로 저장하기 위한 클래스들을 담고 있다.
- java.io : 키보드, 모니터, 프린터, 파일등을 제어할 수 있는 클래스들의 모음
- java.net : 통신을 위한 기능들을 담고 있다.

</details>

<details>
<summary>14) 접근 제어자 </summary>

- 변수/메소드 레벨
  - protected / default 
    - <img src="images/접근제어자1.png" width="70%" height="70%"/>
    - <img src="images/접근제어자2.png" width="70%" height="70%"/>

- 클래스 레벨 
  - public인 클래스 : 다른 패키지의 클래스에서도 사용할 수 있음, 하나의 소스코드 안에는 하나의 public class만 존재할 수 있음
  - default(아무것도 없는거) 클래스 : 같은 패키지에서만 사용 가능하다.

</details>

<details>
<summary>15) Abstract </summary>

- 추상 클래스
- 상속을 강제하는 일종의 규제
- 추상 클래스 : 추상 메소드를 하나라도 포함하고 있는 클래스는 추상 클래스가 되고, 자연스럽게 클래스의 이름 앞에 abstract가 붙는다.
- 추상 메소드 : 메소드의 시그니처만이 정의된 비어있는 메소드, 이 메소드의 구체적인 구현은 하위 클래스에서 오버라이딩 해야 한다는 의미
- 사용하는 이유 : 여러군데서 바꿔서 사용하려고
</details>

<details>
<summary>16) Final  </summary>

- 자주 안쓰임, 절대 변하지 않는 값을 가진 변수 혹은 메소드 등에 쓰임 (ex. pi값)
- final 메소드가 속한 클래스도 상속이 불가

</details>

<details>
<summary>17) Interface  </summary>

- abstract, final가 같이 대표적인 규제
- 어떤 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면 그 객체는 반드시 인터페이스의  메소드들을 구현해야 한다. 만약 인터페이스에서 강제하고 있는 메소드를 구현하지 않으면 이 에플리케이션은 컴파일 조차 되지 않는다.
- 많은 개발자/사용자 간의 약속을 미리 해두는것?
- interface의 제어자는 반드시 public 이어야함.
- 하나의 클래스는 복수개의 인터페이스를 구현할 수 있다.
- 인터페이스도 다른 인터페이스를 상속 받을 수 있음.


</details>

<details>
<summary>18) 다형성(Polymorphism)  </summary>

- 다형성: 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 의미
- 1) 메소드 오버로딩과 다형성
- 2) 클래스와 다형성 
  - ex) A obj = new B() 상황
  - 클래스 B를 클래스 A의 데이터 타입으로 인스턴스화 했을 때 클래스 A에 존재하는 맴버만이 클래스 B의 맴버가 된다. 
  - 클래스 A의 메소드를 오버라이딩한 클래스 B의 메소드 > 클래스 A의 메소드 보다 우선 됨.
- 3) 이걸 왜 쓰는가?
  - 인스턴스 c1과 c2를 사용하는 입장에서 두개의 클래스 모두 Calculator인 것처럼 사용할 수 있다.
  - CalculatorDemo의 execute 메소드는 CalculatorDecoPlus와 CalculatorDecoMinus 클래스의 메소드 run을 호출하면서 그것이 '실행결과'라는 사실을 화면에 표시하는 기능을 가지고 있다. 이 때 메소드 execute 내부에서는 매개변수로 전달된 객체의 메소드 run을 호출하고 있다.
  - 하나의 클래스(Calculator)가 다양한 동작 방법(ClaculatorDecoPlus, ClaculatorDecoMinus)을 가지고 있는데 이것을 다형성이라고 할 수 있겠다.
- 4) 인터페이스와 다형성
  - ex) 스마트폰 을 전화기로만, 게임기로만 => 원하지 않는 기능, 사용하면 안되는 기능을 제한할 수 있음


</details>

<details>
<summary>19) 예외 처리 </summary>

- 문법
  - try-catch
  - try-catch-catch-catch-finally(에외여부와 관계없이 언제나 실행되는 것)
  - finally는 언제? ex) DB 예외
- 예외 던지기 throws
  - 어떠한 문제를 처리할 수 없기 때문에 이에 대한 처리를 생성자의 사용자에게 위임하겠다는 의미다. => 어떤 api가 에러를 던지니, 처리하기 위해 받을 수도 있고, 안받아도됨
  - ![](images/throw1.png)
- 예외 만들기 throw

  - 예외	사용해야 할 상황  
  IllegalArgumentException	매개변수가 의도하지 않은 상황을 유발시킬 때  
  IllegalStateException	메소드를 호출하기 위한 상태가 아닐 때  
  NullPointerException	매개 변수 값이 null 일 때  
  IndexOutOfBoundsException	인덱스 매개 변수 값이 범위를 벗어날 때  
  ArithmeticException	산술적인 연산에 오류가 있을 때

- 어떤건 반드시 예외처리를 하게 되어 있지만, 어떤건 예외처리를 하지 않아도 되게 되어있음.
  - Throwable : 클래스 Throwable은 범 예외 클래스들의 공통된 조상이다.
  - Error : 에러는 여러분의 애플리케이션의 문제가 아니라 그 애플리케이션이 동작하는 가상머신에 문제가 생겼을 때 발생하는 예외다.
  - Exception : 결국 우리의 관심사는 Exception 클래스와 RuntimeException 클래스로 좁혀진다.
  - ![](images/exception1.png)
  - ![](images/exception2.png)
  - ![](images/exception3.png)
- 예외를 만들기 전에 해야 할 것은 자신의 예외를 checked로 할 것인가? unchecked로 할 것인가를 정해야 한다
  - checked 예외 사용 경우 : API 쪽에서 예외를 던졌을 때 API 사용자 쪽에서 예외 상황을 복구 할 수 있다면 checked 예외를 사용한다.
  - unchecked 예외 사용 경우: 사용자가 API의 사용방법을 어겨서 발생하는 문제거나 예외 상황이 이미 발생한 시점에서 그냥 프로그램을 종료하는 것이 덜 위험 할 때 unchecked를 사용한다.
</details>

<details>
<summary>20) Object 클래스 </summary>

- class O {} = class O extends Object 인것
- 1) toString 
  - 오버라이딩해서 상황에 맞게 다르게 할 수 있음
  - super.toString + 새로 구현한것도 가능
- 2) equals 객체를 비교하는게 아니라, 값만 비교함
    - (Student)obj 는 메소드 equals로 전달된 obj의 데이터 타입이 Object이기 때문에 이를 Student 타입으로 형 변환하는 코드다.  아래 코드를 통해서 현재 객체의 변수 name과 equals의 인자로 전달된 객체의 변수 name을 비교한 결과를 Boolean 값으로 리턴하고 있다.
    - 1. 객체 간에 동일성을 비교하고 싶을 때는 ==를 사용하지 말고 equals를 이용하자.
    - 2. equals를 직접 구현해야 한다면 hashCode도 함께 구현해야 함을 알고 이에 대한 분명한 학습을 한 후에 구현하자.
- 3) finalize
  - 객체가 소멸될 때 호출되기로 약속된 메소드
  - 많이 안쓰니 조심히 써야함
  - RAM을 효율적으로 사용하기 위해서, 더이상 사용하지 않는 데이터를 관리해야 => 가비지 컬렉션, 자바가 정기적으로 순찰하며 삭제함
- 4) clone
  - clone은 복제라는 뜻이다. 어떤 객체가 있을 때 그 객체와 똑같은 객체를 복제해주는 기능이 clone 메소드의 역할
  - 클래스 Student가 인터페이스 Cloneable을 구현.
  - 인터페이스 Cloneable의 코드는 실제 내용비어있는 인터페이스다.
  - 그럼에도 불구하고 이것을 사용한 이유는 클래스 Student가 복제 가능하다는 것을 표시하기 위한 것임.

</details>

<details>
<summary>21) 상수와 enum </summary>

- ex)  상수 그룹이 2개임

- 인터페이스를 이렇게 사용할 수 있는 것은 인터페이스에서 선언된 변수는 무조건 public static final의 속성을 갖기 때문이다.
- 열거형은 어떤 상수 그룹의 특성, 행동들을 열거하여 표현할 수 있음.

</details>

</details>








