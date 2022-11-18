import java.util.HashMap;

// key-value pairs = dictionary같은거

class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        // put
        examScores.put("Math", 75);
        examScores.put("english", 90);
        examScores.put("sociology", 100);
        examScores.put("computer", 100);
        examScores.put("art", 100);
        examScores.put("science", 100);

        System.out.println(examScores.toString());

        // get
        System.out.println(examScores.get("english")); // 90
        System.out.println(examScores.get("region")); // null
        System.out.println(examScores.getOrDefault("art", -1)); // 없으면 -1, 있으면 value

        // putIfAbsent
        examScores.putIfAbsent("Math", 74); // 이미 있으면 아무것도 안변함
        System.out.println(examScores.toString());

        // replace
        examScores.replace("Math", 10);
        System.out.println(examScores.toString());

        // clear
//        examScores.clear();
//        System.out.println(examScores.toString());

        // size
        System.out.println(examScores.size());

        // remove
        examScores.remove("art");

        // containsKey,containsValue
        System.out.println(examScores.containsKey("science")); // true
        System.out.println(examScores.containsValue(100)); // true
        System.out.println(examScores.containsValue(Integer.valueOf(30))); // false

        // isEmpty
        System.out.println(examScores.isEmpty()); // false

        // forEach
        examScores.forEach(( subject, score) -> {
            System.out.println(subject + "-" + score);
            if (subject == "Math") {
                examScores.replace(subject, 0);
            }
        });
        System.out.println(examScores.toString());
    }
}