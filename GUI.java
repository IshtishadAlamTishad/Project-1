package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI implements ActionListener {
	private int ticks=0;
	private JLabel label = new JLabel("Number of ticks:    0");
	private JFrame frame = new JFrame();
	
	public GUI() {
		JButton button = new JButton("😁😁 Tick me 😎😎");
	//	JButton button1 = new JButton("")
		button.addActionListener(this);
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(150,150,50,50));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Clicking Counter");
		frame.pack();
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		ticks++;
		label.setText("Number of ticks : "+ ticks);
	}
	public static void main(String[] args)
	{
		new GUI();
	}
}
