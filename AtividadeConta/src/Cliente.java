import java.time.LocalDate;

public class Cliente {
    private String nome;
    private LocalDate dataNascimento;
    private String endereco;
    private String rg;

    public Cliente(String nome, String endereco, String rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.rg = rg;
    }
}
