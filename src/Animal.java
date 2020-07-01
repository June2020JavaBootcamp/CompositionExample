public class Animal {
    private int legs;
    private String speaks;

    public Animal(){
        this.legs = 4;
        this.speaks = "hello";
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs ){
        this.legs = legs;
    }

    public String getSpeaks() {
        return this.speaks;
    }

    public void setSpeaks(String speaks){
        this.speaks = speaks;
    }

    public String toString(){
        return "has " + this.legs + " legs and " + this.speaks;
    }
}
