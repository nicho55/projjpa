package dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable{
	
	
	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	
	
	String nome;
	String senha;
	
	@OneToMany
	@JoinColumn(name = "id_usuario")
	List<Telefone> telefone;
	
	public Usuario(Integer id, String nome, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}
	
	public Usuario() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", senha=" + senha + "]";
	}
	
	
}
