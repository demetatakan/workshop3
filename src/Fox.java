public class Fox extends Animal
{
    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    private String breed;

    private String gender;

    // Constructor
    public Fox(String name, int age, String breed, String gender)
    {
        super(name, age);
        this.breed = breed;
        this.gender = gender;
    }

    /*
    When you created a method by inheriting from another class which is Abstract in this example
    You have to override the methods of Abstract class.
    * */
    @Override
    public int getAgeInHumanYears()
    {
        int humanYears;

        if (getAge() <= 2)
            humanYears = getAge() + 11;
        else
            humanYears = 22 + ((getAge() - 2) * 5);

        return humanYears;
    }

    @Override
    public String toString()
    {
        return  "................" + "\n" +
                "Name :" + getName() + "\n" +
                "Breed :" + breed + "\n" +
                "Gender :" + gender + "\n" +
                "Age in calendar years :" + getAge() + "\n" +
                "Age in human years: " + getAgeInHumanYears() + "\n" +
                "................";
    }

    /*
    Boolean is a type which contains only true or false
    */
    public boolean Equals(Fox d){
        if(getName() != d.getName()) return false;
        if(getAge() != d.getAge()) return false;
        if(getBreed() != d.getBreed()) return false;

        return true;
    }

    /*
    When a method have a "void" keyword, it shouldn't have a "return"
    Otherwise, the method should return something related to its method type (String or int or double)
    * */
    public int topla(int a, int b)
    {
        return a + b;
    }
}



