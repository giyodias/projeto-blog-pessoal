package org.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.generation.blogpessoal.model.Postagem;

//@Repository indica que a interface é do tipo repositório (realiza o a interação com
//o banco de dados
@Repository

//a interface é herança da interface JpaRepository e recebe 2 parâmetros:
//o primeiro é a classe Postagem, que gerou a tabela (entidade a ser mapeada no banco de dados)
//Long representa a PK, que recebeu a annotation @Id na classe postagem

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
}
