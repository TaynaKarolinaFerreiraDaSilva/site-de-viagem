package br.com.agencia.main;

import br.com.agencia.DAO.ClasseDAO;
import br.com.agencia.DAO.PeríodoDAO;
import br.com.agencia.model.Período;

public class PeríodoMain {

	private static int id;

	public static void main(String[] args) {
		
PeríodoDAO períodoDAO = new PeríodoDAO();
		
		Período período= new Período();
		período.setDuracao_da_viagem("8");
      períodoDAO.save(período);

  	for(Período P :PeríodoDAO.getPeríodos()) {
		System.out.println("período:"+P.getDuracao_da_viagem());
	}
  	Período P2 = new Período();
	P2.setDuracao_da_viagem("");
	P2.setId_periodo(1);
	P2.setId_periodo(1);
		
             períodoDAO.Update(P2);	
             
             ClasseDAO.deleteById(id);
}
	}

