package facturador.comportamiento;



public class AutorizacionFact {
	public Esquema getEsquema(String tipoEsquema){
	      if(tipoEsquema == null){
	         return null;
	      }		
	      if(tipoEsquema.equalsIgnoreCase("ONLINE")){
	         return new EsquemaOnline();
	         
	      } else if(tipoEsquema.equalsIgnoreCase("OFFLINE")){
	         return new EsquemaOffline();
	         
	      }
	      return null;
	   }

}
