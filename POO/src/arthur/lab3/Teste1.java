package study.arthur.lab3;

public class Teste1 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Michael", "Chefe", 1, 45, null, 3000);
        Funcionario f2 = new Funcionario("Pam", "Secretaria", 2, 30, f1, 1500);
        Funcionario f3 = new Funcionario("Jim", "Vendedor", 3, 31, f1, 4000);

        System.out.println("Nome: " + f1.getNome() + "\nCargo: " + f1.getCargo() + "\nChefe: " + f1.getChefe() + "\n");
        System.out.println("Nome: " + f2.getNome() + "\nCargo: " + f2.getCargo() + "\nChefe: " + f2.getChefe().getNome() + "\n");
        System.out.println("Nome: " + f3.getNome() + "\nCargo: " + f3.getCargo() + "\nChefe: " + f3.getChefe().getNome() + "\n");

        if(f2.mesmaChefia(f3)) {
            System.out.println(f2.getNome() + " e " + f3.getNome() + " têm o mesmo chefe.");
        } else {
            System.out.println(f2.getNome() + " e " + f3.getNome() + " não têm o mesmo chefe.");
        }
    }
}
