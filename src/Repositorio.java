
/*
public abstract class Repositorio {
    public abstract void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);

}
*/

public interface Repositorio
{
    void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);
    void adicionaEncomenda(Encomenda encomenda);
}