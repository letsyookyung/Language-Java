// 참조형 data type = new로 생성하는, 참조자료형

class A {
    public int id;
    A(int id){
        this.id = id;
    }
}

class Reference {

    // copy
    // 기본 데이터 타입으로 인스턴스를 만들면, 복제가 일어남
    public static void runValue(){
        int a = 1;
        int b = a;
        b = 2 ;
        System.out.println("runValue: "+a); // 1

    }

    // reference 참조, 기본 데이터 타입이 아닌, new로 사용해서 만들어진 데이터 타입은 다름
    public static void runReference(){
        A a = new A(1);
        A b = a;
        b.id = 2;
        System.out.println("runRefernec: " + a.id);
        System.out.println("runRefernec: " + b.id);
    }

    public static void main(String[] args) {
        runValue();
        runReference();
    }
}

// 비유 복제 vs 참조
//- 파일 복사
//- 원본 파일 수정 -> 복사한 파일은 수정 안됨
//- 바로가기 만들기 : 참조하는거


class runReferenceWithMethod {

    static void _value(int b){
        b = 2;
    }

    static void _reference1(A b){
        b = new A(2);
    }

    static void _reference2(A b){
        b.id = 100;
    }

    static void runValue() {
        int a = 1;
        _value(a); // int b = a 랑 같은거
        System.out.println("runValue, "+ a); //1
    }


    // 메소드의 매개변수와 참조 + 복제
    public static void runReference1(){
        A a = new A(1);
        _reference1(a); // A b = a 와 같다 => b = new A(2) =>
        System.out.println("runReference1: " + a.id); // 원래의 a는 그대로 1

        _reference2(a); // A b = a 와 같다 => a.id = 3
        System.out.println("runReference2: " + a.id); // 원래의 a도 3
    }

    public static void main(String[] args){
        runValue();
        runReference1();
    }

}