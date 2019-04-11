import java.time.LocalDate;

public class Emprestimo {
   private LocalDate data;
   private Requisicao requisicao;

    public Emprestimo(LocalDate data, Requisicao requisicao) {
        this.data = data;
        this.requisicao = requisicao;
    }

    public Requisicao getRequisicao() {
        return requisicao;
    }

    public void setRequisicao(Requisicao requisicao) {
        this.requisicao = requisicao;
    }

    public Emprestimo(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
