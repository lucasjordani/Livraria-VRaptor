package livraria_admin;

import java.util.List;

public interface Estante {
	
	void guarda(Livro livro);
	List<Livro> todosOsLivros();

}
