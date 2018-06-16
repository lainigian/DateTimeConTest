import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest 
{

	@Test
	public void testCostruttoreDefault() 
	{
		Date data=new Date();
		
		assertTrue("Data con costruttore vuoto", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	
	@Test
	public void testGiorno0() 
	{
		Date data=new Date(0,2,2011);
		
		assertTrue("Data con giorno=0", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	
	@Test
	public void testMese0() 
	{
		Date data=new Date(1,0,2011);
		
		assertTrue("Data con mese=0", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	
	@Test
	public void testAnno0() 
	{
		Date data=new Date(1,1,0);
		
		assertTrue("Data con anno=0", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	
	
	@Test
	public void testGiorno32() 
	{
		Date data=new Date(32,12,2011);
		
		assertTrue("Data inesistente", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	
	@Test
	public void testMese13() 
	{
		Date data=new Date(2,13,2011);
		
		assertTrue("Data inesistente", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	
	@Test
	public void testParametriDataDefault() 
	{
		Date data=new Date(1,1,2000);
		
		assertTrue("Data default", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	
	@Test
	public void testAprile() 
	{
		Date data=new Date(31,4,2011);
		
		assertTrue("Data Aprile inesistente", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	
	@Test
	public void testGiugno() 
	{
		Date data=new Date(31,6,2011);
		
		assertTrue("Data Giugno inesistente", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	
	@Test
	public void testSettembre() 
	{
		Date data=new Date(31,9,2011);
		
		assertTrue("Data Settembre inesistente", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	
	@Test
	public void testNovembre() 
	{
		Date data=new Date(31,6,2011);
		
		assertTrue("Data Novembre inesistente", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	
	@Test
	public void testGennaio() 
	{
		Date data=new Date(31,1,2011);
		
		assertTrue("Data estrema Gennaio", data.getDay()==31 && data.getMonth()==1 && data.getYear()==2011);
	}
	
	@Test
	public void testMarzo() 
	{
		Date data=new Date(31,3,2011);
		
		assertTrue("Data estrema Marzo", data.getDay()==31 && data.getMonth()==3 && data.getYear()==2011);
	}
	
	
	@Test
	public void testMaggio() 
	{
		Date data=new Date(31,5,2011);
		
		assertTrue("Data estrema Maggio", data.getDay()==31 && data.getMonth()==5 && data.getYear()==2011);
	}
	
	@Test
	public void testLuglio() 
	{
		Date data=new Date(31,7,2011);
		
		assertTrue("Data estrema Luglio", data.getDay()==31 && data.getMonth()==7 && data.getYear()==2011);
	}
	
	
	@Test
	public void testAgosto() 
	{
		Date data=new Date(31,8,2011);
		
		assertTrue("Data estrema Agosto", data.getDay()==31 && data.getMonth()==8 && data.getYear()==2011);
	}
	
	
	@Test
	public void testOttobre() 
	{
		Date data=new Date(31,10,2011);
		
		assertTrue("Data estrema Ottobre", data.getDay()==31 && data.getMonth()==10 && data.getYear()==2011);
	}
	
	@Test
	public void testDicembre() 
	{
		Date data=new Date(31,12,2011);
		
		assertTrue("Data estrema Dicembre", data.getDay()==31 && data.getMonth()==12 && data.getYear()==2011);
	}
	

	@Test
	public void testFebbraioNonBisestile() 
	{
		Date data=new Date(29,2,2011);
		
		assertTrue("Data Febbraio non bisestile", data.getDay()==1 && data.getMonth()==1 && data.getYear()==2000);
	}
	

	@Test
	public void testFebbraioBisestile() 
	{
		Date data=new Date(29,2,2012);
		
		assertTrue("Data Febbraio bisestile ", data.getDay()==29 && data.getMonth()==2 && data.getYear()==2012);
	}
	
	@Test
	public void testDataGenerica() 
	{
		Date data=new Date(23,3,1965);
		
		assertTrue("Data generica ", data.getDay()==23 && data.getMonth()==3 && data.getYear()==1965);
	}
	
	@Test
	public void testSetDate() 
	{
		Date data=new Date();
		data.setDate(23, 3, 1965);
		
		assertTrue("Data generica ", data.getDay()==23 && data.getMonth()==3 && data.getYear()==1965);
	}
	
	@Test
	public void testGiornoGenerico() 
	{
		Date data=new Date(23,3,1965);		
		assertTrue("Data generica ", data.getDay()==23 && data.getMonth()==3 && data.getYear()==1965);
	}
	
	@Test
	public void testDiffDatePositivo() 
	{
		Date data1=new Date(23,3,1965);
		Date data2=new Date();
		assertEquals("Differenza date positivo ",12702, data1.diff(data2));
	}
	
	@Test
	public void testDiffDateNegativo() 
	{
		Date data1=new Date(23,3,1965);
		Date data2=new Date();
		assertEquals("Differenza date negativo ",-12702, data2.diff(data1));
	}
	
	
}













