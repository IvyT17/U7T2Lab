import java.util.ArrayList;
/**
 * This class represents a car lot for used cars
 *
 * @author Ivy Tang
 */

/** This is an ArrayList called inventory and it includes car objects with names and miles.
 *
 */
public class UsedCarLot
{
    private ArrayList<Car> inventory;

    /** initialization of ArrayList inventory
     *
     */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car> ();
    }

    /** returns the items in the ArrayList inventory
     *
     * @return ArrayList inventory items
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /** adds another car into the ArrayList inventory
     * @param newCar is a new Car object
     */
    public void addCar(Car newCar)
    {
        inventory.add(newCar);
    }

    /** Condition: both cars must be within the size of the inventory in order to
     * prevent an indexOutOfBounds error
     * switches positions of first and second car
     * @param firstCar is the first car you want to change positions of with the second car
     * @param secondCar is the second car you want to change positions of with the previous car
     * @return true if the program successfully swaps the first and second car
     * @return false if the program failed to swap the first and second car
     */
    public boolean swap(int firstCar, int secondCar)
    {
       if (firstCar < inventory.size() && secondCar < inventory.size() && firstCar >= 0 && secondCar >= 0)
       {
           Car car1 = inventory.get(firstCar);
           Car car2 = inventory.get(secondCar);
           inventory.set(firstCar, car2);
           inventory.set(secondCar, car1);
           return true;
       }
       else
       {
           return false;
       }
    }

    /** Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */

    /** adds another Car object in a specific location on the ArrayList inventory
     *
     * @param indexToAdd the specific index in the ArrayList inventory that you want to add the new car into
     * @param carToAdd the car object you want to add into that particular index
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /** "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell &lt; inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */

    /** removes the car that is sold and moves the cars behind one index up
     *
     * @param indexOfCarToSell the index of the car you want to sell and remove
     * @return the index to be removed from inventory
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /** "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell &lt; inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */

    /** removes the car that is sold from the ArrayList inventory and
     *  replacing it with null so that the other cars do not move one index up
     * @param indexOfCarToSell the index of the car you want to sell and remove
     * @return the index to be removed from inventory
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car sold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sold;
    }

    /** moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex &lt; indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
                      destinationIndex &lt; inventory.size()
     */

    /** exchanges the position of one car with another
     *
     * @param indexOfCarToMove the index of the Car object in ArrayList inventory that you want to move
     * @param destinationIndex the new index you want to move the car object into in the ArrayList inventory
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car movedCar = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, movedCar);
    }
}
