package lanSimulation.internals;

public abstract class NodoAbstracto implements INodo {

	/**
	Holds the name of the Node.
	 */
	public String name_;
	/**
	Holds the next Node in the token ring architecture.
	@see lanSimulation.internals.Node
	 */
	public NodoAbstracto nextNode_;


	/* (non-Javadoc)
	 * @see lanSimulation.internals.INodo#printOn(java.lang.StringBuffer)
	 */
	@Override
	public void printOn(StringBuffer buf) {}

	/* (non-Javadoc)
	 * @see lanSimulation.internals.INodo#XMLOn(java.lang.StringBuffer)
	 */
	@Override
	public void XMLOn(StringBuffer buf) {}

	/* (non-Javadoc)
	 * @see lanSimulation.internals.INodo#printHTMLOn(java.lang.StringBuffer)
	 */
	@Override
	public void printHTMLOn( StringBuffer buf) {}


}