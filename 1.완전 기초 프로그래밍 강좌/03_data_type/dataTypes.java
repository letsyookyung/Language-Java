class DataTypes {
    public static void main(String[] args) {
        //integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; //-32,768 to 32,767
        int anInteger = 2147483647; // -2147483648 to 2147483647
        long aLargeNumber = 999999999999999L; // "L/l"을 해줘야 컴파일러가 default로 int라고 인식하는걸 방지할 수 있음

        //decimal types
        double aDouble = 1.79769313; // 4.9E-324 to 1.2999999999999999
        float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38 // "F/f"로 표시해줘야

        //booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        //characters
        char copyrightSymbol = '\u00A9' ;

        System.out.println("this is a " + copyrightSymbol + ".");

    }
}

class DataTypes2 {
    public static void main(String[] args) {
        int number1 = 5;
        double number2 = number1; // 순서 반대로 하면 에러남

        System.out.println(number2);
    }
}
