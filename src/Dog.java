public class Dog extends Animal{
    private boolean tail;

    public Dog(){
        super();
        this.tail = true;
        this.setSpeaks("barks");
    }


    public boolean isTail() {
        return this.tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public String toString(){
        String msg = super.toString();
        return msg = msg + " tails=" + this.tail;
    }

    public String toString(String textmsg) {
        return textmsg + " " + super.toString();
    }



}
