// Default class Only inside class and package
public class AccessSpecifiers
{
    public static void main(){
        System.out.println("In default class");
    }
}

// Public class inside class, package, subclass outside package, outside package
public class AccessSpecifiers
{
    public static void main(){
        System.out.println("In default class");
    }
}

// Private class only inside class
private class AccessSpecifiers2
{
    public static void main(){
        System.out.println("In default class");
    }
}


// Protected class only inside class, package, subclass from outer package
class AccessSpecifiers3
{
    public static void main(){
        System.out.println("In default class");
    }
}