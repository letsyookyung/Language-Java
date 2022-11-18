//import java.util.Arrays;


// for :
// 1) initializer,
// 2) for문 안에로 가는 condition,
// 3) for문 안
// 4) update,

class ForLoops {
    public static void main(String[] args) {

        // 1
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }

        // 2
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
            System.out.println(numbers[index]);
        }
        System.out.println(sum);

        // 3
//        int number = 5;
        for (int number =1; number < 10; number++) {
            System.out.printf("%d단\n",number);
            System.out.printf("-----------\n");
            for (int multiplier = 1; multiplier < 10; multiplier++) {
                System.out.printf("%d x %d = %d\n", number, multiplier, number * multiplier);
            }
        }

       // 4
       for (int number = 1; number <= 50; number++) {
           if (number % 2 == 1) {
               System.out.println(number);
           }
       }

       // 5
        int number_array[] = {2,3,4,5,6};
       int sum2 = 0 ;
       for (int number : number_array) {
           System.out.println(number);
           sum2 += number;
       }
        System.out.println(sum2);


    }
}



class While_loop {
    public static void main(String[] args) {
        int number = 5; // initializer
        int multiplier =1;

        while (multiplier <=10) {
            System.out.printf("%d x %d = %d\n", number, multiplier, number*multiplier);
            multiplier += 1; //update
        }
    }
}


class DoWhileLoop {
    public static void main(String[] args) {
        int number = 5; // initializer
        int multiplier =1;

        do {
            System.out.printf("%d x %d = %d\n", number, multiplier, number*multiplier);
            multiplier += 1;
        } while (multiplier <= 10);
    }
}

