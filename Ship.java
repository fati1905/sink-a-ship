public class Ship{

	ArrayList<Integer> loc;

	//Instantiate the ship location
	Ship(){
		
		int rand = (int)Math.floor(Math.random*5+4);
		loc = new ArrayList(); 
		loc.add(rand);
		loc.add(rand+1);
		loc.add(rand+2);
	}


	public void setLocationCells(ArrayList<Integer> locationCells){
       this.loc =  locationCells;
    }

	//Check if the ship was hit or not
	public String isHit(int num){

		//We recieve the number hit in num

		String result = "miss"; //The result of the hit is st on miss on default

		if(loc.contains(num)){ //if The number inserted is in the arrayList
			
			result = "hit";//Then The ship was hit

			loc.remove(loc.indexOf(num));//We remove the hit block from the arraylist

			if(loc.isEmpty()){ //Check if the ArrayList is not empty
				result = "kill"; //If it is we should end the game
			}
		}

		return result;
	}

}