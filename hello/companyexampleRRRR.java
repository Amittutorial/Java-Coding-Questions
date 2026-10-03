import java.util.ArrayList;
class StudentRRR
{
   
    String name;
    double salary;
    StudentRRR(String name, double salary)
    {
        
        this.name=name;
        this.salary=salary;

    }
}
class companyexampleRRRR{
public static void main(String args[])
{
ArrayList<StudentRRR> list = new ArrayList<>();
list.add(new StudentRRR("Amit",55000));
list.set(0,new StudentRRR("Rammu",450000));
list.add(new StudentRRR("AmreshBhaiya",7000000));   // Anolomas object  use only one time
list.add(new StudentRRR("Raj",6700000));
list.remove(0);

for(StudentRRR s:list)
{
System.out.println(s.name + " | "+ s.salary);
}
}
}
