package org.generation.blogpessoal.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

//A annotation @Entity indica que a classe define uma entidade (tabela).
@Entity
//A annotation @Table indica o nome da tabela no banco de dados.
@Table(name="tb_postagens")
public class Postagem {

	
	//@Id indica que o atributo abaixo será a chave primária da tabela.
	@Id
	//@GeneratedValue indica que a PK será gerada através do JPA.
	//O parâmetro strategy inidica de qual forma a pf será gerada. nesse caso,
	//a opção será auto_increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Atributo da classe postagem com o tipo de dado do mySQL convertido em Java.
	private Long id;
	
	//@NotBlank define que o atributo não pode ser nulo.
	//Através do atributo message é possível exibir uma mensagem para o usuário.
	@NotBlank(message = "O atributo título é obrigatório")
	
	//@Size define o valor mínimo e o valor máximo de caracteres do atributo
	@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 5 e no máximo 100 caracteres.")

	//Atributo da classe postagem com o tipo de dado do mySQL convertido em Java
	private String titulo;
	
	@NotBlank(message = "O atributo texto é obrigatório")
	@Size(min = 10, max = 1000, message = "O atriuto texto deve conter no mínimo 10 e no máximo 1000 caracteres.")
	//Atributo da classe postagem com o tipo de dado do mySQL convertido em Java
	private String texto;
	
	//@UpdateTimestamp define o atributo como timestamp.
	@UpdateTimestamp
	//Atributo da classe postagem com o tipo de dado do mySQL convertido em Java
	private LocalDateTime data;

	
	//Geração dos Getters e Setters.
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
	
	
	
	
}
