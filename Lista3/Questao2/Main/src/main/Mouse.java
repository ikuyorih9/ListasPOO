package main;

public class Mouse extends Produto { 

  private String tipo;

  public Mouse(String d,String t) {
    this.descricao=d;
    this.tipo=t;
  }

  public String getDescricao() {
    return (this.descricao + '\t' + this.tipo);
  }

}