package facturador.estructural;

import java.util.List;

public class FooterDecorator extends DetalleDecorator{

	public FooterDecorator() {
		
	}
	
	public FooterDecorator(IComprobante c1) {
		super(c1);
	}
	
	public List<String> getDetallesEmisor() {		
		List<String> footer=super.getDetallesEmisor();
		footer.add("Pie de pagina");
		return footer;
	}
}
