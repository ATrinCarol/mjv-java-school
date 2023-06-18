import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ArquivoCSV {
    public void escreverArquivoCsv(PessoaCandidata cadastros){
        StringBuilder sb = new StringBuilder();
        PessoaCandidata cadastro = new PessoaCandidata();

        try{
            sb.append("Nome: " + cadastro.getNome() + ",");
            sb.append("Sobrenome: " + cadastro.getSobrenome() + ",");
            sb.append("Data de Nascimento: " + cadastro.getDataNascimento() + ",");
            sb.append("Sexo: " + cadastro.getSexo() + ",");
            sb.append("Email: " + cadastro.getEmail() + ",");
            sb.append("Telefone: " + cadastro.getTelefone() + ",");
            sb.append("Experiência Profissional: " + cadastro.getExperienciaProfissional() + ",");
            sb.append("Faixa Salarial: " + cadastro.getFaixaSalarial() + ",");
            sb.append("Endereço: " + cadastro.getEndereco());

            String caminhoDiretorio = "C:\\Users\\karin\\Desktop\\CAROL\\2 MJV School - Java\\mjv-java-school\\AtividadeArquivoCSV";
            Path caminhoArquivo = Paths.get(caminhoDiretorio + "\\candidaturas.csv");

            Files.write(caminhoArquivo, sb.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);

        } catch (Exception error){
            error.printStackTrace();
        }
    }
}
