import java.util.ArrayList;

public class RepositorioMem implements Repositorio {

    ArrayList<Coima> arrayCoima = new ArrayList<>();

    ArrayList<Copia> arrayCopia = new ArrayList<>();

    ArrayList<Devolucao> arrayDevolucao = new ArrayList<>();

    ArrayList<Emprestimo> arrayEmprestimo = new ArrayList<>();

    ArrayList<Notificacao> arrayNotificacao = new ArrayList<>();

    ArrayList<Utilizador> arrayUtilizador = new ArrayList<>();

    ArrayList<TipoUtilizador> arrayTipo = new ArrayList<>();

    ArrayList<Livro> arrayLivro = new ArrayList<>();

    ArrayList<Requisicao> arrayRequisicao = new ArrayList<>();

    ArrayList<Encomenda> arrayEncomenda = new ArrayList<>();

    ArrayList<EntradaNovoLivro> arrayEntrada = new ArrayList<>();

    ArrayList<PropostaAquisicao> arrayProposta = new ArrayList<>();

    ArrayList<RequisicaoCompra> arrayRequisicaoCompra = new ArrayList<>();

    ArrayList<Evento> arrayEvento = new ArrayList<>();

    ArrayList<Orcamento> arrayOrcamento = new ArrayList<>();

    ArrayList<PropostaReparacao> arrayPropostaReparacao = new ArrayList<>();

    ArrayList<RequisicaoCartao> arrayRequisicaoCartao = new ArrayList<>();

    ArrayList<Cartao> arrayCartao = new ArrayList<>();

    ArrayList<Responsavel> arrayResponsavel = new ArrayList<>();






    public RepositorioMem() {
    }
    public void adicionaUtilizador(Utilizador utilizador)
    {
        arrayUtilizador.add(utilizador);
    }
    public void adicionaTipoUtilizador(TipoUtilizador tipo)
    {
        arrayTipo.add(tipo);
    }
    public void adicionaRequisicao(Requisicao requisicao)

    {
        arrayRequisicao.add(requisicao);
    }
    public void adicionaCopia(Copia copia)
    {
        arrayCopia.add(copia);
    }
    public void adicionaLivro(Livro livro)
    {
        arrayLivro.add(livro);
    }
    public void adicionaEmprestimo(Emprestimo emprestimo)
    {
        arrayEmprestimo.add(emprestimo);
    }
    public void adicionaNotificacao(Notificacao notificacao)
    {
        arrayNotificacao.add(notificacao);
    }
    public void adicionaDevolucao(Devolucao devolucao)
    {
        arrayDevolucao.add(devolucao);
    }
    public void adicionaEvento(Evento evento)
    {
        arrayEvento.add(evento);
    }
    public void adicionaOrcamento(Orcamento orcamento)
    {
        arrayOrcamento.add(orcamento);
    }
    public void adicionaPropostaReparacao(PropostaReparacao propostaReparacao)
    {
        arrayPropostaReparacao.add(propostaReparacao);
    }
    public void adicionionaRequisicaoCartao(RequisicaoCartao requisicaoCartao)
    {
        arrayRequisicaoCartao.add(requisicaoCartao);
    }
    public void adicionaCartao(Cartao cartao)
    {
        arrayCartao.add(cartao);
    }
    public void adicionaResponsavel(Responsavel responsavel)
    {
        arrayResponsavel.add(responsavel);
    }



    public void adicionaCoima(Coima coima)
    {
        arrayCoima.add(coima);
    }

    public void adicionaEncomenda(Encomenda encomenda)

    {
        arrayEncomenda.add(encomenda);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro)
    {

        arrayEntrada.add(entradaNovoLivro);
    }

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta)

    {
        arrayProposta.add(proposta);
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra)
    {
        arrayRequisicaoCompra.add(requisicaoCompra);
    }


    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r)
    {
        for(Emprestimo e : arrayEmprestimo )
            if(e.getRequisicao().equals(r))
                return e;
        return null;
    }


}
