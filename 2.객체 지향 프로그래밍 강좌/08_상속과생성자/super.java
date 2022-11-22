class Calculator {
    int left, right;

//    public Calculator(){}; //SubstractionableCalculator를 부르지만, 그 상위의 Calculator로 올라가서 초기화됨.

    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right){
//        this.left = left;
//        this.right = right;
        super(left, right);
        this.left = left+10;
        this.right = right+10;
    // ~~ 하위 클라스의 초기화
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}