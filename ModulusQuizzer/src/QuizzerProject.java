import java.util.Scanner;

public class QuizzerProject{

	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) 
		{
			System.out.print("How many questions would you like to do? ");
			int ques = userInput.nextInt();
			int j = ((int)(Math.random() * (ques - 1)));
			int counter = 0;
			for(int i = 0 ; i < ques; i++)
				{
					int x = ((int)(Math.random() * 60));
					int y = ((int)(Math.random() * 30) + 1);
					if(i == j)
						{
							int ans = x % x;
							System.out.print(x + " % " + x + " = ");
							int guess = userInput.nextInt();
							if(guess == ans)
								{
									System.out.println("Correct.");
									counter++;
								}
							else
								{
									System.out.println("Wrong. The correct answer was " + ans);
								}	
						}
					else if((i + 1) == j)
						{
							int ans = y % x;
							System.out.print(y + " % " + x + " = ");
							int guess = userInput.nextInt();
							if(guess == ans)
								{
									System.out.println("Correct.");
									counter++;
								}	
							else
								{
									System.out.println("Wrong. The correct answer was " + ans);
								}
						}
					else
						{
							int ans = x % y;
							System.out.print(x + " % " + y + " = ");
							int guess = userInput.nextInt();
							if(guess == ans)
								{
									System.out.println("Correct.");
									counter++;
								}	
							else
								{
									System.out.println("Wrong. The correct answer was " + ans);
								}
						}
				}
			System.out.println("You got " + counter + " right answers out of " + ques + ".");
		}
}