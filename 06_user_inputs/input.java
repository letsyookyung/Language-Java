import java.util.Scanner;


class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner 열고

        System.out.println("what is your name?");
        String name = scanner.nextLine();

        System.out.printf("oh you are %s. how old are you? ", name);
//        int age = scanner.nextInt();
        // 해결방법2)
//        int age2 = Integer.parseInt(scanner.nextLine());
        double gpa = Double.parseDouble(scanner.nextLine());
        // 30 <enter> // 이렇게가 buffer에 남아있다

        // 해결방법1)cleans up the input buffer 중요!
//        scanner.nextLine();

        System.out.printf("%f is an excellent age to start programming! \nwhat is favorite lang?", gpa);
//        System.out.printf("\nwhat is favorite lang?");
        String lang = scanner.nextLine();
        // <enter> //
        System.out.printf("%s is very popular.", lang);


        scanner.close();
    }
}