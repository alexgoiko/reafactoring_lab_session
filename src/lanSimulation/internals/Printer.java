package lanSimulation.internals;


public class Printer extends NodoAbstracto {

	public Printer(String name) {
		super(name);
	}
	
	public Printer(String name, NodoAbstracto nextNode) {
		super(name,nextNode);
	}

	public void printOn(StringBuffer buf) {
		añadirNombre(buf);
	}
	
	public void printXMLOn(StringBuffer buf) {

		buf.append("<printer>");
		buf.append(getName_());
		buf.append("</printer>");
	}
	
	public void printHTMLOn(StringBuffer buf) {
		añadirNombre(buf);
	}

	private void añadirNombre(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(getName_());
		buf.append(" [Printer]");
	}
	


		
	
}
