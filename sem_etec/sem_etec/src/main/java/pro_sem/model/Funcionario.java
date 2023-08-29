package pro_sem.model;

public class Funcionario extends Pessoa{
    private String funcao;
    private Integer cod_func;

 

public Funcionario(String name, Integer idade, String genero, String estado, String funcao, Integer cod_func) {
    super(name, idade, genero, estado);
    this.funcao = funcao;
    this.cod_func = cod_func;
}

 

@Override
public void Trabalho() {
    System.out.println(getName() + " (Funcionário(a)) está trabalhando.");
  }
public String getFuncao() {
    return funcao;
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