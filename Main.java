/**
 * calculates sum of 1's in an integer
 * @jacoe0850 
 */
public class Main {
public static int countOnes(int num){
  // making variable for the sum of 1's
int sum = 0;
// while loop that runs whenever number is 10 or above
while(num >= 10){
  // if the number in the while loop is 1 add 1
  if(num % 10 == 1){
    sum = sum + 1;
  }
  // removes the last digit from the integer
  num = num / 10;
}
// this is here because i couldn't get the while loop to work with the first digit so if the first digit is 1 it adds 1
if(num == 1){
  sum = sum + 1;
}
return sum;
}
  public static void main(String[] args) {
    // makes a number to insert into my method
    int sum = countOnes(65111416);
    // says answer
    System.out.println(sum);    
  }
}