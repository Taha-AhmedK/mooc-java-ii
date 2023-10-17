/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CD implements Packable {

    private String artist;
    private String cdName;
    private int publicationYr;
    private double weight;

    public CD(String artist, String cdName, int publicationYr) {
        this.artist = artist;
        this.cdName = cdName;
        this.publicationYr = publicationYr;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist+": "+this.cdName+String.format(" (%s)", this.publicationYr);
    }
    
    

}
