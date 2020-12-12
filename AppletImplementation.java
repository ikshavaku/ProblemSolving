import java.applet.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletImplementation extends Applet implements ActionListener {
	TextField firstname = new TextField();
	TextField lastName = new TextField();
	TextField fullName = new TextField();
	
	public AppletImplementation() {
		Label firstNameLabel = new Label("First Name");
		Label lastNameLabel = new Label("Last Name");
		setLayout(new GridLayout(3,2));
		add(firstNameLabel);
		add(firstname);
		add(lastNameLabel);
		add(lastName);
		Label fullNameLabel = new Label("Full Name");
		add(fullNameLabel);
		add(fullName);
		firstname.addActionListener(this);
		lastName.addActionListener(this);
		Button red = new Button("Red");
		add(red);
		Button blue = new Button("Blue");
		add(blue);
		Button green = new Button("Green");
		add(green);
		red.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.red);
				
			}
		});
		blue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.blue);
			}
		});
		green.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.green);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		fullName.setText(firstname.getText()+" "+ lastName.getText());
	}
}
