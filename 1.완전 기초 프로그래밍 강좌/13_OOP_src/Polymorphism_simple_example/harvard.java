package Polymorphism_simple_example;

public class harvard implements school {
    private String name;
    public harvard() {

        name = "harvard";
    }

    @Override
    public String getName() {
        return name;
    }


}