package facturador.main;

import java.util.Scanner;

import facturador.comportamiento.AutorizacionFact;
import facturador.comportamiento.AutorizadorSRI;
import facturador.comportamiento.Esquema;
import facturador.creacional.ComprobanteElectronico;
import facturador.creacional.ComprobantesFactory;
import facturador.estructural.IComprobante;
import facturador.estructural.LogoDecorator;

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
			IComprobante logo=new LogoDecorator(factura);
			IComprobante logoFooter=new LogoDecorator(new LogoDecorator(factura));	
			
			
			System.out.println("Que tipo de factura desea autorizar:\n"
					+ "ONLINE\n"
					+ "OFFLINE\n");
			String tipoAutorizacion = sc.next();
			
			try {
				AutorizacionFact esquemaFact = new AutorizacionFact();
				Esquema esquema = esquemaFact.getEsquema(tipoAutorizacion);
				AutorizadorSRI autorizacion = new AutorizadorSRI(esquema);
				autorizacion.autorizar(factura);
			} catch (Exception e) {
				System.out.println("Usted ha creado una factura vacia");
			}
			System.out.println("Usted ha creado una factura vacia");
			
			break;
		case 2:
			ComprobanteElectronico guiaRemision = comprobanteFact.getComprobante("GUIAREMISION");
			System.out.println("Ha creado una guia de remision");
			break;
		case 3:
			ComprobanteElectronico notaCredito = comprobanteFact.getComprobante("NOTACREDITO");
			System.out.println("Ha creado una nota de credito");
			break;

		default:
			break;
		}
			
	}

}
