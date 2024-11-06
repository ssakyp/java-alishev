package src19;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal.toString());
        switch (animal){
            case CAT:
                System.out.println("It is a cat.");
                break;
            case DOG:
                System.out.println("It is a dog.");
                break;
            default:
                System.out.println("It is not an animal.");
        }

        // Object -> Test
        // Object -> Enum -> Season


        Season season = Season.SUMMER;
        System.out.println(season instanceof Object);
        System.out.println(season.getClass());
        System.out.println(season.getTemperature());
        switch (season){
            case SUMMER:
                System.out.println("It is warm outside.");
                break;
            case WINTER:
                System.out.println("It is cold outside.");
                break;

        }

        System.out.println(season.name());
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        System.out.println(season.ordinal());   // index of enum

    }


    /* //without enum
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args){
        int animal = 100;
        switch (animal){
            case DOG:
                System.out.println("It is a dog.");
                break;
            case FROG:
                System.out.println("It is a frog.");
                break;
            default:
                System.out.println("It is not an animal.");
        }
    }*/

}
