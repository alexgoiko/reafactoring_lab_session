package lanSimulation.internals;

public abstract class NodoAbstracto implements INodo {

	/**
	Holds the name of the Node.
	 */
	private String name_;
	/**
	Holds the next Node in the token ring architecture.
	@see lanSimulation.internals.Node
	 */
	private NodoAbstracto nextNodo_;

	
	/**
Construct a <em>NodoAbstracto</em> with given #type and #name.
<p><strong>Precondition:</strong>
	 */
	public NodoAbstracto(String name) {
		this.name_ = name;
	}

	/**
Construct a <em>NodoAbstracto</em> with given #type and #name, and which is linked to #nextNode.
<p><strong>Precondition:</strong>
	 */
	public NodoAbstracto(String name, NodoAbstracto nextNode) {
		this.name_ = name;
		this.nextNodo_ = nextNode;
	}

	/* (non-Javadoc)
	 * @see lanSimulation.internals.INodo#printOn(java.lang.StringBuffer)
	 */
	@Override
	public void printOn(StringBuffer buf) {}

	/* (non-Javadoc)
	 * @see lanSimulation.internals.INodo#XMLOn(java.lang.StringBuffer)
	 */
	@Override
	public void printXMLOn(StringBuffer buf) {}

	/* (non-Javadoc)
	 * @see lanSimulation.internals.INodo#printHTMLOn(java.lang.StringBuffer)
	 */
	@Override
	public void printHTMLOn( StringBuffer buf) {}

	public String getName_() {
		return name_;
	}

	public void setName_(String name_) {
		this.name_ = name_;
	}

	public NodoAbstracto getNextNodo_() {
		return nextNodo_;
	}

	public void setNextNodo_(NodoAbstracto nextNode_) {
		this.nextNodo_ = nextNode_;
	}


	
}