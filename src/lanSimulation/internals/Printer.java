package lanSimulation.internals;

import lanSimulation.Network;

public class Printer {

	

	
	/**
	Write a printable representation of #receiver on the given #buf.
	<p><strong>Precondition:</strong> isInitialized();</p>
	 * @param network TODO
	 * @param buf TODO
	 */
	public void printOn (Network network, StringBuffer buf) {
		assert network.isInitialized();
		Node currentNode = network.getFirstNode_();
		do {
			añadirTipoNodo(network, buf, currentNode);
			buf.append(" -> ");
			currentNode = currentNode.nextNode_;
		} while (currentNode != network.getFirstNode_());
		buf.append(" ... ");
	}

	/**
	Write an XML representation of #receiver on the given #buf.
	<p><strong>Precondition:</strong> isInitialized();</p>
	 * @param network TODO
	 * @param buf TODO
	 */
	public void printXMLOn (Network network, StringBuffer buf) {
		assert network.isInitialized();
	
		Node currentNode = network.getFirstNode_();
		buf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\n<network>");
		do {
			buf.append("\n\t");
			switch (currentNode.type_) {
			case Node.NODE:
				buf.append("<node>");
				buf.append(currentNode.name_);
				buf.append("</node>");
				break;
			case Node.WORKSTATION:
				buf.append("<workstation>");
				buf.append(currentNode.name_);
				buf.append("</workstation>");
				break;
			case Node.PRINTER:
				buf.append("<printer>");
				buf.append(currentNode.name_);
				buf.append("</printer>");
				break;
			default:
				buf.append("<unknown></unknown>");;
				break;
			};
			currentNode = currentNode.nextNode_;
		} while (currentNode != network.getFirstNode_());
		buf.append("\n</network>");
	}

	/**
	Write a HTML representation of #receiver on the given #buf.
	<p><strong>Precondition:</strong> isInitialized();</p>
	 * @param network TODO
	 * @param buf TODO
	 */
	public void printHTMLOn (Network network, StringBuffer buf) {
		assert network.isInitialized();
	
		buf.append("<HTML>\n<HEAD>\n<TITLE>LAN Simulation</TITLE>\n</HEAD>\n<BODY>\n<H1>LAN SIMULATION</H1>");
		Node currentNode = network.getFirstNode_();
		buf.append("\n\n<UL>");
		do {
			buf.append("\n\t<LI> ");
			network.printer.añadirTipoNodo(network, buf, currentNode);
			buf.append(" </LI>");
			currentNode = currentNode.nextNode_;
		} while (currentNode != network.getFirstNode_());
		buf.append("\n\t<LI>...</LI>\n</UL>\n\n</BODY>\n</HTML>\n");
	}

	public void añadirTipoNodo(Network network, StringBuffer buf, Node currentNode) {
		switch (currentNode.type_) {
		case Node.NODE:
			buf.append("Node ");
			buf.append(currentNode.name_);
			buf.append(" [Node]");
			break;
		case Node.WORKSTATION:
			buf.append("Workstation ");
			buf.append(currentNode.name_);
			buf.append(" [Workstation]");
			break;
		case Node.PRINTER:
			buf.append("Printer ");
			buf.append(currentNode.name_);
			buf.append(" [Printer]");
			break;
		default:
			buf.append("(Unexpected)");;
			break;
		};
	}

}
