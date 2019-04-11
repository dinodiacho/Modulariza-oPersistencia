import java.time.LocalDate;

public class RequisicaoCompraCopia extends RequisicaoCompra {
    Livro livro;
    Utilizador utilizador;

    public RequisicaoCompraCopia(String estado, LocalDate data, String oficio, Livro livro, Utilizador utilizador) {
        super(estado, data, oficio);
        this.livro = livro;
        this.utilizador = utilizador;
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
