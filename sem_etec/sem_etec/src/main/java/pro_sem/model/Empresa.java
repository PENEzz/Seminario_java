package pro_sem.model;

import java.util.ArrayList;

public class Empresa {
	public static void main(String[] args) {
		
        ArrayList<Pessoa> departamento = new ArrayList<>();


        Chefe chefe1 = new Chefe("Patrick", 46, "masc", "MG", 001);
        Funcionario funcionario1 = new Funcionario("Maycon", 23, "masc", "SP", "Desenvolvedor", 002);
        Funcionario funcionario2 = new Funcionario("Maria", 27, "fem", "SP", "Secretaria", 003);

        
        departamento.add(chefe1);
        departamento.add(funcionario1);
        departamento.add(funcionario2);
        /*departamento.size();*/
        /*departamento.remove(0);*/

        for (Pessoa pessoa : departamento) {
            pessoa.Trabalho();
        }
        
        System.out.println();
        mostrarAcao(chefe1);
        System.out.println();
        System.out.println("As informações do "+chefe1.getName()+" são...");
        System.out.println();
        Infos.mostrarInfo(chefe1);
        System.out.println();
        mostrarAcao(funcionario1);
        System.out.println();
        System.out.println("As informaçõe do "+funcionario1.getName()+" são...");
        Infos.mostrarInfo(funcionario1);
        System.out.println();
        mostrarAcao(funcionario2);
        System.out.println();
        System.out.println("As informaçõe do "+funcionario2.getName()+" são...");
        System.out.println();
        Infos.mostrarInfo(funcionario2);
        System.out.println();
        /*System.out.println(departamento.size());*/
        /*System.out.println(departamento.contains("Amanda"));*/
    }
    
    public static void mostrarAcao(Pessoa pessoa) {
        if (pessoa instanceof Funcionario) {
            Funcionario funcionario = (Funcionario) pessoa;
            System.out.println("O funcionário " + funcionario.getName() + " está desenvolvendo um site.");
        } else if (pessoa instanceof Chefe) {
            Chefe chefe = (Chefe) pessoa;
            System.out.println("O gerente " + chefe.getName() + " está em uma reunião com os sócios.");
        }

        System.out.println();
    }
}