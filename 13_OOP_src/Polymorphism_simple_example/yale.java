package Polymorphism_simple_example;

public class yale implements school {
    private String name;
    public yale() {

        name = "yale";
    }

    @Override
    public String getName() {
        return name;
    }


}