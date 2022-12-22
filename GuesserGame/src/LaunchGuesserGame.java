public class LaunchGuesserGame {

	public static void main(String[] args) {
		System.out.println("===== Hey, welcome to Guessing Game! =====");
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		
	}

}
