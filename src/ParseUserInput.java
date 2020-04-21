import java.util.Scanner;
public class ParseUserInput {
   public static void main(String[] args) {

      String addressInto = "P Sherman 42 Wallaby Way Sydney";

      Scanner strToken = new Scanner(addressInto);

      String firstInitial = strToken.next();
      String lastName = strToken.next();
      int houseNumber = strToken.nextInt();
      String streetName = strToken.next();
      String streetType = strToken.next();
      String city = strToken.next(); 

      System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
      System.out.println(streetName + " " + streetType + " " + city);

   }
}
