package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {

	int f = -1;

	//2. create an array of 5 robots.

Robot[] r = new Robot[5];

	//3. use a for loop to initialize the robots.


for (int x = 0; x < 5; x++) {
	
 r[x] = new Robot();
	

r[x].setX(100 + x*175);
r[x].setY(500);
	
}



		//4. make each robot start at the bottom of the screen, side by side, facing up



	//5. use another for loop to iterate through the array and make each robot move 


	//   a random amount less than 50.


	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

boolean dog = true;


while(dog == true) {
	

	for (int g = 0; g < 5; g++) {
		
		Random y = new Random();
		int ran = y.nextInt(50);
		
		r[g].setSpeed(100);
		
		r[g].setAngle(90);
		r[g].move(ran);
		
		for (int c = 0; c < 360; c++) {
			
			r[g].turn(-10);
			r[g].move(ran);
			
		}
		

		
		
		
	if (r[g].getY() == 0){
		
	 f = g;
		dog = false;
		
		r[g].sparkle();
	}
		
	}
	



}


	//7. declare that robot the winner and throw it a party!

System.out.println("Robot" + f + " is the winner!");

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.


}
}
