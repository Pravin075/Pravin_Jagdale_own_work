import java.util.*;
class Student
{
int rollno;
String name;
int age;
int marks;
Student(int a,String b,int c,int d)
{
rollno=a;
name=b;
age=c;
marks=d;
}
int getNo()
{
return this.rollno;
}
void setNo(int no)
{
 this.rollno=no;
}

int getAge()
{
return this.age;
}
void setAge(int no)
{
 this.age=no;
}

int getMarks()
{
return this.marks;
}
void setMarks(int no)
{
 this.marks=no;
}

String getName()
{
return this.name;
}
void setName(String a)
{
this.name=a;
}
}


public class Demo3
{
public static void main(String arf[])
{
Student s1=new Student(1,"pravin",25,88);
Student s2=new Student(2,"omkar",20,90);
Student s3=new Student(3,"sairaj",27,98);
Student s4=new Student(4,"nikhil",24,92);
List<Student> arr=new ArrayList<Student>();
arr.add(s1);
arr.add(s2);
arr.add(s3);
arr.add(s4);
arr.stream().map(s->s.getAge()).filter(s-> s>=22 && s<=25).forEach(System.out::println);

}
}




