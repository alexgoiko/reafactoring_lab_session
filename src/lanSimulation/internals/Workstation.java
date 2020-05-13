package lanSimulation.internals;

public class Workstation extends NodoAbstracto {

	public Workstation(String name) {
		super.name_ = name;
	}

	public void printOn(StringBuffer buf) {
		añadirNombre(buf);
	}

	public void printXMLOn(StringBuffer buf) {

		buf.append("<workstation>");
		buf.append(name_);
		buf.append("</workstation>");

	}
	
	public void printHTMLOn(StringBuffer buf) {
		añadirNombre(buf);
	}

	private void añadirNombre(StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}


}
