package main;

public class Livro extends Produto { 

  private String autor;

  public Livro(String d,String a) {
    this.descricao=d;
    this.autor=a;
  }

  public String getDescricao() {
    return (this.descricao + '\t' + this.autor);
  }

}