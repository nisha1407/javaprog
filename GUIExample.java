import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Cursor;
public class GUIExample 
{
	public static void main(String args[])
	{
		JFrame jf=new JFrame();
		 
		Toolkit theKit = jf.getToolkit(); // Get the window toolkit
		Dimension wndSize = theKit.getScreenSize();
		
		int windowWidth=400;
		int windowHeight=150;
		
		jf.setBounds(50,100,windowWidth,windowHeight);
		//jf.setBounds(0,0,screen.width,screen.height);
		//jf.setBounds(0,0,screen.width,screen.height);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setName("My Frame");
		jf.setTitle("My Frame");
		jf.setForeground(Color.PINK);
		
		Dimension d= new Dimension(100,100);
		jf.setMinimumSize(d);	
		
		Container container=jf.getContentPane();
		FlowLayout f1=new FlowLayout();
		container.setLayout(f1);
		container.setBackground(Color.PINK);
		addComponent(container);
		
		f1.setHgap(50);
		jf.setVisible(true);
		jf.pack();
		
		
		
	}
	public static void addComponent(Container container)
		{
			for(int i=0;i<10;i++)
			{
				JButton button=new JButton("Button "+i);
				button.setName("Button "+i);
				button.addActionListener(new BtnClickListener());
				container.add(button); 
			}
		}
	
}