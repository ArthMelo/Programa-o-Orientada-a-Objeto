package study.arthur.lab3;

public class Contato {
    private String nome;
    private String tel;

    public Contato(String nome, String tel) {
        if(nome == "" || nome == " ") {
            this.nome = "Anônimo";
        } else {
            this.nome = nome;
        }
        this.tel = tel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return false; 
        }
        if (!(obj instanceof Contato)) {
            return false; // Se o objeto não for do tipo Contato, retorna false.
        }
        Contato c = (Contato) obj; // Faz o casting de obj para Contato.
    
        // Compara o nome e o telefone.
        return this.nome.equals(c.getNome()) && this.tel.equals(c.getTel());
    }
    

    public String getNome() {
        return nome; // O mesmo que "return this.nome"
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.nome = tel;
    }

}
