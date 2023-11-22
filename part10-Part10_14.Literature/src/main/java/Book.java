public class Book  implements  Comparable<Book>{
    private String name;
    private Integer recAge;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRecAge() {
        return recAge;
    }

    public void setRecAge(Integer recAge) {
        this.recAge = recAge;
    }

    public Book(String name, Integer recAge) {
        this.name = name;
        this.recAge = recAge;
    }

    @Override
    public String toString() {
        return String.format("%s (recommended for %d year-olds or older)",name,recAge);
    }

    @Override
    public int compareTo(Book o) {
        if(this.getRecAge()-o.getRecAge()==0){
            return this.name.compareTo(o.getName());
        }
        return this.getRecAge()-o.getRecAge();
    }


}
