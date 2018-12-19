package facturador.main;

import facturador.creacional.ComprobanteElectronico;
import facturador.creacional.ComprobantesFactory;

public class FacturadorMain {

	public static void main(String[] args) {
		ComprobantesFactory comprobanteFact = new ComprobantesFactory();
		ComprobanteElectronico factura = comprobanteFact.getComprobante("FACTURA");
		ComprobanteElectronico guiaRemision = comprobanteFact.getComprobante("GUIAREMISION");
		ComprobanteElectronico notaCredito = comprobanteFact.getComprobante("NOTACREDITO");
		
		
	}

}
