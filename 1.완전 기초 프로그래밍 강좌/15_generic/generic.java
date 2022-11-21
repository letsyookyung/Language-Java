// 제네릭 : 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법

class Person<T>{
    public T info;
}

public class Generic {

    public static void main(String[] args) {
        Person<String> p1 = new Person<String>();
        Person<StringBuilder> p2 = new Person<StringBuilder>();
    }
}


// 제네릭의 사용 이유
// 1. 제니릭이 없는 경우의 문제점
// - 중복이 너무 많이 보임!!
class StudentInfo {
    public int grade;
    StudentInfo(int grade){
        this.grade = grade;
    }
}

class StudentPerson{
    public studentInfo info;
    StudentPerson(StudentInfo info){
        this.info = info;
    }
}

class EmployeeInfo{
    public int rank;
    public EmployeeInfo(int rank){
        this.rank = rank;
    }
}

class EmployeePerson{
    public EmployeeInfo info;
    EmployeePerson(EmployeeInfo info){
        this.info = info;
    }
}

public class Generic1 {
    public static void main(String[] args){
        StudentInfo si = new StudentInfo(2);
        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info.grade); //2

        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank); //1

    }
}

// 2. 중복이 없게 하려고, Object를 써버리면 문제가 생김 => 타입이 안전하지 않다. 자바의 정서상에서는 맞지 않음.
class Person{
    public Object info;  // Object : 모든 클래스들의 공통의 조상인 Object 사용, 어떠한 클래스도 어떠한 클래스의 인스턴스도 가능
    Person(Object info) {
        this.info = info;
    }
}

class EmployeeInfo{
    public int rank;
    public EmployeeInfo(int rank){
        this.rank = rank;
    }
}

public class GenericObject {
    public static void main(String[] args){
//        StudentInfo si = new StudentInfo(2);
//        StudentPerson sp = new StudentPerson(si);
//        System.out.println(sp.info.grade); //2
//
//        EmployeeInfo ei = new EmployeeInfo(1);
//        EmployeePerson ep = new EmployeePerson(ei);
//        System.out.println(ep.info.rank); //1

        Person p1 = new Person("부장"); //기억이 가물가물해져서... 문법적으로는 문제가 없지만,코드가 설계된 어떤 목적성에 부합되지 않는 상황
        EmployeeInfo ei = (EmployeeInfo)p1.info; // 형변환해서 Object(String) -> EmployeeInfo로, 런타임때는 에러가 발생하긴 하지만, compile때는 문제 없음 => type safety X
        Person P2 = new Person();

    }
}


// 3. 타입이 안전성 + 코드의 중복 제거 => 제니릭화
// ./generic2.java
