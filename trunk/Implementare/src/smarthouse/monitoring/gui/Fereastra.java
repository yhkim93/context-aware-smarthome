package smarthouse.monitoring.gui;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;

import javax.swing.*;





public class Fereastra extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BasePaint basePaint;
	
	private Container mainContainer;

	private String fileName;
	
	public int x,y, px,py, xm, ym;
	
	public int m1,m3;
	
		  public int nu=1;
	public int dir1=1,
			   dir2=1,
	           dir3=1;
	
	public int sel1, sel2,
			   sel3, sel4,
			   sel5, sel6,
			   sel7, sel8,
			   sel9, sel10,
			   sel11, sel12,
			   sel13, sel14,
			   sel15, sel16,
			   sel17, sel18,
			   sel19, sel20,
			   sel21, sel22,
			   sel23, sel24,
			   sel25, sel26,
			   sel27, sel28,
			   sel29, sel30;
	
	public int  Door1,Door2, 
				Door3, Door4,
				Door5, Door6,
				Door7, Door8,
				Door9, Door10,
				Door11, Door12,
				Door13, Door14; 
				
				
	public int  D1=0,D2=0, 
				D3=0, D4=0,
				D5=0, D6=0,
				D7=0, D8=0,
				D9=0, D10=0,
				D11=0, D12=0,
				D13=0, D14=0; 
				
				
	public int  W1,W2,W3,W4,
				W5,W6,W7,W8,
				W9,W10,W11,W12;	
				
				
	public int  Win1=0,Win2=0,Win3=0,Win4=0,
				Win5=0,Win6=0,Win7=0,Win8=0,
				Win9=0,Win10=0,Win11=0,Win12=0;	
				
	
				
	public int  X1=180,X2=155,
				X3=420,X4=435,
				X5=820,X6=800,
				X7=845,X8=870,
				X9=90,X10=305,
				X11=220,X12=500,
				X13=330,X14=365,
				X15=400,X16=455,
				X17=330,X18=365,
				X19=400,X20=280;
				
	public int  Y1=110,Y2=125,
				Y3=35,Y4=20,
				Y5=120,Y6=140,
				Y7=245,Y8=215,
				Y9=490,Y10=580,
				Y11=380,Y12=390,
				Y13=555,Y14=555,
				Y15=555,Y16=610,
				Y17=670,Y18=670,
				Y19=670,Y20=610;
	
				
				
	public int Xr1=560, 
			   Xr2=600,
			   Xr3=640;
			   
	public int Yr1=60,
			   Yr2=60,
			   Yr3=60;
			   
  
	public int DIR1=1,
			   DIR2=1,
	           DIR3=1;
	           
	public int Xpack=315,
			   Ypack=160;
			   
				   
	//human position
	public int Xm=455,
			   Xw=280,
			   Xl=335,
			   Xb=330;
			   
	public int Ym=610,
			   Yw=610,
			   Yl=555,
			   Yb=670;
			   
	public int DIM=4,
			   DIW=3,
			   DIL=1,
			   DIB=2;

	public int E;
	BasePaint desen = new BasePaint();
	
	

	
	
	JMenuBar mainBar;
	
	JMenu fileMenu, editMenu,setDoorsMenu,setWinMenu,ChangeObjectMenu,CarMenu;
	
	JMenuItem 
	exitMenuItem,
	//Door
	
	mainDoorMenuItem, 
	mainDoorCloseMenuItem,
	mainDoorOpenMenuItem,
	
	garageDoorMenuItem,	
	garageDoorOpenMenuItem,	
	garageDoorCloseMenuItem,
	
	garageHallDoorMenuItem,	
	garageHallDoorOpenMenuItem,
	garageHallDoorCloseMenuItem,
	
	bedroomBathroomDoorMenuItem,
	bedroomBathroomDoorOpenMenuItem,
	bedroomBathroomDoorCloseMenuItem,
	
	bathroom1DoorMenuItem,
	bathroom1DoorOpenMenuItem,
	bathroom1DoorCloseMenuItem,
	
	littleChildDoorMenuItem,
	littleChildDoorOpenMenuItem,
	littleChildDoorCloseMenuItem,
	
	bathroom2DoorMenuItem,
	bathroom2DoorOpenMenuItem,
	bathroom2DoorCloseMenuItem,
	
	bigChildDoorMenuItem,
	bigChildDoorOpenMenuItem,
	bigChildDoorCloseMenuItem,
	
	officeDoorMenuItem,
	officeDoorOpenMenuItem,
	officeDoorCloseMenuItem,
	
	bathroom3DoorMenuItem,
	bathroom3DoorOpenMenuItem,
	bathroom3DoorCloseMenuItem,
	
	livingGarageDoorMenuItem,
	livingGarageDoorOpenMenuItem,
	livingGarageDoorCloseMenuItem,
	
	livingChildDoorMenuItem,
	livingChildDoorOpenMenuItem,
	livingChildDoorCloseMenuItem,
	
	livingKitchenDoorMenuItem,
	livingKitchenDoorOpenMenuItem,
	livingKitchenDoorCloseMenuItem,
	
	bedroomDoorMenuItem,
	bedroomDoorOpenMenuItem,
	bedroomDoorCloseMenuItem,
	
	
	
	
	//Windows
	bathroom1WinMenuItem,
	bathroom1WinOpenMenuItem,
	bathroom1WinCloseMenuItem,
	
	bigChildWinMenuItem,
	bigChildWinOpenMenuItem,
	bigChildWinCloseMenuItem,
	
	bathroom2WinMenuItem,
	bathroom2WinOpenMenuItem,
	bathroom2WinCloseMenuItem,
		
	hallWinMenuItem, 
	hallWinCloseMenuItem,
	hallWinOpenMenuItem,
	
	littleChildWinMenuItem,
	littleChildWinOpenMenuItem,
	littleChildWinCloseMenuItem,
	
	bigChildBackWinMenuItem,
	bigChildBackWinOpenMenuItem,
	bigChildBackWinCloseMenuItem,
	
	officeWinMenuItem,
	officeWinOpenMenuItem,
	officeWinCloseMenuItem,
	
	bathroom3WinMenuItem,
	bathroom3WinOpenMenuItem,
	bathroom3WinCloseMenuItem,	
	
	garageWinMenuItem,
	garageWinOpenMenuItem,
	garageWinCloseMenuItem,
	
	livingWinMenuItem,
	livingWinOpenMenuItem,
	livingWinCloseMenuItem,
	
	kitchenWinMenuItem,
	kitchenWinOpenMenuItem,
	kitchenWinCloseMenuItem,
	
	bedroomWinMenuItem,
	bedroomWinOpenMenuItem,
	bedroomWinCloseMenuItem,
	
	bigChildRightWinMenuItem,
	bigChildRightWinOpenMenuItem,
	bigChildRightWinCloseMenuItem,
	
	
	
	/////Chair/////	
	bedroomChairMenuItem,
	bedroomChairUpMenuItem,
	bedroomChairDownMenuItem,
	bedroomChairRightMenuItem,
	bedroomChairLeftMenuItem,

	
	littleChairMenuItem,
	littleChairUpMenuItem,
	littleChairDownMenuItem,
	littleChairRightMenuItem,
	littleChairLeftMenuItem,

	
	bigChairMenuItem,
	bigChairUpMenuItem,
	bigChairDownMenuItem,
	bigChairRightMenuItem,
	bigChairLeftMenuItem,

	
	officeChairMenuItem,
	officeChairUpMenuItem,
	officeChairDownMenuItem,
	officeChairRightMenuItem,
	officeChairLeftMenuItem,

	
	living1ChairMenuItem,
	living1ChairUpMenuItem,
	living1ChairDownMenuItem,
	living1ChairRightMenuItem,
	living1ChairLeftMenuItem,


	living2ChairMenuItem,
	living2ChairUpMenuItem,
	living2ChairDownMenuItem,
	living2ChairRightMenuItem,
	living2ChairLeftMenuItem,

	
	living3ChairMenuItem,
	living3ChairUpMenuItem,
	living3ChairDownMenuItem,
	living3ChairRightMenuItem,
	living3ChairLeftMenuItem,

	living4ChairMenuItem,
	living4ChairUpMenuItem,
	living4ChairDownMenuItem,
	living4ChairRightMenuItem,
	living4ChairLeftMenuItem,

	
	living5ChairMenuItem,
	living5ChairUpMenuItem,
	living5ChairDownMenuItem,
	living5ChairRightMenuItem,
	living5ChairLeftMenuItem,
	
	
	living6ChairMenuItem,
	living6ChairUpMenuItem,
	living6ChairDownMenuItem,
	living6ChairRightMenuItem,
	living6ChairLeftMenuItem,

	
	living7ChairMenuItem,
	living7ChairUpMenuItem,
	living7ChairDownMenuItem,
	living7ChairRightMenuItem,
	living7ChairLeftMenuItem,
	
	
	living8ChairMenuItem,
	living8ChairUpMenuItem,
	living8ChairDownMenuItem,
	living8ChairRightMenuItem,
	living8ChairLeftMenuItem,

	
	bedTableMenuItem,
	bedTableUpMenuItem,
	bedTableDownMenuItem,
	bedTableRightMenuItem,
	bedTableLeftMenuItem,

	
	littleTableMenuItem,
	littleTableUpMenuItem,
	littleTableDownMenuItem,
	littleTableRightMenuItem,
	littleTableLeftMenuItem,

	
	bigTableMenuItem,
	bigTableUpMenuItem,
	bigTableDownMenuItem,
	bigTableRightMenuItem,
	bigTableLeftMenuItem,

	
	officeTableMenuItem,
	officeTableUpMenuItem,
	officeTableDownMenuItem,
	officeTableRightMenuItem,
	officeTableLeftMenuItem,

	
	kitchenTableMenuItem,
	kitchenTableUpMenuItem,
	kitchenTableDownMenuItem,
	kitchenTableRightMenuItem,
	kitchenTableLeftMenuItem,

	
	livingTableMenuItem,
	livingTableUpMenuItem,
	livingTableDownMenuItem,
	livingTableRightMenuItem,
	livingTableLeftMenuItem,
	
	couchMenuItem,
	couchUpMenuItem,
	couchDownMenuItem,
	couchRightMenuItem,
	couchLeftMenuItem,

	
	tvMenuItem,
	tvUpMenuItem,
	tvDownMenuItem,
	tvRightMenuItem,
	tvLeftMenuItem,
	
	
	
	CarEMenuItem,
	CarNeMenuItem;
	

	
	public Fereastra()
	{
		
	
	super("Smart House");
		
		MouseEvent e;
		
		

		
		fileName = null;
		
		mainBar 		= new JMenuBar();
		setJMenuBar(mainBar);
/*----------------------------------------------------------------------------*/		
		fileMenu  		= new JMenu("File");
		fileMenu.setMnemonic('F');
		
		exitMenuItem	= new JMenuItem("Exit");
		exitMenuItem.addActionListener(new MenuButtonListener());
		
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);

/*----------------------------------------------------------------------------*/
		//Doors menu	
		setDoorsMenu = new JMenu("SetDoors");
		setDoorsMenu.setMnemonic('D');
		
			mainDoorMenuItem	= new JMenu("Main Door");
			mainDoorOpenMenuItem	= new JMenuItem("Open");
			mainDoorCloseMenuItem	= new JMenuItem("Close");
			
			garageDoorMenuItem	= new JMenu("Garage-Out Door");
			garageDoorOpenMenuItem	= new JMenuItem("Open");
			garageDoorCloseMenuItem	= new JMenuItem("Close");
			
			garageHallDoorMenuItem	= new JMenu("Garage-Hall Door");
			garageHallDoorOpenMenuItem	= new JMenuItem("Open");
			garageHallDoorCloseMenuItem	= new JMenuItem("Close");
			
			bedroomBathroomDoorMenuItem	= new JMenu("Bedroom-Bathroom Door");
			bedroomBathroomDoorOpenMenuItem	= new JMenuItem("Open");
			bedroomBathroomDoorCloseMenuItem= new JMenuItem("Close");
			
			bathroom1DoorMenuItem	= new JMenu("Bathroom 1 Door");
			bathroom1DoorOpenMenuItem = new JMenuItem("Open");
			bathroom1DoorCloseMenuItem= new JMenuItem("Close");
			
			littleChildDoorMenuItem	= new JMenu("Little-Child Door");
			littleChildDoorOpenMenuItem = new JMenuItem("Open");
			littleChildDoorCloseMenuItem= new JMenuItem("Close");
			
			bathroom2DoorMenuItem	= new JMenu("Bathroom 2 Door");
			bathroom2DoorOpenMenuItem = new JMenuItem("Open");
			bathroom2DoorCloseMenuItem= new JMenuItem("Close");
			
			bigChildDoorMenuItem	= new JMenu("Big-Child Door");
			bigChildDoorOpenMenuItem = new JMenuItem("Open");
			bigChildDoorCloseMenuItem= new JMenuItem("Close");
			
			
			officeDoorMenuItem	= new JMenu("Office Door");
			officeDoorOpenMenuItem = new JMenuItem("Open");
			officeDoorCloseMenuItem= new JMenuItem("Close");
			
			bathroom3DoorMenuItem	= new JMenu("Bathroom 3 Door");
			bathroom3DoorOpenMenuItem = new JMenuItem("Open");
			bathroom3DoorCloseMenuItem= new JMenuItem("Close");
		
			livingGarageDoorMenuItem	= new JMenu("Living-Garage Door");
			livingGarageDoorOpenMenuItem = new JMenuItem("Open");
			livingGarageDoorCloseMenuItem= new JMenuItem("Close");
			
			livingChildDoorMenuItem	= new JMenu("Living-Child Door");
			livingChildDoorOpenMenuItem = new JMenuItem("Open");
			livingChildDoorCloseMenuItem= new JMenuItem("Close");
			
			livingKitchenDoorMenuItem	= new JMenu("Living-Kitchen Door");
			livingKitchenDoorOpenMenuItem = new JMenuItem("Open");
			livingKitchenDoorCloseMenuItem= new JMenuItem("Close");
			
			bedroomDoorMenuItem	= new JMenu("Bedroom Door");
			bedroomDoorOpenMenuItem	= new JMenuItem("Open");
			bedroomDoorCloseMenuItem= new JMenuItem("Close");
			
			
			
		
			mainDoorOpenMenuItem.addActionListener(new MenuButtonListener());
			mainDoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			garageDoorOpenMenuItem.addActionListener(new MenuButtonListener());
			garageDoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			garageHallDoorOpenMenuItem.addActionListener(new MenuButtonListener());
			garageHallDoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			bedroomBathroomDoorOpenMenuItem.addActionListener(new MenuButtonListener());
			bedroomBathroomDoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			bathroom1DoorOpenMenuItem.addActionListener(new MenuButtonListener());
			bathroom1DoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			littleChildDoorOpenMenuItem.addActionListener(new MenuButtonListener());
			littleChildDoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			bathroom2DoorOpenMenuItem.addActionListener(new MenuButtonListener());
			bathroom2DoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			bigChildDoorOpenMenuItem.addActionListener(new MenuButtonListener());
			bigChildDoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			officeDoorOpenMenuItem.addActionListener(new MenuButtonListener());
			officeDoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			bathroom3DoorOpenMenuItem.addActionListener(new MenuButtonListener());
			bathroom3DoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			livingGarageDoorOpenMenuItem.addActionListener(new MenuButtonListener());
			livingGarageDoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			livingChildDoorOpenMenuItem.addActionListener(new MenuButtonListener());
			livingChildDoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			livingKitchenDoorOpenMenuItem.addActionListener(new MenuButtonListener());
			livingKitchenDoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			bedroomDoorOpenMenuItem.addActionListener(new MenuButtonListener());
			bedroomDoorCloseMenuItem.addActionListener(new MenuButtonListener());
			
			
			
			
			mainDoorMenuItem.add(mainDoorOpenMenuItem);
			mainDoorMenuItem.add(mainDoorCloseMenuItem);
			
			garageDoorMenuItem.add(garageDoorOpenMenuItem);
			garageDoorMenuItem.add(garageDoorCloseMenuItem);
			
			garageHallDoorMenuItem.add(garageHallDoorOpenMenuItem);
			garageHallDoorMenuItem.add(garageHallDoorCloseMenuItem);
			
			bedroomBathroomDoorMenuItem.add(bedroomBathroomDoorOpenMenuItem);
			bedroomBathroomDoorMenuItem.add(bedroomBathroomDoorCloseMenuItem);
			
			bathroom1DoorMenuItem.add(bathroom1DoorOpenMenuItem);
			bathroom1DoorMenuItem.add(bathroom1DoorCloseMenuItem);
			
			littleChildDoorMenuItem.add(littleChildDoorOpenMenuItem);
			littleChildDoorMenuItem.add(littleChildDoorCloseMenuItem);
			
			bathroom2DoorMenuItem.add(bathroom2DoorOpenMenuItem);
			bathroom2DoorMenuItem.add(bathroom2DoorCloseMenuItem);
			
			bigChildDoorMenuItem.add(bigChildDoorOpenMenuItem);
			bigChildDoorMenuItem.add(bigChildDoorCloseMenuItem);
			
			officeDoorMenuItem.add(officeDoorOpenMenuItem);
			officeDoorMenuItem.add(officeDoorCloseMenuItem);
			
			bathroom3DoorMenuItem.add(bathroom3DoorOpenMenuItem);
			bathroom3DoorMenuItem.add(bathroom3DoorCloseMenuItem);
			
			livingGarageDoorMenuItem.add(livingGarageDoorOpenMenuItem);
			livingGarageDoorMenuItem.add(livingGarageDoorCloseMenuItem);
			
			livingChildDoorMenuItem.add(livingChildDoorOpenMenuItem);
			livingChildDoorMenuItem.add(livingChildDoorCloseMenuItem);
			
			livingKitchenDoorMenuItem.add(livingKitchenDoorOpenMenuItem);
			livingKitchenDoorMenuItem.add(livingKitchenDoorCloseMenuItem);
			
			bedroomDoorMenuItem.add(bedroomDoorOpenMenuItem);
			bedroomDoorMenuItem.add(bedroomDoorCloseMenuItem);
			
			
			
			
			
			setDoorsMenu.add(mainDoorMenuItem);
			setDoorsMenu.add(garageDoorMenuItem);
			setDoorsMenu.add(garageHallDoorMenuItem);
			setDoorsMenu.add(bedroomDoorMenuItem);
			setDoorsMenu.add(bedroomBathroomDoorMenuItem);
			setDoorsMenu.add(bathroom1DoorMenuItem);
			setDoorsMenu.add(bathroom2DoorMenuItem);
			setDoorsMenu.add(bathroom3DoorMenuItem);
			setDoorsMenu.add(littleChildDoorMenuItem);
			setDoorsMenu.add(bigChildDoorMenuItem);
			setDoorsMenu.add(officeDoorMenuItem);
			setDoorsMenu.add(livingGarageDoorMenuItem);
			setDoorsMenu.add(livingChildDoorMenuItem);
			setDoorsMenu.add(livingKitchenDoorMenuItem);
			
/*----------------------------------------------------------------------------*/
	//Windows menu
	setWinMenu = new JMenu("SetWindows");
		setWinMenu.setMnemonic('W');
		
		
			bathroom1WinMenuItem	= new JMenu("Bathroom 1 Windows");
			bathroom1WinOpenMenuItem = new JMenuItem("Open");
			bathroom1WinCloseMenuItem= new JMenuItem("Close");
			
			littleChildWinMenuItem	= new JMenu("Little-Child Windows");
			littleChildWinOpenMenuItem = new JMenuItem("Open");
			littleChildWinCloseMenuItem= new JMenuItem("Close");
			
			bathroom2WinMenuItem	= new JMenu("Bathroom 2 Windows");
			bathroom2WinOpenMenuItem = new JMenuItem("Open");
			bathroom2WinCloseMenuItem= new JMenuItem("Close");
		
			hallWinMenuItem	= new JMenu("Hall Window");
			hallWinOpenMenuItem	= new JMenuItem("Open");
			hallWinCloseMenuItem	= new JMenuItem("Close");
			
			bigChildBackWinMenuItem	= new JMenu("Big-Child Back Windows");
			bigChildBackWinOpenMenuItem = new JMenuItem("Open");
			bigChildBackWinCloseMenuItem= new JMenuItem("Close");
			
			bigChildRightWinMenuItem	= new JMenu("Big-Child Right Windows");
			bigChildRightWinOpenMenuItem = new JMenuItem("Open");
			bigChildRightWinCloseMenuItem= new JMenuItem("Close");
			
			officeWinMenuItem	= new JMenu("Office Windows");
			officeWinOpenMenuItem = new JMenuItem("Open");
			officeWinCloseMenuItem= new JMenuItem("Close");
			
			bathroom3WinMenuItem	= new JMenu("Bathroom 3 Windows");
			bathroom3WinOpenMenuItem = new JMenuItem("Open");
			bathroom3WinCloseMenuItem= new JMenuItem("Close");
			
			garageWinMenuItem	= new JMenu("Garage Windows");
			garageWinOpenMenuItem	= new JMenuItem("Open");
			garageWinCloseMenuItem	= new JMenuItem("Close");
			
			livingWinMenuItem	= new JMenu("Living Windows");
			livingWinOpenMenuItem = new JMenuItem("Open");
			livingWinCloseMenuItem= new JMenuItem("Close");
			
			kitchenWinMenuItem	= new JMenu("Kitchen Windows");
			kitchenWinOpenMenuItem = new JMenuItem("Open");
			kitchenWinCloseMenuItem= new JMenuItem("Close");
			
			bedroomWinMenuItem	= new JMenu("Bedroom Windows");
			bedroomWinOpenMenuItem	= new JMenuItem("Open");
			bedroomWinCloseMenuItem= new JMenuItem("Close");
			
			
			
			
			bathroom1WinOpenMenuItem.addActionListener(new MenuButtonListener());
			bathroom1WinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			littleChildWinOpenMenuItem.addActionListener(new MenuButtonListener());
			littleChildWinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			bathroom2WinOpenMenuItem.addActionListener(new MenuButtonListener());
			bathroom2WinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			hallWinOpenMenuItem.addActionListener(new MenuButtonListener());
			hallWinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			bigChildBackWinOpenMenuItem.addActionListener(new MenuButtonListener());
			bigChildBackWinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			bigChildRightWinOpenMenuItem.addActionListener(new MenuButtonListener());
			bigChildRightWinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			officeWinOpenMenuItem.addActionListener(new MenuButtonListener());
			officeWinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			bathroom3WinOpenMenuItem.addActionListener(new MenuButtonListener());
			bathroom3WinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			garageWinOpenMenuItem.addActionListener(new MenuButtonListener());
			garageWinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			livingWinOpenMenuItem.addActionListener(new MenuButtonListener());
			livingWinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			kitchenWinOpenMenuItem.addActionListener(new MenuButtonListener());
			kitchenWinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			bedroomWinOpenMenuItem.addActionListener(new MenuButtonListener());
			bedroomWinCloseMenuItem.addActionListener(new MenuButtonListener());
			
			
			
			
			bathroom1WinMenuItem.add(bathroom1WinOpenMenuItem);
			bathroom1WinMenuItem.add(bathroom1WinCloseMenuItem);
			
			littleChildWinMenuItem.add(littleChildWinOpenMenuItem);
			littleChildWinMenuItem.add(littleChildWinCloseMenuItem);
			
			bathroom2WinMenuItem.add(bathroom2WinOpenMenuItem);
			bathroom2WinMenuItem.add(bathroom2WinCloseMenuItem);
			
			hallWinMenuItem.add(hallWinOpenMenuItem);
			hallWinMenuItem.add(hallWinCloseMenuItem);
			
			bigChildBackWinMenuItem.add(bigChildBackWinOpenMenuItem);
			bigChildBackWinMenuItem.add(bigChildBackWinCloseMenuItem);
			
			officeWinMenuItem.add(officeWinOpenMenuItem);
			officeWinMenuItem.add(officeWinCloseMenuItem);
			
			bathroom3WinMenuItem.add(bathroom3WinOpenMenuItem);
			bathroom3WinMenuItem.add(bathroom3WinCloseMenuItem);
			
			garageWinMenuItem.add(garageWinOpenMenuItem);
			garageWinMenuItem.add(garageWinCloseMenuItem);
			
			bigChildRightWinMenuItem.add(bigChildRightWinOpenMenuItem);
			bigChildRightWinMenuItem.add(bigChildRightWinCloseMenuItem);
			
			livingWinMenuItem.add(livingWinOpenMenuItem);
			livingWinMenuItem.add(livingWinCloseMenuItem);
			
			kitchenWinMenuItem.add(kitchenWinOpenMenuItem);
			kitchenWinMenuItem.add(kitchenWinCloseMenuItem);
			
			bedroomWinMenuItem.add(bedroomWinOpenMenuItem);
			bedroomWinMenuItem.add(bedroomWinCloseMenuItem);
			
			
			
			
			setWinMenu.add(livingWinMenuItem);
			setWinMenu.add(kitchenWinMenuItem);
			setWinMenu.add(garageWinMenuItem);
			setWinMenu.add(bedroomWinMenuItem);
			setWinMenu.add(hallWinMenuItem);
			setWinMenu.add(bathroom1WinMenuItem);
			setWinMenu.add(bathroom2WinMenuItem);
			setWinMenu.add(bathroom3WinMenuItem);
			setWinMenu.add(littleChildWinMenuItem);
			setWinMenu.add(bigChildBackWinMenuItem);
			setWinMenu.add(bigChildRightWinMenuItem);
			setWinMenu.add(officeWinMenuItem);
			setWinMenu.add(livingWinMenuItem);
	

/*----------------------------------------------------------------------------*/
	ChangeObjectMenu = new JMenu("Change Objects Position");
		ChangeObjectMenu.setMnemonic('C');
		
		////////////Chair///////////////////////		
		bedroomChairMenuItem	= new JMenu("Bedroom Chair");
		bedroomChairUpMenuItem = new JMenuItem("Up");
		bedroomChairDownMenuItem = new JMenuItem("Down");
		bedroomChairRightMenuItem = new JMenuItem("Right");
		bedroomChairLeftMenuItem = new JMenuItem("Left");
		
		littleChairMenuItem	= new JMenu("Little Child Chair");
		littleChairUpMenuItem = new JMenuItem("Up");
		littleChairDownMenuItem = new JMenuItem("Down");
		littleChairRightMenuItem = new JMenuItem("Right");
		littleChairLeftMenuItem = new JMenuItem("Left");
		
		bigChairMenuItem	= new JMenu("Big Child Chair");
		bigChairUpMenuItem = new JMenuItem("Up");
		bigChairDownMenuItem = new JMenuItem("Down");
		bigChairRightMenuItem = new JMenuItem("Right");
		bigChairLeftMenuItem = new JMenuItem("Left");
		
		officeChairMenuItem	= new JMenu("Office Chair");
		officeChairUpMenuItem = new JMenuItem("Up");
		officeChairDownMenuItem = new JMenuItem("Down");
		officeChairRightMenuItem = new JMenuItem("Right");
		officeChairLeftMenuItem = new JMenuItem("Left");
		
		living1ChairMenuItem	= new JMenu("Living Chair 1");
		living1ChairUpMenuItem = new JMenuItem("Up");
		living1ChairDownMenuItem = new JMenuItem("Down");
		living1ChairRightMenuItem = new JMenuItem("Right");
		living1ChairLeftMenuItem = new JMenuItem("Left");
		
		living2ChairMenuItem	= new JMenu("Living Chair 2");
		living2ChairUpMenuItem = new JMenuItem("Up");
		living2ChairDownMenuItem = new JMenuItem("Down");
		living2ChairRightMenuItem = new JMenuItem("Right");
		living2ChairLeftMenuItem = new JMenuItem("Left");
		
		living3ChairMenuItem	= new JMenu("Living Chair 3");
		living3ChairUpMenuItem = new JMenuItem("Up");
		living3ChairDownMenuItem = new JMenuItem("Down");
		living3ChairRightMenuItem = new JMenuItem("Right");
		living3ChairLeftMenuItem = new JMenuItem("Left");
		
		living4ChairMenuItem	= new JMenu("Living Chair 4");
		living4ChairUpMenuItem = new JMenuItem("Up");
		living4ChairDownMenuItem = new JMenuItem("Down");
		living4ChairRightMenuItem = new JMenuItem("Right");
		living4ChairLeftMenuItem = new JMenuItem("Left");
		
		living5ChairMenuItem	= new JMenu("Living Chair 5");
		living5ChairUpMenuItem = new JMenuItem("Up");
		living5ChairDownMenuItem = new JMenuItem("Down");
		living5ChairRightMenuItem = new JMenuItem("Right");
		living5ChairLeftMenuItem = new JMenuItem("Left");
		
		living6ChairMenuItem	= new JMenu("Living Chair 6");
		living6ChairUpMenuItem = new JMenuItem("Up");
		living6ChairDownMenuItem = new JMenuItem("Down");
		living6ChairRightMenuItem = new JMenuItem("Right");
		living6ChairLeftMenuItem = new JMenuItem("Left");
		
		living7ChairMenuItem	= new JMenu("Living Chair 7");
		living7ChairUpMenuItem = new JMenuItem("Up");
		living7ChairDownMenuItem = new JMenuItem("Down");
		living7ChairRightMenuItem = new JMenuItem("Right");
		living7ChairLeftMenuItem = new JMenuItem("Left");
	    
	    living8ChairMenuItem	= new JMenu("Living Chair 8");
		living8ChairUpMenuItem = new JMenuItem("Up");
		living8ChairDownMenuItem = new JMenuItem("Down");
		living8ChairRightMenuItem = new JMenuItem("Right");
		living8ChairLeftMenuItem = new JMenuItem("Left");
		
		
		
	
		bedroomChairUpMenuItem.addActionListener(new MenuButtonListener());
		bedroomChairDownMenuItem.addActionListener(new MenuButtonListener());
		bedroomChairRightMenuItem.addActionListener(new MenuButtonListener());
		bedroomChairLeftMenuItem.addActionListener(new MenuButtonListener());
		
		
		littleChairUpMenuItem.addActionListener(new MenuButtonListener());
		littleChairDownMenuItem.addActionListener(new MenuButtonListener());
		littleChairRightMenuItem.addActionListener(new MenuButtonListener());
		littleChairLeftMenuItem.addActionListener(new MenuButtonListener());
	
	
		bigChairUpMenuItem.addActionListener(new MenuButtonListener());
		bigChairDownMenuItem.addActionListener(new MenuButtonListener());
		bigChairRightMenuItem.addActionListener(new MenuButtonListener());
		bigChairLeftMenuItem.addActionListener(new MenuButtonListener());
		
	
		officeChairUpMenuItem.addActionListener(new MenuButtonListener());
		officeChairDownMenuItem.addActionListener(new MenuButtonListener());
		officeChairRightMenuItem.addActionListener(new MenuButtonListener());
		officeChairLeftMenuItem.addActionListener(new MenuButtonListener());
		
		
		living1ChairUpMenuItem.addActionListener(new MenuButtonListener());
		living1ChairDownMenuItem.addActionListener(new MenuButtonListener());
		living1ChairRightMenuItem.addActionListener(new MenuButtonListener());
		living1ChairLeftMenuItem.addActionListener(new MenuButtonListener());
		
		
		living2ChairUpMenuItem.addActionListener(new MenuButtonListener());
		living2ChairDownMenuItem.addActionListener(new MenuButtonListener());
		living2ChairRightMenuItem.addActionListener(new MenuButtonListener());
		living2ChairLeftMenuItem.addActionListener(new MenuButtonListener());
		
	
		living3ChairUpMenuItem.addActionListener(new MenuButtonListener());
		living3ChairDownMenuItem.addActionListener(new MenuButtonListener());
		living3ChairRightMenuItem.addActionListener(new MenuButtonListener());
		living3ChairLeftMenuItem.addActionListener(new MenuButtonListener());
			
		
		living4ChairUpMenuItem.addActionListener(new MenuButtonListener());
		living4ChairDownMenuItem.addActionListener(new MenuButtonListener());
		living4ChairRightMenuItem.addActionListener(new MenuButtonListener());
		living4ChairLeftMenuItem.addActionListener(new MenuButtonListener());
		
	
		living5ChairUpMenuItem.addActionListener(new MenuButtonListener());
		living5ChairDownMenuItem.addActionListener(new MenuButtonListener());
		living5ChairRightMenuItem.addActionListener(new MenuButtonListener());
		living5ChairLeftMenuItem.addActionListener(new MenuButtonListener());
	
		
		living6ChairUpMenuItem.addActionListener(new MenuButtonListener());
		living6ChairDownMenuItem.addActionListener(new MenuButtonListener());
		living6ChairRightMenuItem.addActionListener(new MenuButtonListener());
		living6ChairLeftMenuItem.addActionListener(new MenuButtonListener());
		
	
		living7ChairUpMenuItem.addActionListener(new MenuButtonListener());
		living7ChairDownMenuItem.addActionListener(new MenuButtonListener());
		living7ChairRightMenuItem.addActionListener(new MenuButtonListener());
		living7ChairLeftMenuItem.addActionListener(new MenuButtonListener());
		
		
		living8ChairUpMenuItem.addActionListener(new MenuButtonListener());
		living8ChairDownMenuItem.addActionListener(new MenuButtonListener());
		living8ChairRightMenuItem.addActionListener(new MenuButtonListener());
		living8ChairLeftMenuItem.addActionListener(new MenuButtonListener());
		
		
		
		
	
		bedroomChairMenuItem.add(bedroomChairUpMenuItem);
		bedroomChairMenuItem.add(bedroomChairDownMenuItem);
		bedroomChairMenuItem.add(bedroomChairRightMenuItem);
	    bedroomChairMenuItem.add(bedroomChairLeftMenuItem);
		
		
		littleChairMenuItem.add(littleChairUpMenuItem);
		littleChairMenuItem.add(littleChairDownMenuItem);
		littleChairMenuItem.add(littleChairRightMenuItem);
	    littleChairMenuItem.add(littleChairLeftMenuItem);
	    
	    
		bigChairMenuItem.add(bigChairUpMenuItem);
		bigChairMenuItem.add(bigChairDownMenuItem);
		bigChairMenuItem.add(bigChairRightMenuItem);
	    bigChairMenuItem.add(bigChairLeftMenuItem);
		

		officeChairMenuItem.add(officeChairUpMenuItem);
		officeChairMenuItem.add(officeChairDownMenuItem);
		officeChairMenuItem.add(officeChairRightMenuItem);
	    officeChairMenuItem.add(officeChairLeftMenuItem);
	    
		
		living1ChairMenuItem.add(living1ChairUpMenuItem);
		living1ChairMenuItem.add(living1ChairDownMenuItem);
		living1ChairMenuItem.add(living1ChairRightMenuItem);
	    living1ChairMenuItem.add(living1ChairLeftMenuItem);
		
	
		living2ChairMenuItem.add(living2ChairUpMenuItem);
		living2ChairMenuItem.add(living2ChairDownMenuItem);
		living2ChairMenuItem.add(living2ChairRightMenuItem);
	    living2ChairMenuItem.add(living2ChairLeftMenuItem);
	    
	  
		living3ChairMenuItem.add(living3ChairUpMenuItem);
		living3ChairMenuItem.add(living3ChairDownMenuItem);
		living3ChairMenuItem.add(living3ChairRightMenuItem);
	    living3ChairMenuItem.add(living3ChairLeftMenuItem);
	    
		living4ChairMenuItem.add(living4ChairUpMenuItem);
		living4ChairMenuItem.add(living4ChairDownMenuItem);
		living4ChairMenuItem.add(living4ChairRightMenuItem);
	    living4ChairMenuItem.add(living4ChairLeftMenuItem);
	    
		
		living5ChairMenuItem.add(living5ChairUpMenuItem);
		living5ChairMenuItem.add(living5ChairDownMenuItem);
		living5ChairMenuItem.add(living5ChairRightMenuItem);
	    living5ChairMenuItem.add(living5ChairLeftMenuItem);
	    
		
		living6ChairMenuItem.add(living6ChairUpMenuItem);
		living6ChairMenuItem.add(living6ChairDownMenuItem);
		living6ChairMenuItem.add(living6ChairRightMenuItem);
	    living6ChairMenuItem.add(living6ChairLeftMenuItem);
	    
		
		living7ChairMenuItem.add(living7ChairUpMenuItem);
		living7ChairMenuItem.add(living7ChairDownMenuItem);
		living7ChairMenuItem.add(living7ChairRightMenuItem);
	    living7ChairMenuItem.add(living7ChairLeftMenuItem);
	    
		
		living8ChairMenuItem.add(living8ChairUpMenuItem);
		living8ChairMenuItem.add(living8ChairDownMenuItem);
		living8ChairMenuItem.add(living8ChairRightMenuItem);
	    living8ChairMenuItem.add(living8ChairLeftMenuItem);
	    
	    
	    ////////Table////////////////
	 	bedTableMenuItem	= new JMenu("Bedroom Table");
		bedTableUpMenuItem = new JMenuItem("Up");
		bedTableDownMenuItem = new JMenuItem("Down");
		bedTableRightMenuItem = new JMenuItem("Right");
		bedTableLeftMenuItem = new JMenuItem("Left");
		
		
		littleTableMenuItem	= new JMenu("Little Child Room Table");
		littleTableUpMenuItem = new JMenuItem("Up");
		littleTableDownMenuItem = new JMenuItem("Down");
		littleTableRightMenuItem = new JMenuItem("Right");
		littleTableLeftMenuItem = new JMenuItem("Left");
		
		
		bigTableMenuItem	= new JMenu("Big Child Room Table");
		bigTableUpMenuItem = new JMenuItem("Up");
		bigTableDownMenuItem = new JMenuItem("Down");
		bigTableRightMenuItem = new JMenuItem("Right");
		bigTableLeftMenuItem = new JMenuItem("Left");
		
		
		officeTableMenuItem	= new JMenu("Office Room Table");
		officeTableUpMenuItem = new JMenuItem("Up");
		officeTableDownMenuItem = new JMenuItem("Down");
		officeTableRightMenuItem = new JMenuItem("Right");
		officeTableLeftMenuItem = new JMenuItem("Left");
		
		
		kitchenTableMenuItem	= new JMenu("Kitchen Room Table");
		kitchenTableUpMenuItem = new JMenuItem("Up");
		kitchenTableDownMenuItem = new JMenuItem("Down");
		kitchenTableRightMenuItem = new JMenuItem("Right");
		kitchenTableLeftMenuItem = new JMenuItem("Left");
		
		
		livingTableMenuItem	= new JMenu("Living Room Table");
		livingTableUpMenuItem = new JMenuItem("Up");
		livingTableDownMenuItem = new JMenuItem("Down");
		livingTableRightMenuItem = new JMenuItem("Right");
		livingTableLeftMenuItem = new JMenuItem("Left");
		
		
		couchMenuItem	= new JMenu("Couch");
		couchUpMenuItem = new JMenuItem("Up");
		couchDownMenuItem = new JMenuItem("Down");
		couchRightMenuItem = new JMenuItem("Right");
		couchLeftMenuItem = new JMenuItem("Left");
		
		
		tvMenuItem	= new JMenu("Tv");
		tvUpMenuItem = new JMenuItem("Up");
		tvDownMenuItem = new JMenuItem("Down");
		tvRightMenuItem = new JMenuItem("Right");
		tvLeftMenuItem = new JMenuItem("Left");
		
		
		
		

	
		bedTableUpMenuItem.addActionListener(new MenuButtonListener());
		bedTableDownMenuItem.addActionListener(new MenuButtonListener());
		bedTableRightMenuItem.addActionListener(new MenuButtonListener());
		bedTableLeftMenuItem.addActionListener(new MenuButtonListener());
		
	
		littleTableUpMenuItem.addActionListener(new MenuButtonListener());
		littleTableDownMenuItem.addActionListener(new MenuButtonListener());
		littleTableRightMenuItem.addActionListener(new MenuButtonListener());
		littleTableLeftMenuItem.addActionListener(new MenuButtonListener());
		

		bigTableUpMenuItem.addActionListener(new MenuButtonListener());
		bigTableDownMenuItem.addActionListener(new MenuButtonListener());
		bigTableRightMenuItem.addActionListener(new MenuButtonListener());
		bigTableLeftMenuItem.addActionListener(new MenuButtonListener());
		
			    

		officeTableUpMenuItem.addActionListener(new MenuButtonListener());
		officeTableDownMenuItem.addActionListener(new MenuButtonListener());
		officeTableRightMenuItem.addActionListener(new MenuButtonListener());
		officeTableLeftMenuItem.addActionListener(new MenuButtonListener());
		


		kitchenTableUpMenuItem.addActionListener(new MenuButtonListener());
		kitchenTableDownMenuItem.addActionListener(new MenuButtonListener());
		kitchenTableRightMenuItem.addActionListener(new MenuButtonListener());
		kitchenTableLeftMenuItem.addActionListener(new MenuButtonListener());
		

		
		livingTableUpMenuItem.addActionListener(new MenuButtonListener());
		livingTableDownMenuItem.addActionListener(new MenuButtonListener());
		livingTableRightMenuItem.addActionListener(new MenuButtonListener());
		livingTableLeftMenuItem.addActionListener(new MenuButtonListener());
		

		couchUpMenuItem.addActionListener(new MenuButtonListener());
		couchDownMenuItem.addActionListener(new MenuButtonListener());
		couchRightMenuItem.addActionListener(new MenuButtonListener());
		couchLeftMenuItem.addActionListener(new MenuButtonListener());
		
	
	
		tvUpMenuItem.addActionListener(new MenuButtonListener());
		tvDownMenuItem.addActionListener(new MenuButtonListener());
		tvRightMenuItem.addActionListener(new MenuButtonListener());
		tvLeftMenuItem.addActionListener(new MenuButtonListener());
		

		
		
		

		bedTableMenuItem.add(bedTableUpMenuItem);
		bedTableMenuItem.add(bedTableDownMenuItem);
		bedTableMenuItem.add(bedTableRightMenuItem);
	    bedTableMenuItem.add(bedTableLeftMenuItem);
	 		
		
		littleTableMenuItem.add(littleTableUpMenuItem);
		littleTableMenuItem.add(littleTableDownMenuItem);
		littleTableMenuItem.add(littleTableRightMenuItem);
	    littleTableMenuItem.add(littleTableLeftMenuItem);
	    
	
		bigTableMenuItem.add(bigTableUpMenuItem);
		bigTableMenuItem.add(bigTableDownMenuItem);
		bigTableMenuItem.add(bigTableRightMenuItem);
	    bigTableMenuItem.add(bigTableLeftMenuItem);

		
		officeTableMenuItem.add(officeTableUpMenuItem);
		officeTableMenuItem.add(officeTableDownMenuItem);
		officeTableMenuItem.add(officeTableRightMenuItem);
	    officeTableMenuItem.add(officeTableLeftMenuItem);

	
		kitchenTableMenuItem.add(kitchenTableUpMenuItem);
		kitchenTableMenuItem.add(kitchenTableDownMenuItem);
		kitchenTableMenuItem.add(kitchenTableRightMenuItem);
	    kitchenTableMenuItem.add(kitchenTableLeftMenuItem);

		
		livingTableMenuItem.add(livingTableUpMenuItem);
		livingTableMenuItem.add(livingTableDownMenuItem);
		livingTableMenuItem.add(livingTableRightMenuItem);
	    livingTableMenuItem.add(livingTableLeftMenuItem);
	   		
	
		couchMenuItem.add(couchUpMenuItem);
		couchMenuItem.add(couchDownMenuItem);
		couchMenuItem.add(couchRightMenuItem);
	    couchMenuItem.add(couchLeftMenuItem);

	
		tvMenuItem.add(tvUpMenuItem);
		tvMenuItem.add(tvDownMenuItem);
		tvMenuItem.add(tvRightMenuItem);
	    tvMenuItem.add(tvLeftMenuItem);
	    
	    
	    
	    
		ChangeObjectMenu.add (bedroomChairMenuItem);
		ChangeObjectMenu.add (littleChairMenuItem);
		ChangeObjectMenu.add (bigChairMenuItem);
		ChangeObjectMenu.add (officeChairMenuItem);
		ChangeObjectMenu.add (living1ChairMenuItem);
		ChangeObjectMenu.add (living2ChairMenuItem);
		ChangeObjectMenu.add (living3ChairMenuItem);
		ChangeObjectMenu.add (living4ChairMenuItem);
		ChangeObjectMenu.add (living5ChairMenuItem);
		ChangeObjectMenu.add (living6ChairMenuItem);
		ChangeObjectMenu.add (living7ChairMenuItem);
		ChangeObjectMenu.add (living8ChairMenuItem);
		ChangeObjectMenu.add (bedTableMenuItem);
		ChangeObjectMenu.add (littleTableMenuItem);
		ChangeObjectMenu.add (bigTableMenuItem);
		ChangeObjectMenu.add (officeTableMenuItem);
		ChangeObjectMenu.add (kitchenTableMenuItem);
		ChangeObjectMenu.add (livingTableMenuItem);
		ChangeObjectMenu.add (couchMenuItem);
		ChangeObjectMenu.add (tvMenuItem);
/*----------------------------------------------------------------------------*/
	CarMenu = new JMenu("SetCar");
		CarMenu.setMnemonic('S');
		
		CarEMenuItem = new JMenuItem("In");
		CarNeMenuItem = new JMenuItem("Out");
		
		CarEMenuItem.addActionListener(new MenuButtonListener());
		CarNeMenuItem.addActionListener(new MenuButtonListener());
		
		CarMenu.add(CarEMenuItem);
		CarMenu.add(CarNeMenuItem);

/*----------------------------------------------------------------------------*/				
		mainBar.add(fileMenu);
		mainBar.add(setDoorsMenu);
		mainBar.add(setWinMenu);
		mainBar.add(ChangeObjectMenu);		
		mainBar.add(CarMenu);
/*----------------------------------------------------------------------------*/	

		basePaint = new BasePaint();
		mainContainer = getContentPane();
		mainContainer.add(basePaint,BorderLayout.CENTER);
		

		setSize(600,500);
	this.setResizable(false);
	//	setVisible(true);
	
	
		addMouseListener(new MouseListener(){
      
			public void mousePressed(MouseEvent e)
			{
				if ((e.getModifiers() & java.awt.event.MouseEvent.BUTTON1_MASK) != 0) 
			   	 {
			   	 	
			   	 		x = e.getX()-17;
						y = e.getY()-65;
						
					
					 ///Chair///
					 if(sel2==1)
					  {
					
						X2=x;
						Y2=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  				X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  				basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  				Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  				repaint();
	  				    }
	  					
	  				if(sel3==1)
					 {
					
						X3=x;
						Y3=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  				X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  				basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  				Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  				repaint();
	  					}
	  					
	  				if(sel5==1)
					 {
					
						X5=x;
						Y5=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  				X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  				basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  				Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  				repaint();
	  					}
	  					
	  				if(sel7==1)
					 {
					
						X7=x;
						Y7=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  				X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  				basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  				Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  				repaint();
		  				}
		  				
	  				if(sel13==1)
					 {
						
						X13=x;
						Y13=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  				X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  				basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  				Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  				repaint();
	  					}
	  					
	  				if(sel14==1)
					 {
					
					 	X14=x;
					 	Y14=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  					
			   		if(sel14==1)
					 {
					
					 	X14=x;
					 	Y14=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  					
	  				if(sel15==1)
					 {
					
					 	X15=x;
					 	Y15=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  				
	  				if(sel16==1)
					 {
					
						 X16=x;
						 Y16=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  				
	  				if(sel17==1)
					 {
					
						 X17=x;
						 Y17=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);	
	  					repaint();
	  					}
	  				
	  				if(sel18==1)
					 {
					
						 X18=x;
						 Y18=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);	
	  					repaint();
	  					}
	  				
	  				if(sel19==1)
					 {
					
						 X19=x;
						 Y19=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  				
	  				if(sel20==1)
					 {
					
					 	X20=x;
					 	Y20=y;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  				
	  				///tables///
	  				 if(sel1==1)
					 {
					
						X1=x;
						Y1=y-15;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  				
	  				if(sel4==1)
					 {
					
					 	X4=x;
					 	Y4=y-15;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  				
	  				if(sel6==1)
					 {
					
					 	X6=x-20;
					 	Y6=y-10;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  				
	  				if(sel8==1)
					 {
	  				 	X8=x-10;
					 	Y8=y-30;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  				
	  				if(sel9==1)
					 {
	  				 	X9=x-15;
					 	Y9=y-32;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  				if(sel10==1)
					 {
	  				 	X10=x-60;
					 	Y10=y-32;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  				
	  				if(sel11==1)
					 {
	  				 	X11=x-7;
						Y11=y-22;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  				
	  				if(sel12==1)
					 {
	  				 	X12=x-7;
						 Y12=y-12;
						basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
	  					X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
	  					basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
	  					Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
	  					repaint();
	  					}
	  					
	  		 					}
				
			
				if ((e.getModifiers() & java.awt.event.MouseEvent.BUTTON2_MASK) != 0)
					{
					
				
						//Unselect area////
			  				 sel1=0;
							 sel2=0;
							 sel3=0;
							 sel4=0;
							 sel5=0;
							 sel6=0;
							 sel7=0;
							 sel8=0;
							 sel9=0;
							 sel10=0;
							 sel11=0;
							 sel12=0;
							 sel13=0;
							 sel14=0;
							 sel15=0;
							 sel16=0;
							 sel17=0;
							 sel18=0;
							 sel19=0;
							 sel20=0;
			   	    		 sel21=0;
			   	    		 sel22=0;
			   	     		 sel23=0;
			   	     		 sel24=0;
			   	     		 sel25=0;
			   	     		 sel26=0;
			   	     		 sel27=0;
			   	     		 sel28=0;
			   	     		 sel29=0;
			   	     		 sel30=0;
				
				 	} 
				if ((e.getModifiers() & java.awt.event.MouseEvent.BUTTON3_MASK) != 0)
				 { 
		
				 	px = e.getX()-4;
					py = e.getY()-52;
					
					//Unselect area////
			  				 sel1=0;
							 sel2=0;
							 sel3=0;
							 sel4=0;
							 sel5=0;
							 sel6=0;
							 sel7=0;
							 sel8=0;
							 sel9=0;
							 sel10=0;
							 sel11=0;
							 sel12=0;
							 sel13=0;
							 sel14=0;
							 sel15=0;
							 sel16=0;
							 sel17=0;
							 sel18=0;
							 sel19=0;
							 sel20=0;
			   	    		 sel21=0;
			   	    		 sel22=0;
			   	     		 sel23=0;
			   	     		 sel27=0;
			   	     		 sel28=0;
			   	     		 sel29=0;
			   	     		 sel30=0;
			   	 ///Select  area///		 
					///Chears///
					if(px>=X2  & px<= X2+25 &  py>=Y2 & py<=Y2+25)
					{
						sel2=1;
					}
					if(px>=X3  & px<= X3+25 &  py>=Y3 & py<=Y3+25)
					{						
						sel3=1;
					}	
					if(px>=X5  & px<= X5+25 &  py>=Y5 & py<=Y5+25)
					{												
						sel5=1;
					}
					if(px>=X7  & px<= X7+25 &  py>=Y7 & py<=Y7+25)
					{												
						sel7=1;
					}
					
					if(px>=X13  & px<= X13+25 &  py>=Y13 & py<=Y13+25)
					{												
						sel13=1;
					}
					if(px>=X14  & px<= X14+25 &  py>=Y14 & py<=Y14+25)
					{												
						sel14=1;
					}
					if(px>=X15  & px<= X15+25 &  py>=Y15 & py<=Y15+25)
					{												
						sel15=1;
					}
					if(px>=X16  & px<= X16+25 &  py>=Y16 & py<=Y16+25)
					{												
						sel16=1;
					}
					if(px>=X17  & px<= X17+25 &  py>=Y17 & py<=Y17+25)
					{												
						sel17=1;
					}
					if(px>=X18  & px<= X18+25 &  py>=Y18 & py<=Y18+25)
					{												
						sel18=1;
					}
					if(px>=X19  & px<= X19+25 &  py>=Y19 & py<=Y19+25)
					{												
						sel19=1;
					}
					if(px>=X20  & px<= X20+25 &  py>=Y20 & py<=Y20+25)					{
												
						sel20=1;
					}
					
					///Tables///
					if(px>=X1  & px<= X1+30 &  py>=Y1 & py<=Y1+60)
					{												
						sel1=1;
					}
					if(px>=X4  & px<= X4+30 &  py>=Y4 & py<=Y4+60)
					{												
						sel4=1;
					}
					if(px>=X6  & px<= X6+70 &  py>=Y6 & py<=Y6+40)
					{												
						sel6=1;
					}
					if(px>=X8  & px<= X8+50 &  py>=Y8 & py<=Y8+80)
					{												
						sel8=1;
					}
					if(px>=X9  & px<= X9+60 &  py>=Y9 & py<=Y9+90)
					{												
						sel9=1;
					}
					if(px>=X10  & px<= X10+150 &  py>=Y10 & py<=Y10+90)
					{											
						sel10=1;
					}
					if(px>=X11  & px<= X11+150 &  py>=Y11 & py<=Y11+90)
					{												
						sel11=1;
					}
					
					if(px>=X12  & px<= X12+40 &  py>=Y12 & py<=Y12+50)
					{											
						sel12=1;
					}
					if(px>=Xr1  & px<= Xr1+30 &  py>=Yr1 & py<=Yr1+35)
					{												
						sel21=1;
					}
					if(px>=Xr2  & px<= Xr2+30 &  py>=Yr2 & py<=Yr2+35)
					{												
						sel22=1;
					}
					if(px>=Xr3  & px<= Xr3+30 &  py>=Yr3 & py<=Yr3+35)
					{							
						sel23=1;
						
					}
					if((px>=Xpack & px<=Xpack+15 & py>=Ypack & py<=Ypack+15) 
						& (Xr1>=Xpack-30 & Xr1<=Xpack+45 & Yr1>=Ypack-30 & Yr1<=Ypack+45))
					{
						sel24=1;	
					}
					if((px>=Xpack & px<=Xpack+15 & py>=Ypack & py<=Ypack+15) 
						& (Xr2>=Xpack-30 & Xr2<=Xpack+45 & Yr2>=Ypack-30 & Yr2<=Ypack+45))
				
					{
						sel25=1;	
					}
					if((px>=Xpack & px<=Xpack+15 & py>=Ypack & py<=Ypack+15) 
						& (Xr3>=Xpack-30 & Xr3<=Xpack+45 & Yr3>=Ypack-30 & Yr3<=Ypack+45))
					{
						sel26=1;	
					}
					if(px>=Xm  & px<= Xm+20 &  py>=Ym & py<=Ym+30)
					{												
						sel27=1;
					}
					if(px>=Xw  & px<= Xw+20 &  py>=Yw & py<=Yw+30)
					{												
						sel28=1;
					}	
					if(px>=Xl  & px<= Xl+12 &  py>=Yl & py<=Yl+20)
					{												
						sel29=1;
					}	
					if(px>=Xb  & px<= Xb+20 &  py>=Yb & py<=Yb+30)
					{												
						sel30=1;
					}			 
				
				
				}
			}
			public void mouseClicked(MouseEvent e)
			{	
				if ((e.getModifiers() & java.awt.event.MouseEvent.BUTTON1_MASK) != 0) 
				 {		
		 
				 } 
				if ((e.getModifiers() & java.awt.event.MouseEvent.BUTTON2_MASK) != 0)
				 { 
			
				 } 
				if ((e.getModifiers() & java.awt.event.MouseEvent.BUTTON3_MASK) != 0)
				 { 
			
				 }
			
			}
			public void mouseReleased(MouseEvent e)
			{
				
				if ((e.getModifiers() & java.awt.event.MouseEvent.BUTTON1_MASK) != 0) 
				 {
					x = e.getX();
					y = e.getY();
				 } 
				if ((e.getModifiers() & java.awt.event.MouseEvent.BUTTON2_MASK) != 0)
				 {  
				 
				 } 
				if ((e.getModifiers() & java.awt.event.MouseEvent.BUTTON3_MASK) != 0)
				 { 
				 	  		
				 }
				 
			}
			public void mouseEntered(MouseEvent e){}
			public void mouseExited(MouseEvent e){}
		});
	
	
	addKeyListener(new KeyListener() {

			public void keyPressed(KeyEvent evt) { 
			ContextData.getCurrentLocation(Xr1, Yr1, getSelected());
          
		      int key = evt.getKeyCode();  // Keyboard code for the pressed key.
		      if(key ==KeyEvent.VK_SPACE)
		      {
		      	
		      	if(sel24==1)
		      	{	
		      		if(DIR1==4)
		      		{
		      			Xpack=Xr1+8;
		      			Ypack=Yr1+8;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==3)
		      		{
		      			
		      			Xpack=Xr1+5;
		      			Ypack=Yr1+8;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==2)
		      		{
		      			
		      			Xpack=Xr1+8;
		      			Ypack=Yr1+8;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==1)
		      		{
		      			
		      			Xpack=Xr1+8;
		      			Ypack=Yr1+5;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		sel21=1;
		      			
		      	}
		      	
		      	if(sel25==1)
		      	{	
		      		if(DIR1==4)
		      		{
		      			Xpack=Xr2+5;
		      			Ypack=Yr2+5;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==3)
		      		{
		      			
		      			Xpack=Xr2+5;
		      			Ypack=Yr2+5;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==2)
		      		{
		      			
		      			Xpack=Xr2+5;
		      			Ypack=Yr2+5;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==1)
		      		{
		      			
		      			Xpack=Xr2+5;
		      			Ypack=Yr2+5;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		sel22=1;	
		      	}
		      	if(sel26==1)
		      	{	
		      		if(DIR1==4)
		      		{
		      			Xpack=Xr3+2;
		      			Ypack=Yr3+8;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==3)
		      		{
		      			
		      			Xpack=Xr3+2;
		      			Ypack=Yr3+8;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==2)
		      		{
		      			
		      			Xpack=Xr3+2;
		      			Ypack=Yr3+8;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==1)
		      		{
		      			
		      			Xpack=Xr3+2;
		      			Ypack=Yr3+8;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		sel23=1;		
		      	}
		      	
		      }
	  					
		     else if (key == KeyEvent.VK_LEFT) {
		     	
		      	if(sel21==1)//oval red robot
		    	{
		    	
		      		
		      		
			    	DIR1=4;
			    	Xr1=Xr1-5; 
			    	Yr1=Yr1;
			    	
		      	   	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
					 
					  if(sel24==1)
					  {
					    Xpack=Xr1+8;
		      			Ypack=Yr1+8;
		      			basePaint.pack(Xpack,Ypack);
		      			}
					repaint();
					  
					 // if(sel)
		         }
		         
		         if(sel22==1)//blue circle robot
		    	 {
		    	
			    	DIR2=4;
			    	Xr2=Xr2-5; 
			    	Yr2=Yr2;
			    	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
					if(sel25==1)
					  {
					    Xpack=Xr2+5;
		      			Ypack=Yr2+5;
		      			basePaint.pack(Xpack,Ypack);
		      			}
					repaint();
			        
		         }
		         
		         if(sel23==1)//toy robot
		    	 {
		    	
			    	DIR3=4;
			    	Xr3=Xr3-5; 
			    	Yr3=Yr3;
			    	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
					if(sel26==1)
					  {
					    Xpack=Xr3+2;
		      			Ypack=Yr3+8;
		      			basePaint.pack(Xpack,Ypack);
		      			}
					
			        repaint();
		         }
		         
		         if(sel27==1)//man
		    	 {
		    	
			    	DIM=4;
			    	Xm=Xm-5; 
			    	Ym=Ym;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		         if(sel28==1)//man
		    	 {
		    	
			    	DIW=4;
			    	Xw=Xw-5; 
			    	Yw=Yw;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		         if(sel29==1)//man
		    	 {
		    	
			    	DIL=4;
			    	Xl=Xl-5; 
			    	Yl=Yl;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		         if(sel30==1)//man
		    	 {
		    	
			    	DIB=4;
			    	Xb=Xb-5; 
			    	Yb=Yb;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		      }
		      
		      
		      
		   
		      else if (key == KeyEvent.VK_RIGHT) {
		      	if(sel21==1)//oval red robot
		    	{
		    	
			    	DIR1=3;
			    	Xr1=Xr1+5; 
			    	Yr1=Yr1;
			    	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
									  
					 if(sel24==1)
					  {
					    Xpack=Xr1+5;
		      			Ypack=Yr1+8;
		      			basePaint.pack(Xpack,Ypack);
		      			}
					repaint();
		         }
		         
		         if(sel22==1)//blue circle robot
		    	 {
		    	
			    	DIR2=3;
			    	Xr2=Xr2+5; 
			    	Yr2=Yr2;
			    	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
					if(sel25==1)
					  {
					    Xpack=Xr2+5;
		      			Ypack=Yr2+5;
		      			basePaint.pack(Xpack,Ypack);
		      			}
			        repaint();
		         }
		         
		         if(sel23==1)//toy robot
		    	 {
		    	
			    	DIR3=3;
			    	Xr3=Xr3+5; 
			    	Yr3=Yr3;
			    	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
					if(sel26==1)
					  {
					    Xpack=Xr3+2;
		      			Ypack=Yr3+8;
		      			basePaint.pack(Xpack,Ypack);
		      			}
					
			        repaint();
		         }
		         
		         if(sel27==1)//man
		    	 {
		    	
			    	DIM=3;
			    	Xm=Xm+5; 
			    	Ym=Ym;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		          if(sel28==1)//women
		    	 {
		    	
			    	DIW=3;
			    	Xw=Xw+5; 
			    	Yw=Yw;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		         if(sel29==1)//little
		    	 {
		    	
			    	DIL=3;
			    	Xl=Xl+5; 
			    	Yl=Yl;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		         if(sel30==1)//big
		    	 {
		    	
			    	DIB=3;
			    	Xb=Xb+5; 
			    	Yb=Yb;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		      }
		      
		      
		      
		      
		      else if (key == KeyEvent.VK_UP) {
		     	if(sel21==1)//oval red robot
		    	{
		    	
			    	DIR1=2;
			    	Xr1=Xr1; 
			    	Yr1=Yr1-5;
			    	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
					if(sel24==1)
					  {
					    Xpack=Xr1+8;
		      			Ypack=Yr1+8;
		      			basePaint.pack(Xpack,Ypack);
		      			}
					repaint();
		         }
		         
		         if(sel22==1)//blue circle robot
		    	 {
		    	
			    	DIR2=2;
			    	Xr2=Xr2; 
			    	Yr2=Yr2-5;
			    	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
					if(sel25==1)
					  {
					    Xpack=Xr2+5;
		      			Ypack=Yr2+5;
		      			basePaint.pack(Xpack,Ypack);
		      			}
			        repaint();
		         }
		         
		         if(sel23==1)//toy robot
		    	 {
		    	
			    	DIR3=2;
			    	Xr3=Xr3; 
			    	Yr3=Yr3-5;
			    	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
					if(sel26==1)
					  {
					    Xpack=Xr3+2;
		      			Ypack=Yr3+8;
		      			basePaint.pack(Xpack,Ypack);
		      			}
					
			        repaint();
		         }
		         
		         if(sel27==1)//man
		    	 {
		    	
			    	DIM=2;
			    	Xm=Xm; 
			    	Ym=Ym-5;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		         
		         if(sel28==1)//women
		    	 {
		    	
			    	DIW=2;
			    	Xw=Xw; 
			    	Yw=Yw-5;
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		         if(sel29==1)//little
		    	 {
		    	
			    	DIL=2;
			    	Xl=Xl; 
			    	Yl=Yl-5;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		         if(sel30==1)//big
		    	 {
		    	
			    	DIB=2;
			    	Xb=Xb; 
			    	Yb=Yb-5;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		      }
		      
		      
		      
		      else if (key == KeyEvent.VK_DOWN) {
		    	
		    	if(sel21==1)//oval red robot
		    	{
		    	
			    	DIR1=1;
			    	Xr1=Xr1; 
			    	Yr1=Yr1+5;
			    	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
					if(sel24==1)
					  {
					    Xpack=Xr1+8;
		      			Ypack=Yr1+5;
		      			basePaint.pack(Xpack,Ypack);
		      			}
					repaint();
		         }
		         
		         if(sel22==1)//blue circle robot
		    	 {
		    	
			    	DIR2=1;
			    	Xr2=Xr2; 
			    	Yr2=Yr2+5;
			    	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
					if(sel25==1)
					  {
					    Xpack=Xr2+5;
		      			Ypack=Yr2+5;
		      			basePaint.pack(Xpack,Ypack);
		      			}
			        repaint();
		         }
		         
		         if(sel23==1)//toy robot
		    	 {
		    	
			    	DIR3=1;
			    	Xr3=Xr3; 
			    	Yr3=Yr3+5;
			    	
			    	basePaint.rX(Xr1,Xr2,Xr3);
					basePaint.rY(Yr1,Yr2,Yr3);
					basePaint.dirX(DIR1,DIR2,DIR3);
					if(sel26==1)
					  {
					    Xpack=Xr3+2;
		      			Ypack=Yr3+8;
		      			basePaint.pack(Xpack,Ypack);
		      			}
					
			        repaint();
		         }
		         
		         if(sel27==1)//man
		    	 {
		    	
			    	DIM=1;
			    	Xm=Xm; 
			    	Ym=Ym+5;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		         if(sel28==1)//women
		    	 {
		    	
			    	DIW=1;
			    	Xw=Xw; 
			    	Yw=Yw+5;
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		         if(sel29==1)//little
		    	 {
		    	
			    	DIL=1;
			    	Xl=Xl; 
			    	Yl=Yl+5;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		         if(sel30==1)//big
		    	 {
		    	
			    	DIB=1;
			    	Xb=Xb; 
			    	Yb=Yb+5;
			    	
			    	basePaint.hXYdir(Xm,Xw,Xl,Xb,Ym,Yw,Yl,Yb,DIM,DIW,DIL,DIB);
					repaint();
		         }
		      }
		      
		      
		      
		      
		      else if (key == KeyEvent.VK_ENTER) {
		      	if(sel24==1)
		      	{	
		      		if(DIR1==4)
		      		{
		      			Xpack=Xr1-20;
		      			Ypack=Yr1+8;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==3)
		      		{
		      			
		      			Xpack=Xr1+40;
		      			Ypack=Yr1+8;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==2)
		      		{
		      			
		      			Xpack=Xr1+8;
		      			Ypack=Yr1-20;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR1==1)
		      		{
		      			
		      			Xpack=Xr1+8;
		      			Ypack=Yr1+40;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		sel24=0;
		      		
		      			
		      	}
		      	if(sel25==1)
		      	{	
		      		if(DIR2==4)
		      		{
		      			Xpack=Xr2-20;
		      			Ypack=Yr2+5;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR2==3)
		      		{
		      			
		      			Xpack=Xr2+30;
		      			Ypack=Yr2+5;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR2==2)
		      		{
		      			
		      			Xpack=Xr2+5;
		      			Ypack=Yr2-20;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR2==1)
		      		{
		      			
		      			Xpack=Xr2+5;
		      			Ypack=Yr2+30;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		sel25=0;	
		      	}
		      	if(sel26==1)
		      	{	
		      		if(DIR3==4)
		      		{
		      			Xpack=Xr3-20;
		      			Ypack=Yr3+8;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR3==3)
		      		{
		      			
		      			Xpack=Xr3+30;
		      			Ypack=Yr3+8;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR3==2)
		      		{
		      			
		      			Xpack=Xr3+2;
		      			Ypack=Yr3-20;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		if(DIR3==1)
		      		{
		      			
		      			Xpack=Xr3+2;
		      			Ypack=Yr3+30;
		      			basePaint.pack(Xpack,Ypack);
						repaint();	
		      		}
		      		sel26=0;		
		      	}
		      	
		      }
		    

   			} 	
   
   			public void keyReleased(KeyEvent evt) {}
  			public void keyTyped(KeyEvent evt){}
		});
	}
		

		
	
/*----------------------------------------------------------------------------*/
	//menu control	
	public class MenuButtonListener implements ActionListener
	{
			
		public void actionPerformed(ActionEvent event)
		{
			
			if(event.getSource() == exitMenuItem)
			{
				System.exit(0);
			}
			
/*-Doors----------------------------------------------------------------------*/
			//////////bedroomBathroom///////////
			if(event.getSource() == bedroomBathroomDoorOpenMenuItem)
			{
				D1=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door1);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bedroomBathroomDoorCloseMenuItem)
			{
				D1=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door1);
			basePaint.repaint();
		
			}
		
			//////////Bathroom1///////////
			if(event.getSource() == bathroom1DoorOpenMenuItem)
			{
				D2=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door2);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bathroom1DoorCloseMenuItem)
			{
				D2=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door2);
			basePaint.repaint();
		
			}
		
			////////littleChild///////////
			if(event.getSource() == littleChildDoorOpenMenuItem)
			{
				D3=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door3);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == littleChildDoorCloseMenuItem)
			{
				D3=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door3);
			basePaint.repaint();
		
			}
		
			//////////Bathroom2///////////
			if(event.getSource() == bathroom2DoorOpenMenuItem)
			{
				D4=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door4);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bathroom2DoorCloseMenuItem)
			{
				D4=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door4);
			basePaint.repaint();
		
			}
		
			////////bigChild///////////
			if(event.getSource() == bigChildDoorOpenMenuItem)
			{
				D5=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door5);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bigChildDoorCloseMenuItem)
			{
				D5=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door5);
			basePaint.repaint();
		
			}
			////////Office///////////
			if(event.getSource() == officeDoorOpenMenuItem)
			{
				D6=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door6);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == officeDoorCloseMenuItem)
			{
				D6=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door6);
			basePaint.repaint();
		
			}
		
		
			//////////Bathroom3///////////
			if(event.getSource() == bathroom3DoorOpenMenuItem)
			{
				D7=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door7);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bathroom3DoorCloseMenuItem)
			{
				D7=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door7);
			basePaint.repaint();
		
			}
		
			//////////garage door///////////
			if(event.getSource() == garageHallDoorOpenMenuItem)
			{
				D8=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door8);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == garageHallDoorCloseMenuItem)
			{
				D8=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door8);
			basePaint.repaint();
		
		
			}
			//////////living-garage door///////////
			if(event.getSource() == livingGarageDoorOpenMenuItem)
			{
				D9=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door9);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == livingGarageDoorCloseMenuItem)
			{
				D9=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door9);
			basePaint.repaint();
		
			}
		
			//////////living-child door///////////
			if(event.getSource() == livingChildDoorOpenMenuItem)
			{
				D10=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door10);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == livingChildDoorCloseMenuItem)
			{
				D10=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door10);
			basePaint.repaint();
		
			}
	
			//////////living-Kitchen door///////////
			if(event.getSource() == livingKitchenDoorOpenMenuItem)
			{
				D11=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door11);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == livingKitchenDoorCloseMenuItem)
			{
				D11=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door11);
			basePaint.repaint();
		
			}
		
			//////////bedroomBathroom///////////
			if(event.getSource() == bedroomDoorOpenMenuItem)
			{
				D12=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door12);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bedroomDoorCloseMenuItem)
			{
				D12=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door12);
			basePaint.repaint();
		
			}
		
			//////////main door////////////
			if(event.getSource() == mainDoorOpenMenuItem)
			{
				D13=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door13);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == mainDoorCloseMenuItem)
			{
				D13=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door13);
			basePaint.repaint();
				
			}
			///////////garage door//////////////
			if(event.getSource() == garageDoorOpenMenuItem)
			{
				D14=1;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door14);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == garageDoorCloseMenuItem)
			{
				D14=0;
			basePaint.door(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14);
			basePaint.DoorStatus(Door14);
			basePaint.repaint();
				
			}

			//////////Windows/////////////
			//////////Bathroom1///////////
			if(event.getSource() == bathroom1WinOpenMenuItem)
			{
				Win1=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W1);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bathroom1WinCloseMenuItem)
			{
					Win1=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W1);
			basePaint.repaint();
		
			}
		
			//////////little Child///////////
			if(event.getSource() == littleChildWinOpenMenuItem)
			{
				Win2=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W2);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == littleChildWinCloseMenuItem)
			{
					Win2=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W2);
			basePaint.repaint();
		
			}
			
			//////////Bathroom2///////////
			if(event.getSource() == bathroom2WinOpenMenuItem)
			{
				Win3=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W3);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bathroom2WinCloseMenuItem)
			{
					Win3=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W3);
			basePaint.repaint();
		
			}
		

			//////////Hall///////////
			if(event.getSource() == hallWinOpenMenuItem)
			{
				Win4=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W4);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == hallWinCloseMenuItem)
			{
					Win4=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W4);
			basePaint.repaint();
		
			}
			
			//////////big Child Back ///////////
			if(event.getSource() == bigChildBackWinOpenMenuItem)
			{
				Win5=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W5);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bigChildBackWinCloseMenuItem)
			{
					Win5=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W5);
			basePaint.repaint();
		
			}
			
			
			
			//////////big Child Right ///////////
			if(event.getSource() == bigChildRightWinOpenMenuItem)
			{
				Win6=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W6);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bigChildRightWinCloseMenuItem)
			{
					Win6=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W6);
			basePaint.repaint();
		
			}
			
			
			//////////office ///////////
			if(event.getSource() == officeWinOpenMenuItem)
			{
				Win7=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W7);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == officeWinCloseMenuItem)
			{
					Win7=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W7);
			basePaint.repaint();
		
			}
			
			
			//////////Bathroom3///////////
			if(event.getSource() == bathroom3WinOpenMenuItem)
			{
				Win8=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W8);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bathroom3WinCloseMenuItem)
			{
					Win8=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W8);
			basePaint.repaint();
		
			}
			
			//////////garage//////////
			if(event.getSource() == garageWinOpenMenuItem)
			{
				Win9=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W9);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == garageWinCloseMenuItem)
			{
					Win9=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W9);
			basePaint.repaint();
		
			}
			
			//////////bedroom//////////
			if(event.getSource() == bedroomWinOpenMenuItem)
			{
				Win10=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W10);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == bedroomWinCloseMenuItem)
			{
					Win10=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W10);
			basePaint.repaint();
		
			}
			
			//////////kitchen//////////
			if(event.getSource() == kitchenWinOpenMenuItem)
			{
				Win11=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W11);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == kitchenWinCloseMenuItem)
			{
					Win11=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W11);
			basePaint.repaint();
		
			}
		
			//////////living//////////
			if(event.getSource() == livingWinOpenMenuItem)
			{
				Win12=1;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W12);
			basePaint.repaint();
				
			}
			
			if(event.getSource() == livingWinCloseMenuItem)
			{
					Win12=0;
			basePaint.windows(Win1,Win2,Win3,Win4,Win5,Win6,Win7,Win8,Win9,Win10,
			Win11,Win12);
			basePaint.WindowsStatus(W12);
			basePaint.repaint();
		
			}
			
			
			///////Chair////////////
			if(event.getSource() == bedroomChairUpMenuItem)
			{
				X2=X2;
		  		Y2=Y2-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == bedroomChairDownMenuItem)
			{
				X2=X2;
		  		Y2=Y2+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == bedroomChairRightMenuItem)
			{
				X2=X2+7;
		  		Y2=Y2;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == bedroomChairLeftMenuItem)
			{
				X2=X2-7;
		  		Y2=Y2;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			
			
			if(event.getSource() == littleChairUpMenuItem)
			{
				X3=X3;
		  		Y3=Y3-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == littleChairDownMenuItem)
			{
				X3=X3;
		  		Y3=Y3+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == littleChairRightMenuItem)
			{
				X3=X3+7;
		  		Y3=Y3;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == littleChairLeftMenuItem)
			{
				X3=X3-7;
		  		Y3=Y3;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			
			
		
			if(event.getSource() == bigChairUpMenuItem)
			{
				X5=X5;
		  		Y5=Y5-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == bigChairDownMenuItem)
			{
				X5=X5;
		  		Y5=Y5+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == bigChairRightMenuItem)
			{
				X5=X5+7;
		  		Y5=Y5;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == bigChairLeftMenuItem)
			{
				X5=X5-7;
		  		Y5=Y5;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			
			
			
			
			if(event.getSource() == officeChairUpMenuItem)
			{
				X7=X7;
		  		Y7=Y7-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == officeChairDownMenuItem)
			{
				X7=X7;
		  		Y7=Y7+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == officeChairRightMenuItem)
			{
				X7=X7+7;
		  		Y7=Y7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == officeChairLeftMenuItem)
			{
				X7=X7-7;
		  		Y7=Y7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			
			
			
			
			if(event.getSource() == living1ChairUpMenuItem)
			{
				X13=X13;
		  		Y13=Y13-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living1ChairDownMenuItem)
			{
				X13=X13;
		  		Y13=Y13+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
					
			}
			if(event.getSource() == living1ChairRightMenuItem)
			{
				X13=X13+7;
		  		Y13=Y13;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living1ChairLeftMenuItem)
			{
				X13=X13-7;
		  		Y13=Y13;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			
			
		
			if(event.getSource() == living2ChairUpMenuItem)
			{
				X14=X14;
		  		Y14=Y14-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living2ChairDownMenuItem)
			{
				X14=X14;
		  		Y14=Y14+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living2ChairRightMenuItem)
			{
				X14=X14+7;
		  		Y14=Y14;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
					
			}
			if(event.getSource() == living2ChairLeftMenuItem)
			{
				X14=X14-7;
		  		Y14=Y14;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
					
			
				
			}
			
			
			
			
			if(event.getSource() == living3ChairUpMenuItem)
			{
				X15=X15;
		  		Y15=Y15-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living3ChairDownMenuItem)
			{
				X15=X15;
		  		Y15=Y15+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living3ChairRightMenuItem)
			{
				X15=X15+7;
		  		Y15=Y15;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
					
			}
			if(event.getSource() == living3ChairLeftMenuItem)
			{
				X15=X15-7;
		  		Y15=Y15;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			
			
			if(event.getSource() == living4ChairUpMenuItem)
			{
				X16=X16;
		  		Y16=Y16-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
					
			}
			if(event.getSource() == living4ChairDownMenuItem)
			{
				X16=X16;
		  		Y16=Y16+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living4ChairRightMenuItem)
			{
				X16=X16+7;
		  		Y16=Y16;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living4ChairLeftMenuItem)
			{
				X16=X16-7;
		  		Y16=Y16;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			
				
			}
			
			
			
			
			
			
			if(event.getSource() == living5ChairUpMenuItem)
			{
				X17=X17;
		  		Y17=Y17-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living5ChairDownMenuItem)
			{
				X17=X17;
		  		Y17=Y17+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living5ChairRightMenuItem)
			{
				X17=X17+7;
		  		Y17=Y17;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living5ChairLeftMenuItem)
			{
				X17=X17-7;
		  		Y17=Y17;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			
				
			}
			
			
			
			if(event.getSource() == living6ChairUpMenuItem)
			{
				X18=X18;
		  		Y18=Y18-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living6ChairDownMenuItem)
			{
				X18=X18;
		  		Y18=Y18+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living6ChairRightMenuItem)
			{
				X18=X18+7;
		  		Y18=Y18;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living6ChairLeftMenuItem)
			{
				X18=X18-7;
		  		Y18=Y18;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			
			
			if(event.getSource() == living7ChairUpMenuItem)
			{
				X19=X19;
		  		Y19=Y19-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living7ChairDownMenuItem)
			{
				X19=X19;
		  		Y19=Y19+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living7ChairRightMenuItem)
			{
				X19=X19+7;
		  		Y19=Y19;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == living7ChairLeftMenuItem)
			{
				X19=X19-7;
		  		Y19=Y19;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
					
			
				
			}
			
			
			
			if(event.getSource() == living8ChairUpMenuItem)
			{
				X20=X20;
		  		Y20=Y20-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
					
			}
			
			if(event.getSource() == living8ChairDownMenuItem)
			{
				X20=X20;
		  		Y20=Y20+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			if(event.getSource() == living8ChairRightMenuItem)
			{
				X20=X20+7;
		  		Y20=Y20;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			if(event.getSource() == living8ChairLeftMenuItem)
			{
				X20=X20-7;
		  		Y20=Y20;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			
				
			}
			
			
			
			
			
			
			if(event.getSource() == bedTableUpMenuItem)
			{
				X1=X1;
		  		Y1=Y1-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == bedTableDownMenuItem)
			{
				X1=X1;
		  		Y1=Y1+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == bedTableRightMenuItem)
			{
				X1=X1+7;
		  		Y1=Y1;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == bedTableLeftMenuItem)
			{
				X1=X1-7;
		  		Y1=Y1;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();	
			}
			
			
		
		
		
			if(event.getSource() == littleTableUpMenuItem)
			{
				X4=X4;
		  		Y4=Y4-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == littleTableDownMenuItem)
			{
				X4=X4;
		  		Y4=Y4+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == littleTableRightMenuItem)
			{
				X4=X4+7;
		  		Y4=Y4;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == littleTableLeftMenuItem)
			{
				X4=X4-7;
		  		Y4=Y4;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();				
			}
			
			
			
			
			
			if(event.getSource() == bigTableUpMenuItem)
			{
				X6=X6;
		  		Y6=Y6-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
					
			}
			if(event.getSource() == bigTableDownMenuItem)
			{
				X6=X6;
		  		Y6=Y6+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == bigTableRightMenuItem)
			{
				X6=X6+7;
		  		Y6=Y6;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == bigTableLeftMenuItem)
			{
				X6=X6-7;
		  		Y6=Y6;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();				
			}
			
			
			
			
			if(event.getSource() == officeTableUpMenuItem)
			{
				X8=X8;
		  		Y8=Y8-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			if(event.getSource() == officeTableDownMenuItem)
			{
				X8=X8;
		  		Y8=Y8+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
					
			}
			if(event.getSource() == officeTableRightMenuItem)
			{
				X8=X8+7;
		  		Y8=Y8;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == officeTableLeftMenuItem)
			{
				X8=X8-7;
		  		Y8=Y8;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();				
			}
			
			
		
			if(event.getSource() == kitchenTableUpMenuItem)
			{
				X9=X9;
		  		Y9=Y9-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == kitchenTableDownMenuItem)
			{
				X9=X9;
		  		Y9=Y9+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == kitchenTableRightMenuItem)
			{
				X9=X9+7;
		  		Y9=Y9;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
					
			}
			if(event.getSource() == kitchenTableLeftMenuItem)
			{
				X9=X9-7;
		  		Y9=Y9;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();				
			}
			
			
			
			
			if(event.getSource() == livingTableUpMenuItem)
			{
				X10=X10;
		  		Y10=Y10-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
		
			if(event.getSource() == livingTableDownMenuItem)
			{
				X10=X10;
		  		Y10=Y10+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == livingTableRightMenuItem)
			{
				X10=X10+7;
		  		Y10=Y10;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			if(event.getSource() == livingTableLeftMenuItem)
			{
				X10=X10-7;
		  		Y10=Y10;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();				
			}
			
			
			
			
			
			if(event.getSource() == couchUpMenuItem)
			{
				X11=X11;
		  		Y11=Y11-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
		
			if(event.getSource() == couchDownMenuItem)
			{
				X11=X11;
		  		Y11=Y11+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
					
			}
			
			if(event.getSource() == couchRightMenuItem)
			{
				X11=X11+7;
		  		Y11=Y11;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			if(event.getSource() == couchLeftMenuItem)
			{
				X11=X11-7;
		  		Y11=Y11;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();				
			}
			
			
			
			
			if(event.getSource() == tvUpMenuItem)
			{
				X12=X12;
		  		Y12=Y12-7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
			
			}
		
			if(event.getSource() == tvDownMenuItem)
			{
				X12=X12;
		  		Y12=Y12+7;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
				
			}
			
			if(event.getSource() == tvRightMenuItem)
			{
				X12=X12+7;
		  		Y12=Y12;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();
			}
			
			if(event.getSource() == tvLeftMenuItem)
			{
				X12=X12-7;
		  		Y12=Y12;		
				basePaint.mX(X1,X2,X3,X4,X5,X6,X7,X8,X9,
		  		X10,X11,X12,X13,X14,X15,X16,X17,X18,X19,X20);
		  		basePaint.mY(Y1,Y2,Y3,Y4,Y5,Y6,Y7,Y8,Y9,
		  		Y10,Y11,Y12,Y13,Y14,Y15,Y16,Y17,Y18,Y19,Y20);
		  		basePaint.repaint();				
			}
			if(event.getSource() == CarEMenuItem)
			{
				E=1;
				basePaint.car(E);
		  		basePaint.repaint();				
			}
			if(event.getSource() == CarNeMenuItem)
			{
				E=0;
				basePaint.car(E);
		  		basePaint.repaint();				
			}
		}	

	}

	public int getSelected(){
	
		Field[] fields = this.getClass().getFields();
		
		for (int idx = 0; idx < fields.length; idx++) {
			if (fields[idx].getName().contains("sel") ) {
				try {
					if (fields[idx].getInt(this)!=0){
					String no=fields[idx].getName().substring(3);
					return Integer.parseInt(no);
					}
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return 0;
	
	}
	
}