class Calculator {
    int left, right;

    // constructor , 클래스가 생성될 때 자동으로 클래스와 똑같은 이름을 가지고 있는 생성가 실행되도록 약속
    // 어떤것보다 제일 먼저 실행되도록, 초기화 작업을 하게 되는거
    public Calculator(int left, int right) { // class이름과 같은 함수
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

public class Constructor {
    public static void main(String[] args){

        Calculator c1 = new Calculator(10,20); // 생성자가 실행되는것, 클래스가 아니라 메소드
    }

}