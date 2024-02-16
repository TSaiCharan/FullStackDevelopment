class StaticDemo
{
    static int a=10;
}

public class Keywordsa
{

    // @SuppressWarnings("static-access")
    public static void main()
    {
        // Instance 1
        StaticDemo a= new StaticDemo();
        StaticDemo b= new StaticDemo();

        System.out.println("Instance a variable before change = "+a.a); // This won't work because static variables can't be accessed with instance names but with class name
        System.out.println("Instance b variable before change = "+StaticDemo.a);

        a.a=20;

        System.out.println("Instance a variable after change = "+a.a);
        System.out.println("Instance b variable after change = "+b.a);


    }
}