package PresentationLayer.gui;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.lang.reflect.Field;

import javax.swing.*;

public class BasePaint extends JPanel 
 {
	private int j,i;
	
	
	//doors
	public int  Door1,Door2, 
				Door3, Door4,
				Door5, Door6,
				Door7, Door8,
				Door9, Door10,
				Door11, Door12,
				Door13, Door14;
	//windows
	public int  W1,W2,W3,W4,
				W5,W6,W7,W8,
				W9,W10,W11,W12;	
	//furniture			
	public int  x1=180,x2=155,
				x3=420,x4=435,
				x5=820,x6=800,
				x7=845,x8=870,
				x9=90,x10=305,
				x11=220,x12=500,
				x13=330,x14=365,
				x15=400,x16=455,
				x17=330,x18=365,
				x19=400,x20=280;
				
	public int  y1=110,y2=125,
				y3=35,y4=20,
				y5=120,y6=140,
				y7=245,y8=215,
				y9=490,y10=580,
				y11=380,y12=390,
				y13=555,y14=555,
				y15=555,y16=610,
				y17=670,y18=670,
				y19=670,y20=610;
				
	//robots			
	public int xr1=560, 
			   xr2=600,
			   xr3=640;
			   
	public int yr1=60,
			   yr2=60,
			   yr3=60;
			   

	  
	public int dir1=1,
			   dir2=1,
	           dir3=1;
	           
	//package
	public int xpack=315,
			   ypack=160;
			   
			   
	//human position
	
	public int xm=455,
			   xw=280,
			   xl=335,
			   xb=330;
			   
	public int ym=610,
			   yw=610,
			   yl=555,
			   yb=670;
			   
	public int dim=4,
			   diw=3,
			   dil=1,
			   dib=2;
	public int e;
	

	
	Color maro = new Color(184,134,11);
	Color maro1 = new Color(160,82,45);
	Color office = new Color(139,105,20);
	Color living_table = new Color(139,40,15);	
	Color couch = new Color(238,221,130);
	Color couch1 = new Color(255,222,173);
	Color toyRobot = new Color(99,184,255);
	Color CRT = new Color(245,245,220);
	Color car = new Color(205,201,201);
	Color pack = new Color(255,105,180);
	Color skin = new Color(255,228,196);
	Color big = new Color(0,139,0);

	
			
	public int doorSt, WindowsSt;
	
	
				
	public void door(int D1,int D2,int D3,int D4,int D5,int D6,int D7,int D8,int D9,
	int D10,int D11,int D12,int D13,int D14)
	{
	
  	Door1=D1;
  	Door2=D2;
  	Door3=D3;
  	Door4=D4;
  	Door5=D5;
  	Door6=D6;
  	Door7=D7;
  	Door8=D8;
  	Door9=D9;
  	Door10=D10;
  	Door11=D11;
  	Door12=D12;
  	Door13=D13;
  	Door14=D14;
  	
  	}
	
	public void windows(int Win1,int Win2,int Win3,int Win4,int Win5,int Win6,
	int Win7,int Win8,int Win9,int Win10,int Win11,int Win12)
	{
	
  	W1=Win1;
  	W2=Win2;
  	W3=Win3;
  	W4=Win4;
  	W5=Win5;
  	W6=Win6;
  	W7=Win7;
  	W8=Win8;
  	W9=Win9;
  	W10=Win10;
  	W11=Win11;
  	W12=Win12;
  
  	
  	}	
				
	public void mX(int X1,int X2,int X3,int X4,int X5,int X6,int X7,int X8,int X9,
	int X10,int X11,int X12,int X13,int X14,int X15,int X16,int X17,int X18,int X19,int X20)
	{
	
  	x1=X1;
  	x2=X2;
  	x3=X3;
  	x4=X4;
  	x5=X5;
  	x6=X6;
  	x7=X7;
  	x8=X8;
  	x9=X9;
  	x10=X10;
  	x11=X11;
  	x12=X12;
  	x13=X13;
  	x14=X14;
  	x15=X15;
  	x16=X16;
  	x17=X17;
  	x18=X18;
  	x19=X19;
  	x20=X20;
  	
  	
  	}	
  	public void mY(int Y1,int Y2,int Y3,int Y4,int Y5,int Y6,int Y7,int Y8,int Y9,
	int Y10,int Y11,int Y12,int Y13,int Y14,int Y15,int Y16,int Y17,int Y18,int Y19,int Y20)
	{
	
  	y1=Y1;
  	y2=Y2;
  	y3=Y3;
  	y4=Y4;
  	y5=Y5;
  	y6=Y6;
  	y7=Y7;
  	y8=Y8;
  	y9=Y9;
  	y10=Y10;
  	y11=Y11;
  	y12=Y12;
  	y13=Y13;
  	y14=Y14;
  	y15=Y15;
  	y16=Y16;
  	y17=Y17;
  	y18=Y18;
  	y19=Y19;
  	y20=Y20;
  	
  	
  	}
  	
  	
  	public void rX(int Xr1,int Xr2,int Xr3)
	{
	
  	xr1=Xr1;
  	xr2=Xr2;
  	xr3=Xr3;

	}
	public void rY(int Yr1,int Yr2,int Yr3)
	{
	
  	yr1=Yr1;
  	yr2=Yr2;
  	yr3=Yr3;

	}
	public void dirX(int DIR1,int DIR2,int DIR3)
	{
	
  	dir1=DIR1;
  	dir2=DIR2;
  	dir3=DIR3;

	}
	
	public void hXYdir(int Xm,int Xw,int Xl, int Xb, int Ym, int Yw, int Yl, 
	int Yb, int DIM, int DIW, int DIL, int DIB)
	{
	
  	xm=Xm;
  	xw=Xw;
  	xl=Xl;
  	xb=Xb;
  	
  	ym=Ym;
  	yw=Yw;
  	yl=Yl;
  	yb=Yb;
  	
  	dim=DIM;
	diw=DIW;
	dil=DIL;
	dib=DIB;

	}

	public void car(int E)
	{
		e=E;
	}
  

	
	public void pack(int Xpack, int Ypack)
	{
		xpack=Xpack;
		ypack=Ypack;
	}


  	
  
  	
	public int DoorStatus(int Door)
	{
		
		if(Door==1)
		{
			doorSt=0;
		}
		else
		{
		
			doorSt=1;
		}
		return doorSt;
	}
	
	
	public int WindowsStatus(int W)
	{
		
		if(W==1)
		{
			WindowsSt=0;
		}
		else
		{
		
			WindowsSt=1;
		}
		return WindowsSt;
	}
	
	
	public void paint(Graphics g) 
	{

/////////////////////beddroom bad///////////////////////////////////////////////
	g.drawRect(25, 20, 185, 80);
	g.drawLine(30,105, 207, 105);
	g.drawLine(30,105, 33, 110);
	g.drawLine(25,100, 30, 110);
	g.drawLine(30,110, 33, 110);
	g.drawLine(209,110, 211, 110);
	g.drawLine(207,105, 209, 110);
	g.drawLine(210,100, 211, 110);
	g.drawLine(212,25, 212, 105);
	g.drawRoundRect(30,27,30,30,20,20);
	g.drawRoundRect(30,63,30,30,20,20);
	g.setColor(Color.pink);
	g.fillRoundRect(57,25,150,70,20,20);
	
/////////////////////beddroom Clothes Press//////////////////////////////////////////////////
	g.setColor(Color.orange);
	g.fillRect(23,315,60,50);
	g.fillRect(86,315,60,50);
	g.fillRect(149,315,60,50);
	
/////////////////////Little Child bad///////////////////////////////////////////
	g.setColor(Color.black);
	g.drawRect(310,14,43,100);
	g.drawLine(315,118,350,118);
	g.drawLine(310,115,313,122);
	g.drawLine(353,115,354,122);
	g.drawLine(315,118,317,122);
	g.drawLine(315,122,317,122);
	g.drawLine(350,118,353,122);
	g.drawLine(355,119,355,16);
	g.drawRoundRect(315,17,35,25,10,25);
	g.setColor(Color.orange);
	g.fillRoundRect(313,38,37,75,20,20);
	
/////////////////////Little Child toy shelf/////////////////////////////////////
	g.setColor(Color.lightGray );

	g.fillRect(311,144,18,100);
	g.setColor(Color.black);		
	g.drawRect(310,145,20,100);
	
/////////////////////////Hall flower////////////////////////////////////////////

	g.setColor(Color.orange);
	g.fillOval(595,20,40,40);
	g.setColor(Color.green);
	g.fillOval(605,30,20,20);
	g.fillOval(600,30,15,15);
	g.fillOval(600,25,10,10);
	g.fillOval(620,25,10,10);
	

/////////////Big Child Clothes Press /////////////////////////////////////////////////
	g.setColor(Color.orange);
	g.fillRect(680, 15,120,50);
	g.fillRect(955, 130,50,50);
	
/////////////Big Child bad /////////////////////////////////////////////////////
	g.setColor(Color.black);
	g.drawRect(875, 18, 125, 50);
	g.drawRoundRect(877,23,30,40,20,20);
	g.drawLine(879,72,997,72);
	g.drawLine(874,68,876,76);
	g.drawLine(879,72,880,76);
	g.drawLine(876,76,880,76);
	g.drawLine(1000,68,1002,76);
	g.drawLine(997,72,999,76);
	g.drawLine(999,76,1002,76);
	g.drawLine(1002,25,1002,76);
	g.setColor(Color.blue);
	g.fillRoundRect(900,21,100,45,20,20);
	
	
/////////////////////Central////////////////////////////////////////////////////
	g.setColor(Color.black);
	g.fillRect(935,380,70,30);
	
/////////////////////Car Place//////////////////////////////////////////////////
	g.setColor(Color.black);
	g.drawRect(760,520,160,160);
	i=640;
	for(i=520;i<680;i=i+4)
	{
		g.drawLine(760,i,920,i);
	}
	
//////////////////////Car///////////////////////////////////////////////////////
if(e==1){

	g.setColor(Color.black);
	g.fillOval(795,570,20,30);
	g.fillOval(865,570,20,30);
	g.fillOval(795,620,20,30);
	g.fillOval(865,620,20,30);
	g.setColor(car);
	g.fillRoundRect(800,540,80,140,100,100);
	g.setColor(Color.black);
	g.drawRoundRect(810,590,60,50,30,30);
	g.fillRect(830,590,2,15);
	g.drawOval(820,600,20,10);
	g.drawRect(815,550,0,33);
	g.drawRect(815,583,48,0);
	g.drawRect(863,550,0,33);
	
	g.setColor(maro1);
	g.fillRoundRect(820,615,20,20, 10, 10);
	g.fillRoundRect(843,615,20,20, 10, 10);
	g.setColor(maro);
	g.fillRoundRect(820,630,20,8, 10, 10);
	g.fillRoundRect(843,630,20,8, 10, 10);
	g.setColor(Color.red);
	g.setFont(new Font("Arial", Font.BOLD , 20));
	g.drawString("Car", 825, 665);
	
	}

/////////////////////Garage shelf///////////////////////////////////////////////

	g.setColor(Color.lightGray );

	g.fillRect(680,415,325,25);
	g.setColor(Color.black);		
	g.drawRect(680,415,325,25);
	
/////////////////////kitchen ///////////////////////////////////////////////////
	g.setColor(Color.black);
	g.drawRect(23,375,50,50);
	g.setColor(Color.orange);
	g.fillRect(84,375,40,40);
	g.fillRect(127,375,40,40);
	g.fillRect(170,375,40,40);
	g.setColor(Color.black);
	g.drawRect(23,647,50,50);
	g.fillOval(27,650,20,20);
	g.fillOval(55,655,10,10);
	g.fillOval(50,677,15,15);	
	g.fillOval(27,676,17,17);
	g.drawRect(80,647,75,50);
	g.drawOval(82,650,40,44);
	g.fillRect(100,675,4,23);
	for(j=695;j>648;j=j-3)
	{
		g.drawLine(125,j,150,j);
	}
	
	g.setColor(Color.orange);
	g.fillRect(160,647,50,50);


////////////bethroom 1//////////////////////////////////////////////////////////
	g.setColor(Color.white);
	g.fillOval(218,20,30,35);
	g.setColor(Color.black);
	g.drawOval(218,20,30,35);
	g.drawOval(223,25,20,25);
	g.setColor(Color.cyan);
	g.fillOval(223,25,20,25);
	g.setColor(Color.white);
	g.fillRect(218,16,27,12);
	g.setColor(Color.black);
	g.drawRect(219,16,27,12);
	g.fillRect(224,20,8,5);
	
	
	g.setColor(Color.white);
	g.fillRect(275,16,30,50);
	g.fillRoundRect(219,100,20,40,10,20);
	g.setColor(Color.gray);	
	g.drawRect(275,16,30,50);
	g.fillRect(296,40,10,3);
	g.fillOval(290,35,10,10);
	
	
	g.setColor(Color.black);
	g.drawRoundRect(219,100,20,40,10,20);
	g.drawRoundRect(219,103,16,34,10,20);
	g.fillOval(225,117,7,7);
	
	g.setColor(Color.lightGray );
	g.fillRect(219,90,8,60);
	g.setColor(Color.black);		
	g.drawRect(219,90,8,60);
	
	g.setColor(Color.lightGray );
	g.fillRect(290,80,12,80);
	g.setColor(Color.black);		
	g.drawRect(290,80,12,80);
	
////////////bethroom 2//////////////////////////////////////////////////////////
	g.setColor(Color.white);
	g.fillOval(468,20,30,35);
	g.setColor(Color.black);
	g.drawOval(468,20,30,35);
	g.drawOval(473,25,20,25);
	g.setColor(Color.cyan);
	g.fillOval(473,25,20,25);
	g.setColor(Color.white);
	g.fillRect(468,16,27,12);
	g.setColor(Color.black);
	g.drawRect(469,16,27,12);
	g.fillRect(474,20,8,5);
	
	
	g.setColor(Color.white);
	g.fillRect(525,16,30,50);
	g.fillRoundRect(469,120,20,40,10,20);
	g.setColor(Color.gray);	
	g.drawRect(525,16,30,50);
	g.fillRect(546,40,10,3);
	g.fillOval(540,35,10,10);
	
	
	g.setColor(Color.black);
	g.drawRoundRect(469,120,20,40,10,20);
	g.drawRoundRect(469,123,16,34,10,20);
	g.fillOval(475,137,7,7);
	
	g.setColor(Color.lightGray );
	g.fillRect(469,110,8,60);
	g.setColor(Color.black);		
	g.drawRect(469,110,8,60);
	
	g.setColor(Color.lightGray );
	g.fillRect(540,100,12,100);
	g.setColor(Color.black);		
	g.drawRect(540,100,12,100);
	
	
////////////bethroom 3//////////////////////////////////////////////////////////
	g.setColor(Color.white);
	g.fillOval(967,323,35,30);
	g.setColor(Color.black);
	g.drawOval(967,323,35,30);
	g.drawOval(973,327,25,20);
	g.setColor(Color.cyan);
	g.fillOval(973,327,25,20);
	g.setColor(Color.white);
	g.fillRect(992,323,12,27);
	g.setColor(Color.black);
	g.drawRect(992,323,12,27);
	g.fillRect(995,325,5,8);
	
	
	g.setColor(Color.white);
	g.fillRect(870,380,50,30);
	g.fillRoundRect(815,380,40,20,20,10);
	g.setColor(Color.gray);	
	g.drawRect(870,380,50,30);
	g.fillRect(895,400,3,10);
	g.fillOval(895,395,10,10);
	
	
	g.setColor(Color.black);
	g.drawRoundRect(815,380,40,20,20,10);
	g.drawRoundRect(818,383,34,16,20,10);
	g.fillOval(830,389,7,7);
	
	g.setColor(Color.lightGray );
	g.fillRect(805,400,60,8);
	g.setColor(Color.black);		
	g.drawRect(805,400,60,8);
	
	g.setColor(Color.lightGray );
	g.fillRect(690,396,100,12);
	g.setColor(Color.black);		
	g.drawRect(690,396,100,12);
	
	
	

			
////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Room Name//////////////////////////////////////////
		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.PLAIN, 16));
		g.drawString("Central",945,400);
		
		
		g.setColor(Color.red);
		g.setFont(new Font("Arial", Font.BOLD , 20));
		g.drawString("Car Place", 800, 540);

		g.setFont(new Font("Arial", Font.BOLD , 16));
		g.drawString("Gas Range",5,680);
		
		g.setColor(Color.blue);
		g.drawString("Basin",95,680);
		
		g.setColor(Color.black);
		g.setFont(new Font("Arial", Font.PLAIN, 12));
   		g.drawString("Bedroom", 80, 200);
   		g.drawString("Bathroom", 230, 170);
   		g.drawString("1", 255, 190);
   		g.drawString("Little", 368, 170);
   		g.drawString("Children", 360, 190);
   		g.drawString("Room", 365, 210);
   		g.drawString("Bathroom", 480, 170);
   		g.drawString("2", 505, 190);
   		g.drawString("Big", 800, 50);
   		g.drawString("Children", 800, 70);
   		g.drawString("Room", 800, 90);
   		g.drawString("Office", 800, 250);
   		g.drawString("Bathroom 3", 800, 370);
   		g.drawString("Garage", 950, 600);
   		g.drawString("Living", 360, 480);
   		g.drawString("Kitchen", 100, 480);
   		g.drawString("Wardrobe",60,350);
   		g.drawString("Shelf",305,200);
   		g.drawString("", 590, 50);
   		g.drawString("Wardrobe",690,45);
   		g.drawString("Shelf",830,435);
   		g.drawString("Cupboard",110,400);
   		g.drawString("Fridge",27,400);
   		g.drawString("Cupboard",160,680);
   		g.drawString("Cabinet",950, 160);
   		
   		


//////////////////////////////WALLS//////////////////////////////////////////////		
/*--pereti eXteriori----------------------------------------------------------*/

/*----------partea de sus(spate)----------------------------------------------*/ 
		
		g.setColor(Color.black);
		g.drawRect(15, 10, 200, 3); //PE1
		g.drawRect(215,10, 30, 3);  //PE2
		//	geam 30 pixeli
		g.drawRect(275,10, 30, 3);  //PE3
		g.drawRect(305,10, 50, 3);  //PE4
		// geam 60 pixeli
		g.drawRect(415,10, 50, 3);  //PE5
		g.drawRect(465,10, 30, 3);  //PE6
		//geam 30 pixeli
		g.drawRect(525,10, 30, 3);  //PE7
		g.drawRect(555,10, 30, 3);  //PE8
		//geam 60 pixeli
		g.drawRect(645,10, 30, 3);  //PE9
		g.drawRect(675,10, 135, 3);  //PE10
		// geam 60 pixeli
		g.drawRect(870,10, 135, 3);  //PE11
		
/*----------partea din dr(lateral-dreapta)------------------------------------*/ 
		g.drawRect(1005,10, 3, 60);  //PE12
		// geam 60 pixeli
		g.drawRect(1005,130, 3, 50);  //PE13
		g.drawRect(1005,180, 3, 40);  //PE14
		// geam 60 pixeli
		g.drawRect(1005,280, 3, 40);  //PE15
		g.drawRect(1005,320, 3, 30);  //PE16
		// geam 30 pixeli
		g.drawRect(1005,380, 3, 30);  //PE17
		g.drawRect(1005,410, 3, 130);  //PE18
		//geam 30 pixeli
		g.drawRect(1005,570, 3, 130);  //PE19
		
/*----------partea de jos(fatada)---------------------------------------------*/ 
		g.drawRect(15, 700, 200, 3); //PE20
		g.drawRect(215,700, 45, 3);  //PE21
		//	geam 250 pixeli
		g.drawRect(510,700, 45, 3);  //PE22
		g.drawRect(555,700, 30, 3);  //PE23
		//usa intrare 60 pixeli
		g.drawRect(645,700, 30, 3);  //PE24
		g.drawRect(675,700, 45, 3);  //PE25
		//usa garaj 260 pixeli
		g.drawRect(960,700, 48, 3);  //PE26
		
/*----------partea din dr(lateral-dreapta)------------------------------------*/ 
		g.drawRect(15,10, 3, 130);  //PE27
		// geam 110 pixeli
		g.drawRect(15,250, 3, 120);  //PE28
		g.drawRect(15,370, 3, 115);  //PE29
		// geam 110 pixeli
		g.drawRect(15,595, 3, 107);  //PE30
	
	
/*--pereti interiori----------------------------------------------------------*/	
	//---------vertoical	
		g.drawRect(215,10, 3, 160);  //P1
		//usa 00 pixeli
		g.drawRect(215,210, 3, 40);  //P2
		g.drawRect(215,250, 3, 20); //P3
		//usa 30 pixeli
		g.drawRect(215, 310, 3, 63); //P4
		g.drawRect(215, 370, 3, 115); //P5
		//usa sufragerie 100 pixeli
		g.drawRect(215, 585, 3, 115); //P6
		g.drawRect(305, 10, 3, 243); //P13
		g.drawRect(465, 10, 3, 243); //P14
		g.drawRect(555, 10, 3, 243); //P15
		g.drawRect(555, 370, 3, 115); //P19
		//usa sufragerie 100 pixeli
		g.drawRect(555, 585, 3, 115); //P20
		g.drawRect(675, 10, 3, 100); //P21
		//usa 40 pixeli
		g.drawRect(675, 150, 3, 30); //P22
		g.drawRect(675,180, 3, 50);  //P23
		// usa 40 pixeli
		g.drawRect(675,270, 3, 50);  //P24
		g.drawRect(675,320, 3, 25);  //P25
		// usa 40 pixeli
		g.drawRect(675,385, 3, 25);  //P26
		g.drawRect(675,410, 3, 75);  //P27
		//usa 100 pixeli
		g.drawRect(675,585, 3, 115);  //P28
					
	//---------orizontal
		g.drawRect(215,250, 25, 3); //P7
		//usa 40 pixeli
		g.drawRect(280,250, 25, 3); //P8
		g.drawRect(305,250, 95, 3); //P9
		//usa 40 pixeli
		g.drawRect(440,250, 25, 3); //P10
		g.drawRect(465,250, 25, 3); //P11
		//usa 40 pixeli
		g.drawRect(530,250, 25, 3); //P12
		g.drawRect(15, 370, 200, 3); //P16
		g.drawRect(215, 370, 120, 3); //P17
		//usa sufragerie 100 pixeli
		g.drawRect(435, 370, 120, 3); //P18
		g.drawRect(675, 180, 330, 3); //P29
		
		g.drawRect(675, 320, 330, 3); //P30
		g.drawRect(675, 410, 330,3); //P31*/
		
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////		
		
		
//////////////////Doors/////////////////////////////////////////////////////////

	
	
	DoorStatus(Door1);//D1
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(216,170, 256, 170);
		g.drawLine(216,171, 256, 171); 
		
					
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(216,170, 2, 40);  
	}
	
	
	DoorStatus(Door2);//D2
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(240,251, 240, 215); 
		g.drawLine(241,251, 241, 215);
	
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(240,251, 40, 2); 
	}
	
	
		DoorStatus(Door3);//D3
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(400,251, 400, 210); 
		g.drawLine(401,251, 401, 210);
		
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(400,251, 40, 2); 
	}
	
	DoorStatus(Door4);//D4
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(490,250, 490, 210); 
		g.drawLine(491,250, 491, 210);
		
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(490,251, 40, 2); 
	}
	
	
	
	DoorStatus(Door5);//D5
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(675, 110, 715, 110);
		g.drawLine(675, 111, 715, 111); 
		
					
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(676, 110, 2, 40);  
	}
	
	
	DoorStatus(Door6);//D6
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(675, 230, 715, 230);
		g.drawLine(675, 231, 715, 231); 
		
					
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(676, 230, 2, 40);  
	}
	
		DoorStatus(Door7);//D7
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(675, 345, 715, 345);
		g.drawLine(675, 346, 715, 346); 
		
				
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(676, 345, 2, 40);  
	}
	
		DoorStatus(Door8);//D8
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.fillRect(676, 435, 2, 50);
		g.fillRect(676, 585, 2, 50); 
		
					
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(676,485, 2, 100); 
	}
	
	
		DoorStatus(Door9);//D9 sufragerie
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(556,485, 506, 485);
		g.drawLine(556,486, 506, 486); 
		g.drawLine(556,585, 506, 585);
		g.drawLine(556,586, 506, 586); 
		
		
					
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(556,485, 2, 50); 
		g.fillRect(556,535, 2, 50);
	}
	
	
		DoorStatus(Door10);//D10 sufragerie
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(335,370, 335, 420);
		g.drawLine(336,370, 336, 420); 
		g.drawLine(435,370, 435, 420);
		g.drawLine(436,370, 436, 420); 
		
		
					
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(335,371, 50, 2); 
		g.fillRect(385,371, 50, 2);
	}
	
	
		DoorStatus(Door11);//D11 sufragerie
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(215,485, 265, 485);
		g.drawLine(215,486, 265, 486); 
		g.drawLine(215,585, 265, 585);
		g.drawLine(215,586, 265, 586); 
		
		
					
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(216,485, 2, 50); 
		g.fillRect(216,535, 2, 50);
	}
	
	
	
	
	DoorStatus(Door12);//D12
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(216,310, 256, 310);
		g.drawLine(216,311, 256, 311); 
		
					
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(216,270, 2, 40);  
	}
	
	
	
	
	
	DoorStatus(Door13);//D13 intrare
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.drawLine(585,700,585,640); 
		g.drawLine(586,700,586,640);
		
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(585,701, 60, 2); 
	}
	
	
	DoorStatus(Door14);//D14 garaj
	if(doorSt==0)
	{
		g.setColor(Color.green);
		g.fillRect(735,705, 210, 1);
		
	}
	else
	{
		g.setColor(Color.red);
		g.fillRect(720,701, 240, 2); 
	}
	
	
//////////////////////Windows///////////////////////////////////////////////////	
	
	
	WindowsStatus(W1); //W1
	if(WindowsSt==0)
	{
		g.setColor(Color.cyan);
		g.drawLine(245,10, 245, 30); 
		g.drawLine(246,10, 246, 30);
	
	}
	else
	{
		g.setColor(Color.cyan);
		g.drawRect(245,11, 30, 1); 
	}
	
	WindowsStatus(W2); //W2
	if(WindowsSt==0)
	{
		g.setColor(Color.cyan);
		g.drawLine(355,10, 355, 60); 
		g.drawLine(356,10, 356, 60);
	
	}
	else
	{
		g.setColor(Color.cyan);
		g.drawRect(355,11, 60, 1); 
	}
	
	
	WindowsStatus(W3); //W3
	if(WindowsSt==0)
	{
		g.setColor(Color.cyan);
		g.drawLine(495,10, 495, 30); 
		g.drawLine(496,10, 496, 30);
	
	}
	else
	{
		g.setColor(Color.cyan);
		g.drawRect(495,11, 30, 1); 
	}
	
	
	WindowsStatus(W4); //W4
	if(WindowsSt==0)
	{
		g.setColor(Color.cyan);
		g.drawLine(585,10, 585, 60); 
		g.drawLine(586,10, 586, 60);
	
	}
	else
	{
		g.setColor(Color.cyan);
		g.drawRect(585,11, 60, 1); 
	}
	
	WindowsStatus(W5); //W5
	if(WindowsSt==0)
	{
		g.setColor(Color.cyan);
		g.drawLine(810,10, 810, 60); 
		g.drawLine(811,10, 811, 60);
	
	}
	else
	{
		g.setColor(Color.cyan);
		g.drawRect(810,11, 60, 1); 
	}
	
	WindowsStatus(W6);//W6
	if(WindowsSt==0)
	{
		g.setColor(Color.cyan);
		g.drawLine(1005, 70, 945, 70);
		g.drawLine(1005, 71, 945, 71); 
		
					
	}
	else
	{
		g.setColor(Color.cyan);
		g.fillRect(1006, 70, 2, 60);  
	}
	
	
	WindowsStatus(W7);//W7
	if(WindowsSt==0)
	{
		g.setColor(Color.cyan);
		g.drawLine(1005, 220, 945, 220);
		g.drawLine(1005, 221, 945, 221); 
		
					
	}
	else
	{
		g.setColor(Color.cyan);
		g.fillRect(1006, 220, 2, 60);  
	}
	
	
	WindowsStatus(W8);//W8
	if(WindowsSt==0)
	{
		g.setColor(Color.cyan);
		g.drawLine(1005, 350, 975, 350);
		g.drawLine(1005, 351, 975, 351); 
		
					
	}
	else
	{
		g.setColor(Color.cyan);
		g.fillRect(1006, 350, 2, 30);  
	}
	
	WindowsStatus(W9);//W9
	if(WindowsSt==0)
	{
		g.setColor(Color.cyan);
		g.drawLine(1005, 540, 975, 540);
		g.drawLine(1005, 541, 975, 541); 
		
					
	}
	else
	{
		g.setColor(Color.cyan);
		g.fillRect(1006, 540, 2, 30);  
	}
	
	WindowsStatus(W10);//W10
	if(WindowsSt==0)
	{
		g.setColor(Color.cyan);
		g.drawLine(16, 140, 70, 140);
		g.drawLine(16, 141, 70, 141); 
		g.drawLine(16, 250, 70, 250);
		g.drawLine(16, 251, 70, 251); 
		
					
	}
	else
	{
		g.setColor(Color.cyan);
		g.fillRect(16, 140, 2, 55);  
		g.fillRect(16, 195, 2, 55);
	}
	
	
	WindowsStatus(W11);//W11
	if(WindowsSt==0)
	{
		g.setColor(Color.cyan);
		g.drawLine(16, 485, 70, 485);
		g.drawLine(16, 486, 70, 486); 
		g.drawLine(16, 595, 70, 595);
		g.drawLine(16, 596, 70, 596); 
		
					
	}
	else
	{
		g.setColor(Color.cyan);
		g.fillRect(16, 485, 2, 55);  
		g.fillRect(16, 540, 2, 55);
	}
	
	
	WindowsStatus(W12); //W12
	if(WindowsSt==0)
	{
		g.fillRect(310,701, 50, 4);
		g.fillRect(360,701, 100, 2);
		g.fillRect(410,701, 50, 4); 
	}
	else
	{
		g.setColor(Color.cyan);
		g.fillRect(260,701, 250, 2); 
	}
	
	
///////////////////bedroom chair////////////////////////////////////////////////
///////////////////////M2///////////////////////////////////////////////////////

		g.setColor(maro);
		if((x2>=70 & x2<=190 & y2>=105 & y2<=290) 
		||( x2>=18 & x2<=80 & y2>=105 & y2<=115)
		||( x2>=18 & x2<=80 & y2>=255 & y2<=290))
		{
			
			
				g.fillOval(x2,y2,25,25); 
				
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x2-25,y2-20);
				g.drawString("for Chair", x2-25,y2-5);
				g.drawOval(x2,y2,25,25); */
			}
	

			
			
///////////////////little child chair////////////////////////////////////////////////
///////////////////////M3///////////////////////////////////////////////////////

		g.setColor(maro);
		if((x3>=415 & x3<=435 & y3>=15 & y3<=75) //suprafetele permise pentru mutare
		||(x3>=360 & x3<=435 & y3>=75 & y3<=110)
		||(x3>=310 & x3<=435 & y3==120)
		||(x3>=330 & x3<=435 & y3>=100 & y3<=180)
		||(x3>=330 & x3<=375 & y3>=180 & y3<=225))
		{
			
			
				g.fillOval(x3,y3,25,25); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x3-25,y3-20);
				g.drawString("for Chair", x3-25,y3-5);
				g.drawOval(x3,y3,25,25);*/
			}
	

		
			

///////////////////Big child chair////////////////////////////////////////////////
///////////////////////M5///////////////////////////////////////////////////////

		g.setColor(maro);
		if((x5>=680 & x5<=720 & y5>=60 & y5<=85)
		||(x5>=680 & x5<=720 & y5>=150 & y5<=155)
		||(x5>=720 & x5<=930 & y5>=70 & y5<=155))
		{
			
			
				g.fillOval(x5,y5,25,25); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x5-25,y5-20);
				g.drawString("for Chair", x5-25,y5-5);
				g.drawOval(x5,y5,25,25);*/
			}
	


///////////////////Office chair////////////////////////////////////////////////
///////////////////////M7///////////////////////////////////////////////////////

		g.setColor(maro);
		if((x7>=720 & x7<=915 & y7>=185 & y7<=295)
		||(x7>=680 & x7<=720 & y7>=185 & y7<=200)
		||(x7>=680 & x7<=720 & y7>=270 & y7<=295)
		||(x7>=915 & x7<=980 & y7>=185 & y7<=195)
		||(x7>=915 & x7<=980 & y7>=280 & y7<=295))
		{
			
			
				g.fillOval(x7,y7,25,25); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x7-25,y7-20);
				g.drawString("for Chair", x7-25,y7-5);
				g.drawOval(x7,y7,25,25);*/
			}
	



						
///////////////////Living Couch/////////////////////////////////////////////////
////////////////////////M11//////////////////////////////////////////////////////

	
		if((x11>=220 & x11<=295 & y11>=375 & y11<=410))
		{
			
				g.setColor(couch);
				g.fillRoundRect(x11,y11,40,70,50,50); 
				g.setColor(couch1);
				g.fillRoundRect(x11,y11,10,70,50,50);
				g.fillRoundRect(x11,y11,40,15,50,50);
				g.fillOval(x11+3,y11+3,15,15);
				g.fillRoundRect(x11,y11+57,40,15,50,50);
				g.fillOval(x11+3,y11+55,15,15);
			
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x11-25,y11-20);
				g.drawString("for Couch", x11-25,y11-5);
				g.drawRoundRect(x11,y11,40,70,15,15);*/
			}
			
///////////////////Living TV/////////////////////////////////////////////////
////////////////////////M12//////////////////////////////////////////////////////

	
		if((x12>=440 & x12<=520 & y12>=375 & y12<=430))
		{
			
				g.setColor(Color.black);
				g.fillRect(x12,y12,40,50); 	
				g.setColor(Color.cyan);
				g.fillRect(x12-1,y12+4,2,42);
				g.fillRect(x12-3,y12+10,2,30);	
			g.setColor(Color.white);
			g.setFont(new Font("Arial", Font.PLAIN, 16));
			g.drawString("TV",x12+10,y12+30);	
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x12-25,y12-20);
				g.drawString("for TV", x12-25,y12-5);
				g.drawRect(x12,y12,40,50);
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 16));
			g.drawString("TV",x12+10,y12+30);*/
			}

///////////////////Living chair1/////////////////////////////////////////////////
///////////////////////M13///////////////////////////////////////////////////////

		g.setColor(maro);		
		if(
		  ((x11-220)>25) & (x13>=220 	& x13<=x11-25 & y13>=375    & y13<=460)
		||((295-x11)>25) & (x13>=x11+40 & x13<=310 	  & y13>=375    & y13<=460)
		||((y11-375)>25) & (x13>=220 	& x13<=310    & y13>=375    & y13<=y11-25)
		||((460-y11)>25) & (x13>=220 	& x13<=310    & y13>=y11+70 & y13<=460)
		
		||((x12-440)>25) & (x13>=440    & x13<=x12-25 & y13>=375    & y13<=460)
		||((515-x12)>25) & (x13>=x12+40 & x13<=530    & y13>=375    & y13<=460)
		||((y12-375)>25) & (x13>=440    & x13<=530    & y13>=375    & y13<=y12-25)
		||((460-y12)>25) & (x13>=440    & x13<=530    & y13>=y12+50 & y13<=460)
		
			
		||(x13>=220 & x13<=530 & y13>=585 & y13<=675)
		||(x13>=335 & x13<=415 & y13>=420 & y13<=675)
		||(x13>=270 & x13<=490 & y13>=485 & y13<=585))
		{
			
			
				g.fillOval(x13,y13,25,25); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x13-25,y13-20);
				g.drawString("for Chair", x13-25,y13-5);
				g.drawOval(x13,y13,25,25);*/
			}
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.drawString("1",x13+7,y13+18);
			
///////////////////Living chair2/////////////////////////////////////////////////
///////////////////////M14///////////////////////////////////////////////////////

		g.setColor(maro);		
		if(
		  ((x11-220)>25) & (x14>=220 	& x14<=x11-25 & y14>=375    & y14<=460)
		||((310-x11)>25) & (x14>=x11+40 & x14<=310 	  & y14>=375    & y14<=460)
		||((y11-375)>25) & (x14>=220 	& x14<=310 	  & y14>=375    & y14<=y11-25)
		||((460-y11)>25) & (x14>=220 	& x14<=310    & y14>=y11+70 & y14<=460)
		
		||((x12-440)>25) & (x14>=440    & x14<=x12-25 & y14>=375    & y14<=460)
		||((515-x12)>25) & (x14>=x12+40 & x14<=530    & y14>=375    & y14<=460)
		||((y12-375)>25) & (x14>=440    & x14<=530    & y14>=375    & y14<=y12-25)
		||((460-y12)>25) & (x14>=440    & x14<=530    & y14>=y12+50 & y14<=460)
		
		||(x14>=220 & x14<=530 & y14>=585 & y14<=675)
		||(x14>=335 & x14<=415 & y14>=420 & y14<=675)
		||(x14>=270 & x14<=490 & y14>=485 & y14<=585))
		{
			
			
				g.fillOval(x14,y14,25,25); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x14-25,y14-20);
				g.drawString("for Chair", x14-25,y14-5);
				g.drawOval(x14,y14,25,25);*/
			}
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.drawString("2",x14+7,y14+18);
///////////////////Living chair3/////////////////////////////////////////////////
///////////////////////M15///////////////////////////////////////////////////////

		g.setColor(maro);		
		if(
		  ((x11-220)>25) & (x15>=220 	& x15<=x11-25 & y15>=375    & y15<=460)
		||((310-x11)>25) & (x15>=x11+40 & x15<=310 	  & y15>=375    & y15<=460)
		||((y11-375)>25) & (x15>=220 	& x15<=310 	  & y15>=375    & y15<=y11-25)
		||((460-y11)>25) & (x15>=220 	& x15<=310    & y15>=y11+70 & y15<=460)
		
		||((x12-440)>25) & (x15>=440    & x15<=x12-25 & y15>=375    & y15<=460)
		||((515-x12)>25) & (x15>=x12+40 & x15<=530    & y15>=375    & y15<=460)
		||((y12-375)>25) & (x15>=440    & x15<=530    & y15>=375    & y15<=y12-25)
		||((460-y12)>25) & (x15>=440    & x15<=530    & y15>=y12+50 & y15<=460)
		
		||(x15>=220 & x15<=530 & y15>=585 & y15<=675)
		||(x15>=335 & x15<=415 & y15>=420 & y15<=675)
		||(x15>=270 & x15<=490 & y15>=485 & y15<=585))
		{
			
			
				g.fillOval(x15,y15,25,25); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x15-25,y15-20);
				g.drawString("for Chair", x15-25,y15-5);
				g.drawOval(x15,y15,25,25);*/
			}
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.drawString("3",x15+7,y15+18);
			
///////////////////Living chair4/////////////////////////////////////////////////
///////////////////////M16///////////////////////////////////////////////////////

		g.setColor(maro);		
		if(
		  ((x11-220)>25) & (x16>=220 	& x16<=x11-25 & y16>=375    & y16<=460)
		||((310-x11)>25) & (x16>=x11+40 & x16<=310 	  & y16>=375    & y16<=460)
		||((y11-375)>25) & (x16>=220 	& x16<=310 	  & y16>=375    & y16<=y11-25)
		||((460-y11)>25) & (x16>=220 	& x16<=310    & y16>=y11+70 & y16<=460)
		
		||((x12-440)>25) & (x16>=440    & x16<=x12-25 & y16>=375    & y16<=460)
		||((515-x12)>25) & (x16>=x12+40 & x16<=530    & y16>=375    & y16<=460)
		||((y12-375)>25) & (x16>=440    & x16<=530    & y16>=375    & y16<=y12-25)
		||((460-y12)>25) & (x16>=440    & x16<=530    & y16>=y12+50 & y16<=460)
		
		||(x16>=220 & x16<=530 & y16>=585 & y16<=675)
		||(x16>=335 & x16<=415 & y16>=420 & y16<=675)
		||(x16>=270 & x16<=490 & y16>=485 & y16<=585))
		{
			
			
				g.fillOval(x16,y16,25,25); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x16-25,y16-20);
				g.drawString("for Chair", x16-25,y16-5);
				g.drawOval(x16,y16,25,25);*/
			}
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.drawString("4",x16+7,y16+18);
			
///////////////////Living chair5/////////////////////////////////////////////////
///////////////////////M17///////////////////////////////////////////////////////

		g.setColor(maro);		
		if(
		  ((x11-220)>25) & (x17>=220 	& x17<=x11-25 & y17>=375    & y17<=460)
		||((310-x11)>25) & (x17>=x11+40 & x17<=310 	  & y17>=375    & y17<=460)
		||((y11-375)>25) & (x17>=220 	& x17<=310 	  & y17>=375    & y17<=y11-25)
		||((460-y11)>25) & (x17>=220 	& x17<=310    & y17>=y11+70 & y17<=460)
		
		||((x12-440)>25) & (x17>=440    & x17<=x12-25 & y17>=375    & y17<=460)
		||((515-x12)>25) & (x17>=x12+40 & x17<=530    & y17>=375    & y17<=460)
		||((y12-375)>25) & (x17>=440    & x17<=530    & y17>=375    & y17<=y12-25)
		||((460-y12)>25) & (x17>=440    & x17<=530    & y17>=y12+50 & y17<=460)
		
		||(x17>=220 & x17<=530 & y17>=585 & y17<=675)
		||(x17>=335 & x17<=415 & y17>=420 & y17<=675)
		||(x17>=270 & x17<=490 & y17>=485 & y17<=585))
		{
			
			
				g.fillOval(x17,y17,25,25); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x17-25,y17-20);
				g.drawString("for Chair", x17-25,y17-5);
				g.drawOval(x17,y17,25,25);*/
			}
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.drawString("5",x17+7,y17+18);
						
///////////////////Living chair6/////////////////////////////////////////////////
///////////////////////M18///////////////////////////////////////////////////////

		g.setColor(maro);		
		if(
		  ((x11-220)>25) & (x18>=220 	& x18<=x11-25 & y18>=375    & y18<=460)
		||((310-x11)>25) & (x18>=x11+40 & x18<=310 	  & y18>=375    & y18<=460)
		||((y11-375)>25) & (x18>=220 	& x18<=310 	  & y18>=375    & y18<=y11-25)
		||((460-y11)>25) & (x18>=220 	& x18<=310    & y18>=y11+70 & y18<=460)
		
		||((x12-440)>25) & (x18>=440    & x18<=x12-25 & y18>=375    & y18<=460)
		||((515-x12)>25) & (x18>=x12+40 & x18<=530    & y18>=375    & y18<=460)
		||((y12-375)>25) & (x18>=440    & x18<=530    & y18>=375    & y18<=y12-25)
		||((460-y12)>25) & (x18>=440    & x18<=530    & y18>=y12+50 & y18<=460)
		
		||(x18>=220 & x18<=530 & y18>=585 & y18<=675)
		||(x18>=335 & x18<=415 & y18>=420 & y18<=675)
		||(x18>=270 & x18<=490 & y18>=485 & y18<=585))
		{
			
			
				g.fillOval(x18,y18,25,25); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x18-25,y18-20);
				g.drawString("for Chair", x18-25,y18-5);
				g.drawOval(x18,y18,25,25);*/
			}
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.drawString("6",x18+7,y18+18);
			
///////////////////Living chair7/////////////////////////////////////////////////
///////////////////////M19///////////////////////////////////////////////////////

		g.setColor(maro);	
		if(
		  ((x11-220)>25) & (x19>=220 	& x19<=x11-25 & y19>=375    & y19<=460)
		||((310-x11)>25) & (x19>=x11+40 & x19<=310 	  & y19>=375    & y19<=460)
		||((y11-375)>25) & (x19>=220 	& x19<=310 	  & y19>=375    & y19<=y11-25)
		||((460-y11)>25) & (x19>=220 	& x19<=310    & y19>=y11+70 & y19<=460)
		
		||((x12-440)>25) & (x19>=440    & x19<=x12-25 & y19>=375    & y19<=460)
		||((515-x12)>25) & (x19>=x12+40 & x19<=530    & y19>=375    & y19<=460)
		||((y12-375)>25) & (x19>=440    & x19<=530    & y19>=375    & y19<=y12-25)
		||((460-y12)>25) & (x19>=440    & x19<=530    & y19>=y12+50 & y19<=460)
		
		||(x19>=220 & x19<=530 & y19>=585 & y19<=675)
		||(x19>=335 & x19<=415 & y19>=420 & y19<=675)
		||(x19>=270 & x19<=490 & y19>=485 & y19<=585))
		
		{
			
		
				g.fillOval(x19,y19,25,25); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x19-25,y19-20);
				g.drawString("for Chair", x19-25,y19-5);
				g.drawOval(x19,y19,25,25);*/
			}
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.drawString("7",x19+7,y19+18);
///////////////////Living chair8/////////////////////////////////////////////////
///////////////////////M20///////////////////////////////////////////////////////

		g.setColor(maro);		
		if(
		  ((x11-220)>25) & (x20>=220 	& x20<=x11-25 & y20>=375    & y20<=460)
		||((310-x11)>25) & (x20>=x11+40 & x20<=310 	  & y20>=375    & y20<=460)
		||((y11-375)>25) & (x20>=220 	& x20<=310 	  & y20>=375    & y20<=y11-25)
		||((460-y11)>25) & (x20>=220 	& x20<=310    & y20>=y11+70 & y20<=460)
		
		||((x12-440)>25) & (x20>=440    & x20<=x12-25 & y20>=375    & y20<=460)
		||((515-x12)>25) & (x20>=x12+40 & x20<=530    & y20>=375    & y20<=460)
		||((y12-375)>25) & (x20>=440    & x20<=530    & y20>=375    & y20<=y12-25)
		||((460-y12)>25) & (x20>=440    & x20<=530    & y20>=y12+50 & y20<=460)
		
		||(x20>=220 & x20<=530 & y20>=585 & y20<=675)
		||(x20>=335 & x20<=415 & y20>=420 & y20<=675)
		||(x20>=270 & x20<=490 & y20>=485 & y20<=585))
		{
			
			
				g.fillOval(x20,y20,25,25); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 20));
				g.drawString("Illegal Position", x20-25,y20-20);
				g.drawString("for Chair", x20-25,y20-5);
				g.drawOval(x20,y20,25,25);*/
			}
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.drawString("8",x20+7,y20+18);
			



//////////////////human being///////////////////////////////////////////////////
//////////////////man///////////////////////////////////////////////////////////
if(
	  (xm>555 & xm<660 & ym>55  & ym<610 & Door13==1)//hall (Door=1->open)
	||(xm>587 & xm<660 & ym>605 & ym<670 & Door13==1)
	||(xm>587 & xm<630 & ym>605 & ym<700 & Door13==1)
	||(xm>555 & xm<660 & ym>55  & ym<670 & Door13==0)
	||(xm>255 & xm<640 & ym>250 & ym<345 & Door12==1)
	||(xm>160 & xm<220 & ym>270 & ym<290 & Door12==1)
	||(xm>215 & xm<256 & ym>250 & ym<280 & Door12==1)
	||(xm>215 & xm<256 & ym>305 & ym<345 & Door12==1)
	||(xm>215 & xm<640 & ym>250 & ym<345 & Door12==0)
	||(xm>675 & xm<740 & ym>65  & ym<=80 & Door5==1 )//big child
	||(xm>675 & xm<740 & ym>150 & ym<155 & Door5==1 )
	||(xm>720 & xm<830 & ym>65  & ym<85  & Door5==1 )
	||(xm>640 & xm<740 & ym>110 & ym<125 & Door5==1 )
	||(xm>675 & xm<740 & ym>115 & ym<155 & Door5==1 )
	||(xm>675 & xm<830 & ym>65  & ym<155 & Door5==0 )
	||(xm>715 & xm<940 & ym>70  & ym<155  			)
	||(xm>800 & xm<990 & ym>15  & ym<100 			)
	||(xm>675 & xm<730 & ym>180 & ym<205& Door6==1 )//office
	||(xm>715 & xm<990 & ym>180 & ym<300 & Door6==1 )
	||(xm>640 & xm<740 & ym>230 & ym<250 & Door6==1 )
	||(xm>675 & xm<740 & ym>240 & ym<300 & Door6==1 )
	||(xm>675 & xm<990 & ym>180 & ym<300 & Door6==0 )
	||(xm>640 & xm<740 & ym>345 & ym<365 & Door7==1 )//bethroom3
	||(xm>715 & xm<790 & ym>325 & ym<375  			)
	||(xm>775 & xm<950 & ym>325 & ym<355			)
	||(xm>675 & xm<990 & ym>440 & ym<675 			)//garage
	||(xm>465 & xm<500 & ym>50  & ym<80 			)//bethroom2
	||(xm>490 & xm<515 & ym>60  & ym<230  			)
	||(xm>490 & xm<530 & ym>200 & ym<230			)
	||(xm>490 & xm<520 & ym>210 & ym<285 & Door4==1	)
	||(xm>305 & xm<445 & ym>15  & ym<185 			)//little child
	||(xm>325 & xm<375 & ym>115 & ym<230 & Door3==1	)
	||(xm>400 & xm<415 & ym>80  & ym<285 & Door3==1	)
	||(xm>400 & xm<445 & ym>115 & ym<230 & Door3==1	)
	||(xm>400 & xm<445 & ym>115 & ym<230 & Door3==0	)
	||(xm>325 & xm<445 & ym>115 & ym<230 & Door3==0	)
	||(xm>215 & xm<245 & ym>50  & ym<65 			)//bethroom3
	||(xm>225 & xm<258 & ym>60  & ym<75				)
	||(xm>235 & xm<258 & ym>70  & ym<170 & Door1==0	
											 & Door2==0	)
	||(xm>215 & xm<275 & ym>160 & ym<225 & Door1==0		
											 & Door2==0	)
	||(xm>235 & xm<258 & ym>70 & ym<140  & Door1==1		
											 & Door2==0	)
	||(xm>250 & xm<258 & ym>135 & ym<225 & Door1==1		
											 & Door2==0	)
	||(xm>215 & xm<275 & ym>172 & ym<225 & Door1==1		
											 & Door2==0	)
	||(xm>250 & xm<275 & ym>155 & ym<225 & Door1==1		
											 & Door2==0	)
	||(xm>160 & xm<275 & ym>172 & ym<183 & Door1==1	)
	||(xm>235 & xm<258 & ym>70  & ym<185 & Door1==0		
											 & Door2==1	)
	||(xm>215 & xm<275 & ym>155 & ym<185 & Door1==0		
											 & Door2==1	)
	||(xm>240 & xm<275 & ym>165 & ym<225 & Door1==0		
											 & Door2==1	)
	||(xm>240 & xm<255 & ym>175 & ym<180 & Door1==0	)
	||(xm>235 & xm<258 & ym>70 & ym<140  & Door1==1		
											 & Door2==1	)
	||(xm>250 & xm<258 & ym>135 & ym<225 & Door1==1		
											 & Door2==1	)
	||(xm>160 & xm<275 & ym>172 & ym<185 & Door1==1		
											 & Door2==1	)
	||(xm>235 & xm<258 & ym>172 & ym<185 & Door1==1		
											 & Door2==1	)
	||(xm>240 & xm<275 & ym>165 & ym<225 & Door1==1		
											 & Door2==1	)
	||(xm>240 & xm<255 & ym>175 & ym<280 & Door2==1	)
	||(xm>250 & xm<275 & ym>155 & ym<225 & Door1==1		
											 & Door2==1	)
	||(xm>15  & xm<195 & ym>15 & ym<285			)//bedroom
	||(xm>15  & xm<195 & ym>425 & ym<622			)//kitchen
	||(xm>65  & xm<195 & ym>410 & ym<622			)
	||(xm>335 & xm<410 & ym>370 & ym<520 & Door10==0)//living
	||(xm>215 & xm<560 & ym>375 & ym<700 & Door10==0
										 & Door11==0
										 & Door9==0 )
	||(xm>215 & xm<530 & ym>487 & ym<530			)
	||(xm>215 & xm<305 & ym>487 & ym<560			)
	||(xm>430 & xm<530 & ym>487 & ym<560			)
	||(xm>335 & xm<410 & ym>180 & ym<530 & Door10==1)
	||(xm>160 & xm<305 & ym>487 & ym<560 & Door11==1)
	||(xm>430 & xm<585 & ym>487 & ym<560 & Door9==1 )										 
											 											
											 


	)
{
		
		if(dim==1)//down
		{
			g.setColor(Color.blue);
			g.fillRoundRect(xm,ym+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xm,ym,20,12);
			g.fillRect(xm+1,ym+5,3,13);
			g.fillRect(xm+16,ym+5,3,13);
			
			g.setColor(Color.black);
			g.drawOval(xm,ym,20,12);
			g.fillOval(xm+5,ym+2,4,4);
			g.fillOval(xm+10,ym+2,4,4);
			g.fillRect(xm+6,ym+8,8,2);
			g.fillRect(xm+2,ym+20,6,7);
			g.fillRect(xm+11,ym+20,6,7);	
		}
		if(dim==2)//up
		{
			g.setColor(Color.blue);
			g.fillRoundRect(xm,ym+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xm,ym,20,12);
			g.fillRect(xm+1,ym+5,3,13);
			g.fillRect(xm+16,ym+5,3,13);
			
			g.setColor(Color.black);
			g.drawOval(xm,ym,20,12);
			g.fillRect(xm+2,ym+20,6,7);
			g.fillRect(xm+11,ym+20,6,7);	
		}
		if(dim==3)//right
		{
			g.setColor(Color.blue);
			g.fillRoundRect(xm,ym+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xm+3,ym,15,12);
			g.fillRect(xm+8,ym+5,3,13);
		
			g.setColor(Color.black);
			g.drawOval(xm+3,ym,15,12);
			g.fillOval(xm+12,ym+2,4,4);
			g.fillRect(xm+2,ym+20,6,7);
			g.fillRect(xm+11,ym+20,6,7);	
		}
		if(dim==4)//left
		{
			g.setColor(Color.blue);
			g.fillRoundRect(xm,ym+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xm+3,ym,15,12);
			g.fillRect(xm+8,ym+5,3,13);
		
			g.setColor(Color.black);
			g.drawOval(xm+3,ym,15,12);
			g.fillOval(xm+5,ym+2,4,4);
			g.fillRect(xm+2,ym+20,6,7);
			g.fillRect(xm+11,ym+20,6,7);	
		}
		}
		
		else
		{
			
			if(dim==1)//down
		{
			g.setColor(Color.blue);
			g.drawRoundRect(xm,ym+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xm,ym,20,12);
			g.fillRect(xm+1,ym+5,3,13);
			g.fillRect(xm+16,ym+5,3,13);
			
			g.setColor(Color.red);
			g.drawOval(xm,ym,20,12);
			g.fillOval(xm+5,ym+2,4,4);
			g.fillOval(xm+10,ym+2,4,4);
			g.fillRect(xm+6,ym+8,8,2);
			g.fillRect(xm+2,ym+20,6,7);
			g.fillRect(xm+11,ym+20,6,7);	
		}
		if(dim==2)//up
		{
			g.setColor(Color.blue);
			g.drawRoundRect(xm,ym+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xm,ym,20,12);
			g.fillRect(xm+1,ym+5,3,13);
			g.fillRect(xm+16,ym+5,3,13);
			
			g.setColor(Color.red);
			g.drawOval(xm,ym,20,12);
			g.fillRect(xm+2,ym+20,6,7);
			g.fillRect(xm+11,ym+20,6,7);	
		}
		if(dim==3)//right
		{
			g.setColor(Color.blue);
			g.drawRoundRect(xm,ym+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xm+3,ym,15,12);
			g.fillRect(xm+8,ym+5,3,13);
		
			g.setColor(Color.red);
			g.drawOval(xm+3,ym,15,12);
			g.fillOval(xm+12,ym+2,4,4);
			g.fillRect(xm+2,ym+20,6,7);
			g.fillRect(xm+11,ym+20,6,7);	
		}
		if(dim==4)//left
		{
			g.setColor(Color.blue);
			g.drawRoundRect(xm,ym+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xm+3,ym,15,12);
			g.fillRect(xm+8,ym+5,3,13);
		
			g.setColor(Color.red);
			g.drawOval(xm+3,ym,15,12);
			g.fillOval(xm+5,ym+2,4,4);
			g.fillRect(xm+2,ym+20,6,7);
			g.fillRect(xm+11,ym+20,6,7);	
		}
		}

//////////////////women///////////////////////////////////////////////////////////
//KBLayer.getWomenLocation(xw, yw, Doors[]);





if(
	  (xw>555 & xw<660 & yw>55  & yw<610 & Door13==1)//hall (Door=1->open)
	||(xw>587 & xw<660 & yw>605 & yw<670 & Door13==1)
	||(xw>587 & xw<630 & yw>605 & yw<700 & Door13==1)
	||(xw>555 & xw<660 & yw>55  & yw<670 & Door13==0)
	||(xw>255 & xw<640 & yw>250 & yw<345 & Door12==1)
	||(xw>160 & xw<220 & yw>270 & yw<290 & Door12==1)
	||(xw>215 & xw<256 & yw>250 & yw<280 & Door12==1)
	||(xw>215 & xw<256 & yw>305 & yw<345 & Door12==1)
	||(xw>215 & xw<640 & yw>250 & yw<345 & Door12==0)
	||(xw>675 & xw<740 & yw>65  & yw<=80 & Door5==1 )//big child
	||(xw>675 & xw<740 & yw>150 & yw<155 & Door5==1 )
	||(xw>720 & xw<830 & yw>65  & yw<85  & Door5==1 )
	||(xw>640 & xw<740 & yw>110 & yw<125 & Door5==1 )
	||(xw>675 & xw<740 & yw>115 & yw<155 & Door5==1 )
	||(xw>675 & xw<830 & yw>65  & yw<155 & Door5==0 )
	||(xw>715 & xw<940 & yw>70  & yw<155  			)
	||(xw>800 & xw<990 & yw>15  & yw<100 			)
	||(xw>675 & xw<730 & yw>180 & yw<205& Door6==1 )//office
	||(xw>715 & xw<990 & yw>180 & yw<300 & Door6==1 )
	||(xw>640 & xw<740 & yw>230 & yw<250 & Door6==1 )
	||(xw>675 & xw<740 & yw>240 & yw<300 & Door6==1 )
	||(xw>675 & xw<990 & yw>180 & yw<300 & Door6==0 )
	||(xw>640 & xw<740 & yw>345 & yw<365 & Door7==1 )//bethroom3
	||(xw>715 & xw<790 & yw>325 & yw<375  			)
	||(xw>775 & xw<950 & yw>325 & yw<355			)
	||(xw>675 & xw<990 & yw>440 & yw<675 			)//garage
	||(xw>465 & xw<500 & yw>50  & yw<80 			)//bethroom2
	||(xw>490 & xw<515 & yw>60  & yw<230  			)
	||(xw>490 & xw<530 & yw>200 & yw<230			)
	||(xw>490 & xw<520 & yw>210 & yw<285 & Door4==1	)
	||(xw>305 & xw<445 & yw>15  & yw<185 			)//little child
	||(xw>325 & xw<375 & yw>115 & yw<230 & Door3==1	)
	||(xw>400 & xw<415 & yw>80  & yw<285 & Door3==1	)
	||(xw>400 & xw<445 & yw>115 & yw<230 & Door3==1	)
	||(xw>400 & xw<445 & yw>115 & yw<230 & Door3==0	)
	||(xw>325 & xw<445 & yw>115 & yw<230 & Door3==0	)
	||(xw>215 & xw<245 & yw>50  & yw<65 			)//bethroom3
	||(xw>225 & xw<258 & yw>60  & yw<75				)
	||(xw>235 & xw<258 & yw>70  & yw<170 & Door1==0	
											 & Door2==0	)
	||(xw>215 & xw<275 & yw>160 & yw<225 & Door1==0		
											 & Door2==0	)
	||(xw>235 & xw<258 & yw>70 & yw<140  & Door1==1		
											 & Door2==0	)
	||(xw>250 & xw<258 & yw>135 & yw<225 & Door1==1		
											 & Door2==0	)
	||(xw>215 & xw<275 & yw>172 & yw<225 & Door1==1		
											 & Door2==0	)
	||(xw>250 & xw<275 & yw>155 & yw<225 & Door1==1		
											 & Door2==0	)
	||(xw>160 & xw<275 & yw>172 & yw<183 & Door1==1	)
	||(xw>235 & xw<258 & yw>70  & yw<185 & Door1==0		
											 & Door2==1	)
	||(xw>215 & xw<275 & yw>155 & yw<185 & Door1==0		
											 & Door2==1	)
	||(xw>240 & xw<275 & yw>165 & yw<225 & Door1==0		
											 & Door2==1	)
	||(xw>240 & xw<255 & yw>175 & yw<180 & Door1==0	)
	||(xw>235 & xw<258 & yw>70 & yw<140  & Door1==1		
											 & Door2==1	)
	||(xw>250 & xw<258 & yw>135 & yw<225 & Door1==1		
											 & Door2==1	)
	||(xw>160 & xw<275 & yw>172 & yw<185 & Door1==1		
											 & Door2==1	)
	||(xw>235 & xw<258 & yw>172 & yw<185 & Door1==1		
											 & Door2==1	)
	||(xw>240 & xw<275 & yw>165 & yw<225 & Door1==1		
											 & Door2==1	)
	||(xw>240 & xw<255 & yw>175 & yw<280 & Door2==1	)
	||(xw>250 & xw<275 & yw>155 & yw<225 & Door1==1		
											 & Door2==1	)
	||(xw>15  & xw<195 & yw>15 & yw<285			)//bedroom
	||(xw>15  & xw<195 & yw>425 & yw<622			)//kitchen
	||(xw>65  & xw<195 & yw>410 & yw<622			)
	||(xw>335 & xw<410 & yw>370 & yw<520 & Door10==0)//living
	||(xw>215 & xw<560 & yw>375 & yw<700 & Door10==0
										 & Door11==0
										 & Door9==0 )
	||(xw>215 & xw<530 & yw>487 & yw<530			)
	||(xw>215 & xw<305 & yw>487 & yw<560			)
	||(xw>430 & xw<530 & yw>487 & yw<560			)
	||(xw>335 & xw<410 & yw>180 & yw<530 & Door10==1)
	||(xw>160 & xw<305 & yw>487 & yw<560 & Door11==1)
	||(xw>430 & xw<585 & yw>487 & yw<560 & Door9==1 )										 
											 											
)
{
	//System.out.println("woman moving");

		if(diw==1)//down
		{
			g.setColor(Color.red);
			g.fillRoundRect(xw,yw+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xw,yw,20,12);
			g.fillRect(xw+1,yw+5,3,13);
			g.fillRect(xw+16,yw+5,3,13);
			
			g.setColor(Color.black);
			g.drawOval(xw,yw,20,12);
			g.fillOval(xw+5,yw+2,4,4);
			g.fillOval(xw+10,yw+2,4,4);
			g.fillRect(xw+6,yw+8,8,2);
			g.fillRect(xw+2,yw+20,6,7);
			g.fillRect(xw+11,yw+20,6,7);	
		}
		if(diw==2)//up
		{
			g.setColor(Color.red);
			g.fillRoundRect(xw,yw+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xw,yw,20,12);
			g.fillRect(xw+1,yw+5,3,13);
			g.fillRect(xw+16,yw+5,3,13);
			
			g.setColor(Color.black);
			g.drawOval(xw,yw,20,12);
			g.fillRect(xw+2,yw+20,6,7);
			g.fillRect(xw+11,yw+20,6,7);	
		}
		if(diw==3)//right
		{
			g.setColor(Color.red);
			g.fillRoundRect(xw,yw+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xw+3,yw,15,12);
			g.fillRect(xw+8,yw+5,3,13);
		
			g.setColor(Color.black);
			g.drawOval(xw+3,yw,15,12);
			g.fillOval(xw+12,yw+2,4,4);
			g.fillRect(xw+2,yw+20,6,7);
			g.fillRect(xw+11,yw+20,6,7);	
		}
		if(diw==4)//left
		{
			g.setColor(Color.red);
			g.fillRoundRect(xw,yw+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xw+3,yw,15,12);
			g.fillRect(xw+8,yw+5,3,13);
		
			g.setColor(Color.black);
			g.drawOval(xw+3,yw,15,12);
			g.fillOval(xw+5,yw+2,4,4);
			g.fillRect(xw+2,yw+20,6,7);
			g.fillRect(xw+11,yw+20,6,7);	
		}
		}
		else
		{
			if(diw==1)//down
		{
			g.setColor(Color.red);
			g.drawRoundRect(xw,yw+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xw,yw,20,12);
			g.fillRect(xw+1,yw+5,3,13);
			g.fillRect(xw+16,yw+5,3,13);
			
			g.setColor(Color.red);
			g.drawOval(xw,yw,20,12);
			g.fillOval(xw+5,yw+2,4,4);
			g.fillOval(xw+10,yw+2,4,4);
			g.fillRect(xw+6,yw+8,8,2);
			g.fillRect(xw+2,yw+20,6,7);
			g.fillRect(xw+11,yw+20,6,7);	
		}
		if(diw==2)//up
		{
			g.setColor(Color.red);
			g.drawRoundRect(xw,yw+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xw,yw,20,12);
			g.fillRect(xw+1,yw+5,3,13);
			g.fillRect(xw+16,yw+5,3,13);
			
			g.setColor(Color.red);
			g.drawOval(xw,yw,20,12);
			g.fillRect(xw+2,yw+20,6,7);
			g.fillRect(xw+11,yw+20,6,7);	
		}
		if(diw==3)//right
		{
			g.setColor(Color.red);
			g.drawRoundRect(xw,yw+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xw+3,yw,15,12);
			g.fillRect(xw+8,yw+5,3,13);
		
			g.setColor(Color.red);
			g.drawOval(xw+3,yw,15,12);
			g.fillOval(xw+12,yw+2,4,4);
			g.fillRect(xw+2,yw+20,6,7);
			g.fillRect(xw+11,yw+20,6,7);	
		}
		if(diw==4)//left
		{
			g.setColor(Color.red);
			g.drawRoundRect(xw,yw+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xw+3,yw,15,12);
			g.fillRect(xw+8,yw+5,3,13);
		
			g.setColor(Color.red);
			g.drawOval(xw+3,yw,15,12);
			g.fillOval(xw+5,yw+2,4,4);
			g.fillRect(xw+2,yw+20,6,7);
			g.fillRect(xw+11,yw+20,6,7);	
		}
		}
		
//////////////little child////////////////////////////////////////////////////////

if(
	  (xl>555 & xl<665 & yl>55  & yl<610 & Door13==1)//hall (Door=1->open)
	||(xl>587 & xl<665 & yl>605 & yl<670 & Door13==1)
	||(xl>587 & xl<635 & yl>605 & yl<700 & Door13==1)
	||(xl>555 & xl<665 & yl>55  & yl<670 & Door13==0)
	||(xl>255 & xl<645 & yl>250 & yl<345 & Door12==1)
	||(xl>160 & xl<225 & yl>270 & yl<290 & Door12==1)
	||(xl>215 & xl<261 & yl>250 & yl<280 & Door12==1)
	||(xl>215 & xl<261 & yl>305 & yl<345 & Door12==1)
	||(xl>215 & xl<645 & yl>250 & yl<345 & Door12==0)
	||(xl>675 & xl<745 & yl>65  & yl<=80 & Door5==1 )//big child
	||(xl>675 & xl<745 & yl>150 & yl<155 & Door5==1 )
	||(xl>720 & xl<835 & yl>65  & yl<85  & Door5==1 )
	||(xl>640 & xl<745 & yl>110 & yl<125 & Door5==1 )
	||(xl>675 & xl<745 & yl>115 & yl<155 & Door5==1 )
	||(xl>675 & xl<835 & yl>65  & yl<155 & Door5==0 )
	||(xl>715 & xl<945 & yl>70  & yl<155  			)
	||(xl>800 & xl<995& yl>15  & yl<100 			)
	||(xl>675 & xl<735 & yl>180 & yl<205& Door6==1 )//office
	||(xl>715 & xl<995& yl>180 & yl<300 & Door6==1 )
	||(xl>640 & xl<745 & yl>230 & yl<250 & Door6==1 )
	||(xl>675 & xl<745 & yl>240 & yl<300 & Door6==1 )
	||(xl>675 & xl<995& yl>180 & yl<300 & Door6==0 )
	||(xl>640 & xl<745 & yl>345 & yl<365 & Door7==1 )//bethroom3
	||(xl>715 & xl<795 & yl>325 & yl<375  			)
	||(xl>775 & xl<955 & yl>325 & yl<355			)
	||(xl>675 & xl<995& yl>440 & yl<675 			)//garage
	||(xl>465 & xl<505 & yl>50  & yl<80 			)//bethroom2
	||(xl>490 & xl<520 & yl>60  & yl<230  			)
	||(xl>490 & xl<540 & yl>200 & yl<230			)
	||(xl>490 & xl<530 & yl>210 & yl<285 & Door4==1	)
	||(xl>305 & xl<455 & yl>15  & yl<185 			)//little child
	||(xl>325 & xl<385 & yl>115 & yl<230 & Door3==1	)
	||(xl>400 & xl<425 & yl>80  & yl<285 & Door3==1	)
	||(xl>400 & xl<455 & yl>115 & yl<230 & Door3==1	)
	||(xl>400 & xl<455 & yl>115 & yl<230 & Door3==0	)
	||(xl>325 & xl<455 & yl>115 & yl<230 & Door3==0	)
	||(xl>215 & xl<255 & yl>50  & yl<65 			)//bethroom3
	||(xl>225 & xl<268 & yl>60  & yl<75				)
	||(xl>235 & xl<258 & yl>70  & yl<170 & Door1==0	
											 & Door2==0	)
	||(xl>215 & xl<285 & yl>160 & yl<225 & Door1==0		
											 & Door2==0	)
	||(xl>235 & xl<268 & yl>70 & yl<140  & Door1==1		
											 & Door2==0	)
	||(xl>250 & xl<268 & yl>135 & yl<225 & Door1==1		
											 & Door2==0	)
	||(xl>215 & xl<285 & yl>172 & yl<225 & Door1==1		
											 & Door2==0	)
	||(xl>250 & xl<285 & yl>155 & yl<225 & Door1==1		
											 & Door2==0	)
	||(xl>160 & xl<285 & yl>172 & yl<183 & Door1==1	)
	||(xl>235 & xl<268 & yl>70  & yl<185 & Door1==0		
											 & Door2==1	)
	||(xl>215 & xl<285 & yl>155 & yl<185 & Door1==0		
											 & Door2==1	)
	||(xl>240 & xl<285 & yl>165 & yl<225 & Door1==0		
											 & Door2==1	)
	||(xl>240 & xl<255 & yl>175 & yl<180 & Door1==0	)
	||(xl>235 & xl<268 & yl>70 & yl<140  & Door1==1		
											 & Door2==1	)
	||(xl>250 & xl<268 & yl>135 & yl<225 & Door1==1		
											 & Door2==1	)
	||(xl>160 & xl<285 & yl>172 & yl<185 & Door1==1		
											 & Door2==1	)
	||(xl>235 & xl<268 & yl>172 & yl<185 & Door1==1		
											 & Door2==1	)
	||(xl>240 & xl<285 & yl>165 & yl<225 & Door1==1		
											 & Door2==1	)
	||(xl>240 & xl<265 & yl>175 & yl<280 & Door2==1	)
	||(xl>250 & xl<285 & yl>155 & yl<225 & Door1==1		
											 & Door2==1	)
	||(xl>15  & xl<205 & yl>15 & yl<285			)//bedroom
	||(xl>15  & xl<205 & yl>425 & yl<622			)//kitchen
	||(xl>65  & xl<205 & yl>410 & yl<622			)
	||(xl>335 & xl<420 & yl>370 & yl<520 & Door10==0)//living
	||(xl>215 & xl<570 & yl>375 & yl<700 & Door10==0
										 & Door11==0
										 & Door9==0 )
	||(xl>215 & xl<540 & yl>487 & yl<530			)
	||(xl>215 & xl<315 & yl>487 & yl<560			)
	||(xl>430 & xl<540 & yl>487 & yl<560			)
	||(xl>335 & xl<420 & yl>180 & yl<530 & Door10==1)
	||(xl>160 & xl<315 & yl>487 & yl<560 & Door11==1)
	||(xl>430 & xl<595 & yl>487 & yl<560 & Door9==1 )										 
											 											
)
{
		if(dil==1)//down
		{
			g.setColor(Color.pink);
			g.fillRoundRect(xl,yl+5,15,12,10,10);
			g.setColor(skin);
			g.fillOval(xl,yl,15,10);
			g.fillRect(xl+1,yl+5,3,10);
			g.fillRect(xl+11,yl+5,3,10);
			
			g.setColor(Color.black);
			g.drawOval(xl,yl,15,12);
			g.fillOval(xl+4,yl+2,4,4);
			g.fillOval(xl+8,yl+2,4,4);
			g.fillRect(xl+6,yl+8,5,2);
			g.fillRect(xl+2,yl+15,4,7);
			g.fillRect(xl+8,yl+15,4,7);	
		}
		if(dil==2)//up
		{
			g.setColor(Color.pink);
			g.fillRoundRect(xl,yl+5,15,12,10,10);
			g.setColor(skin);
			g.fillOval(xl,yl,15,10);
			g.fillRect(xl+1,yl+5,3,10);
			g.fillRect(xl+11,yl+5,3,10);
			
			g.setColor(Color.black);
			g.drawOval(xl,yl,15,12);
			g.fillRect(xl+2,yl+15,4,7);
			g.fillRect(xl+8,yl+15,4,7);	
			}
		if(dil==3)//right
		{
			g.setColor(Color.pink);
			g.fillRoundRect(xl,yl+5,15,12,10,10);
			g.setColor(skin);
			g.fillOval(xl+1,yl,12,10);
			g.fillRect(xl+5,yl+5,3,10);
		
			g.setColor(Color.black);
			g.drawOval(xl+1,yl,12,10);
			g.fillOval(xl+8,yl+2,4,4);
			g.fillRect(xl+2,yl+15,4,7);
			g.fillRect(xl+8,yl+15,4,7);	
		}
		if(dil==4)//left
		{
				g.setColor(Color.pink);
			g.fillRoundRect(xl,yl+5,15,12,10,10);
			g.setColor(skin);
			g.fillOval(xl+1,yl,12,10);
			g.fillRect(xl+5,yl+5,3,10);
		
			g.setColor(Color.black);
			g.drawOval(xl+1,yl,12,10);
			g.fillOval(xl+2,yl+2,4,4);
			g.fillRect(xl+2,yl+15,4,7);
			g.fillRect(xl+8,yl+15,4,7);		
		}
		}
	else
		
		{
			if(dil==1)//down
			{
				g.setColor(Color.pink);
				g.drawRoundRect(xl,yl+5,15,12,10,10);
				g.setColor(skin);
				g.fillOval(xl,yl,15,10);
				g.fillRect(xl+1,yl+5,3,10);
				g.fillRect(xl+11,yl+5,3,10);
				
				g.setColor(Color.red);
				g.drawOval(xl,yl,15,12);
				g.fillOval(xl+4,yl+2,4,4);
				g.fillOval(xl+8,yl+2,4,4);
				g.fillRect(xl+6,yl+8,5,2);
				g.fillRect(xl+2,yl+15,4,7);
				g.fillRect(xl+8,yl+15,4,7);	
			}
			if(dil==2)//up
			{
				g.setColor(Color.pink);
				g.drawRoundRect(xl,yl+5,15,12,10,10);
				g.setColor(skin);
				g.fillOval(xl,yl,15,10);
				g.fillRect(xl+1,yl+5,3,10);
				g.fillRect(xl+11,yl+5,3,10);
				
				g.setColor(Color.red);
				g.drawOval(xl,yl,15,12);
				g.fillRect(xl+2,yl+15,4,7);
				g.fillRect(xl+8,yl+15,4,7);	
				}
			if(dil==3)//right
			{
				g.setColor(Color.pink);
				g.drawRoundRect(xl,yl+5,15,12,10,10);
				g.setColor(skin);
				g.fillOval(xl+1,yl,12,10);
				g.fillRect(xl+5,yl+5,3,10);
			
				g.setColor(Color.red);
				g.drawOval(xl+1,yl,12,10);
				g.fillOval(xl+8,yl+2,4,4);
				g.fillRect(xl+2,yl+15,4,7);
				g.fillRect(xl+8,yl+15,4,7);	
			}
			if(dil==4)//left
			{
				g.setColor(Color.pink);
				g.drawRoundRect(xl,yl+5,15,12,10,10);
				g.setColor(skin);
				g.fillOval(xl+1,yl,12,10);
				g.fillRect(xl+5,yl+5,3,10);
			
				g.setColor(Color.red);
				g.drawOval(xl+1,yl,12,10);
				g.fillOval(xl+2,yl+2,4,4);
				g.fillRect(xl+2,yl+15,4,7);
				g.fillRect(xl+8,yl+15,4,7);		
			}
		}
///////////////////////////big child////////////////////////////////////////////
if(
	  (xb>555 & xb<660 & yb>55  & yb<610 & Door13==1)//hall (Door=1->open)
	||(xb>587 & xb<660 & yb>605 & yb<670 & Door13==1)
	||(xb>587 & xb<630 & yb>605 & yb<700 & Door13==1)
	||(xb>555 & xb<660 & yb>55  & yb<670 & Door13==0)
	||(xb>255 & xb<640 & yb>250 & yb<345 & Door12==1)
	||(xb>160 & xb<220 & yb>270 & yb<290 & Door12==1)
	||(xb>215 & xb<256 & yb>250 & yb<280 & Door12==1)
	||(xb>215 & xb<256 & yb>305 & yb<345 & Door12==1)
	||(xb>215 & xb<640 & yb>250 & yb<345 & Door12==0)
	||(xb>675 & xb<740 & yb>65  & yb<=80 & Door5==1 )//big child
	||(xb>675 & xb<740 & yb>150 & yb<155 & Door5==1 )
	||(xb>720 & xb<830 & yb>65  & yb<85  & Door5==1 )
	||(xb>640 & xb<740 & yb>110 & yb<125 & Door5==1 )
	||(xb>675 & xb<740 & yb>115 & yb<155 & Door5==1 )
	||(xb>675 & xb<830 & yb>65  & yb<155 & Door5==0 )
	||(xb>715 & xb<940 & yb>70  & yb<155  			)
	||(xb>800 & xb<990 & yb>15  & yb<100 			)
	||(xb>675 & xb<730 & yb>180 & yb<205& Door6==1 )//office
	||(xb>715 & xb<990 & yb>180 & yb<300 & Door6==1 )
	||(xb>640 & xb<740 & yb>230 & yb<250 & Door6==1 )
	||(xb>675 & xb<740 & yb>240 & yb<300 & Door6==1 )
	||(xb>675 & xb<990 & yb>180 & yb<300 & Door6==0 )
	||(xb>640 & xb<740 & yb>345 & yb<365 & Door7==1 )//bethroom3
	||(xb>715 & xb<790 & yb>325 & yb<375  			)
	||(xb>775 & xb<950 & yb>325 & yb<355			)
	||(xb>675 & xb<990 & yb>440 & yb<675 			)//garage
	||(xb>465 & xb<500 & yb>50  & yb<80 			)//bethroom2
	||(xb>490 & xb<515 & yb>60  & yb<230  			)
	||(xb>490 & xb<530 & yb>200 & yb<230			)
	||(xb>490 & xb<520 & yb>210 & yb<285 & Door4==1	)
	||(xb>305 & xb<445 & yb>15  & yb<185 			)//little child
	||(xb>325 & xb<375 & yb>115 & yb<230 & Door3==1	)
	||(xb>400 & xb<415 & yb>80  & yb<285 & Door3==1	)
	||(xb>400 & xb<445 & yb>115 & yb<230 & Door3==1	)
	||(xb>400 & xb<445 & yb>115 & yb<230 & Door3==0	)
	||(xb>325 & xb<445 & yb>115 & yb<230 & Door3==0	)
	||(xb>215 & xb<245 & yb>50  & yb<65 			)//bethroom3
	||(xb>225 & xb<258 & yb>60  & yb<75				)
	||(xb>235 & xb<258 & yb>70  & yb<170 & Door1==0	
											 & Door2==0	)
	||(xb>215 & xb<275 & yb>160 & yb<225 & Door1==0		
											 & Door2==0	)
	||(xb>235 & xb<258 & yb>70 & yb<140  & Door1==1		
											 & Door2==0	)
	||(xb>250 & xb<258 & yb>135 & yb<225 & Door1==1		
											 & Door2==0	)
	||(xb>215 & xb<275 & yb>172 & yb<225 & Door1==1		
											 & Door2==0	)
	||(xb>250 & xb<275 & yb>155 & yb<225 & Door1==1		
											 & Door2==0	)
	||(xb>160 & xb<275 & yb>172 & yb<183 & Door1==1	)
	||(xb>235 & xb<258 & yb>70  & yb<185 & Door1==0		
											 & Door2==1	)
	||(xb>215 & xb<275 & yb>155 & yb<185 & Door1==0		
											 & Door2==1	)
	||(xb>240 & xb<275 & yb>165 & yb<225 & Door1==0		
											 & Door2==1	)
	||(xb>240 & xb<255 & yb>175 & yb<180 & Door1==0	)
	||(xb>235 & xb<258 & yb>70 & yb<140  & Door1==1		
											 & Door2==1	)
	||(xb>250 & xb<258 & yb>135 & yb<225 & Door1==1		
											 & Door2==1	)
	||(xb>160 & xb<275 & yb>172 & yb<185 & Door1==1		
											 & Door2==1	)
	||(xb>235 & xb<258 & yb>172 & yb<185 & Door1==1		
											 & Door2==1	)
	||(xb>240 & xb<275 & yb>165 & yb<225 & Door1==1		
											 & Door2==1	)
	||(xb>240 & xb<255 & yb>175 & yb<280 & Door2==1	)
	||(xb>250 & xb<275 & yb>155 & yb<225 & Door1==1		
											 & Door2==1	)
	||(xb>15  & xb<195 & yb>15 & yb<285			)//bedroom
	||(xb>15  & xb<195 & yb>425 & yb<622			)//kitchen
	||(xb>65  & xb<195 & yb>410 & yb<622			)
	||(xb>335 & xb<410 & yb>370 & yb<520 & Door10==0)//living
	||(xb>215 & xb<560 & yb>375 & yb<700 & Door10==0
										 & Door11==0
										 & Door9==0 )
	||(xb>215 & xb<530 & yb>487 & yb<530			)
	||(xb>215 & xb<305 & yb>487 & yb<560			)
	||(xb>430 & xb<530 & yb>487 & yb<560			)
	||(xb>335 & xb<410 & yb>180 & yb<530 & Door10==1)
	||(xb>160 & xb<305 & yb>487 & yb<560 & Door11==1)
	||(xb>430 & xb<585 & yb>487 & yb<560 & Door9==1 )										 
											 											
)
{
		if(dib==1)//down
		{
			g.setColor(big);
			g.fillRoundRect(xb,yb+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xb,yb,20,12);
			g.fillRect(xb+1,yb+5,3,13);
			g.fillRect(xb+16,yb+5,3,13);
			
			g.setColor(Color.black);
			g.drawOval(xb,yb,20,12);
			g.fillOval(xb+5,yb+2,4,4);
			g.fillOval(xb+10,yb+2,4,4);
			g.fillRect(xb+6,yb+8,8,2);
			g.fillRect(xb+2,yb+20,6,7);
			g.fillRect(xb+11,yb+20,6,7);	
		}
		if(dib==2)//up
		{
			g.setColor(big);
			g.fillRoundRect(xb,yb+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xb,yb,20,12);
			g.fillRect(xb+1,yb+5,3,13);
			g.fillRect(xb+16,yb+5,3,13);
			
			g.setColor(Color.black);
			g.drawOval(xb,yb,20,12);
			g.fillRect(xb+2,yb+20,6,7);
			g.fillRect(xb+11,yb+20,6,7);	
		}
		if(dib==3)//right
		{
			g.setColor(big);
			g.fillRoundRect(xb,yb+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xb+3,yb,15,12);
			g.fillRect(xb+8,yb+5,3,13);
		
			g.setColor(Color.black);
			g.drawOval(xb+3,yb,15,12);
			g.fillOval(xb+12,yb+2,4,4);
			g.fillRect(xb+2,yb+20,6,7);
			g.fillRect(xb+11,yb+20,6,7);	
		}
		if(dib==4)//left
		{
			g.setColor(big);
			g.fillRoundRect(xb,yb+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xb+3,yb,15,12);
			g.fillRect(xb+8,yb+5,3,13);
		
			g.setColor(Color.black);
			g.drawOval(xb+3,yb,15,12);
			g.fillOval(xb+5,yb+2,4,4);
			g.fillRect(xb+2,yb+20,6,7);
			g.fillRect(xb+11,yb+20,6,7);	
		}
		
		}
	else
	
	{
				if(dib==1)//down
		{
			g.setColor(big);
			g.drawRoundRect(xb,yb+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xb,yb,20,12);
			g.fillRect(xb+1,yb+5,3,13);
			g.fillRect(xb+16,yb+5,3,13);
			
			g.setColor(Color.red);
			g.drawOval(xb,yb,20,12);
			g.fillOval(xb+5,yb+2,4,4);
			g.fillOval(xb+10,yb+2,4,4);
			g.fillRect(xb+6,yb+8,8,2);
			g.fillRect(xb+2,yb+20,6,7);
			g.fillRect(xb+11,yb+20,6,7);	
		}
		if(dib==2)//up
		{
			g.setColor(big);
			g.drawRoundRect(xb,yb+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xb,yb,20,12);
			g.fillRect(xb+1,yb+5,3,13);
			g.fillRect(xb+16,yb+5,3,13);
			
			g.setColor(Color.red);
			g.drawOval(xb,yb,20,12);
			g.fillRect(xb+2,yb+20,6,7);
			g.fillRect(xb+11,yb+20,6,7);	
		}
		if(dib==3)//right
		{
			g.setColor(big);
			g.drawRoundRect(xb,yb+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xb+3,yb,15,12);
			g.fillRect(xb+8,yb+5,3,13);
		
			g.setColor(Color.red);
			g.drawOval(xb+3,yb,15,12);
			g.fillOval(xb+12,yb+2,4,4);
			g.fillRect(xb+2,yb+20,6,7);
			g.fillRect(xb+11,yb+20,6,7);	
		}
		if(dib==4)//left
		{
			g.setColor(big);
			g.drawRoundRect(xb,yb+5,20,17,10,10);
			g.setColor(skin);
			g.fillOval(xb+3,yb,15,12);
			g.fillRect(xb+8,yb+5,3,13);
		
			g.setColor(Color.red);
			g.drawOval(xb+3,yb,15,12);
			g.fillOval(xb+5,yb+2,4,4);
			g.fillRect(xb+2,yb+20,6,7);
			g.fillRect(xb+11,yb+20,6,7);	
		}

	}

////////////////////Robots//////////////////////////////////////////////////////
////////red Oval robot//////////

	
if(
	  (xr1>555 & xr1<645 & yr1>55  & yr1<610 & Door13==1)//hall (Door=1->open)
	||(xr1>587 & xr1<645 & yr1>605 & yr1<670 & Door13==1)
	||(xr1>587 & xr1<615 & yr1>605 & yr1<700 & Door13==1)
	||(xr1>555 & xr1<645 & yr1>55  & yr1<670 & Door13==0)
	||(xr1>245 & xr1<640 & yr1>250 & yr1<345 & Door12==1)
	||(xr1>160 & xr1<220 & yr1>270 & yr1<280 & Door12==1)
	||(xr1>215 & xr1<250 & yr1>250 & yr1<280 & Door12==1)
	||(xr1>215 & xr1<250 & yr1>305 & yr1<345 & Door12==1)
	||(xr1>215 & xr1<640 & yr1>250 & yr1<345 & Door12==0)
	||(xr1>675 & xr1<730 & yr1>65  & yr1<=80 & Door5==1 )//big child
	||(xr1>675 & xr1<730 & yr1>150 & yr1<155 & Door5==1 )
	||(xr1>720 & xr1<820 & yr1>65  & yr1<85  & Door5==1 )
	||(xr1>640 & xr1<730 & yr1>110 & yr1<125 & Door5==1 )
	||(xr1>675 & xr1<730 & yr1>115 & yr1<155 & Door5==1 )
	||(xr1>675 & xr1<820 & yr1>65  & yr1<155 & Door5==0 )
	||(xr1>715 & xr1<930 & yr1>70  & yr1<155  			)
	||(xr1>800 & xr1<850 & yr1>15  & yr1<100 			)
	||(xr1>915 & xr1<980 & yr1>70  & yr1<100			)
	||(xr1>675 & xr1<730 & yr1>180 & yr1<=200& Door6==1 )//office
	||(xr1>715 & xr1<980 & yr1>180 & yr1<295 & Door6==1 )
	||(xr1>640 & xr1<730 & yr1>230 & yr1<245 & Door6==1 )
	||(xr1>675 & xr1<730 & yr1>240 & yr1<295 & Door6==1 )
	||(xr1>675 & xr1<980 & yr1>180 & yr1<295 & Door6==0 )
	||(xr1>640 & xr1<730 & yr1>345 & yr1<360 & Door7==1 )//bethroom3
	||(xr1>715 & xr1<780 & yr1>325 & yr1<370  			)
	||(xr1>775 & xr1<940 & yr1>325 & yr1<355			)
	||(xr1>675 & xr1<730 & yr1>440 & yr1<670 			)//garage
	||(xr1>675 & xr1<975 & yr1>440 & yr1<490  			)
	||(xr1>920 & xr1<975 & yr1>440 & yr1<670			)
	||(xr1>640 & xr1<730 & yr1>485 & yr1<555 & Door8==1	)
	||(xr1>465 & xr1<495 & yr1>50  & yr1<80 			)//bethroom2
	||(xr1>490 & xr1<510 & yr1>60  & yr1<225  			)
	||(xr1>490 & xr1<525 & yr1>200 & yr1<225			)
	||(xr1>490 & xr1<515 & yr1>210 & yr1<280 & Door4==1	)
	||(xr1>355 & xr1<440 & yr1>15  & yr1<180 			)//little child
	||(xr1>325 & xr1<370 & yr1>115 & yr1<225 & Door3==1	)
	||(xr1>400 & xr1<410 & yr1>80  & yr1<280 & Door3==1	)
	||(xr1>400 & xr1<440 & yr1>115 & yr1<225 & Door3==1	)
	||(xr1>400 & xr1<440 & yr1>115 & yr1<225 & Door3==0	)
	||(xr1>325 & xr1<440 & yr1>115 & yr1<225 & Door3==0	)
	||(xr1>215 & xr1<245 & yr1>50  & yr1<65 			)//bethroom3
	||(xr1>225 & xr1<258 & yr1>60  & yr1<75				)
	||(xr1>235 & xr1<258 & yr1>70  & yr1<170 & Door1==0	
											 & Door2==0	)
	||(xr1>215 & xr1<275 & yr1>160 & yr1<225 & Door1==0		
											 & Door2==0	)
	||(xr1>235 & xr1<258 & yr1>70 & yr1<140  & Door1==1		
											 & Door2==0	)
	||(xr1>250 & xr1<258 & yr1>135 & yr1<225 & Door1==1		
											 & Door2==0	)
	||(xr1>215 & xr1<275 & yr1>172 & yr1<225 & Door1==1		
											 & Door2==0	)
	||(xr1>250 & xr1<275 & yr1>155 & yr1<225 & Door1==1		
											 & Door2==0	)
	||(xr1>160 & xr1<275 & yr1>172 & yr1<183 & Door1==1	)
	||(xr1>235 & xr1<258 & yr1>70  & yr1<185 & Door1==0		
											 & Door2==1	)
	||(xr1>215 & xr1<275 & yr1>155 & yr1<185 & Door1==0		
											 & Door2==1	)
	||(xr1>240 & xr1<275 & yr1>165 & yr1<225 & Door1==0		
											 & Door2==1	)
	||(xr1>240 & xr1<255 & yr1>175 & yr1<180 & Door1==0	)
	||(xr1>235 & xr1<258 & yr1>70 & yr1<140  & Door1==1		
											 & Door2==1	)
	||(xr1>250 & xr1<258 & yr1>135 & yr1<225 & Door1==1		
											 & Door2==1	)
	||(xr1>160 & xr1<275 & yr1>172 & yr1<185 & Door1==1		
											 & Door2==1	)
	||(xr1>235 & xr1<258 & yr1>172 & yr1<185 & Door1==1		
											 & Door2==1	)
	||(xr1>240 & xr1<275 & yr1>165 & yr1<225 & Door1==1		
											 & Door2==1	)
	||(xr1>240 & xr1<255 & yr1>175 & yr1<280 & Door2==1	)
	||(xr1>250 & xr1<275 & yr1>155 & yr1<225 & Door1==1		
											 & Door2==1	)
	||(xr1>15  & xr1<190 & yr1>100 & yr1<285			)//bedroom
	||(xr1>15  & xr1<190 & yr1>425 & yr1<617			)//kitchen
	||(xr1>65  & xr1<190 & yr1>410 & yr1<617			)
	||(xr1>335 & xr1<405 & yr1>370 & yr1<525 & Door10==0)//living
	||(xr1>215 & xr1<525 & yr1>487 & yr1<525			)
	||(xr1>215 & xr1<300 & yr1>487 & yr1<555			)
	||(xr1>430 & xr1<525 & yr1>487 & yr1<555			)
	||(xr1>335 & xr1<405 & yr1>180 & yr1<525 & Door10==1)
	||(xr1>160 & xr1<300 & yr1>487 & yr1<555 & Door11==1)
	||(xr1>430 & xr1<580 & yr1>487 & yr1<555 & Door9==1 )										 
											 											
											 


	)
{

	if(dir1==1)//down
	{
		g.setColor(Color.red);
		g.fillOval(xr1+3,yr1,25,30);
		g.setColor(Color.black);
		g.fillOval(xr1,yr1+3,7,10);
		g.fillOval(xr1,yr1+13,7,10);
		g.fillOval(xr1+25,yr1+3,7,10);
		g.fillOval(xr1+25,yr1+13,7,10);
		g.fillRect(xr1+10,yr1+20,12,4);
	}
	
	if(dir1==2)//up
	{
		g.setColor(Color.red);
		g.fillOval(xr1+3,yr1,25,30);
		g.setColor(Color.black);
		g.fillOval(xr1,yr1+3,7,10);
		g.fillOval(xr1,yr1+13,7,10);
		g.fillOval(xr1+25,yr1+3,7,10);
		g.fillOval(xr1+25,yr1+13,7,10);
		g.fillRect(xr1+10,yr1+5,12,4);
	}
	if(dir1==3)//right
	{
		g.setColor(Color.red);
		g.fillOval(xr1,yr1+3,30,25);
		g.setColor(Color.black);
		g.fillOval(xr1+3,yr1,10,7);
		g.fillOval(xr1+16,yr1,10,7);
		g.fillOval(xr1+3,yr1+25,10,7);
		g.fillOval(xr1+16,yr1+25,10,7);
		g.fillRect(xr1+23,yr1+10,4,12);
	}
	if(dir1==4)//left
	{
		g.setColor(Color.red);
		g.fillOval(xr1,yr1+3,30,25);
		g.setColor(Color.black);
		g.fillOval(xr1+3,yr1,10,7);
		g.fillOval(xr1+16,yr1,10,7);
		g.fillOval(xr1+3,yr1+25,10,7);
		g.fillOval(xr1+16,yr1+25,10,7);
		g.fillRect(xr1+5,yr1+10,4,12);
	}
	
	}
	else
	
	{
		if(dir1==1)//down
	{
		g.setColor(Color.red);
		g.drawOval(xr1+3,yr1,25,30);
		g.setColor(Color.black);
		g.drawOval(xr1,yr1+3,7,10);
		g.drawOval(xr1,yr1+13,7,10);
		g.drawOval(xr1+25,yr1+3,7,10);
		g.drawOval(xr1+25,yr1+13,7,10);
		g.fillRect(xr1+10,yr1+20,12,4);
	}
	
	if(dir1==2)//up
	{
		g.setColor(Color.red);
		g.drawOval(xr1+3,yr1,25,30);
		g.setColor(Color.black);
		g.drawOval(xr1,yr1+3,7,10);
		g.drawOval(xr1,yr1+13,7,10);
		g.drawOval(xr1+25,yr1+3,7,10);
		g.drawOval(xr1+25,yr1+13,7,10);
		g.fillRect(xr1+10,yr1+5,12,4);
	}
	if(dir1==3)//right
	{
		g.setColor(Color.red);
		g.drawOval(xr1,yr1+3,30,25);
		g.setColor(Color.black);
		g.drawOval(xr1+3,yr1,10,7);
		g.drawOval(xr1+16,yr1,10,7);
		g.drawOval(xr1+3,yr1+25,10,7);
		g.drawOval(xr1+16,yr1+25,10,7);
		g.fillRect(xr1+23,yr1+10,4,12);
	}
	if(dir1==4)//left
	{
		g.setColor(Color.red);
		g.drawOval(xr1,yr1+3,30,25);
		g.setColor(Color.black);
		g.drawOval(xr1+3,yr1,10,7);
		g.drawOval(xr1+16,yr1,10,7);
		g.drawOval(xr1+3,yr1+25,10,7);
		g.drawOval(xr1+16,yr1+25,10,7);
		g.fillRect(xr1+5,yr1+10,4,12);
	}
	
			/*g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.drawString("Illigal Position",xr1+7,yr1-8);*/
	
		
	}
		/////////blue robot
if(
	  (xr2>555 & xr2<655 & yr2>55  & yr2<610 & Door13==1)//hall (Door=1->open)
	||(xr2>587 & xr2<655 & yr2>605 & yr2<680 & Door13==1)
	||(xr2>587 & xr2<625 & yr2>605 & yr2<700 & Door13==1)
	||(xr2>555 & xr2<655 & yr2>55  & yr2<680 & Door13==0)
	||(xr2>245 & xr2<640 & yr2>250 & yr2<345 & Door12==1)
	||(xr2>160 & xr2<220 & yr2>270 & yr2<285 & Door12==1)
	||(xr2>215 & xr2<250 & yr2>250 & yr2<285 & Door12==1)
	||(xr2>215 & xr2<250 & yr2>305 & yr2<345 & Door12==1)
	||(xr2>215 & xr2<640 & yr2>250 & yr2<345 & Door12==0)
	||(xr2>680 & xr2<720 & yr2>=65 & yr2<=80 & Door5==1 )//big child
	||(xr2>680 & xr2<720 & yr2>150 & yr2<155 & Door5==1 )
	||(xr2>720 & xr2<840 & yr2>65  & yr2<85  & Door5==1 )
	||(xr2>650 & xr2<730 & yr2>110 & yr2<125 & Door5==1 )
	||(xr2>680 & xr2<730 & yr2>115 & yr2<155 & Door5==1 )
	||(xr2>680 & xr2<820 & yr2>65  & yr2<155 & Door5==0 )
	||(xr2>715 & xr2<935 & yr2>70  & yr2<155  			)
	||(xr2>800 & xr2<855 & yr2>15  & yr2<100 			)
	||(xr2>930 & xr2<985 & yr2>70  & yr2<100			)
	||(xr2>675 & xr2<730 & yr2>180 & yr2<=200& Door6==1 )//office
	||(xr2>715 & xr2<980 & yr2>180 & yr2<295 & Door6==1 )
	||(xr2>640 & xr2<730 & yr2>230 & yr2<245 & Door6==1 )
	||(xr2>675 & xr2<730 & yr2>240 & yr2<295 & Door6==1 )
	||(xr2>675 & xr2<980 & yr2>180 & yr2<295 & Door6==0 )
	||(xr2>640 & xr2<730 & yr2>345 & yr2<365 & Door7==1 )//bethroom
	||(xr2>715 & xr2<780 & yr2>325 & yr2<370  			)
	||(xr2>775 & xr2<945 & yr2>325 & yr2<355			)
	||(xr2>675 & xr2<735 & yr2>440 & yr2<680 			)//garage
	||(xr2>675 & xr2<980 & yr2>440 & yr2<495  			)
	||(xr2>920 & xr2<980 & yr2>440 & yr2<680			)
	||(xr2>640 & xr2<735 & yr2>485 & yr2<560 & Door8==1	)
	||(xr2>465 & xr2<500 & yr2>50  & yr2<80 			)//bethroom2
	||(xr2>490 & xr2<515 & yr2>60  & yr2<225  			)
	||(xr2>490 & xr2<530 & yr2>200 & yr2<225			)
	||(xr2>490 & xr2<520 & yr2>210 & yr2<280 & Door4==1	)
	||(xr2>355 & xr2<445 & yr2>15  & yr2<185 			)//little child
	||(xr2>325 & xr2<375 & yr2>115 & yr2<225 & Door3==1	)
	||(xr2>400 & xr2<415 & yr2>80  & yr2<280 & Door3==1	)
	||(xr2>400 & xr2<445 & yr2>115 & yr2<225 & Door3==1	)
	||(xr2>400 & xr2<445 & yr2>115 & yr2<225 & Door3==0	)
	||(xr2>325 & xr2<445 & yr2>115 & yr2<225 & Door3==0	)
	||(xr2>215 & xr1<260 & yr2>45  & yr2<65 			)//bethroom3
	||(xr2>225 & xr2<263 & yr2>60  & yr2<75				)
	||(xr2>235 & xr2<263 & yr2>70  & yr2<170 & Door1==0	
											 & Door2==0	)
	||(xr2>215 & xr2<280 & yr2>160 & yr2<225 & Door1==0		
											 & Door2==0	)
	||(xr2>235 & xr2<263 & yr2>70  & yr2<140 & Door1==1		
											 & Door2==0	)
	||(xr2>250 & xr2<263 & yr2>135 & yr2<225 & Door1==1		
											 & Door2==0	)
	||(xr2>215 & xr2<280 & yr2>172 & yr2<225 & Door1==1		
											 & Door2==0	)
	||(xr2>250 & xr2<280 & yr2>155 & yr2<225 & Door1==1		
											 & Door2==0	)
	||(xr2>160 & xr2<280 & yr2>172 & yr2<183 & Door1==1	)
	||(xr2>235 & xr2<263 & yr2>70  & yr2<185 & Door1==0		
											 & Door2==1	)
	||(xr2>215 & xr2<280 & yr2>155 & yr2<185 & Door1==0		
											 & Door2==1	)
	||(xr2>240 & xr2<280 & yr2>165 & yr2<225 & Door1==0		
											 & Door2==1	)
	||(xr2>240 & xr2<260 & yr2>175 & yr2<180 & Door1==0	)
	||(xr2>235 & xr2<263 & yr2>70  & yr2<140 & Door2==1		
											 & Door2==1	)
	||(xr2>250 & xr2<263 & yr2>135 & yr2<225 & Door1==1		
											 & Door2==1	)
	||(xr2>160 & xr2<280 & yr2>172 & yr2<185 & Door1==1		
											 & Door2==1	)
	||(xr2>235 & xr2<263 & yr2>172 & yr2<185 & Door1==1		
											 & Door2==1	)
	||(xr2>240 & xr2<280 & yr2>165 & yr2<225 & Door1==1		
											 & Door2==1	)
	||(xr2>240 & xr2<260 & yr2>175 & yr2<280 & Door2==1	)
	||(xr2>250 & xr2<280 & yr2>155 & yr2<225 & Door1==1		
											 & Door2==1	)
	||(xr2>15  & xr2<195 & yr2>100 & yr2<285			)//bedroom
	||(xr2>15  & xr2<195 & yr2>425 & yr2<617			)//kitchen
	||(xr2>65  & xr2<195 & yr2>410 & yr2<617			)
	||(xr2>335 & xr2<410 & yr2>370 & yr2<525 & Door10==0)//living
	||(xr2>215 & xr2<530 & yr2>487 & yr2<525			)
	||(xr2>215 & xr2<305 & yr2>487 & yr2<555			)
	||(xr2>430 & xr2<530 & yr2>487 & yr2<555			)
	||(xr2>335 & xr2<410 & yr2>180 & yr2<525 & Door10==1)
	||(xr2>160 & xr2<305 & yr2>487 & yr2<555 & Door11==1)
	||(xr2>430 & xr2<585 & yr2>487 & yr2<555 & Door9==1 )		
	)
{


	if(dir2==1)//down
	{
		
		g.setColor(Color.blue);
		g.fillOval(xr2,yr2,25,25);
		g.setColor(Color.black);
		g.fillOval(xr2-2,yr2+2,7,10);
		g.fillOval(xr2-2,yr2+13,7,10);
		g.fillOval(xr2+20,yr2+3,7,10);
		g.fillOval(xr2+20,yr2+13,7,10);
		g.setColor(Color.white);
		g.fillRect(xr2+7,yr2+18,12,4);
	}

	if(dir2==2)//up
	{
		
		g.setColor(Color.blue);
		g.fillOval(xr2,yr2,25,25);
		g.setColor(Color.black);
		g.fillOval(xr2-2,yr2+2,7,10);
		g.fillOval(xr2-2,yr2+13,7,10);
		g.fillOval(xr2+20,yr2+3,7,10);
		g.fillOval(xr2+20,yr2+13,7,10);
		g.setColor(Color.white);
		g.fillRect(xr2+7,yr2+3,12,4);
	}
	if(dir2==3) //right
	{
		g.setColor(Color.blue);
		g.fillOval(xr2,yr2,25,25);
		g.setColor(Color.black);
		g.fillOval(xr2+2,yr2-2,10,7);
		g.fillOval(xr2+13,yr2-2,10,7);
		g.fillOval(xr2+3,yr2+20,10,7);
		g.fillOval(xr2+13,yr2+20,10,7);
		g.setColor(Color.white);
		g.fillRect(xr2+18,yr2+7,4,12);
	
	}
	
	if(dir2==4)//left
	{
			g.setColor(Color.blue);
		g.fillOval(xr2,yr2,25,25);
		g.setColor(Color.black);
		g.fillOval(xr2+2,yr2-2,10,7);
		g.fillOval(xr2+13,yr2-2,10,7);
		g.fillOval(xr2+3,yr2+20,10,7);
		g.fillOval(xr2+13,yr2+20,10,7);
		g.setColor(Color.white);
		g.fillRect(xr2+3,yr2+7,4,12);
		
	}
	}
	else
	{
		if(dir2==1)//down
	{
		
		g.setColor(Color.blue);
		g.drawOval(xr2,yr2,25,25);
		g.setColor(Color.black);
		g.drawOval(xr2-2,yr2+2,7,10);
		g.drawOval(xr2-2,yr2+13,7,10);
		g.drawOval(xr2+20,yr2+3,7,10);
		g.drawOval(xr2+20,yr2+13,7,10);
		g.setColor(Color.white);
		g.fillRect(xr2+7,yr2+18,12,4);
	}

	if(dir2==2)//up
	{
		
		g.setColor(Color.blue);
		g.drawOval(xr2,yr2,25,25);
		g.setColor(Color.black);
		g.drawOval(xr2-2,yr2+2,7,10);
		g.drawOval(xr2-2,yr2+13,7,10);
		g.drawOval(xr2+20,yr2+3,7,10);
		g.drawOval(xr2+20,yr2+13,7,10);
		g.setColor(Color.white);
		g.fillRect(xr2+7,yr2+3,12,4);
	}
	if(dir2==3) //right
	{
		g.setColor(Color.blue);
		g.drawOval(xr2,yr2,25,25);
		g.setColor(Color.black);
		g.drawOval(xr2+2,yr2-2,10,7);
		g.drawOval(xr2+13,yr2-2,10,7);
		g.drawOval(xr2+3,yr2+20,10,7);
		g.drawOval(xr2+13,yr2+20,10,7);
		g.setColor(Color.white);
		g.fillRect(xr2+18,yr2+7,4,12);
	
	}
	
	if(dir2==4)//left
	{
			g.setColor(Color.blue);
		g.drawOval(xr2,yr2,25,25);
		g.setColor(Color.black);
		g.drawOval(xr2+2,yr2-2,10,7);
		g.drawOval(xr2+13,yr2-2,10,7);
		g.drawOval(xr2+3,yr2+20,10,7);
		g.drawOval(xr2+13,yr2+20,10,7);
		g.setColor(Color.white);
		g.fillRect(xr2+3,yr2+7,4,12);
		
	}
	
			/*g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.drawString("Illigal Position",xr2+7,yr2-8);*/
	}
	
	
	//////////toy robor//////////
	if(
	  (xr3>555 & xr3<655 & yr3>55  & yr3<610 & Door13==1)//hall (Door=1->open)
	||(xr3>587 & xr3<655 & yr3>605 & yr3<675 & Door13==1)
	||(xr3>587 & xr3<625 & yr3>605 & yr3<700 & Door13==1)
	||(xr3>555 & xr3<655 & yr3>55  & yr3<675 & Door13==0)
	||(xr3>245 & xr3<640 & yr3>250 & yr3<345 & Door12==1)
	||(xr3>160 & xr3<220 & yr3>270 & yr3<285 & Door12==1)
	||(xr3>215 & xr3<250 & yr3>250 & yr3<285 & Door12==1)
	||(xr3>215 & xr3<250 & yr3>305 & yr3<345 & Door12==1)
	||(xr3>215 & xr3<640 & yr3>250 & yr3<345 & Door12==0)
	||(xr3>680 & xr3<720 & yr3>=60 & yr3<=80 & Door5==1 )//big child
	||(xr3>670 & xr3<720 & yr3>150 & yr3<155 & Door5==1 )
	||(xr3>720 & xr3<840 & yr3>60  & yr3<85  & Door5==1 )
	||(xr3>650 & xr3<730 & yr3>110 & yr3<120 & Door5==1 )
	||(xr3>670 & xr3<730 & yr3>115 & yr3<155 & Door5==1 )
	||(xr3>675 & xr3<820 & yr3>60  & yr3<155 & Door5==0 )
	||(xr3>715 & xr3<935 & yr3>70  & yr3<155  			)
	||(xr3>800 & xr3<860 & yr3>15  & yr3<100 			)
	||(xr3>930 & xr3<990 & yr3>70  & yr3<100			)
	||(xr3>675 & xr3<730 & yr3>180 & yr3<=200& Door6==1 )//office
	||(xr3>715 & xr3<985 & yr3>180 & yr3<295 & Door6==1 )
	||(xr3>640 & xr3<730 & yr3>230 & yr3<245 & Door6==1 )
	||(xr3>675 & xr3<730 & yr3>240 & yr3<295 & Door6==1 )
	||(xr3>675 & xr3<985 & yr3>180 & yr3<295 & Door6==0 )
	||(xr3>640 & xr2<730 & yr3>340 & yr3<360 & Door7==1 )//bethroom
	||(xr3>715 & xr3<780 & yr3>320 & yr3<370  			)
	||(xr3>775 & xr3<948 & yr3>325 & yr3<350			)
	||(xr3>675 & xr3<740 & yr3>440 & yr3<675 			)//garage
	||(xr3>675 & xr3<985 & yr3>440 & yr3<495  			)
	||(xr3>920 & xr3<985 & yr3>440 & yr3<675			)
	||(xr3>640 & xr3<740 & yr3>485 & yr3<555 & Door8==1	)
	||(xr3>465 & xr3<505 & yr3>50  & yr3<80 			)//bethroom2
	||(xr3>490 & xr3<520 & yr3>60  & yr3<225  			)
	||(xr3>490 & xr3<535 & yr3>200 & yr3<225			)
	||(xr3>490 & xr3<525 & yr3>210 & yr3<280 & Door4==1	)
	||(xr3>355 & xr3<450 & yr3>15  & yr3<180 			)//little child
	||(xr3>325 & xr3<380 & yr3>115 & yr3<225 & Door3==1	)
	||(xr3>400 & xr3<420 & yr3>80  & yr3<280 & Door3==1	)
	||(xr3>400 & xr3<450 & yr3>115 & yr3<225 & Door3==1	)
	||(xr3>400 & xr3<450 & yr3>115 & yr3<225 & Door3==0	)
	||(xr3>325 & xr3<450 & yr3>115 & yr3<225 & Door3==0	)
	||(xr3>215 & xr3<255 & yr3>50  & yr3<65 			)//bethroom3
	||(xr3>225 & xr3<268 & yr3>60  & yr3<75				)
	||(xr3>235 & xr3<268 & yr3>70  & yr3<170 & Door1==0	
											 & Door2==0	)
	||(xr3>215 & xr3<285 & yr3>160 & yr3<225 & Door1==0		
											 & Door2==0	)
	||(xr3>235 & xr3<268 & yr3>70 & yr3<140  & Door1==1		
											 & Door2==0	)
	||(xr3>250 & xr3<268 & yr3>135 & yr3<225 & Door1==1		
											 & Door2==0	)
	||(xr3>215 & xr3<285 & yr3>172 & yr3<225 & Door1==1		
											 & Door2==0	)
	||(xr3>250 & xr3<285 & yr3>155 & yr3<225 & Door1==1		
											 & Door2==0	)
	||(xr3>160 & xr3<285 & yr3>172 & yr3<183 & Door1==1	)
	||(xr3>235 & xr3<268 & yr3>70  & yr3<185 & Door1==0		
											 & Door2==1	)
	||(xr3>215 & xr3<285 & yr3>155 & yr3<185 & Door1==0		
											 & Door2==1	)
	||(xr3>240 & xr3<285 & yr3>165 & yr3<225 & Door1==0		
											 & Door2==1	)
	||(xr3>240 & xr3<265 & yr3>175 & yr3<180 & Door1==0	)
	||(xr3>235 & xr3<268 & yr3>70 & yr3<140  & Door1==1		
											 & Door2==1	)
	||(xr3>250 & xr3<268 & yr3>135 & yr3<225 & Door1==1		
											 & Door2==1	)
	||(xr3>160 & xr3<285 & yr3>172 & yr3<185 & Door1==1		
											 & Door2==1	)
	||(xr3>235 & xr3<268 & yr3>172 & yr3<185 & Door1==1		
											 & Door2==1	)
	||(xr3>240 & xr3<285 & yr3>165 & yr3<225 & Door1==1		
											 & Door2==1	)
	||(xr3>240 & xr3<265 & yr3>175 & yr3<280 & Door2==1	)
	||(xr3>250 & xr3<285 & yr3>155 & yr3<225 & Door1==1		
											 & Door2==1	)
	||(xr3>15  & xr3<200 & yr3>100 & yr3<285			)//bedroom
	||(xr3>15  & xr3<200 & yr3>425 & yr3<617			)//kitchen
	||(xr3>65  & xr3<200 & yr3>410 & yr3<617			)
	||(xr3>335 & xr3<415 & yr3>370 & yr3<525 & Door10==0)//living
	||(xr3>215 & xr3<535 & yr3>487 & yr3<525			)
	||(xr3>215 & xr3<310 & yr3>487 & yr3<555			)
	||(xr3>430 & xr3<535 & yr3>487 & yr3<555			)
	||(xr3>335 & xr3<415 & yr3>180 & yr3<525 & Door10==1)
	||(xr3>160 & xr3<310 & yr3>487 & yr3<555 & Door11==1)
	||(xr3>430 & xr3<590 & yr3>487 & yr3<555 & Door9==1 )	
	)
	{
	


	if(dir3==1)//down
	{
	
		g.setColor(Color.black);
		g.fillOval(xr3,yr3+20,10,10);
		g.fillOval(xr3+10,yr3+20,10,10);
		g.setColor(toyRobot);
		g.fillRoundRect(xr3,yr3+8,20,17,5,5);
		g.setColor(Color.white);
		g.fillRect(xr3+8,yr3+10,4,12);
		g.setColor(Color.green);
		g.fillOval(xr3,yr3,20,10);
		g.setColor(Color.black);
		g.fillOval(xr3+5,yr3+2,4,4);
		g.fillOval(xr3+10,yr3+2,4,4);
	}
	if(dir3==2) //up
	{
	
		g.setColor(Color.black);
		g.fillOval(xr3,yr3+20,10,10);
		g.fillOval(xr3+10,yr3+20,10,10);
		g.setColor(toyRobot);
		g.fillRoundRect(xr3,yr3+8,20,17,5,5);
		g.setColor(Color.green);
		g.fillOval(xr3,yr3,20,10);
	
	}	
	if(dir3==3)//right
	{
	
		g.setColor(Color.black);
		g.fillOval(xr3,yr3+20,10,10);
		g.fillOval(xr3+10,yr3+20,10,10);
		g.setColor(toyRobot);
		g.fillRoundRect(xr3,yr3+8,20,17,5,5);
		g.setColor(Color.white);
		g.fillRect(xr3+15,yr3+10,4,12);
		g.setColor(Color.green);
		g.fillOval(xr3+5,yr3,10,10);
	
	}
	
	if(dir3==4) //left
	{
	
		g.setColor(Color.black);
		g.fillOval(xr3,yr3+20,10,10);
		g.fillOval(xr3+10,yr3+20,10,10);
		g.setColor(toyRobot);
		g.fillRoundRect(xr3,yr3+8,20,17,5,5);
		g.setColor(Color.white);
		g.fillRect(xr3+1,yr3+10,4,12);
		g.setColor(Color.green);
		g.fillOval(xr3+5,yr3,10,10);
	
	}		
	}
	
	else
	{
		if(dir3==1)//down
	{
	
		g.setColor(Color.black);
		g.drawOval(xr3,yr3+20,10,10);
		g.drawOval(xr3+10,yr3+20,10,10);
		g.setColor(toyRobot);
		g.drawRoundRect(xr3,yr3+8,20,17,5,5);
		g.setColor(Color.white);
		g.fillRect(xr3+8,yr3+10,4,12);
		g.setColor(Color.green);
		g.drawOval(xr3,yr3,20,10);
		g.setColor(Color.black);
		g.drawOval(xr3+5,yr3+2,4,4);
		g.drawOval(xr3+10,yr3+2,4,4);
	}
	if(dir3==2) //up
	{
	
		g.setColor(Color.black);
		g.drawOval(xr3,yr3+20,10,10);
		g.drawOval(xr3+10,yr3+20,10,10);
		g.setColor(toyRobot);
		g.drawRoundRect(xr3,yr3+8,20,17,5,5);
		g.setColor(Color.green);
		g.drawOval(xr3,yr3,20,10);
	
	}	
	if(dir3==3)//right
	{
	
		g.setColor(Color.black);
		g.drawOval(xr3,yr3+20,10,10);
		g.drawOval(xr3+10,yr3+20,10,10);
		g.setColor(toyRobot);
		g.drawRoundRect(xr3,yr3+8,20,17,5,5);
		g.setColor(Color.white);
		g.fillRect(xr3+15,yr3+10,4,12);
		g.setColor(Color.green);
		g.drawOval(xr3+5,yr3,10,10);
	
	}
	
	if(dir3==4) //left
	{
	
		g.setColor(Color.black);
		g.drawOval(xr3,yr3+20,10,10);
		g.drawOval(xr3+10,yr3+20,10,10);
		g.setColor(toyRobot);
		g.drawRoundRect(xr3,yr3+8,20,17,5,5);
		g.setColor(Color.white);
		g.fillRect(xr3+1,yr3+10,4,12);
		g.setColor(Color.green);
		g.drawOval(xr3+5,yr3,10,10);
	
	}
	
		/*	g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.drawString("Illigal Position",xr3+7,yr3-8);*/		
	}
///////////////////bedroom table////////////////////////////////////////////////
////////////////////////M1//////////////////////////////////////////////////////
		g.setColor(maro1);
		if(x1>=70 & x1<=180 & y1>=105 & y1<=255)
		{
			
			
				g.fillRect(x1,y1,30,60); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x1-25,y1-20);
				g.drawString("for Table", x1-25,y1-5);
				g.drawRect(x1,y1,30,60);*/
			}
///////////////////Little Child  table////////////////////////////////////////////////
////////////////////////M4//////////////////////////////////////////////////////

		g.setColor(maro1);
		if((x4>=420 & x4<=435 & y4>=17 & y4<=75)
		||(x4>=360 & x4<=435 & y4>=60 & y4<=120)
		||(x4>=330 & x4<=435 & y4>=120 & y4<=180)
		||(x4>=330 & x4<=370 & y4>=180 & y4<=190))
		{
			
			
				g.fillRect(x4,y4,30,60); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x4-25,y4-20);
				g.drawString("for Table", x4-25,y4-5);
				g.drawRect(x4,y4,30,60);*/
			}
///////////////////Big Child  table////////////////////////////////////////////////
////////////////////////M6//////////////////////////////////////////////////////

		g.setColor(maro1);
		if((x6>=720 & x6<=880 & y6>=65 & y6<=140))
		{
			
			
				g.fillRect(x6,y6,70,40); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x6-25,y6-20);
				g.drawString("for Chair", x6-25,y6-5);
				g.drawRect(x6,y6,70,40);*/
			}
///////////////////Office Table/////////////////////////////////////////////////
////////////////////////M8//////////////////////////////////////////////////////

		g.setColor(office);
		if((x8>=720 & x8<=895 & y8>=185 & y8<=240))
		{
			
			
				g.fillRect(x8,y8,50,80); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x8-25,y8-20);
				g.drawString("for Chair", x8-25,y8-5);
				g.drawRect(x8,y8,50,80);*/
			}
	
///////////////////Kitchen Table/////////////////////////////////////////////////
////////////////////////M9//////////////////////////////////////////////////////

		g.setColor(maro1);
		if(x9>=75 & x9<=155 & y9>=415 & y9<=555)
		{
			
			
				g.fillRect(x9,y9,60,90); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x9-25,y9-20);
				g.drawString("for Table", x9-25,y9-5);
				g.drawRect(x9,y9,60,90);*/
			}
			



///////////////////Living Table/////////////////////////////////////////////////
////////////////////////M10//////////////////////////////////////////////////////

		g.setColor(living_table);
		if((x10>=270 & x10<=350 & y10>=420 & y10<=610)
		||(x10>=220 & x10<=405 & y10>=590 & y10<=610))
		{
			
			
				g.fillRoundRect(x10,y10,150,90,50,50); 
			
			}
			else
			{	
				/*g.setColor(Color.red);
				g.setFont(new Font("Arial", Font.BOLD , 16));
				g.drawString("Illegal Position", x10-25,y10-20);
				g.drawString("for Table", x10-25,y10-5);
				g.drawRoundRect(x10,y10,150,90,50,50);*/
			}
			
//////////////////package///////////////////////////////////////////////////////
			g.setColor(pack);
			g.fillRect(xpack,ypack,15,15);			
		
			
/////////////////////Main system////////////////////////////////////////////////
			g.setColor(Color.white);
			g.fillRect(x8+15,y8+5,30,30);
			g.fillRect(x8+2,y8+7,10,25);
			
			g.setColor(CRT);
			g.fillRect(x8+20,y8+10,25,20);
			g.setColor(Color.black);
			g.drawString("S",x8+25,y8+27);
			g.drawRect(x8+20,y8+10,25,20);
			g.drawRect(x8+2,y8+7,3,24);
			g.drawRect(x8+5,y8+7,3,24);
			g.drawRect(x8+8,y8+7,3,24);
			g.drawRect(x8+2,y8+7,9,3);
			g.drawRect(x8+2,y8+10,9,3);
			g.drawRect(x8+2,y8+13,9,3);
			g.drawRect(x8+2,y8+16,9,3);
			g.drawRect(x8+2,y8+19,9,3);
			g.drawRect(x8+2,y8+22,9,3);
			g.drawRect(x8+2,y8+25,9,3);
			g.drawRect(x8+2,y8+28,9,3);
			g.setColor(Color.cyan);
			g.fillRect(x8+20,y8+12,2,18);
			
		}


		}	