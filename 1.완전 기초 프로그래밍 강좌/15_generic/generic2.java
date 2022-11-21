// 3. 타입이 안전성 + 코드의 중복 제거 => 제니릭화

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){
        this.rank = rank;
    };
}

// 참조형 데이터 타입만 올 수 있음, 제니릭으로 기본 데이터 타입으로는 안되고, 객체 타입 wrapper class으로
class Person<T, S> {
    public T info;
    public S id;
    Person(T info, S id) {
        this.info = info;
        this.id = id;
    }

    // 메소드 범위에서의 제너릭 적용
    public <U> void printInfo(U info) {
        System.out.println(info);
    }

}

class Generic {
    public static void main(String[] args) {
        Integer id = new Integer(1);

        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id);
        System.out.println(p1.id.intValue()); // Integer에서 값 가져오는 함수
    }
}

// 4. 제네릭의 생략 => 지금은 안되는걸?

class GenericNo {
    public static void main(String[] args){
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10);

        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
//        Person p1 = new Person(e,i);
        p1.<EmployeeInfo>printInfo(e);
//        p1.printInfo(e);

    }
}

// 5. extends를 통해 들어올 수 있는 데이터 타입을 제한둠 (Info 부모/자식 클래스로 제한)
//abstract class Info{
//    public abstract int getLevel();
//}


//class EmployeeInfo extends Info{
//    public int rank;
//    EmployeeInfo(int rank){
//        this.rank = rank;
//    }
//    public int getLevel(){
//        return this.rank;
//    }
//}

// ---- Interface로도 가능

interface Info{
    int getLevel();
}

class EmployeeInfo2 implements Info{
    public int rank;
    EmployeeInfo2(int rank){
        this.rank = rank;
    }
    public int getLevel(){
        return this.rank;
    }
}


// ---------


class Person2<T extends Info>{ // extends 부모가 누구냐
    public T info;
    Person2(T info){
        this.info = info;
        info.getLevel(); // 부모꺼를 받아와서 가능
    }
}


class GenericExtends{
    public static void main(String[] args){

        Person2<EmployeeInfo2> p1= new Person2<EmployeeInfo2>(new EmployeeInfo2(1));
//        Person<String> = new Person<String>("부장")
    }
}
