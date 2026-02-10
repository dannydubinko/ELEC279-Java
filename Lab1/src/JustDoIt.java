
public class JustDoIt {
	
	public void dodgeDefender() {
        System.out.println("Nasty spin move resulting in ankle break");
	}
	
	public void run(int steps)
	{
        int n;
		for (n = 1; n <= steps; n++){
            System.out.println("Ran " + n + " steps");
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 50;
        String type = "receiver";
        System.out.println(number + " will receive.");
        
        int steps =0;
        while(steps < 6)
        {
            steps = steps+1;
            
        }
        System.out.println("After " + steps + " steps, " + number + " receives");
        
        boolean isDefender = true;
        JustDoIt reference = new JustDoIt();
        if (isDefender)
        {
            reference.dodgeDefender();
        }else
        {
            reference.run(4);
        }
        
        
        
	}

}
