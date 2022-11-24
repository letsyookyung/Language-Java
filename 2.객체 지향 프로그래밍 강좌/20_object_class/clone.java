// Cloneable 인터페이스를 적용하고
class Student implements Cloneable {
    String name;
    Student(String name){
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}



class CloneDemo {

    public static void main(String[] args){
        Student s1 = new Student("egoing");
        // 복제 가능한 객체라는걸 알려줘야됨
        try {
            Student s2 = (Student)s1.clone(); // Object는 다른 패키지의 메소드이기 때문에.
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}