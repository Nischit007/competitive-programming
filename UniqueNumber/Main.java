


// with time complexity of 0(n^2)
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);
    
        List<Integer> list2=new ArrayList<>();

       for(Integer i:list){
       
            if(list2==null){
                list2.add(i);
            }
            for(Integer j:list2){
                System.out.println(i);
                if(j!=i){
                    list2.add(i);
                }
            }
       }

       System.out.println(list2);


    }

}