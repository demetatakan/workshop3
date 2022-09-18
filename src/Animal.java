public abstract class Animal
{
    /*
    Variables with getter and setters
    */
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    /* constructor
     - constructor name and class name are same
     - they don't have void, int, String before its name
     - They are executed when an object is created
    */
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }


    //abstract method
    public abstract int getAgeInHumanYears();
}