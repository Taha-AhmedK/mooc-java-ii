public class Person {
    private String name ;
    private Education education;

    public Person(String name , Education edu){
        this.name=name;
        this.education=edu;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return String.format("%s, %s",name,education);
    }
}
