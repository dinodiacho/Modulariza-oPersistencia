import java.time.LocalDate;

public class Cartao {
    private LocalDate emissao;
    private String prazo;
    private String nome;
    private RequisicaoCartao requisicaoCartao;

    public Cartao(LocalDate emissao, String prazo, String nome, RequisicaoCartao requisicaoCartao) {
        this.emissao = emissao;
        this.prazo = prazo;
        this.nome = nome;
        this.requisicaoCartao = requisicaoCartao;
    }

    public LocalDate getEmissao() {
        return emissao;
    }

    public void setEmissao(LocalDate emissao) {
        this.emissao = emissao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RequisicaoCartao getRequisicaoCartao() {
        return requisicaoCartao;
    }

    public void setRequisicaoCartao(RequisicaoCartao requisicaoCartao) {
        this.requisicaoCartao = requisicaoCartao;
    }
}
