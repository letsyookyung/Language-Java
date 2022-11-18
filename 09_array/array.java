import java.util.Arrays;


class English {
    public static void main(String[] args) {
        char vowels[] = new char[5];
        // a e i o u
        vowels[0] ='a';
        vowels[1] ='e';
        vowels[2] ='i';
        vowels[3] ='o';
        vowels[4] ='u';
//        vowels[5] ='x'; //length 벗어남

        System.out.println(vowels[2]);
        System.out.println(Arrays.toString(vowels));


        String nouns[] = {"apple", "eclipse", "input"};
        System.out.println(nouns[0]);
        System.out.println(Arrays.toString(nouns));
        System.out.print(nouns.length);

    }
}

class Sorting {
    public static void main(String[] args) {
        char vowels[] = {'e', 'i', 'a', 'o', 'u'};
        int startingIndex = 1;
        int endingIndex = 3; // not inclusive 0-2까지임
//        Arrays.sort(vowels); //original array를 바꿈, 배열은 call by refer?
        Arrays.sort(vowels, startingIndex, endingIndex); //original array를 바꿈, 배열은 call by refer?


        System.out.println(vowels); // aeiou
        System.out.println(Arrays.toString(vowels)); // [a,e,i,o,u]

    }
}


class Searching {
    public static void main(String[] args) {
        char vowels[] = {'e', 'i', 'a', 'o', 'u'};

//        char key = 'o';
        char key = 'b';
        int foundItemIndex = Arrays.binarySearch(vowels, key); //startingindex, endingindex도 할 수 있음

        System.out.println(foundItemIndex); // 없는 key 면 -값 뱉음
        System.out.println(vowels[3]);

        System.out.println(vowels[foundItemIndex]);


    }
}


class Fill {
    public static void main(String[] args) {
        char vowels[] = {'e', 'i', 'a', 'o', 'u'};
        int startingIndex = 1;
        int endingIndex = 3;

        Arrays.fill(vowels, startingIndex, endingIndex, 'x'); //[x, x, x, x, x]

        System.out.println(Arrays.toString(vowels));

    }
}

class Copy {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        int copyOfNumbers[] = numbers;
        int copyOfNumbers2[] = copyOfNumbers;
        int copyOfNumbers3[] = Arrays.copyOf(numbers, numbers.length);
        int copyOfNumbers4[] = Arrays.copyOfRange(numbers,0,3);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));

//        numbers[3] = 333;
//        copyOfNumbers[0] = 100;
//        copyOfNumbers3[2] = 200000;
        System.out.println(Arrays.toString(numbers)); //[100, 2, 3, 333, 5]
        System.out.println(Arrays.toString(copyOfNumbers)); //[100, 2, 3, 333, 5]
        System.out.println(Arrays.toString(copyOfNumbers2)); //[100, 2, 3, 333, 5]
        System.out.println(Arrays.toString(copyOfNumbers3)); //[1, 2, 200000, 4, 5], length 변경하면, [1, 2, 200000, 4, 5, 0, 0, 0, 0, 0], [1, 2]
        System.out.println(Arrays.toString(copyOfNumbers4)); //[1, 2, 3], length 변경하면, [1, 2, 0, 0, 0, 0, 0, 0, 0]

        //compare
        System.out.println(numbers == copyOfNumbers); //true
        System.out.println(numbers == copyOfNumbers3); //false
        System.out.println(Arrays.equals(numbers, copyOfNumbers3)); //true

    }
}