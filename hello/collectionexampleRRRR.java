import java.util.ArrayList;
class StudentRRR
{
    int rollno;
    String name;
    StudentRRR(int rollno ,String name)
    {
        this.rollno=rollno;
        this.name=name;

    }
}
class collectionexampleRRRR{
public static void main(String args[])
{
ArrayList<StudentRRR> list = new ArrayList<>();
list.add(new StudentRRR(10,"Amit"));
list.add(new StudentRRR(11,"AmreshBhaiya"));
list.add(new StudentRRR(12,"Raj"));
for(StudentRRR s:list)
{
System.out.println(s.rollno + " | "+ s.name);
}
}
}
