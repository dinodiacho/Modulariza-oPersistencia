public class Copia {

    Livro livro;
   private int id;

    public Copia(int id,Livro livro) {
        this.livro = livro;
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public int getId() {
        return id;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setId(int id) {
        this.id = id;
    }
}
