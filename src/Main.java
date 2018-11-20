import java.util.Random;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Flight f1 = new Flight();
        CargoFlight f2 = new CargoFlight();
        Flight f3 = new CargoFlight();

        System.out.println("base Flight number of flightCrue = " + f1.flightCrue);
        System.out.println("cargo Flight number of flightCrue = " + f2.flightCrue);
        System.out.println("cargoFlight as Flight number of flightCrue = " + f3.flightCrue);

        System.out.println("_______________________________________________________________");

        System.out.println("base Flight number of seats = " + f1.getSeats());
        System.out.println("cargo Flight number of seats = " + f2.getSeats());
        System.out.println("cargoFlight as Flight number of seats = " + f3.getSeats());



               /*
        //System.out.println(RandomNumber());
        int numOfParams = RandomNumber();
        ArrayList<Integer> params = new ArrayList<Integer>(numOfParams);
        for (int i = 0; i < numOfParams; i++  )
        {
            params.add(RandomNumber());
        }

        System.out.println("Size = " + params.size());
        ListAllParams(2,3, 4, 5, 6, 7, 1, 11, 999, -3, 05);
        ListAllParams(2,3);
*/

    }

  public static int RandomNumber() {
      Random rand = new Random();
      int  n = rand.nextInt(10) + 1;
     return  n;
  }

  public static void ListAllParams(int... list)
  {
      for (int param : list)
      {
          System.out.println(param);
      }

  }

}
