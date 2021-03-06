/*   This file is part of lanSimulation.
 *
 *   lanSimulation is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 *
 *   lanSimulation is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with lanSimulation; if not, write to the Free Software
 *   Foundation, Inc. 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *   Copyright original Java version: 2004 Bart Du Bois, Serge Demeyer
 *   Copyright C++ version: 2006 Matthias Rieger, Bart Van Rompaey
 */
package lanSimulation.internals;


/**
A <em>Node</em> represents a single Node in a Local Area Network (LAN).
Several types of Nodes exist.
 */
public class Node extends NodoAbstracto{

	/**
Construct a <em>Node</em> with given #type and #name.
<p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
	 */
	public Node(String name) {
		super(name);
	}

	/**
Construct a <em>Node</em> with given #type and #name, and which is linked to #nextNode.
<p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
	 */
	public Node(String name, NodoAbstracto nextNode) {
		super(name,nextNode);
	}
	
	public void printOn(StringBuffer buf) {
		añadirNombre(buf);
	}
	
	public void printXMLOn(StringBuffer buf) {

		buf.append("<node>");
		buf.append(getName_());
		buf.append("</node>");
		
	}
	
	public void printHTMLOn(StringBuffer buf) {
		añadirNombre(buf);
	}

	private void añadirNombre(StringBuffer buf) {
		buf.append("Node ");
		buf.append(getName_());
		buf.append(" [Node]");
	}
	

}