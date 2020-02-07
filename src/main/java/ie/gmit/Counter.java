package ie.gmit;

public class Counter {

    private int count;

    public Counter(){
        count = 0;
    }

    public Counter(int count) throws illegalArgumentException {
        if(count < 1){
            throw new illegalArgumentException();
        }
        this.count = count;
    }

    public int getCount(){
        return count;
    }

    public void increase(){
        count++;
    }
    public void decrease(){
        count--;
    }
}
