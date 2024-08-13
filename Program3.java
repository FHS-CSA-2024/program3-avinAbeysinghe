//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class program3{
 public static void main(String[] args){
     int length, width, area, perimeter;
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter the length:");
     length = input.nextInt();
     System.out.println("Enter the width:");
     width = input.nextInt();
     
     area = length * width;
     perimeter = 2*length + 2*width;
     
     System.out.println("The Length is: " + length);
     System.out.println("The width is: " + width);
     System.out.println("The area is: " + area);
     System.out.println("The perimeter is: " + perimeter);
     
     
        
     
    }
}


//Paste console output below:
/*
Enter the length:
99
Enter the width:
99
The Length is: 99
The width is: 99
The area is: 9801
The perimeter is: 396


*/
