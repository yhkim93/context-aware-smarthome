package smarthouse.monitoring.gui;

import java.awt.Color;

public class ContextData {

	public static void getCurrentLocation(int xw, int yw,int sel)
	{
		System.out.println("sel"+sel);
		System.out.println("xw: "+xw+"yw:"+yw);
		if 		
		((xw>15 & xw<215 & yw>10 & yw<370 )
		)
		System.out.println("Bedroom"); 
		else if  ( (xw>215 & xw<465 & yw>10  & yw<250 ))
		{
			System.out.println("Bathroom1"); 
		}
		else if  ( (xw>305 & xw<465 & yw>10  & yw<250 ))
		{
			System.out.println("Little Children Room"); 
		}
		else if  ( (xw>465 & xw<535 & yw>10  & yw<250 ))
		{
			System.out.println("Bathroom2"); 
		}
		else if  ( (xw>675 & xw<1005 & yw>10  & yw<180 ))
		{
			System.out.println("Big Children Room"); 
		}
		
		else if  ( (xw>675 & xw<1005 & yw>180  & yw<320 ))
		{
			System.out.println("Office"); 
		}
		else if  ( (xw>675 & xw<1005 & yw>320  & yw<410 ))
		{
			System.out.println("Bathroom2"); 
		}
		else if  ( (xw>675 & xw<1005 & yw>410  & yw<700 ))
		{
			System.out.println("Garage"); 
		}
		else if  ( (xw>215 & xw<555 & yw>370  & yw<700 ))
		{
			System.out.println("Living Room"); 
		}
		else if  ( (xw>15 & xw<215 & yw>370  & yw<700 ))
		{
			System.out.println("Kitchen"); 
		}
		else
			System.out.println("Hall"); 
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
