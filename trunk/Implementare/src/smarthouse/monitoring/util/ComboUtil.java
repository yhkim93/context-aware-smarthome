package smarthouse.monitoring.util;
import  java.util.Iterator;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class ComboUtil  {
	
    public static JComboBox initCombo(JComboBox comboList,Vector list,JLabel picture) {
        comboList = new JComboBox(list);
     
        //Set up the picture.
        picture.setFont(picture.getFont().deriveFont(Font.ITALIC));
        picture.setHorizontalAlignment(JLabel.CENTER);
        updateLabel((String)comboList.getSelectedItem(),picture);
        picture.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

        //The preferred size is hard-coded to be the width of the
        //widest image and the height of the tallest image + the border.
        //A real program would compute this.
        picture.setPreferredSize(new Dimension(177, 122+10));
        return comboList;
        
        }

   
    protected static void reloadCombo(JComboBox c, Vector source ){
    	c.removeAllItems();
    	for(Iterator it=source.iterator();it.hasNext();)
    	{
    		c.addItem(it.next());
    	}
    	
    }
    protected static void updateLabel(String name,JLabel picture) {
    	
    	System.out.println("Searching for image: "+name+".png");
        ImageIcon icon = createImageIcon("/smarthouse/images/" + name + ".png");
        picture.setIcon(icon);
        picture.setToolTipText("A drawing of a " + name.toLowerCase());
        if (icon != null) {
            picture.setText(null);
        } else {
            picture.setText("Image not found");
        }
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = ComboUtil.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    
 
}
