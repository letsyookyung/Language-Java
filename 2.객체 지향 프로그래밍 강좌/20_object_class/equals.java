class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals (Object obj) {
        Student _obj = (Student)obj;
        System.out.println("equals s1.name:"+ name);
        System.out.println("equals s2.name:"+_obj.name);

        return name == _obj.name;
    }
}



class CloneDemo {
    public static void main(String[] args){
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2); // false
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.equals(s2)); // false

    }
}