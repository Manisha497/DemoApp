import java.util.Scanner;

class Guesser {
	int guessNum;

	public int getGuessNum() {
		return guessNum;
	}

	public void setGuessNum(int guessNum) {
		this.guessNum = guessNum;
	}
	
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey Guesser, please guess a number: ");
		guessNum = sc.nextInt();
		return guessNum;	
	}
}
