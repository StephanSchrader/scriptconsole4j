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

import scriptconsole4j.BasicScriptingWindow;

/**
 * Simple example that can be used to test the console
 * 
 * @author Kiev Gama (kiev.gama@gmail.com)
 *
 */
public class Main {
	public static void main(String[] args) {
		BasicScriptingWindow frame = new BasicScriptingWindow();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
