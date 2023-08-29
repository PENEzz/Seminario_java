package pro_sem.model;

public class Chefe extends Pessoa{
	   private Integer cod_func;

	   

	    public Chefe(String name, Integer idade, String genero, String estado, Integer cod_func) {
	        super(name, idade, genero, estado);
	        this.cod_func = cod_func;
	    }

	 

	    @Override
	    public void Trabalho() {
	        System.out.println(getName() + " (Chefe) está supervisionando.");
	    }

	    public Integer getCodFunc() {
	        return cod_func;
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