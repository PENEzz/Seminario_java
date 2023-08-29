package pro_sem.model;

public class Pessoa {
	   protected String name;
	   protected Integer idade;
	   protected String genero;
	   protected String estado;

	 

	public Pessoa(String name, Integer idade, String genero, String estado) {
	   this.name = name;
	   this.idade = idade;
	   this.genero = genero;
	   this.estado = estado;
	}

	 

	public String getName() {
	   return name;
	}

	 

	public void Trabalho() {
	   System.out.println(name + " estão trabalhando.");
	   }
	
public String getEstado() {
	return estado;
	}
public String getGenero() {
	return genero;
	}
public Integer getIdade() {
	return idade;
	}
}