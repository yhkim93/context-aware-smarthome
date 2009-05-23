/*
* Created by JFormDesigner on Thu May 15 02:10:38 EEST 2008
*/
package PresentationLayer.util;
import com.jgoodies.uif_lite.panel.*;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.IExternalAccess;
import jadex.runtime.IMessageEvent;
import jadex.runtime.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.*;
import ontology.lowerOntology.Device;
import ontology.lowerOntology.Location;
import ontology.lowerOntology.Sensor;
import util.AgentMessage;
import KBLayer.CreateModel;
import com.hp.hpl.jena.ontology.Individual;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/**
* @author Hoszu Amalia
*/
public class SensorGui extends JPanel implements ActionListener {
private CreateModel model;
private Vector sensors;
private Vector devices;
private Vector states;
//private Vector sensorType;
private String uri;
private IExternalAccess agent;
private static final int TIMEOUT = 15000;
public SensorGui(final IExternalAccess agent) {
this.agent=agent;
model=new CreateModel("http://www.owl-ontologies.com/Ontology1207603095.owl#","file:ontology/sensor.owl");
sensors=new Vector();
devices=new Vector();
states=new Vector( model.getIndividuals("State"));
initComponents();
}

public JPanel getPanel(){
return this.panel2;
}
private void button2ActionPerformed(ActionEvent e) {
// TODO add your code here
}
private void initComponents() {
// JFormDesigner - Component initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
action1 = new AddSensor();
action2 = new AddNewDevice();
action3 = new EnableSensor();
action4 = new SetSensorData();
action5 = new DisableSensor();
action6 = new EnableDevice();
action7 = new DisableDevice();
action8 = new SetDeviceData();
panel2 = new JPanel();
panel5 = new JPanel();
tabbedPane2 = new JTabbedPane();
panel4 = new JPanel();
label6 = new JLabel();
comboBox7 = new JComboBox();
label7 = new JLabel();
comboBox8 = new JComboBox();
label8 = new JLabel();
comboBox9 = new JComboBox();
label9 = new JLabel();
comboBox10 = new JComboBox();
button5 = new JButton();
label16 = new JLabel();
comboBox15 = new JComboBox();
button1 = new JButton();
label10 = new JLabel();
textField1 = new JTextField();
button2 = new JButton();
simpleInternalFrame1 = new SimpleInternalFrame();
panel7 = new JPanel();
comboBox11 = new JComboBox();
label12 = new JLabel();
comboBox12 = new JComboBox();
label13 = new JLabel();
label14 = new JLabel();
comboBox13 = new JComboBox();
button10 = new JButton();
comboBox14 = new JComboBox();
button11 = new JButton();
label15 = new JLabel();
textField3 = new JTextField();
button4 = new JButton();
simpleInternalFrame2 = new SimpleInternalFrame();
label11 = new JLabel();
panel6 = new JPanel();
label1 = new JLabel();
comboBox16 = new JComboBox();
label27 = new JLabel();
textField2 = new JTextField();
label28 = new JLabel();
comboBox17 = new JComboBox();
label17 = new JLabel();
comboBox18 = new JComboBox();

label18 = new JLabel();
comboBox19 = new JComboBox();
button6 = new JButton();
simpleInternalFrame3 = new SimpleInternalFrame();
panel8 = new JPanel();
label2 = new JLabel();
comboBox20 = new JComboBox();
label3 = new JLabel();
comboBox22 = new JComboBox();
label29 = new JLabel();
textField4 = new JTextField();
label30 = new JLabel();
comboBox21 = new JComboBox();
label20 = new JLabel();
comboBox23 = new JComboBox();
button7 = new JButton();
simpleInternalFrame4 = new SimpleInternalFrame();
panel1 = new JPanel();
label32 = new JLabel();
label33 = new JLabel();
label4 = new JLabel();
label5 = new JLabel();
label19 = new JLabel();
comboBox1 = new JComboBox();
button3 = new JButton();
label24 = new JLabel();
comboBox4 = new JComboBox();
comboBox6 = new JComboBox();
comboBox27 = new JComboBox();
comboBox26 = new JComboBox();
label21 = new JLabel();
comboBox2 = new JComboBox();
button8 = new JButton();
label25 = new JLabel();
comboBox24 = new JComboBox();
comboBox28 = new JComboBox();
label22 = new JLabel();
comboBox3 = new JComboBox();
label23 = new JLabel();
comboBox5 = new JComboBox();
button12 = new JButton();
button9 = new JButton();
label26 = new JLabel();
comboBox25 = new JComboBox();
comboBox29 = new JComboBox();
label31 = new JLabel();
comboBox30 = new JComboBox();
simpleInternalFrame5 = new SimpleInternalFrame();
panel3 = new JPanel();
scrollPane1 = new JScrollPane();
textArea1 = new JTextArea();
action9 = new StateSelection();
action10 = new setMaryState();
action12 = new setJohnState();
action13 = new setJLittleJohnState();
action14 = new setLittleJaneState();
CellConstraints cc = new CellConstraints();
//======== panel2 ========
{
panel2.setBackground(Color.white);
// JFormDesigner evaluation mark
panel2.setBorder(new javax.swing.border.CompoundBorder(
new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,

javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
java.awt.Color.red), panel2.getBorder())); panel2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});
panel2.setLayout(new GridBagLayout());
((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {558, 0};
((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 314, 0};
((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0, 1.0E-4};
//======== panel5 ========
{
panel5.setBackground(new Color(205, 225, 255));
panel5.setLayout(new FormLayout(
"default:grow",
"default, default"));
//======== tabbedPane2 ========
{
tabbedPane2.setBackground(Color.white);
tabbedPane2.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
//======== panel4 ========
{
panel4.setBackground(Color.white);
panel4.setLayout(new FormLayout(
"47px, left:5px, 87px, left:5px, 105px, left:5px, 53px, left:5px, 77px, left:5px, pref:grow",
"60px, top:5px, 32px, top:5px, 32px, top:5px, 32px, top:5px, 32px, top:5px, 32px, top:5px, 32px, top:5px, pref:grow"));
//---- label6 ----
label6.setText("Sensor Type");
panel4.add(label6, cc.xywh(3, 3, 9, 1));
//---- comboBox7 ----
Vector sensorType=new Vector();
sensorType=model.getSubclasses("Sensor");
//sensorType=(Vector)agent.getBeliefbase().getBelief("sensorType").getFact();
comboBox7 = new JComboBox(sensorType);
comboBox7.setSelectedIndex(0);
comboBox7.addActionListener(this);
panel4.add(comboBox7, cc.xy(5, 3));
//---- label7 ----
label7.setText("Sensor ID");
panel4.add(label7, cc.xy(3, 5));
//---- comboBox8 ----
comboBox8.addActionListener(this);
comboBox8.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e) {
if (e.getStateChange() == ItemEvent.SELECTED) {
setCurrentSensorLocation(comboBox8,comboBox9);

setCurrentSensorValue(comboBox8,comboBox10);
setCurrentSensorStatus(comboBox8,comboBox15);
setCurrentSensorTimestamp(comboBox8,textField1);
}
}
});
panel4.add(comboBox8, cc.xy(5, 5));
//---- label8 ----
label8.setText("Sensor Location");
panel4.add(label8, cc.xy(3, 7));
//---- comboBox9 ----
Vector sensorLoc=new Vector();
sensorLoc=model.getIndividuals("IndoorSpace");
comboBox9 = new JComboBox(sensorLoc);
comboBox9.addActionListener(this);
panel4.add(comboBox9, cc.xy(5, 7));
//---- label9 ----
label9.setText("Sensor Value");
panel4.add(label9, cc.xy(3, 9));
//---- comboBox10 ----
Vector sensorValue=new Vector();
sensorValue=model.getAllowableValues("sensorValue");
comboBox10 = new JComboBox(sensorValue);
//comboBox10.setSelectedItem(s.getSensorValue());
comboBox10.addActionListener(this);
panel4.add(comboBox10, cc.xy(5, 9));
//---- button5 ----
button5.setAction(action3);
panel4.add(button5, cc.xy(9, 9));
//---- label16 ----
label16.setText("Sensor Status");
panel4.add(label16, cc.xy(3, 11));
//---- comboBox15 ----
Vector sensorStatus=new Vector();
sensorStatus=model.getAllowableValues("deviceStatus");
comboBox15 = new JComboBox(sensorStatus);
comboBox15.addActionListener(this);
panel4.add(comboBox15, cc.xy(5, 11));
//---- button1 ----
button1.setAction(action5);
panel4.add(button1, cc.xy(9, 11));
//---- label10 ----
label10.setText("Timestamp");
panel4.add(label10, cc.xy(3, 13));

//---- textField1 ----
textField1.setEnabled(false);
textField1.setEnabled(false);
panel4.add(textField1, cc.xy(5, 13));
//---- button2 ----
button2.setAction(action4);
button2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
button2ActionPerformed(e);
}
});
panel4.add(button2, cc.xy(9, 13));
//======== simpleInternalFrame1 ========
{
simpleInternalFrame1.setTitle("text");
Container simpleInternalFrame1ContentPane = simpleInternalFrame1.getContentPane();
simpleInternalFrame1ContentPane.setLayout(new FormLayout(
"default",
"default"));
}
panel4.add(simpleInternalFrame1, cc.xywh(1, 1, 11, 15));
}
tabbedPane2.addTab("Sensors", new ImageIcon(getClass().getResource("/images/sensor2.png")), panel4);
//======== panel7 ========
{
panel7.setBackground(Color.white);
panel7.setLayout(new FormLayout(
new ColumnSpec[] {
new ColumnSpec(Sizes.dluX(31)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(58)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(63)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(35)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(46)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(ColumnSpec.FILL, Sizes.DEFAULT, FormSpec.DEFAULT_GROW)
},
new RowSpec[] {
new RowSpec(Sizes.dluY(40)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,

new RowSpec(RowSpec.CENTER, Sizes.dluY(63), FormSpec.DEFAULT_GROW),
FormFactory.LINE_GAP_ROWSPEC,
FormFactory.DEFAULT_ROWSPEC,
FormFactory.LINE_GAP_ROWSPEC,
FormFactory.DEFAULT_ROWSPEC
}));
//---- comboBox11 ----
Vector deviceType=new Vector();
deviceType=model.getDirectSubclasses("Device");
comboBox11 = new JComboBox(deviceType);
comboBox11.setSelectedIndex(0);
comboBox11.addActionListener(this);
panel7.add(comboBox11, cc.xy(5, 3));
//---- label12 ----
label12.setText("Device ID");
panel7.add(label12, cc.xy(3, 5));
//---- comboBox12 ----
comboBox12.addActionListener(this);
comboBox12.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e) {
if (e.getStateChange() == ItemEvent.SELECTED) {
setCurrentDeviceLocation(comboBox12,comboBox13);
setCurrentDeviceValue(comboBox12,comboBox14);
setCurrentDeviceTimestamp(comboBox12,textField3);
}
}
});
panel7.add(comboBox12, cc.xy(5, 5));
//---- label13 ----
label13.setText("Device Location");
panel7.add(label13, cc.xy(3, 7));
//---- label14 ----
label14.setText("Device Status");
panel7.add(label14, cc.xy(3, 9));
//---- comboBox13 ----
Vector deviceLoc=new Vector();
deviceLoc=model.getIndividuals("IndoorSpace");
comboBox13 = new JComboBox(deviceLoc);
comboBox13.addActionListener(this);
panel7.add(comboBox13, cc.xy(5, 7));
//---- button10 ----
button10.setSelectedIcon(null);
button10.setAction(action6);
panel7.add(button10, cc.xy(9, 7));
//---- comboBox14 ----
Vector deviceValue=new Vector();
deviceValue=model.getAllowableValues("deviceStatus");
comboBox14 = new JComboBox(deviceValue);
comboBox14.addActionListener(this);
panel7.add(comboBox14, cc.xy(5, 9));
//---- button11 ----
button11.setAction(action7);
panel7.add(button11, cc.xy(9, 9));

//---- label15 ----
label15.setText("Timestamp");
panel7.add(label15, cc.xy(3, 11));
//---- textField3 ----
textField3.setEnabled(false);
textField3.setEnabled(false);
panel7.add(textField3, cc.xy(5, 11));
//---- button4 ----
button4.setAction(action8);
button4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
button2ActionPerformed(e);
}
});
panel7.add(button4, cc.xy(9, 11));
//======== simpleInternalFrame2 ========
{
simpleInternalFrame2.setTitle("text");
Container simpleInternalFrame2ContentPane = simpleInternalFrame2.getContentPane();
simpleInternalFrame2ContentPane.setLayout(new FormLayout(
"default",
"default"));
}
panel7.add(simpleInternalFrame2, cc.xywh(1, 1, 11, 13));
//---- label11 ----
label11.setText("Device Type");
panel7.add(label11, cc.xywh(3, 3, 9, 1));
}
tabbedPane2.addTab("Devices", new ImageIcon(getClass().getResource("/images/device1.png")), panel7);
//======== panel6 ========
{
panel6.setBackground(Color.white);
panel6.setLayout(new FormLayout(
new ColumnSpec[] {
new ColumnSpec(Sizes.dluX(31)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(58)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(63)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(35)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(46)),
new ColumnSpec(ColumnSpec.FILL, Sizes.DEFAULT, FormSpec.DEFAULT_GROW),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(ColumnSpec.FILL, Sizes.DEFAULT, FormSpec.DEFAULT_GROW)
},
new RowSpec[] {

new RowSpec(Sizes.dluY(40)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(RowSpec.CENTER, Sizes.DEFAULT, FormSpec.DEFAULT_GROW),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.DLUY11)
}));
//---- label1 ----
label1.setText("Sensor Type");
panel6.add(label1, cc.xy(3, 3));
//---- comboBox16 ----
Vector sensorType=new Vector();
sensorType=model.getSubclasses("Sensor");
comboBox16 = new JComboBox(sensorType);
comboBox16.setSelectedIndex(0);
comboBox16.addActionListener(this);
panel6.add(comboBox16, cc.xy(5, 3));
//---- label27 ----
label27.setText("Sensor ID");
panel6.add(label27, cc.xy(3, 5));
panel6.add(textField2, cc.xy(5, 5));
//---- label28 ----
label28.setText("Sensor Location");
panel6.add(label28, cc.xy(3, 7));
//---- comboBox17 ----
Vector sensorLoc=new Vector();
sensorLoc=model.getIndividuals("IndoorSpace");
comboBox17 = new JComboBox(sensorLoc);
comboBox17.addActionListener(this);
panel6.add(comboBox17, cc.xy(5, 7));
//---- label17 ----
label17.setText("Sensor Value");
panel6.add(label17, cc.xy(3, 9));
//---- comboBox18 ----
Vector sensorValue=new Vector();
sensorValue=model.getAllowableValues("sensorValue");
comboBox18 = new JComboBox(sensorValue);
//comboBox10.setSelectedItem(s.getSensorValue());
comboBox18.addActionListener(this);
panel6.add(comboBox18, cc.xy(5, 9));
//---- label18 ----

label18.setText("Sensor Status");
panel6.add(label18, cc.xy(3, 11));
//---- comboBox19 ----
Vector sensorStatus=new Vector();
sensorStatus=model.getAllowableValues("deviceStatus");
comboBox19 = new JComboBox(sensorStatus);
comboBox19.addActionListener(this);
panel6.add(comboBox19, cc.xy(5, 11));
//---- button6 ----
button6.setAction(action1);
panel6.add(button6, cc.xy(9, 11));
//======== simpleInternalFrame3 ========
{
simpleInternalFrame3.setTitle("text");
Container simpleInternalFrame3ContentPane = simpleInternalFrame3.getContentPane();
simpleInternalFrame3ContentPane.setLayout(new FormLayout(
"default",
"default"));
}
panel6.add(simpleInternalFrame3, cc.xywh(1, 1, 13, 13));
}
tabbedPane2.addTab("Sensor Management", new ImageIcon(getClass().getResource("/images/sensor1.png")), panel6);
//======== panel8 ========
{
panel8.setBackground(Color.white);
panel8.setLayout(new FormLayout(
new ColumnSpec[] {
new ColumnSpec(Sizes.dluX(29)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(58)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(63)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(35)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(47)),
new ColumnSpec(ColumnSpec.FILL, Sizes.DEFAULT, FormSpec.DEFAULT_GROW),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(ColumnSpec.FILL, Sizes.DEFAULT, FormSpec.DEFAULT_GROW)
},
new RowSpec[] {
new RowSpec(Sizes.dluY(40)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(20)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),

FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(21)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(RowSpec.CENTER, Sizes.DEFAULT, FormSpec.DEFAULT_GROW),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.DLUY11),
FormFactory.LINE_GAP_ROWSPEC,
FormFactory.DEFAULT_ROWSPEC,
FormFactory.LINE_GAP_ROWSPEC,
FormFactory.DEFAULT_ROWSPEC,
FormFactory.LINE_GAP_ROWSPEC,
FormFactory.DEFAULT_ROWSPEC,
FormFactory.LINE_GAP_ROWSPEC,
FormFactory.DEFAULT_ROWSPEC
}));
//---- label2 ----
label2.setText("Device Type");
panel8.add(label2, cc.xy(3, 3));
//---- comboBox20 ----
Vector sensorType=new Vector();
sensorType=model.getDirectSubclasses("Device");
comboBox20 = new JComboBox(sensorType);
comboBox20.setSelectedIndex(0);
comboBox20.addActionListener(this);
panel8.add(comboBox20, cc.xy(5, 3));
//---- label3 ----
label3.setText("Device");
panel8.add(label3, cc.xy(3, 5));
//---- comboBox22 ----
Vector deviceSubType=new Vector();
deviceSubType=model.getDirectSubclasses(comboBox20.getSelectedItem().toString());;
comboBox22 = new JComboBox(deviceSubType);
comboBox22.setSelectedIndex(0);
comboBox22.addActionListener(this);
panel8.add(comboBox22, cc.xy(5, 5));
//---- label29 ----
label29.setText("Device ID");
panel8.add(label29, cc.xy(3, 7));
panel8.add(textField4, cc.xy(5, 7));
//---- label30 ----
label30.setText("Device Location");
panel8.add(label30, cc.xy(3, 9));
//---- comboBox21 ----
Vector sensorLoc=new Vector();
sensorLoc=model.getIndividuals("IndoorSpace");
comboBox21 = new JComboBox(sensorLoc);
comboBox21.addActionListener(this);
panel8.add(comboBox21, cc.xy(5, 9));
//---- label20 ----
label20.setText("Device Status");
panel8.add(label20, cc.xy(3, 11));
//---- comboBox23 ----

Vector sensorStatus=new Vector();
sensorStatus=model.getAllowableValues("deviceStatus");
comboBox23 = new JComboBox(sensorStatus);
comboBox23.addActionListener(this);
panel8.add(comboBox23, cc.xy(5, 11));
//---- button7 ----
button7.setAction(action2);
panel8.add(button7, cc.xy(9, 11));
//======== simpleInternalFrame4 ========
{
simpleInternalFrame4.setTitle("text");
Container simpleInternalFrame4ContentPane = simpleInternalFrame4.getContentPane();
simpleInternalFrame4ContentPane.setLayout(new FormLayout("default", "default"));
}
panel8.add(simpleInternalFrame4, cc.xywh(1, 1, 13, 23));
}
tabbedPane2.addTab("Device Management", new ImageIcon(getClass().getResource("/images/device2.png")), panel8);
//======== panel1 ========
{
panel1.setLayout(new FormLayout(
new ColumnSpec[] {
new ColumnSpec(Sizes.dluX(29)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(59)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(71)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
FormFactory.DEFAULT_COLSPEC,
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(75)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(63)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(31)),
FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
new ColumnSpec(Sizes.dluX(68))
},
new RowSpec[] {
FormFactory.DEFAULT_ROWSPEC,
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(13)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(69)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(69)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(69)),
FormFactory.LINE_GAP_ROWSPEC,
new RowSpec(Sizes.dluY(69)),
FormFactory.LINE_GAP_ROWSPEC,
FormFactory.DEFAULT_ROWSPEC
}));
//---- label32 ----
label32.setText("Entity");
panel1.add(label32, cc.xy(3, 3));

//---- label33 ----
label33.setText("State");
panel1.add(label33, cc.xy(5, 3));
//---- label4 ----
label4.setText("Location");
panel1.add(label4, cc.xy(11, 3));
//---- label5 ----
label5.setText("Activity");
panel1.add(label5, cc.xy(15, 3));
//---- label19 ----
label19.setText("Mary");
panel1.add(label19, cc.xy(3, 5));
//---- comboBox1 ----
comboBox1.setAction(action9);
comboBox1=ComboBoxRenderer.initCombo(comboBox1,states,label24);
comboBox1.setSelectedItem(model.getIndividualPropertyValue("Mary","hasState"));
comboBox1.addActionListener(this);
panel1.add(comboBox1, cc.xy(5, 5));
//---- button3 ----
button3.setAction(action10);
panel1.add(button3, cc.xy(7, 5));
panel1.add(label24, cc.xy(9, 5));
//---- comboBox4 ----
Vector sensorLoc=new Vector();
sensorLoc=model.getIndividuals("Location");
comboBox4 = new JComboBox(sensorLoc);
comboBox4.setSelectedItem(model.getIndividualPropertyValue("Mary","hasLocation"));
panel1.add(comboBox4, cc.xy(11, 5));
//---- comboBox6 ----
Vector activity=new Vector();
activity=model.getIndividuals("Activity");
comboBox6 = new JComboBox(activity);
comboBox6.setSelectedItem(model.getIndividualPropertyValue("Mary","hasActivity"));
panel1.add(comboBox6, cc.xy(15, 5));
//---- comboBox27 ----
sensorLoc=new Vector();
sensorLoc=model.getIndividuals("Location");
comboBox27 = new JComboBox(sensorLoc);
comboBox27.setSelectedItem(model.getIndividualPropertyValue("LittleJohn","hasLocation"));
panel1.add(comboBox27, cc.xy(11, 11));
//---- comboBox26 ----
sensorLoc=new Vector();
sensorLoc=model.getIndividuals("Location");
comboBox26 = new JComboBox(sensorLoc);
comboBox26.setSelectedItem(model.getIndividualPropertyValue("Jane","hasLocation"));
panel1.add(comboBox26, cc.xy(11, 9));
//---- label21 ----
label21.setText("John");
panel1.add(label21, cc.xy(3, 7));

//---- comboBox2 ----
comboBox2.setAction(null);
comboBox2=ComboBoxRenderer.initCombo(comboBox2,states,label25);
comboBox2.addActionListener(this);
comboBox2.setSelectedItem(model.getIndividualPropertyValue("John","hasState"));
panel1.add(comboBox2, cc.xy(5, 7));
//---- button8 ----
button8.setAction(action12);
panel1.add(button8, cc.xy(7, 7));
panel1.add(label25, cc.xy(9, 7));
//---- comboBox24 ----
sensorLoc=new Vector();
sensorLoc=model.getIndividuals("Location");
comboBox24 = new JComboBox(sensorLoc);
comboBox24.setSelectedItem(model.getIndividualPropertyValue("John","hasLocation"));
panel1.add(comboBox24, cc.xy(11, 7));
//---- comboBox28 ----
activity=new Vector();
activity=model.getIndividuals("Activity");
comboBox28 = new JComboBox(activity);
comboBox28.setSelectedItem(model.getIndividualPropertyValue("John","hasActivity"));
panel1.add(comboBox28, cc.xy(15, 7));
//---- label22 ----
label22.setText("Jane");
panel1.add(label22, cc.xy(3, 9));
//---- comboBox3 ----
comboBox3=ComboBoxRenderer.initCombo(comboBox3,states,label26);
comboBox3.addActionListener(this);
comboBox3.setSelectedItem(model.getIndividualPropertyValue("Jane","hasState"));
panel1.add(comboBox3, cc.xy(5, 9));
//---- label23 ----
label23.setText("LittleJohn");
panel1.add(label23, cc.xy(3, 11));
//---- comboBox5 ----
comboBox5=ComboBoxRenderer.initCombo(comboBox5,states,label31);
comboBox5.addActionListener(this);
comboBox5.setSelectedItem(model.getIndividualPropertyValue("LittleJohn","hasState"));
panel1.add(comboBox5, cc.xy(5, 11));
//---- button12 ----
button12.setAction(action13);
panel1.add(button12, cc.xy(7, 11));
//---- button9 ----
button9.setAction(action14);
panel1.add(button9, cc.xy(7, 9));
panel1.add(label26, cc.xy(9, 9));
panel1.add(comboBox25, cc.xy(11, 9));
//---- comboBox29 ----
activity=new Vector();

activity=model.getIndividuals("Activity");
comboBox29 = new JComboBox(activity);
comboBox29.setSelectedItem(model.getIndividualPropertyValue("Jane","hasActivity"));
panel1.add(comboBox29, cc.xy(15, 9));
panel1.add(label31, cc.xy(9, 11));
//---- comboBox30 ----
activity=new Vector();
activity=model.getIndividuals("Activity");
comboBox30 = new JComboBox(activity);
comboBox30.setSelectedItem(model.getIndividualPropertyValue("LittleJohn","hasActivity"));
panel1.add(comboBox30, cc.xy(15, 11));
//======== simpleInternalFrame5 ========
{
simpleInternalFrame5.setTitle("text");
Container simpleInternalFrame5ContentPane = simpleInternalFrame5.getContentPane();
simpleInternalFrame5ContentPane.setLayout(new FormLayout(
"default",
"default"));
}
panel1.add(simpleInternalFrame5, cc.xywh(1, 1, 15, 13));
}
tabbedPane2.addTab("State Detector", new ImageIcon(getClass().getResource("/images/emoticon.png")), panel1);
}
panel5.add(tabbedPane2, cc.xy(1, 1));
}
panel2.add(panel5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
GridBagConstraints.CENTER, GridBagConstraints.BOTH,
new Insets(0, 0, 5, 0), 0, 0));
//======== panel3 ========
{
panel3.setBorder(new CompoundBorder(
new TitledBorder("Action Log"),
new EmptyBorder(5, 5, 5, 5)));
panel3.setBackground(new Color(205, 225, 255));
panel3.setLayout(new GridBagLayout());
((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {95, 0};
((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {243, 0};
((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};
setCurrentComboValues();
//======== scrollPane1 ========
{
scrollPane1.setViewportView(textArea1);
}
panel3.add(scrollPane1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
GridBagConstraints.CENTER, GridBagConstraints.BOTH,
new Insets(0, 0, 0, 0), 0, 0));
}
panel2.add(panel3, new GridBagConstraints(0, 1, 1, 2, 0.0, 0.0,
GridBagConstraints.CENTER, GridBagConstraints.BOTH,
new Insets(0, 0, 0, 0), 0, 0));
}
// JFormDesigner - End of component initialization //GEN-END:initComponents
}
// JFormDesigner - Variables declaration - DO NOT MODIFY //GEN-BEGIN:variables
// Generated using JFormDesigner Evaluation license - Hoszu Amalia

private AddSensor action1;
private AddNewDevice action2;
private EnableSensor action3;
private SetSensorData action4;
private DisableSensor action5;
private EnableDevice action6;
private DisableDevice action7;
private SetDeviceData action8;
private JPanel panel2;
private JPanel panel5;
private JTabbedPane tabbedPane2;
private JPanel panel4;
private JLabel label6;
private JComboBox comboBox7;
private JLabel label7;
private JComboBox comboBox8;
private JLabel label8;
private JComboBox comboBox9;
private JLabel label9;
private JComboBox comboBox10;
private JButton button5;
private JLabel label16;
private JComboBox comboBox15;
private JButton button1;
private JLabel label10;
private JTextField textField1;
private JButton button2;
private SimpleInternalFrame simpleInternalFrame1;
private JPanel panel7;
private JComboBox comboBox11;
private JLabel label12;
private JComboBox comboBox12;
private JLabel label13;
private JLabel label14;
private JComboBox comboBox13;
private JButton button10;
private JComboBox comboBox14;
private JButton button11;
private JLabel label15;
private JTextField textField3;
private JButton button4;
private SimpleInternalFrame simpleInternalFrame2;
private JLabel label11;
private JPanel panel6;
private JLabel label1;
private JComboBox comboBox16;
private JLabel label27;
private JTextField textField2;
private JLabel label28;
private JComboBox comboBox17;
private JLabel label17;
private JComboBox comboBox18;
private JLabel label18;
private JComboBox comboBox19;
private JButton button6;
private SimpleInternalFrame simpleInternalFrame3;
private JPanel panel8;
private JLabel label2;
private JComboBox comboBox20;
private JLabel label3;
private JComboBox comboBox22;
private JLabel label29;
private JTextField textField4;
private JLabel label30;
private JComboBox comboBox21;
private JLabel label20;
private JComboBox comboBox23;

private JButton button7;
private SimpleInternalFrame simpleInternalFrame4;
private JPanel panel1;
private JLabel label32;
private JLabel label33;
private JLabel label4;
private JLabel label5;
private JLabel label19;
private JComboBox comboBox1;
private JButton button3;
private JLabel label24;
private JComboBox comboBox4;
private JComboBox comboBox6;
private JComboBox comboBox27;
private JComboBox comboBox26;
private JLabel label21;
private JComboBox comboBox2;
private JButton button8;
private JLabel label25;
private JComboBox comboBox24;
private JComboBox comboBox28;
private JLabel label22;
private JComboBox comboBox3;
private JLabel label23;
private JComboBox comboBox5;
private JButton button12;
private JButton button9;
private JLabel label26;
private JComboBox comboBox25;
private JComboBox comboBox29;
private JLabel label31;
private JComboBox comboBox30;
private SimpleInternalFrame simpleInternalFrame5;
private JPanel panel3;
private JScrollPane scrollPane1;
private JTextArea textArea1;
private StateSelection action9;
private setMaryState action10;
private setJohnState action12;
private setJLittleJohnState action13;
private setLittleJaneState action14;
// JFormDesigner - End of variables declaration //GEN-END:variables
public void actionPerformed(ActionEvent e) {
if (e.getSource() == comboBox7) {
setCurrentSensorComboValues();
}
else if (e.getSource() == comboBox11) {
setCurrentDeviceComboValues();
}
else if (e.getSource() == comboBox20) {
Vector deviceSubType=new Vector();
deviceSubType=model.getDirectSubclasses(comboBox20.getSelectedItem().toString());;
comboBox22.removeAllItems();
for (int i=0;i<deviceSubType.size(); i++) {
String s=(String)deviceSubType.elementAt(i);
comboBox22.addItem(s);
}
comboBox22.setSelectedIndex(0);
}
else if (e.getSource() == comboBox1) {
String sel = (String)comboBox1.getSelectedItem();
ComboBoxRenderer.updateLabel(sel,label24);
}

else if (e.getSource() == comboBox2) {
String sel = (String)comboBox2.getSelectedItem();
ComboBoxRenderer.updateLabel(sel,label25);
}
else if (e.getSource() == comboBox3) {
String sel = (String)comboBox3.getSelectedItem();
ComboBoxRenderer.updateLabel(sel,label26);
}
else if (e.getSource() == comboBox5) {
String sel = (String)comboBox5.getSelectedItem();
ComboBoxRenderer.updateLabel(sel,label31);
}
}
public void createSensor(String individualClass,String sensorValue, String timestamp, String deviceStatus,String instanceName,String location) {
Individual x=model.createIndividual(instanceName,individualClass);
model.setPropertyValue(instanceName, "sensorValue", sensorValue,true);
model.setPropertyValue(instanceName, "timestamp",timestamp,true);
model.setPropertyValue(instanceName, "instanceName", instanceName,true);
model.setPropertyValue(instanceName, "deviceStatus", deviceStatus,true);
model.setPropertyValue(instanceName,"hasLocation",location,false);
}
public void createDevice(String individualClass,String timestamp, String deviceStatus,String instanceName,String location) {
Individual x=model.createIndividual(instanceName,individualClass);
model.setPropertyValue(instanceName, "timestamp",timestamp,true);
model.setPropertyValue(instanceName, "instanceName", instanceName,true);
model.setPropertyValue(instanceName, "deviceStatus", deviceStatus,true);
model.setPropertyValue(instanceName,"hasLocation",location,false);
}
public Vector getGuiContent(String sensorType) {
Vector sensorInd=new Vector();
sensorInd=model.getIndividuals(sensorType);
for (int i=0;i<sensorInd.size(); i++) {
String crt=(String)sensorInd.elementAt(i);
Location loc=new Location(model.getIndividualPropertyValue(crt,"hasLocation"));
Sensor s=new Sensor(model.getIndividualPropertyValue(crt,"deviceStatus"),
loc,
model.getIndividualPropertyValue(crt,"instanceName"),
model.getIndividualPropertyValue(crt,"sensorValue"),
model.getIndividualPropertyValue(crt,"timestamp")
);
sensors.addElement(s);
}
return sensors;
}
public Vector getGuiContent2(String deviceType) {
Vector sensorInd=new Vector();
sensorInd=model.getIndividuals(deviceType);
for (int i=0;i<sensorInd.size(); i++) {
String crt=(String)sensorInd.elementAt(i);
Location loc=new Location(model.getIndividualPropertyValue(crt,"hasLocation"));
Device s=new Device(model.getIndividualPropertyValue(crt,"deviceStatus"),
loc,

model.getIndividualPropertyValue(crt,"instanceName"),
model.getIndividualPropertyValue(crt,"timestamp")
);
devices.addElement(s);
}
return devices;
}
public Sensor getCurrentSensor(String sensorId) {
Sensor s=new Sensor();
for (int i=0;i<sensors.size(); i++) {
s=(Sensor)sensors.elementAt(i);
if (s.getInstanceName().equals(sensorId)){
return s;
}
}
return s;
}
public Device getCurrentDevice(String deviceId) {
Device s=new Device();
for (int i=0;i<devices.size(); i++) {
s=(Device)devices.elementAt(i);
if (s.getInstanceName().equals(deviceId)){
return s;
}
}
return s;
}
public void setCurrentComboValues() {
setCurrentSensorComboValues() ;
setCurrentDeviceComboValues() ;
}
public void setCurrentSensorComboValues() {
setCurrentSensorId(comboBox7,comboBox8);
setCurrentSensorLocation(comboBox8,comboBox9);
setCurrentSensorValue(comboBox8,comboBox10);
setCurrentSensorStatus(comboBox8,comboBox15);
setCurrentSensorTimestamp(comboBox8,textField1);
}
public void setCurrentSensorIdComboValues() {
setCurrentSensorLocation(comboBox8,comboBox9);
setCurrentSensorValue(comboBox8,comboBox10);
setCurrentSensorStatus(comboBox8,comboBox15);
setCurrentSensorTimestamp(comboBox8,textField1);
}
public void setCurrentDeviceIdComboValues() {
setCurrentDeviceLocation(comboBox12,comboBox13);
setCurrentDeviceValue(comboBox12,comboBox14);
setCurrentDeviceTimestamp(comboBox12,textField3);
}
public void setCurrentDeviceComboValues() {
setCurrentDeviceId(comboBox11,comboBox12);
setCurrentDeviceLocation(comboBox12,comboBox13);
setCurrentDeviceValue(comboBox12,comboBox14);
setCurrentDeviceTimestamp(comboBox12,textField3);

}
public void setCurrentSensorLocation(JComboBox modified,JComboBox update){
Sensor s= new Sensor();
s=getCurrentSensor(modified.getSelectedItem().toString());
update.setSelectedItem(s.getHasLocation().getInstanceName());
}
public void setCurrentSensorValue(JComboBox modified,JComboBox update){
Sensor s= new Sensor();
s=getCurrentSensor(modified.getSelectedItem().toString());
update.setSelectedItem(s.getSensorValue());
}
public void setCurrentSensorStatus(JComboBox modified,JComboBox update){
Sensor s= new Sensor();
s=getCurrentSensor(modified.getSelectedItem().toString());
update.setSelectedItem(s.getDeviceStatus());
}
public void setCurrentDeviceLocation(JComboBox modified,JComboBox update){
Device s= new Device();
s=getCurrentDevice(modified.getSelectedItem().toString());
update.setSelectedItem(s.getHasLocation().getInstanceName());
}
public void setCurrentDeviceValue(JComboBox modified,JComboBox update){
Device s= new Device();
s=getCurrentDevice(modified.getSelectedItem().toString());
update.setSelectedItem(s.getDeviceStatus());
}
public void setCurrentSensorId(JComboBox modified,JComboBox update){
if (sensors.capacity()!=0)
sensors.removeAllElements();
update.removeAllItems();
sensors=getGuiContent(modified.getSelectedItem().toString());
Sensor s= new Sensor();
for (int i=0;i<sensors.size(); i++) {
s=(Sensor)sensors.elementAt(i);
update.addItem(s.getInstanceName());
}
update.setSelectedIndex(0);
}
public void setCurrentDeviceId(JComboBox modified,JComboBox update){
if (devices.capacity()!=0)
devices.removeAllElements();
update.removeAllItems();
devices=getGuiContent2(modified.getSelectedItem().toString());
Device s= new Device();
for (int i=0;i<devices.size(); i++) {
s=(Device)devices.elementAt(i);
update.addItem(s.getInstanceName());
}
update.setSelectedIndex(0);
}
public void setCurrentSensorTimestamp(JComboBox modified,JTextField update){
Sensor s= new Sensor();
s=getCurrentSensor(modified.getSelectedItem().toString());
update.setText(s.getTimestamp());
}
public void setCurrentDeviceTimestamp(JComboBox modified,JTextField update){

Device s= new Device();
s=getCurrentDevice(modified.getSelectedItem().toString());
update.setText(s.getTimestamp());
}
private class AddSensor extends AbstractAction {
private AddSensor() {
// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "SET");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String individualName=textField2.getText();
String individualClass=comboBox16.getSelectedItem().toString();
Individual x=model.createIndividual(individualName,individualClass);
createSensor(individualClass,
comboBox18.getSelectedItem().toString(),
"124564646",
comboBox19.getSelectedItem().toString(),
individualName,
comboBox17.getSelectedItem().toString());
textArea1.setText(textArea1.getText()+" \n"+ " Added New Sensor: "+individualName +"\n\t Sensor Value: "+ comboBox10.getSelectedItem().toString()
+"\n \t Sensor Value: " + comboBox18.getSelectedItem().toString()
+"\n \t Sensor Status: " + comboBox19.getSelectedItem().toString()
+"\n \t Sensor Location: "+comboBox17.getSelectedItem().toString()
+"\n \t at ");
}
}
private class AddNewDevice extends AbstractAction {
private AddNewDevice() {
// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "SET");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String individualName=textField4.getText();
String individualClass=comboBox20.getSelectedItem().toString();
Individual x=model.createIndividual(individualName,individualClass);
createDevice(individualClass,
"124564646",
comboBox23.getSelectedItem().toString(),
individualName,
comboBox21.getSelectedItem().toString());
textArea1.setText(textArea1.getText()+" \n"+ " Added New Device: "+individualName
+"\n \t Device Status: " + comboBox23.getSelectedItem().toString()
+"\n \t Device Location: "+comboBox21.getSelectedItem().toString()
+"\n \t at ");
}
}
private class EnableSensor extends AbstractAction {
private EnableSensor() {

// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "Enable");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String instanceName=comboBox12.getSelectedItem().toString();
model.setPropertyValue(instanceName, "deviceStatus","ON",true);
comboBox15.setSelectedItem("ON");
textArea1.setText(textArea1.getText()+" \n"+ " Sensor instance: "+instanceName+" enabled at "+textField1.getText());
setCurrentSensorId(comboBox7,comboBox8);
}
}
private class SetSensorData extends AbstractAction {
private SetSensorData() {
// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "SET");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String instanceName=comboBox8.getSelectedItem().toString();
model.setPropertyValue(instanceName, "sensorValue", comboBox10.getSelectedItem().toString(),true);
model.setPropertyValue(instanceName, "timestamp","54645564561",true);
model.setPropertyValue(instanceName, "deviceStatus", comboBox15.getSelectedItem().toString(),true);
model.setPropertyValue(instanceName,"hasLocation",comboBox9.getSelectedItem().toString(),false);
textArea1.setText(textArea1.getText()+" \n"+ " Set Sensor: "+instanceName
+"\n\t Sensor Value: "+ comboBox10.getSelectedItem().toString()
+"\n \t Sensor Status: " + comboBox15.getSelectedItem().toString()
+"\n \t Sensor Location: "+comboBox9.getSelectedItem().toString()
+"\n \t at "+textField1.getText());
setCurrentSensorId(comboBox7,comboBox8);
Sensor sensor=new Sensor(comboBox15.getSelectedItem().toString(),
new Location(comboBox9.getSelectedItem().toString()),
instanceName,
comboBox9.getSelectedItem().toString(),
((Long)System.currentTimeMillis()).toString()
);
jadex.adapter.fipa.AgentIdentifier receiver;
receiver = new AgentIdentifier("LightSensor",true);
IMessageEvent me = agent.createMessageEvent("message");
me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(receiver);
me.setContent(sensor);
IMessageEvent reply = agent.sendMessageAndWait(me, TIMEOUT);
}
}
private class DisableSensor extends AbstractAction {
private DisableSensor() {

// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "Disable");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String instanceName=comboBox8.getSelectedItem().toString();
model.setPropertyValue(instanceName, "deviceStatus","OFF",true);
comboBox15.setSelectedItem("OFF");
textArea1.setText(textArea1.getText()+" \n"+ " Sensor instance: "+instanceName+" disabled at "+textField1.getText());
setCurrentSensorId(comboBox7,comboBox8);
}
}
private class EnableDevice extends AbstractAction {
private EnableDevice() {
// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "Enable");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String instanceName=comboBox12.getSelectedItem().toString();
model.setPropertyValue(instanceName, "deviceStatus","ON",true);
comboBox14.setSelectedItem("ON");
textArea1.setText(textArea1.getText()+" \n"+ " Device instance: "+instanceName+" enabled at "+textField3.getText());
setCurrentDeviceId(comboBox11,comboBox12);
}
}
private class DisableDevice extends AbstractAction {
private DisableDevice() {
// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "Disable");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String instanceName=comboBox12.getSelectedItem().toString();
model.setPropertyValue(instanceName, "deviceStatus","OFF",true);
comboBox14.setSelectedItem("OFF");
textArea1.setText(textArea1.getText()+" \n"+ " Device instance: "+instanceName+" disabled at "+textField3.getText());
setCurrentDeviceId(comboBox11,comboBox12);
}
}
private class SetDeviceData extends AbstractAction {
private SetDeviceData() {
// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "SET");
// JFormDesigner - End of action initialization //GEN-END:initComponents

}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String instanceName=comboBox12.getSelectedItem().toString();
model.setPropertyValue(instanceName, "timestamp","54645564561",true);
model.setPropertyValue(instanceName, "deviceStatus", comboBox14.getSelectedItem().toString(),true);
model.setPropertyValue(instanceName,"hasLocation",comboBox13.getSelectedItem().toString(),false);
textArea1.setText(textArea1.getText()+" \n"+ " Set Sensor: "+instanceName
+"\n \t Sensor Status: " + comboBox14.getSelectedItem().toString()
+"\n \t Sensor Location: "+comboBox13.getSelectedItem().toString()
+"\n \t at "+textField1.getText());
setCurrentDeviceId(comboBox11,comboBox12);
}
}
private class StateSelection extends AbstractAction {
private StateSelection() {
// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "selectState");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String sel = (String)comboBox1.getSelectedItem();
ComboBoxRenderer.updateLabel(sel,label24);
}
}
private class setMaryState extends AbstractAction {
private setMaryState() {
// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "SET");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String instanceName="Mary";
model.setPropertyValue(instanceName, "hasState", comboBox1.getSelectedItem().toString(),true);
}
}
private class setJohnState extends AbstractAction {
private setJohnState() {
// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "SET");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String instanceName="John";
model.setPropertyValue(instanceName, "hasState", comboBox2.getSelectedItem().toString(),true);
}

}
private class setJLittleJohnState extends AbstractAction {
private setJLittleJohnState() {
// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "SET");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String instanceName="LittleJohn";
model.setPropertyValue(instanceName, "hasState", comboBox5.getSelectedItem().toString(),true);
}
}
private class setLittleJaneState extends AbstractAction {
private setLittleJaneState() {
// JFormDesigner - Action initialization - DO NOT MODIFY //GEN-BEGIN:initComponents
// Generated using JFormDesigner Evaluation license - Hoszu Amalia
putValue(NAME, "SET");
// JFormDesigner - End of action initialization //GEN-END:initComponents
}
public void actionPerformed(ActionEvent e) {
// TODO add your code here
String instanceName="Jane";
model.setPropertyValue(instanceName, "hasState", comboBox3.getSelectedItem().toString(),true);
}
}
}