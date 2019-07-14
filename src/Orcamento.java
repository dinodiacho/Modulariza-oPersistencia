import java.time.LocalDate;

public class Orcamento {
    private LocalDate data;
    private String valor;
    private PropostaReparacao propostaReparacao;

    public Orcamento(LocalDate data, String valor, PropostaReparacao propostaReparacao) {
        this.data = data;
        this.valor = valor;
        this.propostaReparacao = propostaReparacao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public PropostaReparacao getPropostaReparacao() {
        return propostaReparacao;
    }

    public void setPropostaReparacao(PropostaReparacao propostaReparacao) {
        this.propostaReparacao = propostaReparacao;
    }
}
