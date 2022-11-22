//class Scope {
//
//     static String a() {
//        String title = "hello";
//        return title;
//    }
//
////    static void a(){
////        String title = "hello";
////        System.out.println("void");
////    }
//
//    public static void main(String[] args){
//         String title = a();
////        a();
//        System.out.println(title);
//    }
//}


class C {

    int v = 10;

    void m() {
        int v = 20;
        System.out.println(v);
        System.out.println(this.v);
    }

    static String s(){
        return "String hi";
    }

}

class ScopeInstance {
    public static void main(String[] args){
        C c1 = new C();
        c1.m();
        String s = c1.s();
        System.out.println(s);
    }
}