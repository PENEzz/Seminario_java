package pro_sem.model;

public class Infos {
	    public static void main(String[] args) {
	        Funcionario funcionario1 = new Funcionario("Maycon", 23, "masc", "SP", "Desenvolvedor", 002);
	        Funcionario funcionario2 = new Funcionario("Maria", 27, "fem", "SP", "Secretaria", 003);
	        Chefe chefe1 = new Chefe("Patrick", 46, "masc", "MG", 001);
	        
	        mostrarInfo(funcionario1);
	        mostrarInfo(funcionario2);
	        mostrarInfo(chefe1);
	    }
	    
	    public static void mostrarInfo(Pessoa pessoa) {
	        System.out.println("As informações da pessoa " + pessoa.getName() + " são:");
	        System.out.println("Idade: " + pessoa.getIdade());
	        System.out.println("Gênero: " + pessoa.getGenero());
	        System.out.println("Estado: " + pessoa.getEstado());

	        if (pessoa instanceof Funcionario) {
	            Funcionario funcionario = (Funcionario) pessoa;
	            System.out.println("Função: " + funcionario.getFuncao());
	            System.out.println("Código do(a) Funcionário(a): " + funcionario.getCodFunc());
	        } else if (pessoa instanceof Chefe) {
	            Chefe chefe = (Chefe) pessoa;
	            System.out.println("Código do Chefe: " + chefe.getCodFunc());
	        }
	        
	        System.out.println();
}
}