import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra{
    PropostaAquisicao propostaAquisicao;
    Utilizador utilizador;
    Livro livro;

    public RequisicaoCompraLivro(String estado, LocalDate data, String oficio, PropostaAquisicao propostaAquisicao,Livro livro, Utilizador utilizador) {
        super(estado, data, oficio);
        this.propostaAquisicao = propostaAquisicao;
        this.utilizador = utilizador;
        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public PropostaAquisicao getPropostaAquisicao() {
        return propostaAquisicao;
    }

    public void setPropostaAquisicao(PropostaAquisicao propostaAquisicao) {
        this.propostaAquisicao = propostaAquisicao;
    }

    @Override
    public LocalDate getData() {
        return super.getData();
    }

    @Override
    public void setData(LocalDate data) {
        super.setData(data);
    }

    @Override
    public String getEstado() {
        return super.getEstado();
    }

    @Override
    public void setEstado(String estado) {
        super.setEstado(estado);
    }

    @Override
    public String getOficio() {
        return super.getOficio();
    }

    @Override
    public void setOficio(String oficio) {
        super.setOficio(oficio);
    }
}

