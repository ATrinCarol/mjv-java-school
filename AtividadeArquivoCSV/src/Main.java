import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco();
        PessoaCandidata cadastro1 = new PessoaCandidata();
        endereco1.setRua("Rua Gervásio");
        endereco1.setNumero(1910);
        endereco1.setCep("04587-963");
        endereco1.setBairro("Jd. Peri");
        cadastro1.setNome("Carol");
        cadastro1.setSobrenome("Trindade");
        cadastro1.setDataNascimento(LocalDate.of(1995, 05, 28));
        cadastro1.setSexo("Feminino");
        cadastro1.setEmail("carol@email.com");
        cadastro1.setTelefone("000000000");
        cadastro1.setExperienciaProfissional("Assistente Social, Product Owner");
        cadastro1.setFaixaSalarial(3000.00);
        cadastro1.setEndereco(endereco1);

        Endereco endereco2 = new Endereco();
        PessoaCandidata cadastro2 = new PessoaCandidata();
        endereco1.setRua("Rua Gervásio 2");
        endereco1.setNumero(1912);
        endereco1.setCep("04587-222");
        endereco1.setBairro("Jd. Peri 2");
        cadastro1.setNome("Caroline");
        cadastro1.setSobrenome("Alves");
        cadastro1.setDataNascimento(LocalDate.of(1992, 02, 22));
        cadastro1.setSexo("Feminino");
        cadastro1.setEmail("carol2@email.com");
        cadastro1.setTelefone("000002222");
        cadastro1.setExperienciaProfissional("Assistente Social, Product Owner");
        cadastro1.setFaixaSalarial(2000.00);
        cadastro1.setEndereco(endereco2);

        ArquivoCSV arquivoCsv = new ArquivoCSV();
        arquivoCsv.escreverArquivoCsv(cadastro2);
    }
}