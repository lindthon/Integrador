package facturador.main;

import facturador.creacional.ComprobanteElectronico;
import facturador.creacional.ComprobantesFactory;
import facturador.estructural.DetalleDecorator;
import facturador.estructural.IComprobante;
import facturador.estructural.LogoDecorator;

public class FacturadorMain {

	public static void main(String[] args) {
		
		ComprobantesFactory comprobanteFact = new ComprobantesFactory();
		ComprobanteElectronico factura = comprobanteFact.getComprobante("FACTURA");
		ComprobanteElectronico guiaRemision = comprobanteFact.getComprobante("GUIAREMISION");
		ComprobanteElectronico notaCredito = comprobanteFact.getComprobante("NOTACREDITO");
		
		IComprobante logo=new LogoDecorator(factura);
		IComprobante logoFooter=new LogoDecorator(new LogoDecorator(factura));		
		
	}

}
