class Strings {
    public static void main(String[] args) {
        // char ' ', string " "
        char percentSign = '1'; // character 1개만 가능
        System.out.println(percentSign);

        // String, new String
        String literalString1 = "abc"; //추천
        String literalString2 = "abc";

        String objectString = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2); //true
        System.out.println(objectString == objectString2); //false

    }
}

class Long {
    public static void main(String[] args) {
        String name = "yookyung"; //%s
        String country = "korea";
        int age = 30; //%d
        double gpa = 3.99; //%f
        char percentSign = '%'; //%c
        boolean amITellingTruth = false; //%b

        String formattedString = String.format("My name is %s. I am from %s. I am %d years old.", name, country, age);
        String formattedString2 = String.format("My GPA is %f. I have attended 100%c of my university classes. These are all %b claims.", gpa, percentSign, amITellingTruth);
        System.out.println(formattedString + formattedString2);

    }
}

class LengthReplaceContains {
    public static void main(String[] args) {
        String name = "yookyung";
        String string1 = new String("yoo");
        String string2 = new String("YOO");
        String sentence = "the sky is blue.";
        String updatedString = sentence.replace("blue", "green");
        sentence = sentence.replace("blue", "red");

        System.out.println(name.length()); // 8
        System.out.println(name.isEmpty()); //false
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(string1 == string2); //false
        System.out.println(string1.equals(string2)); //true, value자체만 체크
        System.out.println(string1.equalsIgnoreCase(string2)); //true
        System.out.println(sentence);
        System.out.println(updatedString);
        System.out.println(sentence.contains("sky"));

    }
}