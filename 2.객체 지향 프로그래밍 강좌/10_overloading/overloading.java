class Calculator {
    int left, right;
    int third = 0;

    public void setOperands(int left, int right) {
        System.out.println("setOperands with 2 params.");
        this.left = left;
        this.right = right;
    }

    public void setOperands(int left, int right, int third) {
        this.setOperands(left, right);
        System.out.println("setOperands with 3 params.");
        this.third = third;
    }


    public void sum() {
        System.out.println(this.left + this.right + this.third);
    }

    public void avg() {
        if (this.third == 0) {
            System.out.println((this.left + this.right + this.third) / 2);
        } else {
            System.out.println((this.left + this.right + this.third) / 3);
        }
    }
}


class CalculatorConstructorDemo4 {

    public static void main(String[] args) {

        // 3개의 인자를 받고 싶음
        Calculator c1 = new Calculator();
        c1.setOperands(10,2);
        c1.setOperands(10,20, 30 );
        c1.sum();
        c1.avg();

    }
}