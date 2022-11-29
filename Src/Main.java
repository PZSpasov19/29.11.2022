import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    /*public static void main(String[] args)
    {
        Lamp x = new Lamp();
        Lamp.Room y = x.new Room();
        Lamp.Home c = y.new Home();

    }*/

    /*public static void main(String[] args)
    {
        Animal dog = new Animal( "Dog", 20);
        Animal cat = new Animal("Cat", 10);

        System.out.println(dog.getAge());
        System.out.println(cat.getAge());

        dog.setAge(21);
        cat.setBreed(11);

        System.out.println(dog.getAge());
        System.out.println(cat.getBreed());

        System.out.println(dog);
        System.out.println(cat);


        int n = Integer.parseInt("1");

        Scanner scanner = new Scanner(System.in);
    }

    public static void test()
    {
        System.out.println("Testing...");
    }*/

    Scanner scanner = new Scanner(System.in);

    List<Person> people = new ArrayList<>();
    int n = Integer.parseInt(scanner.nextLine());

    for(int i = 0; i < n; i++)
    {
        String[] input = scanner.nextLine().split("\\S+");
        String name = input[0];
        int age = Integer.parseInt(input[1]);
        Person person = new Person(name, age);
        people.add(person);
    }
    for(int i = 0; i < people.size(); i++)
    {
        System.out.println(people.get(i));
    }

    for(Person per : people)
    {
        System.out.println(per);
    }
}

