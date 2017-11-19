public class Light
{
	private String [] lightColor = {"Red", "Blue", "Green"};
	private String color;
	private boolean lightState = false;
	private int lightId;
	
	public Light(int colorIndex, int lightId){
		this.color = lightColor[colorIndex];
		this.lightId = lightId;
	}

	

	public String getLightColor()
	{
		return color + " Light";
	}

	public void changeLightState()
	{
		if(lightState == false){
			lightState = true;
		}else lightState = false;
	}

	public String isLState()
	{
		if(lightState == false){
			return "Off";
		}else return "On";
	};
	
	public int getLightId(){
		return lightId;
	}
	
}
