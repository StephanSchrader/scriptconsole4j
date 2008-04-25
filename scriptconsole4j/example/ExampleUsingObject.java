package scriptconsole4j.example;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import scriptconsole4j.ScriptContextVariable;
import scriptconsole4j.ScriptingPanel;

public class ExampleUsingObject {
	public static void main(String[] args) {
		JFrame frame = new JFrame("[Scriptconsole4j] Default Window");
		ScriptContextVariable myObjectVar = new ScriptContextVariable(new MyObject(),"myobj","");
		ScriptingPanel panel = new ScriptingPanel(myObjectVar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.add(panel);
		frame.setVisible(true);
	}
}

class MyObject {
	
	public void doSomething() {
		JOptionPane.showMessageDialog(null, "My object");
	}
}
