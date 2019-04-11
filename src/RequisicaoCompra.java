import java.time.LocalDate;

public class RequisicaoCompra {
    public LocalDate data;
    private String estado;
    private String oficio;

    public RequisicaoCompra(String estado,LocalDate data,  String oficio) {
        this.data = data;
        this.estado = estado;
        this.oficio = oficio;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }
}
