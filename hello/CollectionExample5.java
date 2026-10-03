import java.util.ArrayList;

class CollectionExample5
{
 public static void main(String args[])
 {
    ArrayList<Integer> list =new ArrayList<>();
    list.add(10);
    list.add(30);
    list.add(40);
    System.out.println(list);

    list.remove(1);  // reemove element from index
    System.out.println(list);
    System.out.println(list.isEmpty()); // cheack list is empty or not
    list.set(1,30);  // upbate value in list at index
    System.out.println(list);
    System.out.println(list.contains(25));  // it cheack element is present or not
    list.clear();  // for remove all elements from list
    System.out.println(list);
        


 }
}