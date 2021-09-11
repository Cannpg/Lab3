import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Scanner myScan = new Scanner(System.in);
    System.out.println("Please input a whole number.");
    int userInput = myScan.nextInt();
    myScan.close();
    System.out.println("Your number was " + userInput);

    if(userInput < 0){
      while(userInput<0){
        userInput++;
        System.out.println(userInput);
      }}
     else if (userInput > 0){
       while(userInput > 0){
         userInput--;
         System.out.println(userInput);
       }}
      else {
        System.out.println("Please enter a number greater than or less than 0.");
      }

    System.out.println("Blast off!");
     } 
    }
  }
}