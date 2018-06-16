
public class Time 
{
	private int hour;
	private int minute;
	private int second;
	
	public Time()
	{
		hour=0;
		minute=0;
		second=0;
	}

	public Time (int hour, int minute, int second)
	{
		if (hour>=0 && hour<24)
			this.hour=hour;
		else
			hour=0;
		
		if(minute>=0 && minute<60)
			this.minute=minute;
		else
			this.minute=0;
		
		if (second>=0 && second<60)
			this.second=second;
		else
			this.second=0;
		
	}
	
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public int getSecond()
	{
		return second;
	}
	
	public void setHour(int hour)
	{
		if (hour>=0 && hour<24)
			this.hour=hour;
	}
	
	public void setMinute(int minute)
	{
		if (minute>=0 &&minute<60)
			this.minute=minute;
	}
	
	public void setSecond(int second)
	{
		if (second>=0 && second <60)
			this.second=second;
	}
	
	public Time diff(Time time)
	{
		Time differenza= new Time();
		int secondi=this.getHour()*3600+this.getMinute()*60+this.getSecond();
		int secondiTime=time.getHour()*3600+time.getMinute()*60+time.getSecond();
		int differenzaSecondi=secondi-secondiTime;
		//differenza negativa
		if(differenzaSecondi<0)
			differenzaSecondi=(-1)*differenzaSecondi;
		int differenzaOre=differenzaSecondi/3600;
		differenza.setHour(differenzaOre);
		int secondiRimasti=differenzaSecondi-(differenzaOre*3600);
		int differenzaMinuti=secondiRimasti/60;
		differenza.setMinute(differenzaMinuti);
		secondiRimasti=secondiRimasti-(differenzaMinuti*60);
		differenza.setSecond(secondiRimasti);
		return differenza;
	}
	
	public boolean equals(Time t)
	{
		if (t.getHour()==getHour() && t.getMinute()==getMinute() && t.getSecond()==getSecond())
			return true;
		else
			return false;
	}

	
}


