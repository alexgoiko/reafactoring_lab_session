package lanSimulation.internals;


public class Printer extends NodoAbstracto {

	public Printer(String name) {
		super.name_ = name;
	}

	public void printOn(StringBuffer buf) {
		añadirNombre(buf);
	}
	
	public void printXMLOn(StringBuffer buf) {

		buf.append("<printer>");
		buf.append(name_);
		buf.append("</printer>");
	}
	
	public void printHTMLOn(StringBuffer buf) {
		añadirNombre(buf);
	}

	private void añadirNombre(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
	}
	


		
	
}
