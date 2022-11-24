//abstract class A{ // 추상 클래스는 추상 메소드를 갖고 있기 때문에 되는것
//    public abstract int b(); // 추상 메소드 = 메소드는 본체가 없다, 사용하는 쪽에서 오버라이딩 해야됨
//
//    public void d() {
//        System.out.println("world"); // 그냥 메소드도 넣어두됨
//    }
//}
//
//class B extends A{
//    public int b(){
//        return 1;
//    }
//}
//
//
//class AbstractDemo{
//    public static void main(String[] args) {
////        A obj = new A();
//        B obj = new B();
//    }
//}


abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    int _sum() {
        return this.left + this.right;
    }

    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+ _sum());
    }
    public void avg(){
        System.out.println("+ avg :"+ _sum() / 2);
    }
}
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+ _sum());
    }
    public void avg(){
        System.out.println("- avg :"+ _sum() /2);
    }
}

class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();

        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }

}