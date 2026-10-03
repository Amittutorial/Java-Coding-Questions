/*==========================================package==========================================================

It is the collection of similar types of calsses ,interfaces and subpakages

Types of packages 
[1]=User define packages
[2]= Pre Define all Buid in packages
# Build in pakages are those packages which are allredy define 
FOR EXAMPLE:-----
java.util,java.io,java.long;

____________________________[User Define pakages]____________________________
the pakage which are define user or developer is known as User define pakage

Syntax:----
package packagename

*/

 package hello;
 class pakage
 {
    void helloRR()
    {
        System.out.println("Hello Amit verma");        // javac -d.pakage.java
    }                                                   // java hello.pakage
    public static void main(String args[])
    {
        pakage h=new pakage();
        h.helloRR();

    }
 } 