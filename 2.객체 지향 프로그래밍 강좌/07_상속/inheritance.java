// 상속을 받았는데, 기능을 추가하고 싶을 때, class에 들어가서 추가하는 것이 어려운 경우가 있다
// 1) 객체를 자신이 만들지 않음
// 2) 객체가 다양한 곳에서 활용되고 있는데 메소드를 추가하면 다른 곳에서는 불필요한 기능이 포함될 수 있

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
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

class Substraction extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

class CalculatorDemo4 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();


        Substraction c2 = new Substraction();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();
        c2.substract();
    }

}