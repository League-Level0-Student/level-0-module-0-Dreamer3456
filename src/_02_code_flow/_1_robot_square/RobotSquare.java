package _02_code_flow._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;


public class RobotSquare {
	
    public static void main(String[] args){
 
    	Robot rob = new Robot();

       
    	 rob.penDown();   
        
    	   rob.setSpeed(20);  
    	
    	   int count = 0;   

        
    	    while ( count < 5 ) { 
    	             rob.move(200);
    	             rob.turn(144);
    	                count += 1;
    	       }rob.hide();
    	 
    	
    	
    	
    }
}
