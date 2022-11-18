class ArithmeticOperators {
    public static void main(String[] args) {
        double number1 = 12;
        double number2 = -5;

        number1 %= 5;

        //addition
        System.out.println(number1 + number2);

        //substraction
        System.out.println(number1 - number2);

        //multiplication
        System.out.println(number1 * number2);

        // division
        System.out.println(number1 / number2); // double, float / int => double로 나옴

        // remainder (=modulo/modulus)
        System.out.println(number1 % number2);

    }
}

class RelationalOperator {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 15;

        System.out.println(number1 == number2);
        System.out.println(number1 != number2);
        System.out.println(number1 > number2);
        System.out.println(number1 < number2);
        System.out.println(number1 <= number2);
        System.out.println(number1 >= number2);

    }
}

class LogicalOperator {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = false;
        boolean isLibraryMember = true;

        //age >=18
        //age <= 40
        System.out.println(age >= 18 && age <= 40);
        System.out.println(isStudent || isLibraryMember);
        System.out.println(!isStudent); //true

    }
}

class IncrementDecrementOperator {
    public static void main(String[] args) {
        int score = 0;
        int turns = 10;
        int number = 55;

        score += 2;
        score++; // increase value by 1 for any value or type
        turns--;

        System.out.println(score);
        System.out.println(turns);
        System.out.println(number++); //55 , -> 컴파일러가 이렇게 읽어가서,
        System.out.println(number); //56

        System.out.println(++number); //57 , -> 컴파일러가 이렇게 읽어가서,
        System.out.println(number); //57

    }
}
