package facturador.comportamiento;

import facturador.creacional.ComprobanteElectronico;

public class EsquemaOffline implements Esquema {

	@Override
	public void autorizar(ComprobanteElectronico comprobante) {
		System.out.println("Numero de Autorizacion: " + comprobante.getClaveAcceso());		
		
	}

}
