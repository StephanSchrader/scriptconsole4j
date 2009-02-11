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
package scriptconsole4j.activation;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

import scriptconsole4j.BasicScriptingWindow;
import scriptconsole4j.ScriptContextVariable;


public class Activator implements BundleActivator {
	private BasicScriptingWindow window;
	public void start(final BundleContext ctx) throws Exception {
		ScriptContextVariable var = new ScriptContextVariable(ctx,"ctx","OSGi bundle context");
		window = new BasicScriptingWindow(var);
		window.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(window, "Confirm stop bundle?");
				if (result == JOptionPane.YES_OPTION) {
					try {
						ctx.getBundle().stop();
					} catch (BundleException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		window.setVisible(true);
	}

	public void stop(BundleContext ctx) throws Exception {
		window.dispose();
	}
}
