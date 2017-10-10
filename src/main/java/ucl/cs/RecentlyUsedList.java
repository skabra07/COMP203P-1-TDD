package ucl.cs;

import java.util.ArrayList;

/**
 * Created by Suyash on 10-Oct-17.
 */
public class RecentlyUsedList {
    private ArrayList<String> list;

    public RecentlyUsedList(){
        list = new ArrayList<>();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void add(String val){
        if(list.contains(val)){
            list.remove(val);
        }
        try{
            list.add(0,val);
        }
        catch (Exception e){
            throw new IllegalArgumentException("String not added");
        }
    }

    public String get() {
        return list.get(list.size()-1);

    }

    public String getFirstValue() {
        return list.get(0);
    }

    public int numberOfItems(String val) {
        int count = 0;
        for(String item:list){
            if(item.equals(val)){
                count++;
            }
        }
        return count;
    }
}
