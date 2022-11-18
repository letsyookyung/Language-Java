import java.util.ArrayList;
import java.util.Comparator;


class ArraryLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // int double float boolean
        // Integer => wrapper class (기본 자료형들의 클래스 타입), reference type form of the regular int type
        // dynamic

        // add
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers.toString()); //[1, 2, 3, 4, 5, 6]
        System.out.println(numbers.get(2)); //3

        // remove
        numbers.remove(2) ; //index
        System.out.println(numbers.toString()); //[1, 2, 4, 5, 6]

        numbers.remove(Integer.valueOf(4)); // value로 삭제
        System.out.println(numbers.toString()); //[1,2,5,6]

        // set
        numbers.set(0, Integer.valueOf(30)) ;
        System.out.println(numbers.toString()); // [30,2,5,6]

        numbers.clear();
        System.out.println(numbers.toString()); //[]

        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(6);
        numbers.add(4);
        System.out.println(numbers.toString()); //[]

        // sort
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.toString()); //[]
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString()); //[]

        // size
        System.out.println(numbers.size()); // 6

        //contains
        System.out.println(numbers.contains(Integer.valueOf(3))); // true

        //isEmpty
        System.out.println(numbers.isEmpty()); //[] // false

        // forEach , for Each number -> action = lambda 같은데?
        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number*2);
        });

        System.out.println(numbers.toString()); //[]
        System.out.println(sum); //[]


    }
}