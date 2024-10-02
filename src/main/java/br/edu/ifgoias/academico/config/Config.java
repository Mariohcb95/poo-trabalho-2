package br.edu.ifgoias.academico.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.edu.ifgoias.academico.repositories.CursoRepository;
import br.edu.ifgoias.academico.repositories.DisciplinaRepository;

@Configuration
public class Config implements CommandLineRunner {

	@Autowired
	private CursoRepository cursoRep;
	
	@Autowired
	private DisciplinaRepository disciplinaRep;
	
	@Override
	public void run(String... args) throws Exception {
//		Curso c1 = new Curso(null, "Spring");
//		Curso c2 = new Curso(null, "Tools");
//		
//		cursoRep.save(c1);
//		cursoRep.save(c2);
//		List<Curso> cursos = cursoRep.findAll();
		
//		for(Curso curso : cursos) {
//			System.out.println("Curso: " + curso.getNomecurso());
//		}
	}

}
