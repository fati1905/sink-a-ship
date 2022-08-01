
public class Ship{

	int row;
	int col;
	int colBow;

	//Instanciate the ship location
	Ship(){
		
		this.row = 1;
		this.col = (int) Math.floor(Math.random()*5+4); //Generate a rondom location for the ship
		this.colBow = col + 3;
	}


	//Setting or updating the location of the ship
	public void setLocation(int r2, int c2 ){

		this.row = 1;
		this.col = (int) Math.floor(Math.random()*5+4);
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