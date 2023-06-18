import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PessoaCandidata> candidaturas = new ArrayList<>();

        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua Gervásio");
        endereco1.setNumero(1910);
        endereco1.setCep("04587-963");
        endereco1.setBairro("Jd. Peri");
        PessoaCandidata cadastro1 = new PessoaCandidata();
        cadastro1.setNome("Carol");
        cadastro1.setSobrenome("Trindade");
        cadastro1.setDataNascimento(LocalDate.of(1995, 05, 28));
        cadastro1.setSexo("Feminino");
        cadastro1.setEmail("carol@email.com");
        cadastro1.setTelefone("000000000");
        cadastro1.setExperienciaProfissional("Assistente Social, Product Owner");
        cadastro1.setFaixaSalarial(3000.00);
        cadastro1.setEndereco(endereco1);
        candidaturas.add(cadastro1);

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua Gervásio Dois");
        endereco2.setNumero(1912);
        endereco2.setCep("04587-222");
        endereco2.setBairro("Jd. Peri 2");
        PessoaCandidata cadastro2 = new PessoaCandidata();
        cadastro2.setNome("Caroline");
        cadastro2.setSobrenome("Alves");
        cadastro2.setDataNascimento(LocalDate.of(1992, 02, 22));
        cadastro2.setSexo("Masculino");
        cadastro2.setEmail("carol2@email.com");
        cadastro2.setTelefone("000002222");
        cadastro2.setExperienciaProfissional("Assistente Social, Product Owner");
        cadastro2.setFaixaSalarial(2000.00);
        cadastro2.setEndereco(endereco2);

        //candidaturas.add(cadastro1); Mesmo sem adicionar na lista, o método retorna as informações do cadastro1.
        candidaturas.add(cadastro2);

        ArquivoCSV arquivoCsv = new ArquivoCSV();
        arquivoCsv.escreverArquivoCsv(candidaturas);
    }
}