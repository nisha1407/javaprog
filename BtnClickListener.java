import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class BtnClickListener implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		JComponent comp = (JComponent)event.getSource();
		JOptionPane.showMessageDialog(null,comp.getName()+"button clicked");
		//System.out.println("Clicked on button");
	}
	public static void main(String args[])
	{
	}
}