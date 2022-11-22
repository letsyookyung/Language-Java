class Calculator {
    int left, right;

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
        super(left, right);
    }

    // overriding 된거
    public void sum() { System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.") ;}

//    public int avg() {
//        return (this.left + this.right)/2
//    } // 부모 클라스의 메소드의 매개변수 숫자 / 데이터 타입 순서 같아야됨.


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