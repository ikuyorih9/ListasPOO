package main;

import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    List<Produto> carrinho = new ArrayList<>();
    
    carrinho.add(new Mouse("Mouse óptico, Saída USB, 1.600 dpi","gamer"));
    carrinho.add(new Mouse("Mouse laser, Saída USB, 1.700 dpi","Office"));
    carrinho.add(new Mouse("Mouse óptico, Saída USB-C, 1.800 dpi","Student"));
    carrinho.add(new Livro("Capa dura","Daniel"));
    carrinho.add(new Livro("Capa mole","Chiarotto"));
    carrinho.add(new Livro("Digital","Brioto"));

    //carrinho.forEach(System.out::println);

    // size() pega o tamanho de um array
    // get() pega o objeto da lista sendo iterado naquele momento
    // Aí, pelo objeto, conseguimos aplicar seus métodos
    for (int i = 0; i < carrinho.size(); i++) {
      try{
        System.out.println(((Mouse)carrinho.get(i)).getDescricao());
      }catch(java.lang.ClassCastException x){
        System.out.println(((Livro)carrinho.get(i)).getDescricao());
      }
    }
    // Exception x permite pegar qualquer tipo de erro
    
  }
}