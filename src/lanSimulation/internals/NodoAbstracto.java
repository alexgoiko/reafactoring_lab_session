package lanSimulation.internals;

import lanSimulation.Network;

public abstract class NodoAbstracto {

	/**
	Holds the name of the Node.
	 */
	public String name_;
	/**
	Holds the next Node in the token ring architecture.
	@see lanSimulation.internals.Node
	 */
	public NodoAbstracto nextNode_;



	public void printOn(StringBuffer buf) {}

	public void XMLOn(StringBuffer buf) {}

	public void printHTMLOn( StringBuffer buf) {}


}