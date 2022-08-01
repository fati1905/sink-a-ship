public class Ship{

	int row; //The row of the ship
	int col; //The column of the stern of the ship (Back of the ship)
	int colBow; //The column of the bow of the ship (Front of the ship)

	//Instanciate the ship location
	Ship(){
		
		this.row = 1;
		this.col = (int) Math.floor(Math.random()*5+4); //Generate a rondom location for the ship (from 0 to 4, The 4 is because the bow of the ship is three block bigger than the column of the stern)
		this.colBow = col + 3; //The length of the ship is 3 block so we add that to column of the stern (col) of the ship to get the column of the bow (colBow) of the ship
	}


	//Setting or updating the location of the ship
	public void setLocation(int r2, int c2 ){

		this.row = 1;
		this.col = (int) Math.floor(Math.random()*5+4); //regenerate a new location 
		this.colBow = this.col + 3;
	}

	//Check if the ship was hit or not
	public boolean isHit(int rowHit, int colHit){

		if(rowHit == row){

			if(col<= colHit <= colBow){
				
				return true;
			
			}else{

				return false;
			}

		}else{

			return false;
		}
	}

}