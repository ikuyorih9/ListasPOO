package main;

public class Produto { 

  private String nomeloja;
  private double preco;
  protected String descricao="Produto de informática";
  
  public void setnomeloja(String nome) {
    this.nomeloja=nome;
  }

  public void setpreco(double p) {
    this.preco=p;
  }

  public String getnomeloja() {
    return this.nomeloja;
  }

  public double getpreco() {
    return this.preco;
  }

  public String getDescricao() {
    return this.descricao;
  }

}