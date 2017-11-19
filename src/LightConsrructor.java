
import java.lang.reflect.*;public class LightConsrructor
{
	
	Light [] ligths;
	
	
	
	public LightConsrructor(){
		//defaul constructor for 20 lights
		int defLights = 20;
		ligths = new Light[defLights];
		
		int clr =0;
	 	
		
	 	for(int nl = 0; nl <  defLights; nl++){
			//for loop for new ligths
			//for(int clr = 0; clr <= 2; clr++){
				// second for loop for cycling color for ligth
				
				ligths[nl] = new Light(clr, nl+1);
				clr++;
				if(clr == 3){clr = 0;}
			//}
		}
		
		
		
		
	}
	
	public LightConsrructor(int howMuch){
		//if user enters number in CMD
		int defLights = howMuch;
		ligths = new Light[defLights];
		
		// 0 > 20 == 21

		int clr =0;


	 	for(int nl = 0; nl <  defLights; nl++){
			//for loop for new ligths
		

			ligths[nl] = new Light(clr, nl+1);
			clr++;
			if(clr == 3){clr = 0;}
			//}
		}
		
	}
	
	
}
