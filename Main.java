public class Main {
	public static void main (String[] args) {
		int amount = 0;
		int amountOfDoors = 3;
		int[] doors = init(amountOfDoors);
		int isCorrect = 0;
		int isWrong = 0;
		int pick = 0;
		//main loop for game
		for (int i = 0; i < 999999999; i++) {
			doors = init(amountOfDoors);
			boolean isPicked = false;
			//randomize pick for door
			pick = (int) (Math.random() * amountOfDoors);
			for (int j = 0; j < doors.length; j++) {
				//remove one door that is not pick and is a goat
				if (doors[j] == 0 && j != pick) {
					doors[j] = 2;
					break;
				}
			}
			//change pick to other door
			if (isPicked == false) {	
				for (int j = 0; j < doors.length; j++) {
					if (doors[j] != 2 && pick != j) {
						pick = j;
						break;
					}
				}
			}
			//check if pick is the winner
			if (doors[pick] == 1) {
				isCorrect++;
			}
			else {
				isWrong++;
			}
			amount++;
			System.out.println(((double) isCorrect / amount) * 100 + "%" + " Switching is correct");
			}
		
	}
	
	public static int[] init(int amountOfDoors) {
		//make the doors
		int[] doors = new int[amountOfDoors];
		for (int i = 0; i < doors.length; i++) {
			doors[i] = 0;
		}
		
		int random = (int) (Math.random() * amountOfDoors);
		//set one door as winner
		doors[random] = 1;
		return doors;
	}
}
