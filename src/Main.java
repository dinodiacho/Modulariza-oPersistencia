import java.time.LocalDate;


public class Main{



    public static void main(String args[]){

        Utilizador u = new Utilizador("Manuel","Ativo", new TipoUtilizador("aluno",10));
        PropostaAquisicao propostaAquisicao = new PropostaAquisicao(LocalDate.now(),u,"Alice no Pais das Maravilhas");
        Livro l = new Livro("Programar em Java", "FCA");
        Copia c = new Copia(1, l);
        RequisicaoCompraCopia requisicaoCompraCopia = new RequisicaoCompraCopia("pendente", LocalDate.now(), "Oficio",l,u);
        Encomenda encomenda = new Encomenda(LocalDate.now(),requisicaoCompraCopia);
        EntradaNovoLivro entradaNovoLivro = new EntradaNovoLivro(LocalDate.now(),encomenda,c);

        Responsavel r = new Responsavel("João","Ativo");
        LocalDate d = LocalDate.now();
        Evento e = new Evento(d,"Feira do Livro","Feira Anual do Livro",r);

        RequisicaoCartao requisicaoCartao = new RequisicaoCartao(d,u);
        Cartao cartao = new Cartao(d,"26-09-2019","Cartão Bibliotecário",requisicaoCartao);


        PropostaReparacao propostaReparacao = new PropostaReparacao(d,l,r);
        Orcamento orcamento = new Orcamento(d,"50€",propostaReparacao);


        //... criação do objeto repositorio
        Repositorio repo = new RepositorioMem();
        repo.adicionaEntradaNovoLivro(entradaNovoLivro);
        repo.adicionaEncomenda(encomenda);
        repo.adicionaResponsavel(r);
        repo.adicionaEvento(e);
        repo.adicionaCartao(cartao);
        repo.adicionaPropostaReparacao(propostaReparacao);
        repo.adicionaOrcamento(orcamento);
    }
}
