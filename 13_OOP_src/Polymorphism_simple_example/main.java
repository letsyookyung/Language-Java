package Polymorphism_simple_example;

public class main {

    public static void main(String[] args) {
        harvard h = new harvard();
        yale y = new yale() ;

        printSchoolName(h);
        printSchoolName(y);
    }

    public static void printSchoolName(school school) {
        System.out.println(school.getName());
    }
}
