package br.com.etechoracio.avaliacao.view;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.DualListModel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.avaliacao.model.Professor;
import br.com.etechoracio.common.view.BaseMB;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope("view")
public class AlunoMB extends BaseMB {

	
	public void postConstruct() {
		List<Professor> source = professorSB.findAll();
		professores = new DualListModel<Professor>(source, new ArrayList<Professor>());
	}
	
	public void onSave() {
		edit.setprofessores(professores.getTarget());
		showInsertMessage();
			
		
	}
}
