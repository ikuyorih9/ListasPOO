package stackoverflow;

public class MyObject {
    
    /*
    [...]
    */

    //O método realiza chamadas recursivas empilhando-as na stack indiscriminadamente
    public int MyMethod(){
        return MyMethod();
    }
}
