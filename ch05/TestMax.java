public class TestMax {
  /** Main Method **/
  public static void main(String[] args) {
    int i = 5;
    int j = 2;
    int k = max(i,j);
    System.out.println("The maximum between " + i +
        " and " + j + " is " + k );
  }

  public static int max(int num1, int num2) {
    int result;
    double r = Math.random();

    System.out.printf("r is %f", r);


    if (num1 > num2)
      result = num1;
    else
      result = num2;

    return result;
  }
}
