/*
 * Copyright [2008-2009] [Kiev Gama - kiev.gama@gmail.com]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package scriptconsole4j.example;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import scriptconsole4j.BasicScriptingWindow;
import scriptconsole4j.ScriptContextVariable;

public class ExampleUsingObject {
	public static void main(String[] args) {
		ScriptContextVariable myObjectVar = new ScriptContextVariable(new MyObject(),"myobj","");
		BasicScriptingWindow frame = new BasicScriptingWindow(myObjectVar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class MyObject {
	
	public void doSomething() {
		JOptionPane.showMessageDialog(null, "My object");
	}
}
