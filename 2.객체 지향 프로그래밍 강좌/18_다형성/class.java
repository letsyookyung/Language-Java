class A{
    public String x(){return "A.x";}
}
class B extends A{
//    @Overriding
    public String x(){return "B.x";}
    public String y(){return "y";}
}

class B2 extends A{
    public String x(){return "B2.x";}
}

class PolymorphismDemo1 {
    public static void main(String[] args) {
//        A obj = new B(); // 이 부분이 핵심
//        // 새로운 인스턴스를 생성했을 때, 새로운 객체의 데이터 형이 인스턴스화한 클래스의 부모클래스의 데이터 황으로 선언할 수 있음.
//        obj.x();
////        obj.y(); // 이건 안됨. A에 없어서
//        System.out.println(obj.x()); // "B.x"


        A obj = new B();
        A obj2 = new B2();
        System.out.println(obj.x()); // "B.x"
        System.out.println(obj2.x()); // "B2.x"


    }
}