import java.util.ArrayList;
import java.util.Arrays;
public class AnotherRunner
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Porsche", 3);
        Car car2 = new Car("Lamborghini", 7);
        Car car3 = new Car("Tesla", 17);
        Car[] cars = {car1, car2, car3};
        ArrayList<Car> carList = new ArrayList<Car> (Arrays.asList(cars));
        System.out.println(carList);
    }
}
