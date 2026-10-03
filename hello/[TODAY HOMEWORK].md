## &#x20;                    \[TODAY HOMEWORK]

## Reverse Array:



public static void main(String args\[]){

&#x20;       int a\[]={1,2,3,4,5};

&#x20;       int left=0;

&#x20;       int right=a.length-1;

&#x20;         int temp;

&#x20;       while(left<right){

&#x20;            temp=a\[left];

&#x20;           a\[left]=a\[right];

&#x20;           a\[right]=temp;

&#x20;           left++;

&#x20;           right--;

&#x20;       }

&#x20;       System.out.println("Print Reversed Array ");

&#x20;       for(int i=0;i<a.length;i++){



&#x20;           System.out.print( a\[i]+"   ");

&#x20;       }

&#x20;   }

}



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

### palindrome number check:



public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       String a = "bob";



&#x20;       boolean palindrome = true;



&#x20;       for (int i = 0; i < a.length() / 2; i++) {

&#x20;           if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {

&#x20;               palindrome = false;

&#x20;               break;

&#x20;           }

&#x20;       }



&#x20;       if (palindrome)

&#x20;           System.out.println("Palindrome");

&#x20;       else

&#x20;           System.out.println("Not Palindrome");

&#x20;   }

}



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

## Anagram Code:

## 

class main {

&#x20;   public static void main(String\[] args) {

&#x20;       String a = "Amit";

&#x20;       String b = "tima";



&#x20;       char\[] first = a.toLowerCase().toCharArray();

&#x20;       char\[] second = b.toLowerCase().toCharArray();



&#x20;       Arrays.sort(first);

&#x20;       Arrays.sort(second);



&#x20;       if (Arrays.equals(first, second)) {

&#x20;           System.out.println("It is an Anagram");

&#x20;       } else {

&#x20;           System.out.println("Not Anagram");

&#x20;       }

&#x20;   }

}



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

### First Non Repeating Char:



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       String a = "aabbcde";



&#x20;       for (int i = 0; i < a.length(); i++) {

&#x20;           boolean unique = true;



&#x20;           for (int j = 0; j < a.length(); j++) {

&#x20;               if (i != j \&\& a.charAt(i) == a.charAt(j)) {

&#x20;                   unique = false;

&#x20;                   break;

&#x20;               }

&#x20;           }



&#x20;           if (unique) {

&#x20;               System.out.println("First non-repeating character: " + a.charAt(i));

&#x20;               break;

&#x20;           }

&#x20;       }

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_



