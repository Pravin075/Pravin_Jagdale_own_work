import java.util.*;
class Player
{
int pid;
String name;
int runs;
String country;

Player(int a,String b,int c,String d)
{
pid=a;
name=b;
runs=c;
country=d;
}

int getpId()
{
return this.pid;
}
void setpId(int no)
{
 this.pid=no;
}

int getRuns()
{
return this.runs;
}
void setRuns(int no)
{
 this.runs=no;
}

String getCountry()
{
return this.country;
}
void setCountry(String no)
{
 this.country=no;
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


public class Demo11
{
public static void main(String arf[])
{
Player p1=new Player(1,"Sachin",18000,"India");
Player p2=new Player(2,"Ponting",14000,"Australia");
Player p3=new Player(3,"Kallis",12000,"Africa");
Player p4=new Player(4,"Lara",13000,"Windies");
Player p5=new Player(5,"Sanath",15000,"Lanka");
Player p6=new Player(6,"Sunil",16000,"India");
Player p7=new Player(7,"hayden",5000,"Australia");
Player p8=new Player(8,"Decock",8000,"Africa");
List<Player> arr=new ArrayList<>();
arr.add(p1);
arr.add(p2);
arr.add(p3);
arr.add(p4);
arr.add(p5);
arr.add(p6);
arr.add(p7);
arr.add(p8);
arr.stream().filter(s->s.getCountry().startsWith("India")).map(Player::getName).forEach(System.out::println);
}
}











