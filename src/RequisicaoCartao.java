import java.time.LocalDate;

public class RequisicaoCartao {
    private LocalDate data;
    private Utilizador utilizador;

    public RequisicaoCartao(LocalDate data, Utilizador utilizador) {
        this.data = data;
        this.utilizador = utilizador;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
}
