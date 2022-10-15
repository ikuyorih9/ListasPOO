package questão3;

public class MinhaListaEncadeada { 

  private Elemento ini;

  MinhaListaEncadeada(){
    this.ini = new Elemento(null);
  }

  public void insereFim(int val){

    if(this.ini.val==null){
      this.ini.val=val;
      return;
    }

    Elemento no = this.ini;

    while(no.prox!=null){
      no=no.prox;
    }
    no.prox=new Elemento(val);

  }
  
  public void remove(int elem) throws Error{
    
    if(this.ini.val==null){;
      return;
    }

    Elemento no = this.ini;
    Elemento ant = this.ini;

    while(no.val!=elem && no.prox!=null){
      ant=no;
      no=no.prox;
    }
    if(no.val==elem){
      if(ant.prox==no.prox){
        this.ini=no.prox;
        return;
      }
      ant.prox=no.prox;
    }
    
  }

  public void insere_n_elementos_Fim(int n){

    if(this.ini.val==null){
      this.ini.val=1;
      return;
    }

    Elemento no = this.ini;

    for(int i=1;i<=n;i++){
      while(no.prox!=null){
        no=no.prox;
      }
      no.prox=new Elemento(i);
    }

  }

  public void imprime(){

    Elemento no = this.ini;

    while(no.prox!=null){
      System.out.println(no.val);
      no=no.prox;
    }
    System.out.println(no.val);

  }

}