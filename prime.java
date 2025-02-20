import java.util.*;
class prime
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num;
boolean flag = false;
System.out.println("Enter number:");
num= sc.nextInt();
// 0 and 1 are not prime numbers
if (num == 0 || num == 1) {
 flag = true;
 }
 for (int i = 2; i <= num / 2; ++i) {
 // condition for nonprime number
 if (num % i == 0) {
 flag = true;
 break;
 }
 }
 if (!flag)
 System.out.println(num + " is a prime number.");
 else
 System.out.println(num + " is not a prime number.");
 }
}