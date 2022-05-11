import java.util.List;

public class Banco {
    // Desafios propostos
    // Estender o domínio  da aplicação incluindo novas classes, atributos e/ou métodos
    // Incluir o lombok par reduzir getters e setters
    public String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
