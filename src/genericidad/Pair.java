package genericidad;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
    
    @Override
    public String toString(){
        String message = "(" +first.toString() + second.toString() +")";
        return message;
    }
    
}
