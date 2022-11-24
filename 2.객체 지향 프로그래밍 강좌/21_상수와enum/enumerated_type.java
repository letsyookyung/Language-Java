enum Fruit{
    APPLE("red", 57), PEACH("pink",100), BANANA("yellow",150);
    public String color;
    public int cal;
    public String isSold = "SOLD OUT";
    Fruit(String color, int cal){
        System.out.println("Call Constructor "+this);
        this.color = color;
        this.cal = cal;
    }

    public String sold(){
        return isSold;
    }
}

enum Compnay {
    GOOGLE, APPLE, ORACLE;

    Compnay() {
        System.out.println("call Compnay constructor");
    }
}
class EnumeratedType {

    public static void main(String[] args) {
        Fruit type = Fruit.APPLE;
//        Compnay type = Compnay.APPLE;
        for (Fruit f : Fruit.values()) {
            System.out.println(f);
            switch(f) {
                case APPLE:
                    System.out.printf("%s(%s) is %d kacal, it is alread %s.\n", f, f.APPLE.color, f.APPLE.cal, f.APPLE.sold());
                    break;
                case PEACH:
                    System.out.printf("%s(%s) is %d kacal, it is alread %s.\n", f, f.PEACH.color, f.PEACH.cal, f.PEACH.sold());
                    break;
                case BANANA:
                    System.out.printf("%s(%s) is %d kacal, it is alread %s.\n", f, f.BANANA.color, f.BANANA.cal, f.BANANA.sold());
                    break;
            }


        }

    }
}
