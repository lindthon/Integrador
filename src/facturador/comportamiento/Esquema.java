/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.comportamiento;

import facturador.creacional.ComprobanteElectronico;

/**
 *
 * @author Palacios
 */
public interface Esquema {
    public void autorizar(ComprobanteElectronico comprobante);
}
