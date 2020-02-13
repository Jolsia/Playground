import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in  = new Scanner(System.in);
    int n = in.nextInt();
    int son = sqaure_of_number(n);
    System.out.println(son);
  }
  public static int sqaure_of_number(int m)
  {
    int son = m*m;
    return son;
  }
}
  