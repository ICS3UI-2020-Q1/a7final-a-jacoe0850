/**
 *
 * @jacoe0850 
 */
public class Main {
public static int countOnes(int num){
int sum = 0;
if(num < 0){
  num = num*-1;
}
while(num >= 10){
    num = num / 10;
  if(num == 1){
    
}
sum = sum + 1;
}
System.out.println(sum);
return num % 10 + sum;
}
  public static void main(String[] args) {
    int answer = countOnes(97511531);
    System.out.println(answer);    
  }
}