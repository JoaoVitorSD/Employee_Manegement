import java.util.ArrayList;
import java.util.List;

public class Element <T>{
    private List<T> list = new ArrayList<T>();

    public T getFirst() {
        if(list.isEmpty()){
            System.out.println("No elements inserted");
            return null;
        }
        return list.get(0); };
    public void add(T t) {
        list.add(t);
    }
    public void print(){
        if(list.isEmpty()){
            System.out.println("No elements found");
        }
        for(T t : list){
            System.out.print(" " + t);
        }
        System.out.println("\n--------------------------------");
    }
}
