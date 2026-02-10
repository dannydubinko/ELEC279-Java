import java.util.Arrays;

import javax.sound.midi.Receiver;

public class Player {
	public int number;
	public int x;
	public int y;
	
	public void moveRight()
    {
		if(this.y<9) {
			this.y = this.y+1;
		}
		else {
			System.out.println("Invalid move");
			//System.exit(0);
		}
    }

    public void moveLeft()
    {
    	if(this.y > 0) {
    		this.y = this.y-1;
    	}else {
    		System.out.println("Invalid move");
    	}
         
    }

    public void moveUp(){
    	//Complete the code 
		if (this.x > 0) {
			this.x = this.x - 1; //-- doest work for some reason but x - 1 works
		}else {
			System.out.println("Invalid move");
		}
    }

	public void printField(int [][] pitchGrid) {
		int i, j;
		for (i = 0; i < pitchGrid.length; i++){
			for (j=0; j< pitchGrid[i].length; j++){
				System.out.print(pitchGrid[i][j] + "  ");
			}
			System.out.println('\n');
		}
	}
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] pitchGrid = new int[10][10];
		
		Player p1 = new Player();
		p1.number = 89;
		p1.x = 9;
		p1.y = 0;
		
		Player p2 = new Player();
		p2.number = 50;
		p2.x = 9;
		p2.y = 9;
		
		// // P1 Moves
		// p1.moveRight();
		p1.moveUp();
		//p1.moveRight();
		// // P2 moves
		//p2.moveLeft();
		p2.moveUp();
		// p2.moveLeft();

		System.out.println("\n");
		
		pitchGrid[p1.x][p1.y] = p1.number;
		pitchGrid[p2.x][p2.y] = p2.number;

		p1.printField(pitchGrid);
				
		
		
	}

}
