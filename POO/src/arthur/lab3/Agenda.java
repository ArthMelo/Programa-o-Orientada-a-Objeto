package study.arthur.lab3;

public class Agenda {
    private Contato[] meusContatos;
    private final int MAX = 100;
    private int total = 0;

    public Agenda() {
        meusContatos = new Contato[MAX];
    }

    public boolean ehDuplicado(Contato c) {
        for (int i = 0; i < total; ++i) {
            if (c.equals(meusContatos[i])) { // Chama o nosso "equals()"!
                return true;
            }
        }
        return false;
    }

    public void listarContatos() {
        for (int i = 0; i < total; ++i) {
            System.out.println(meusContatos[i].getNome());
        }
        System.out.println("Total de " + total + " contatos listados.");
    }

    public boolean adicionarContato(Contato c) {
        if (total == MAX) {// Agenda lotada?
            return false;
        }

        if (ehDuplicado(c)){
            System.out.println("Contato ja adicionado");
            return false;
        } else {
            meusContatos[total] = c;
            ++total;
            return true;
        }
    }

    public boolean removerContato(Contato c) {
        for(int i = 0; i < total; i++) {
            if(meusContatos[i] == c) {
                for(int j = i; j < total-1; ++j) {
                    meusContatos[j] = meusContatos[j+1];
                }
                meusContatos[total-1] = null;
                total--;
                return true;
            }
        }
        return false; 
    }
}
