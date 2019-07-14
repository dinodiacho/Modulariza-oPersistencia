import java.time.LocalDate;

public class PropostaReparacao {
    private LocalDate data;
    private Livro livro;
    private Responsavel responsavel;

    public PropostaReparacao(LocalDate data, Livro livro, Responsavel responsavel) {
        this.data = data;
        this.livro = livro;
        this.responsavel = responsavel;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}
