package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	String name;
	
	ArrayList<String> guests = new ArrayList<String>();

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.createUI();
	}

	void createUI() {
		button1.setText("add Name");
		button2.setText("View names");
		panel.add(button1);
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setTitle("Guest Book");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

		if (e.getSource().equals(button1)) {
			addGuests();

		}

		else if (e.getSource().equals(button2)) {
			viewGuests();
		}

		else {

			System.out.println("not working");
		}

	}

	void viewGuests() {
	String jop="";
		for (int i = 0; i < guests.size(); i++) {
				
				 jop+= "Guest #"+ (i+1) + ": "+guests.get(i)+ "\n";
				 
				 	
		}
		JOptionPane.showMessageDialog(null, jop);
	}

	void addGuests() {
		name = JOptionPane.showInputDialog("Type the name of the person you would like to add.");
		guests.add(name);
	}
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
