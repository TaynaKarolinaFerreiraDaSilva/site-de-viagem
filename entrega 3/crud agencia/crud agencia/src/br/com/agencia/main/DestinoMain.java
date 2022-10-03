package br.com.agencia.main;

import br.com.agencia.DAO.ClienteDAO;
import br.com.agencia.DAO.DestinoDAO;
import br.com.agencia.model.Destino;

public class DestinoMain {

	private static int id;

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
DestinoDAO destinoDAO = new DestinoDAO();
		
		Destino destino= new Destino();
		destino.setIda_volta("brasilia");
		
		destinoDAO.save(destino);

		
			for (Destino D :DestinoDAO.getdestinos()) {
				System.out.println("destino:"+D.getIda());
				System.out.println("destino:"+D.getIda_volta());
				System.out.println("destino:"+D.getMultidestino());
               }
			
			Destino D1 = new Destino();
			D1.setIda("");
			D1.setIda_volta("");
			D1.setMultidestino("");				          			
			D1.setId_destino(0);
			
			 destinoDAO.Update(D1);	
			 
			 DestinoDAO.deleteById(id);
		}
	
}
