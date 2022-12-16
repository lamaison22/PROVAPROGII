package Joao.joaolamaisonmiranda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "sequencia")
    @SequenceGenerator(name="sequencia", sequenceName="hibernate_sequence", initialValue = 1, allocationSize = 1)
    @Column(name="id_usuario")
    private Integer id_usuario;

    @NotNull
    @Size(min = 3, max = 30, message="o nome deve ter no minimo 3 caracteres e no maximo 30")
    @Pattern(regexp = "[^0-9]*")
    private String nome;

    @NotNull
    @Size(min = 3,message="A senha deve ter no minimo 3 caracteres")
    private String senha;
    
    @NotNull
    @NotEmpty
    @Email
    @Column(name = "email")
    private String email;
    @CPF
    private String cpf;


	public Integer getId() {
		return id_usuario;
	}

	public void setId(Integer id) {
		this.id_usuario = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
