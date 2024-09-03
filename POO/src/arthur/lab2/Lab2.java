package study.arthur.lab2;

public class Lab2 {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Luiz", 15.0);
        funcionario1.adicionaDiaDeTrabalho(5);
        funcionario1.atualizaNome("Luiz Henrique");

        System.out.println("Nome: "+funcionario1.getNome());
        System.out.println("ID: "+funcionario1.getID());
        System.out.println("Salario por Hora: "+funcionario1.getSalarioHora());
        System.out.println("Salario: "+funcionario1.calculaSalarioMes());
        funcionario1.reiniciaMesTrabalho();

        VolumeEsfera esfera = new VolumeEsfera(5.0);

        System.out.println("Volume: "+esfera.Volume);
    }
}
