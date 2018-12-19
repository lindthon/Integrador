package facturador.estructural;

import java.util.List;

import facturador.creacional.ComprobanteElectronico;

public class DetalleDecorator implements IComprobante{
	protected IComprobante c;
	
	public DetalleDecorator(IComprobante comprobante){
		c=comprobante;
	}
	
	public DetalleDecorator() {
		
	}
	
	@Override
	public List<String> getDetallesEmisor() {
		return c.getDetallesEmisor();
	}
	
	public ComprobanteElectronico getComprobante() {
		return null;		
	}


}
