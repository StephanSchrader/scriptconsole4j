package scriptconsole4j.example;

import javax.swing.JFrame;

import scriptconsole4j.ScriptingPanel;

/**
 * Simple example that can be used to test the console
 * 
 * @author Kiev Gama (kiev.gama@gmail.com)
 *
 */
public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("[Scriptconsole4j] Default Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.add(new ScriptingPanel());
		frame.setVisible(true);
	}
}
