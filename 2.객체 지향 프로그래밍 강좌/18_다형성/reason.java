abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
        System.out.println("Calculator의 setOperands 실행됨");
    }
//    public abstract void sum();
//    public abstract void avg();
    public void sum() {
         System.out.println("Calculator의 sum :"+(this.left+this.right));

    }

    public void avg(){
        System.out.println("Calculator의 avg :"+(this.left+this.right)/2);
    }
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
    public void print(){
        System.out.println("CalculatorDecoPlus의 프린트함수");
    }


}
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
}

class CalculatorDemo {
    public static void execute(Calculator cal) {
        System.out.println("실행결과");
        cal.run();
    }


    public static void main(String[] args) {
//        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        Calculator c1 = new CalculatorDecoPlus();
//        c1.setOprands(10, 20);
//        c1.run();
//        c1.print();

//        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        Calculator c2 = new CalculatorDecoMinus();
//        c2.setOprands(10, 20);
//        c2.run();

        execute(c1);
        execute(c2);
    }

}