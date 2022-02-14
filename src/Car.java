public class Car
{
    private String name;
    private int miles;

    public Car(String name, int miles)
    {
        this.name = name;
        this.miles = miles;
    }

    public String toString()
    {
        return name + " " + miles + " mi";
    }
}
