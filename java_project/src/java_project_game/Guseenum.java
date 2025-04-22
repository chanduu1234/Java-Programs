package java_project_game;

import java.util.Scanner;

public class Guseenum {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter your name: ");
		String name = s.next();
		int score = 0;
		int r = (int)(Math.random()*5)+1;
		for(int i=3; i >0;i--) {
			System.out.println("guess the num between (1-6)");
			int num = s.nextInt();
			if(num==r) {
				score+=10;
				r=(int) (Math.random()*5)+1;
			}
		
		}
		System.out.println(name + " your score is: " + score);
	}

}
