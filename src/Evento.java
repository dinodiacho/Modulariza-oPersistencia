import java.time.LocalDate;

public class Evento {
    private LocalDate data;
    private String tema;
    private String descricao;
    private Responsavel responsavel;

    public Evento(LocalDate data, String tema, String descricao, Responsavel responsavel) {
        this.data = data;
        this.tema = tema;
        this.descricao = descricao;
        this.responsavel = responsavel;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}
