package facturador.estructural;

import java.util.List;

public class LogoDecorator extends DetalleDecorator{
	
	
	public LogoDecorator() {
		
	}
	
	public LogoDecorator(IComprobante c1) {
		super(c1);
	}
	
	public List<String> getDetallesEmisor() {
		List<String> logo=super.getDetallesEmisor();
		logo.add(0, "Logo: -|O_O|-");		
		return logo;
	}
}
