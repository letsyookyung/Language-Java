Java
--- 
## 자바의 역사

[https://docs.oracle.com/en/java/index.html](https://docs.oracle.com/en/java/index.html)

- 자바는 1991년, Sun Microsystems(썬 마이크로시스템즈)의 제임스 고슬링(James Gosling,) 패트릭 노튼(Patrick Naughton), 크리스 와츠(Chris Warth), 에드 프랭크(Ed Frank), 그리고 마이크 쉐리든(Mike Sheridan)에 의해 창안되었고, 처음에는 오크(Oak) 혹은 그린(Green)이라고 불렸다.
- 오크는 최초 가전제품에 쓰일 프로그램의 개발이 목적이었지만 인터넷과 웹의 출현으로 자바의 초점은 가전제품에서→ 인터넷으로 옮겨지게 되었고, 이후 1995년 이름을 자바로 변경했다.
- 고슬링의 목표는 Write Once, Run Everywhere(한 번 쓰고 어느 곳에도 실행) 하는 것을 목표했고 약속했다.
- 자바는 인기플랫폼에 무료 런타임을 제공하였고, 대부분의 브라우저들은 곧 자바 애플릿을 웹페이지 안에서 실행할 수 있었으며 자바의 인기는 급상승했다.
- 2009년 썬 마이크로시스템즈는 오라클의 인수 합병되었고, 자바에 대한 권리 및 유지보수 또한 오라클로 넘어가게 됨.

## 자바의 특징

### 1) 객체지향 언어

- **객체지향 프로그래밍(OOP, Object Oriented Programming)** 이란 프로그램을 개발하는 기법으로 **부품에 해당하는 객체**들을 먼저 만들고, 이것들을 **하나씩 조립 및 연결**하여 전체 프로그램을 완성하는 것을 말함.
- 객체를 만들기 위해서는 **설계도인 클래스를 먼저 작성**하고, 객체와 객체를 연결하여 목적에 맞는 프로그램을 만들어 낸다.
- 객체지향 언어의 특징인 **캡슐화, 상속성, 다형성**을 완벽하게 지원한다.

### 2) 컴파일 → (인터프리터 + JIT(Just In Time)) 방식

- 컴파일  : 텍스트 소스(자바 언어로 작성한 프로그램)를 컴파일(자바 컴파일러가) 하여 **바이트 코드(byte code)라는 이진 파일,클래스 파일 로** 변환
- 인터프리터  : JRE-JVM이 바이트 코드(이진파일,클래스파일)을 한줄씩 읽어서 해석한 후 하면서 실행
- **JIT :** 지속적으로 인터프리터가 하다가, **인터프리터가 자주 사용하는 코드의 정보를 캐시에 담아두었다가 미리 꺼내서 바로 실행하는 것**
- 시스템에 **무관한 이진 파일을** 만듦으로서 **자바는 컴파일 언어에 가까운 속도와 시스템 독립성**을 얻을 수 있다.
- ex) javac [파일명.java](http://파일명.java) ⇒ class명.class

### 3) 높은 이식성 = 컴퓨터 구조에 중립적

- 서로 다른 실행환경을 가진 시스템간에 프로그램을 옮겨 실행할 수 있는 것을 말함
- **자바 실행환경(JRE, Java Runtime Environment)(→JVM) 이 설치 되어 있는 모든 운영체제에서 실행이 가능하다**
- ex) java class명

### 4) 메모리를 자동으로 관리 및 Garbage Collector 제공

- 자바는 개발자가 직접 메모리에 접근할 수 없으며, 메모리는 자바가 직접 관리함 (C++은 메모리에 생성된 객체를 제거하기 위해 개발자가 직접 코드를 작성해야한다. 만약 이 작업을 성실하게 해주지 않는다면 프로그램은 불완전해지고 갑자기 다운되는 현상을 겪을 수 있음)
- 객체 생성 시 **자동으로 메모리 영역을 찾아서 할당**하고, 사용이 완료되면 **Garbage Collector를 자동 실행**시켜 사용하지 않는 객체를 제거한다

### 5) 멀티 쓰레드 구현이 쉽다

- 운영체제에 따라 멀티 쓰레드를 구현하는 방법이 다르지만, 자바는 **쓰레드 생성 및 제어와 관련된 라이브러리 API를 제공**하므로 **운영체제에 상관없이 멀티 쓰레드**를 쉽게 구현할 수 있음

### 6) 동적 로딩 지원

- 실행 시에 모든 클래스가 로딩되는 것이 아니라, **필요한 시점에 클래스를 로딩하여 사용**할 수 있는 장점
- 애플리케이션의 변경사항이 발생해도 비교적 적은 작업만으로도 처리할 수 있는 유연한 애플리케이션을 작성할 수 있음

### 7) 분산환경 지원

- 자바에는 TCP/IP 라이브러리가 기본적으로 포함되어 있음
- 또한 http/ http프로토콜을 기본적으로 지원

### 8) 오픈소스 라이브러리가 풍부하다

- 자바는 오픈소스 언어이고, 자바 프로그램에서 사용하는 라이브러리 또한 오프솟의 양이 방대하다
- 고급 기능을 구현하는 코드를 작성하는 대신 검증된 오픈소스 라이브러리를 사용하면 애플리케이션을 다시 컴파일 할 필요가 없음
- 따라서 유지보수를 쉽고 빠르게 진행 가능

---

➖ 1) 자바는 실행을 위해 자바 가상 머신(JVM, Java Virtual Machine)을 거쳐야하므로, 다른 언어에 비해 실행 속도가 느리다.

➖ 2) 예외 처리가 잘 되어있지만, 개발자가 일일이 처리를 지정해 줘야한다는 불편함이 있음

➖ 3) 자바는 다른 언어에 비해 작성해야 하는 코드의 길이가 긴 편이다.

---

## 자바 기초 프로그래밍 강좌
- naming conventions : https://www.freecodecamp.org/news/programming-naming-conventions-explained/

⭐️ Contents ⭐️
<details>
<summary>(0:00:00) Hello World </summary>
- 
</details>

<details>
<summary>(0:06:39) Variables</summary>
</details>

<details>
<summary>(0:13:12) Data Types</summary>

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
<summary>(0:20:27) Operators</summary>
  
  - arithmetic operators
  - logical operators
  - relational operators
  - incremental/decremental operators

</details>

<details>
<summary>(0:47:33) Strings</summary>
  
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
<summary>(1:16:42) User Inputs</summary>
 
 - Scanner 00 = new Scanner(System.in) / scanner.close()
 - line -> int -> line 이런식 + <enter> 가 이 전 buffer에 남아있어, 뒤에 해당 변수를 사용하면 적용됨.
   - solve1) cleans up the input buffer in the middle of logic
   - solve2) get inputs as string types and then convert into whatever you want.
   - 
</details>

<details>
<summary>(1:35:13) Conditional Statements</summary>

 - if 
 - else if
 - else

</details>

<details>
<summary>(1:46:38) Switch Cases</summary>

 - switch "keyword" - case "dd" + if-else도 섞어씀
 - break 반드시 넣어야 모든 case를 타지 않음

</details>

<details>
<summary>(1:55:59) Arrays</summary>

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
<summary>(2:27:45) For Loops / While Loops / Dp...While Loops</summary>

 - for (initializer, for문에 진입하는 condition, undate) { 내용 }
 - initializer, while (condition) {내용, update}

</details>


<details>
<summary>(2:52:02) ArrayLists</summary>
 
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
<summary>(3:12:25) HashMaps</summary>

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
<summary>(3:28:38) Object Oriented Programming</summary>
</details>


