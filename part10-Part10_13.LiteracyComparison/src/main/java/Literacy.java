public class Literacy {
    private String country;
    private String year;
    private double literacy_p;
    private String gender;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getLiteracy_p() {
        return literacy_p;
    }

    public void setLiteracy_p(double literacy_p) {
        this.literacy_p = literacy_p;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public Literacy(String country,String year,String gender,double percent){
        this.country=country;
        this.year=year;
        this.gender=gender;
        this.literacy_p=percent;
    }

    @Override
    public String toString() {
        return String.format("%s (%s), %s, %s",this.country,this.year,this.gender,this.literacy_p);
    }
}
