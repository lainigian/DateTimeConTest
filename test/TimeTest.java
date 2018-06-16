import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest 
{

	//----------------test costruttori e metodi getter-----------------------
	@Test
	public void testCostruttoreVuoto()
	{
		Time t1=new Time();
		assertTrue("t1=0:0:0", t1.getHour()==0 && t1.getMinute()==0 && t1.getSecond()==0);	
	}
	
	@Test
	public void testCostruttoreParametriValidi()
	{
		Time t1=new Time(0,1,1);
		assertTrue("t1=0:1:1", t1.getHour()==0 && t1.getMinute()==1 && t1.getSecond()==1);	
	}

	@Test
	public void testMinuteNegativo()
	{
		Time t1=new Time(13,-1,1);
		assertTrue("t1=13:0:1", t1.getHour()==13 && t1.getMinute()==0 && t1.getSecond()==1);	
	}
	
	@Test
	public void testSecondNegativo()
	{
		Time t1=new Time(13,0,-1);
		assertTrue("t1=13:0:0", t1.getHour()==13 && t1.getMinute()==0 && t1.getSecond()==0);	
	}
	
	@Test
	public void testHourNegativo()
	{
		Time t1=new Time(-1,1,1);
		assertTrue("t1=0:1:1", t1.getHour()==0 && t1.getMinute()==1 && t1.getSecond()==1);	
	}

	@Test
	public void testValoriLimiteValidi()
	{
		Time t1=new Time(23,59,59);
		assertTrue("t1=23:59:59", t1.getHour()==23 && t1.getMinute()==59 && t1.getSecond()==59);	
	}
	

	@Test
	public void testValoreLimiteNonValidoHour()
	{
		Time t1=new Time(24,0,0);
		assertTrue("t1=0:0:0", t1.getHour()==0 && t1.getMinute()==0 && t1.getSecond()==0);	
	}
	
	@Test
	public void testValoreLimiteNonValidoMinute()
	{
		Time t1=new Time(12,60,0);
		assertTrue("t1=12:0:0", t1.getHour()==12 && t1.getMinute()==0 && t1.getSecond()==0);	
	}
	
	@Test
	public void testValoreLimiteNonValidoSecond()
	{
		Time t1=new Time(12,0,60);
		assertTrue("t1=12:0:0", t1.getHour()==12 && t1.getMinute()==0 && t1.getSecond()==0);	
	}
	
	
	//-----------------Test e setter--------------------------
	
	@Test
	public void testsetHourNegativo()
	{
		Time t1=new Time(1,1,1);
		t1.setHour(-1);
		assertTrue("ora=1", t1.getHour()==1);	
	}
	
	@Test
	public void testsetHourNonValidoLimitePositivo()
	{
		Time t1=new Time(1,1,1);
		t1.setHour(24);
		assertTrue("ora=1", t1.getHour()==1);	
	}
	
	@Test
	public void testsetHourValido()
	{
		Time t1=new Time(1,1,1);
		t1.setHour(13);
		assertTrue("ora=13", t1.getHour()==13);	
	}
	
	
	@Test
	public void testsetMinuteNegativo()
	{
		Time t1=new Time(1,1,1);
		t1.setMinute(-1);
		assertTrue("minuti=1", t1.getMinute()==1);	
	}
	
	@Test
	public void testsetMinuteNonValidoValoreLimitePositivo()
	{
		Time t1=new Time(1,1,1);
		t1.setMinute(60);
		assertTrue("minuti=1", t1.getMinute()==1);	
	}
	
	@Test
	public void testsetMinuteVloreValido()
	{
		Time t1=new Time(1,1,1);
		t1.setMinute(30);
		assertTrue("minuti=30", t1.getMinute()==30);	
	}
	
	@Test
	public void testSetSecondNegativo()
	{
		Time t1=new Time(1,1,1);
		t1.setSecond(-1);
		assertTrue("secondi=1", t1.getSecond()==1);	
	}
	
	@Test
	public void testSetSecondValoreLimiteNonValdoPositivo()
	{
		Time t1=new Time(1,1,1);
		t1.setSecond(60);
		assertTrue("secondi=1", t1.getSecond()==1);	
	}
	
	@Test
	public void testSetSecondValoreValido()
	{
		Time t1=new Time(1,1,1);
		t1.setSecond(30);
		assertTrue("secondi=30", t1.getSecond()==30);	
	}
	

	//---------------------------test altri metodi--------------------------
	
	
	@Test
	public void testDiffPositivo()
	{
		Time t1=new Time();
		Time t2=new Time(23,59,59);
		Time t3;
		t3=t2.diff(t1);
		assertTrue("t3=23:59:59", t3.getHour()==23 && t3.getMinute()==59 && t3.getSecond()==59);	
	}
	
	@Test
	public void testDiffNegativo()
	{
		Time t1=new Time();
		Time t2=new Time(23,59,59);
		Time t3;
		t3=t1.diff(t2);
		assertTrue("t3=23:59:59", t3.getHour()==23 && t3.getMinute()==59 && t3.getSecond()==59);	
	}
	
	
	@Test
	public void testDiffZero()
	{
		Time t1=new Time(12,12,12);
		Time t2=new Time(12,12,12);
		Time t3;
		t3=t2.diff(t1);
		assertTrue("t3=0:0:0", t3.getHour()==0 && t3.getMinute()==0 && t3.getSecond()==0);	
	}
	
	@Test
	public void testEqualsTrue()
	{
		Time t1=new Time(12,12,12);
		Time t2=new Time(12,12,12);
		assertTrue("t1==t2", t1.equals(t2));	
	}
	
	@Test
	public void testEqualsFalse()
	{
		Time t1=new Time();
		Time t2=new Time(12,12,12);
		assertFalse("t1==t2", t1.equals(t2));	
	}
	
	
	
	
	
	
}
