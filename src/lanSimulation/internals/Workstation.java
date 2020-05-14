package lanSimulation.internals;

public class Workstation extends NodoAbstracto {

	public Workstation(String name) {
		super(name);
	}
	public Workstation(String name, NodoAbstracto nextNode) {
		super(name,nextNode);
	}

	public void printOn(StringBuffer buf) {
		añadirNombre(buf);
	}

	public void printXMLOn(StringBuffer buf) {

		buf.append("<workstation>");
		buf.append(getName_());
		buf.append("</workstation>");

	}
	
	public void printHTMLOn(StringBuffer buf) {
		añadirNombre(buf);
	}

	private void añadirNombre(StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(getName_());
		buf.append(" [Workstation]");
	}


}
