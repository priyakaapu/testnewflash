
import java.util.Scanner;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestCases {
  
	FizzBuzz obj;

 @BeforeMethod
 public void takeInput()
 {
	 obj = new FizzBuzz();
	 
	 try (Scanner obj2 = new Scanner(System.in)) {
		System.out.println("Enter a number"); 
		 int num = obj2.nextInt();
		 System.out.println("The number entered is: "+num);
	} 

 }
 
  @Test
  public void returnNumber() 
  {
	 
	 int number = 3;
	 
     Assert.assertEquals(number, obj.result(number));
  }

}
