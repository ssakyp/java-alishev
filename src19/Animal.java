package src19;

public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягушка");
    private String translation;
    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation(){
        return translation;
    }

    public String toString(){
        return "Translation into Russian language: " + translation;
    }
}
