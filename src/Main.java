import java.util.*;
import java.text.*;

public class Main
{
	public static void main(String[] args)
	{
		
		
	
		final SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");
		
		
		
		
		// String numbersOfLights = args[0];  
		// how mach lights if passed by user feom CMD 
		
		// class for constructor of ligths
		// timer
		
		final LightConsrructor lconstr = new LightConsrructor();
		
		Timer secondsTimer = new Timer();
		Timer secSecondTimer = new Timer();
		
		
		for(int i = 0; i < 19; i++){
			try{
				lconstr.ligths[i].changeLightState();
				Date dateNow = new Date();
				System.out.println( sf.format(dateNow) + " " + lconstr.ligths[i].getLightId() + " "  + lconstr.ligths[i].getLightColor() + " " +lconstr.ligths[i].isLState());
				Thread.sleep(1000);
				Date dateNowSecond = new Date();
				lconstr.ligths[i].changeLightState();
				System.out.println( sf.format(dateNowSecond) + " " + lconstr.ligths[i].getLightId() + " "  + lconstr.ligths[i].getLightColor() + " " +lconstr.ligths[i].isLState());
				
				
			}catch(Exception e){
				
			}
			}
		
		/**
		
		final int i = 0;
		secondsTimer.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run(){
				lconstr.ligths[i].changeLightState();
				Date dateNow = new Date();
				System.out.println( sf.format(dateNow) + " " + lconstr.ligths[i].getLightId() + " "  + lconstr.ligths[i].getLightColor() + " " +lconstr.ligths[i].isLState());
			
				}
	
		}, 1000 , 2000);
		
		secSecondTimer.scheduleAtFixedRate(new TimerTask(){
				@Override
				public void run(){
					lconstr.ligths[5].changeLightState();
					Date dateNow = new Date();
					System.out.println( sf.format(dateNow) + " " + lconstr.ligths[5].getLightId() + " "  + lconstr.ligths[5].getLightColor() + " " +lconstr.ligths[5].isLState());
		
					
				}
			}, 2000 , 2000);
		**/
		
	}
}
