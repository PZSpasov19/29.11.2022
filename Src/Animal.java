public class Animal {
    private String breed;
    private int age;

    public Animal()
    {
        this.age = 19;
    }



    public static int test = 1;

    public Animal(String breed, int age)
    {
        this.breed = breed;
        this.age = age;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(int i)
    {
        this.breed = breed;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String toString()
    {
        return "The breed is: " + this.getBreed()
                + " and its age is: " + this.getAge();
    }

    public void testing()
    {
        Main.test();
    }
}
