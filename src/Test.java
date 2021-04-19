class Test
{
int a, b;
Test ()
{
System.out.println("I am from default Constructor...");
a=1;
b=2;
System.out.println("Value of a ="+a);
System.out.println("Value of b ="+b);
}
Test (int x, int y)
{
System.out.println("I am from double Paraceterized Constructor");
a=x;
b=y;
System.out.println("Value of a ="+a);
System.out.println("Value of b ="+b);
}
Test (int x)
{
System.out.println("I am from single Parameterized Constructor");
a=x;
b=x;
System.out.println("Value of a ="+a);
System.out.println("Value of b ="+b);
}
Test (Test T)
{
System.out.println("I am from Object Parameterized Constructor...");
a=T.a;
b=T.b;
System.out.println("Value of a ="+a);
System.out.println("Value of b ="+b);
}
};
class TestDemo2
{
public static void main (String k [])
{
Test t1=new Test ();
Test t2=new Test (10, 20);
Test t3=new Test (1000);
Test t4=new Test (t1);
}
}