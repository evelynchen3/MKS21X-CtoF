/**
celsiusToFahrenheit() should have parameter celsius. celsius will be type
double. Once run, the fahrenheit equivalent of the value inputted for celsius
will be returned as a double.

fahrenheitToCelsius() should have parameter fahrenheit. fahrenheit will be
type double. Once run, the celsius equivalent of the value inputted for
fahrenheit will be returned as a double.
**/

public class CtoFTester{
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(24.0));
    System.out.println(fahrenheitToCelsius(75.0));
  }
  public static double celsiusToFahrenheit(double celsius){
    // takes parameter celsius and converts it to its fahrenheit equivalent
    double fahrenheit = ((celsius * 9) / 5); // multiples parameter celsius by 9 and divides by 5
    fahrenheit = fahrenheit + 32; // adds 32
    return fahrenheit; // as a double
  }
  public static double fahrenheitToCelsius(double fahrenheit){
    // takes parameter fahrenheit and converts it to its celsius equivalent
    double celsius = ((fahrenheit - 32) * 5); // subtracts 32 from parameter fahrenheit and multiples by 5
    celsius = (celsius / 9); // divides by 9
    return celsius; // as a double
  }
}
