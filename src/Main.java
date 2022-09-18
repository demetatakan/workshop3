public class Main
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Bold",3,"Tazı");
        System.out.println(dog1.toString());

        Dog dog2 = new Dog("Bold", 5, "Tazı");
        System.out.println(dog2.toString());

        System.out.println(dog1.Equals(dog2));

        Cat cat = new Cat("Sarman", 3, "Tekir", "sarı");
        System.out.println(cat.toString());

        Fox fox = new Fox("Herry", 7, "Arctic", "male");
        System.out.println(fox.toString());
    }
}