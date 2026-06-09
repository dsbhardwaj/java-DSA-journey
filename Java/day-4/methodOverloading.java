// multiple methods can have same name as long their parameter list are different .

public class methodOverloading{
    
    public static void greet() {
    System.out.println("Hello");
}

    public static void greet(String name) {
    System.out.println("Hello " + name);
}

    public static void greet(String name, int age) {
    System.out.println(name + " is " + age);
}

public static void main(String[] args) {
    greet();
    greet("Drishti");
    greet("Drishti",21);
}
}