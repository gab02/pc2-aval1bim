package br.com.etechoracio.avaliacao.business;

import java.util.List;

import javax.transaction.Transactional;



import br.com.etechoracio.avaliacao.dao.ProfessorDAO;
import br.com.etechoracio.avaliacao.model.Professor;
import br.com.etechoracio.common.business.BaseSB;


public class ProfessorSB extends BaseSB {

	private ProfessorDAO professorDAO ;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Professor>  findAll(){
		return professorDAO.findAll();
		}

	@Override
	protected void postConstructImpl() {
		// TODO Auto-generated method stub
		
	};
}
