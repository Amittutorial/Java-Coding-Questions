
import java.util.ArrayList;
class CollectionExample
{
    
    public static void main(String args[])
    {   ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> lis=new ArrayList<>();
        ArrayList<Double> li=new ArrayList<>();

        list.add(10);
        lis.add("Amit"); 
        lis.add("Ram");
        lis.add("Ayush");
        li.add(5.55);
        System.out.println(list);
        System.out.println(lis);
        lis.remove(2);
        System.out.println(lis);
        lis.clear();
        System.out.println(lis);
        System.out.println(li);

      
    }
}