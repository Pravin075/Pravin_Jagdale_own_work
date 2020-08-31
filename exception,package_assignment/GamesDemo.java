abstract class Game
{
abstract void play();
}

class FootBall extends Game
{
void play()
{
System.out.println("in Football");
}
}

class Cricket extends Game
{
void play()
{
System.out.println("in cricket");
}
}

class Tennis extends Game
{
void play()
{
System.out.println("in tennis");
}
}

public class GamesDemo
{
public static void main(String arg[])
{
Game arr[] = {new FootBall(),new Cricket(),new Tennis()};

for (int i=0;i<3;i++)
    arr[i].play();
}
}










