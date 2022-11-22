// 변수
//class Number{
//    static int num = 0; //클래스 필드
//    int num2 = 0; //인스턴스 필드
//}
//
//public class Static_ex {
//
//    public static void main(String[] args) {
//        Number number1 = new Number(); //첫번째 number
//        Number number2 = new Number(); //두번쨰 number
//
//        number1.num++; //클래스 필드 num을 1증가시킴
//        number1.num2++; //인스턴스 필드 num을 1증가시킴
//        System.out.println(number2.num); //두번째 number의 클래스 필드 출력 // 1
//        System.out.println(number2.num2); //두번째 number의 인스턴스 필드 출력 // 0
//    }
//}

// 메소드
//- 정적 메소드는 클래스가 메모리에 올라갈 때 정적 메소드가 자동적으로 생성됩니다. 그렇기에 정적 메소드는 인스턴스를 생성하지 않아도 호출을 할 수 있습니다. 정적 메소드는 유틸리티 함수를 만드는데 유용하게 사용됩니다.
class Name{
    static void print() { //클래스 메소드
        System.out.println("내 이름은 홍길동입니다.");
    }

    void print2() { //인스턴스 메소드
        System.out.println("내 이름은 이순신입니다.");
    }
}

public class Static_ex {

    public static void main(String[] args) {
        Name.print(); //인스턴스를 생성하지 않아도 호출이 가능

        Name name = new Name(); //인스턴스 생성
        name.print2(); //인스턴스를 생성하여야만 호출이 가능
    }
}