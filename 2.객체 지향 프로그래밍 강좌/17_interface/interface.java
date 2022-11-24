//interface I {
//    public void z();
//}
//
//class A implements I { // 클래스 A는 인터페이스 I를 구현한다.
//    public void z(){}; // 반드시 구현해야됨
//}


interface Calculatable {
    public void setOperands(int first, int second, int third);
    public int sum();
    public int avg();
}

class CalculatorDeveloper implements Calculatable {
    int first, second, third;
    public void setOperands(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    };
    public int sum(){
        return this.first+this.second+this.third;
    }
    public int avg() {
        return (this.first+this.second+this.third)/3;
    }
}

class CalcultorConsumer {
    public static void main(String[] args){
        int sum;
        double avg;
        CalculatorDeveloper c1 = new CalculatorDeveloper();
        c1.setOperands(34,10,11);
        sum = c1.sum();
        avg = c1.avg();
        System.out.printf("sum:%d, avg:%f. ", sum, avg);
    }
}