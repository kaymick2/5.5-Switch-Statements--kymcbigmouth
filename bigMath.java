import java.lang.*;
  
public class bigMath {
  private int x;
  private double z;

  public bigMath(int x, double z) {
    this.x = x;
    this.z = z;
  }

  public double addition(int x, double z) {
    double a = x + z;
    return a;
    // calls x and z from main, defines a as x + z and puts a on deck to be returned
    // if called from the main method
  }

  public double subtraction(int x, double z) {
    double b = x - z;
    return b;
    // calls x and z, defines b as x - z and tells the program to return b if called
  }

  public double multiplication(int x, double z) {
    double c = x * z;
    return c;
    // calls x and z, defines c as x*z, and puts c to be returned if called
  }

  public double division(int x, double z) {
    double d = (double) x / z;
    return d;
    // calls x and z, defines d as x/z, and puts d to be returned if method is
    // called. if the method is called, you need to call x and z as parameters (as
    // they are the required parameters), which puts x and z into the method, kind
    // of like a function. return d; says that if you put x and z in, you get d out.
  }

  public double average(int x, double z) {
    double f = ((double) x + z) / 2;
    return f;

  }

  public double distance(int x, double z) {
    double g = Math.abs((double) x - z);
    return g;
  }

  public double biggest(int x, double z) {
    double h = Math.max(x, z);
    return h;
  }

  public double smallest(int x, double z) {
    double j = Math.min(x, z);
    return j;
  }
}