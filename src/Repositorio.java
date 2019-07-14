public interface Repositorio
{
    void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);
    void adicionaEncomenda(Encomenda encomenda);
    void adicionaEvento(Evento evento);
    void adicionaOrcamento(Orcamento orcamento);
    void adicionaPropostaReparacao(PropostaReparacao propostaReparacao);
    void adicionionaRequisicaoCartao(RequisicaoCartao requisicaoCartao);
    void adicionaCartao(Cartao cartao);
    void adicionaResponsavel(Responsavel responsavel);

}