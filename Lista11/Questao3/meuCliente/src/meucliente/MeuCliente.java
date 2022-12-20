package meucliente;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MeuCliente {
    public static void main (String [] args){
        try{
            //Cria um socket de cliente na porta 8008.
            Socket CLIENTE = new Socket("localhost", 8008);
            
            //Cria um fluxo de saída para enviar mensagens ao servidor.
            PrintWriter out_servidor = new PrintWriter(CLIENTE.getOutputStream(),true);
            
            //Cria um buffer de entrada para receber mensagens do servidor.
            BufferedReader in_servidor = new BufferedReader(
                    new InputStreamReader(CLIENTE.getInputStream()));
            
            //Cria um buffer de entrada para receber mensagens do teclado.
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            
            //Lê a autenticação do teclado.
            String autenticacao = in.readLine();
            
            //Envia autenticação pro servidor.
            out_servidor.println(autenticacao);
            
            
            
            //Verifica se o status da conexão recebida é 1 (SUCESSO).
            if(in_servidor.readLine().compareTo("1") == 0){
                
                System.out.println(in_servidor.readLine());
                boolean receptor = false;
                
                String leituraServidor = "";
                boolean terminaWhile = false;
                while(!terminaWhile){
                    if(receptor){
                        leituraServidor = in_servidor.readLine();
                        //Verifica se não é Cambio.
                        if(leituraServidor.compareTo("Cambio") != 0)
                            //Se não é 'Cambio', imprime.
                            System.out.println(leituraServidor);
                        //Se é cambio, troca para receptor ou enviador.
                        else
                            receptor = !receptor;
                    }
                    else{
                        leituraServidor = in.readLine();
                        
                        //Verifica se é "Sair".
                        if(leituraServidor.compareTo("Sair") == 0){
                            //Termina o laço.
                            terminaWhile = true;
                            break;
                        }
                        
                        out_servidor.println(leituraServidor);
                        
                        if(leituraServidor.compareTo("Cambio") == 0)
                            receptor = !receptor;
                        else if(leituraServidor.compareTo("Sair") == 0)
                            terminaWhile = true;
                    }
                }
                
            }
            //Se o status da conexão é 0.
            else{
                System.out.println(in_servidor.readLine());
            }
            
            System.out.println("FIM DA CONEXÃO!");
            CLIENTE.close();
            out_servidor.close();
            in_servidor.close();
            in.close();
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

