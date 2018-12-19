package facturador.main;

import java.util.Scanner;

import facturador.creacional.ComprobanteElectronico;
import facturador.creacional.ComprobantesFactory;

public class FacturadorMain {

	public static void main(String[] args) {
		
		ComprobantesFactory comprobanteFact = new ComprobantesFactory();
        
	
		System.out.println("Seleccione el comprobante que desea crear: \n"
				+ "Escoja 1 para crear Factura\n"
				+ "Escoja 2 para crear Guia de remision\n"
				+ "Escoja 3 para crear Nota de Credito\n");
				
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		switch (valor) {
		case 1:
			ComprobanteElectronico factura = comprobanteFact.getComprobante("FACTURA");
			break;
		case 2:
			ComprobanteElectronico guiaRemision = comprobanteFact.getComprobante("GUIAREMISION");
			break;
		case 3:
			ComprobanteElectronico notaCredito = comprobanteFact.getComprobante("NOTACREDITO");
			break;

		default:
			break;
		}
			
	}

}
