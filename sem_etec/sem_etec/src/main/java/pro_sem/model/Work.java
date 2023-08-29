package pro_sem.model;

public class Work {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Maycon", 23, "masc", "SP", "Desenvolvedor", 002);
        Funcionario funcionario2 = new Funcionario("Maria", 27, "fem", "SP", "Secretaria", 003);
        Chefe chefe1 = new Chefe("Patrick", 46, "masc", "MG", 001);

        System.out.println("Todos os funcionários estão ocupados trabalhando.");
        System.out.println();
        
        mostrarAcao(funcionario1);
        mostrarAcao(funcionario2);
        mostrarAcao(chefe1);
    }

    public static void mostrarAcao(Pessoa pessoa) {
       

        if (pessoa instanceof Funcionario) {
            Funcionario funcionario = (Funcionario) pessoa;
            System.out.println("Funcionário(a) " + funcionario.getName() + " está desenvolvendo um site.");
        } else if (pessoa instanceof Chefe) {
            Chefe chefe = (Chefe) pessoa;
            System.out.println("O gerente " + chefe.getName() + " está em uma reunião com sócios.");
        }

        System.out.println();
    }
}