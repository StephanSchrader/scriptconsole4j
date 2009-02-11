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
package scriptconsole4j;

import javax.swing.JFrame;

public class BasicScriptingWindow extends JFrame {
	private static final long serialVersionUID = 3405850457314153200L;
	
	public BasicScriptingWindow() {
		this(null);
	}
	public BasicScriptingWindow(ScriptContextVariable contextVar) {
		super("[Scriptconsole4j] Default Window");
		this.setSize(400, 400);
		this.add(new ScriptingPanel(contextVar));
	}

}
