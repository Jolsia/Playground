import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int first_digit = n/100;
    int second_last_digit = (n%100)/10;
    int last_digit = n%10;
    int rev = (((n%10)*100) + (((n/10)%10)*10) + (n/100)); 
    System.out.println(rev);
  }
}