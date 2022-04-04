package br.com.fiap.app;

import java.time.LocalDate;
import java.util.List;

import br.com.fiap.entity.Livro;
import br.com.fiap.service.impl.LivroServiceImpl;

public class Main {
	public static void main(String[] args) {
		LivroServiceImpl livroService = LivroServiceImpl.getInstance();
		livroService.inserir(new Livro("A Hora Da Estrela","Bruno","978-65-891231-05-3","edicao 1", LocalDate.of(1977,05,05)));
		Livro livro1 = new Livro("Como jogar de Veigar","Fitti","512-35-893131-51-2","edicao 2", LocalDate.of(2022,05,23));
		livroService.inserir(new Livro("Até mais, e Obrigado pelos Peixes!","Douglas Adams","431-66-123512-32-1","edicao 1", LocalDate.of(1984,02,05)));
		
		livroService.remover(2L);
		livro1.setEdicao("edicao 3");
		livroService.atualizar(livro1);
		
		
		List<Livro>livros = livroService.listar();
		for(Livro item: livros) {
			System.out.println(item);
		}
		
		

	}
}
