package livraria_admin;

import br.com.caelum.vraptor.Resource;

@Resource
public class LivrosController {

	public void formulario(){	
	}
	
	public void salva(Livro livro){
		Estante estante = new UmaEstanteQualquer();
		estante.guarda(livro);
	}
	
	public List<Livro> lista(){
		Estante estante = new UmaEstanteQualquer();
		return estante.todosOsLivros();
	}
	
}
