package meuservidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MeuServidor {

    public static void main(String[] args) {
        try{
            //Cria um server socket para receber a conexão da porta 8008.
            ServerSocket conexao = new ServerSocket(8008);
            
            //Cria um SOCKET para receber a conexão com o cliente.
            Socket SERVIDOR = conexao.accept();
            
            //Cria um fluxo de saída para enviar mensagens ao cliente.
            PrintWriter out_cliente = new PrintWriter(SERVIDOR.getOutputStream(),true);
            
            //Cria um buffer de entrada para receber mensagens do cliente.
            BufferedReader in_cliente = new BufferedReader(
                    new InputStreamReader(SERVIDOR.getInputStream()));
            
            //Cria um buffer de entrada para receber mensagens do teclado.
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            
            
            
            if(in_cliente.readLine().compareTo("POO") != 0){
                //Envia erro ao cliente.
                out_cliente.println(0);
                //Envia mensagem de erro ao cliente e a tela padrão.
                System.out.println("Conexão recusada! Você não foi autenticado!");
                out_cliente.println("Conexão recusada! Você não foi autenticado!");
                
            }
            
            else{
                //Envia sucesso ao cliente.
                out_cliente.println(1);
                //Envia sucesso ao cliente e a tela padrão.
                System.out.println("Conexão aceita! Você foi autenticado!");
                out_cliente.println("Conexão aceita! Você foi autenticado!");
                
                String leituraServidor = "";
                boolean receptor = true;
                boolean terminaWhile = false;
                
                //Laço é executado até que seja dito para parar.
                while(!terminaWhile){
                    //Se o servidor estiver trabalhando como receptor.
                    if(receptor){
                        //Recebe uma linha do cliente.
                        leituraServidor = in_cliente.readLine();
                        //Verifica se não é Cambio.
                        if(leituraServidor.compareTo("Cambio") != 0)
                            //Se não é 'Cambio', imprime.
                            System.out.println(leituraServidor);
                        //Se é cambio, troca para receptor ou enviador.
                        else
                            receptor = !receptor;
                        
                    }
                    //Se o receptor estiver trabalhando como enviador.
                    else{
                        leituraServidor = in.readLine();
                        
                        //Verifica se é "Sair".
                        if(leituraServidor.compareTo("Sair") == 0){
                            //Termina o laço.
                            terminaWhile = true;
                            break;
                        }
                        
                        out_cliente.println(leituraServidor);
                        
                        if(leituraServidor.compareTo("Cambio") == 0)
                            receptor = !receptor;
                        else if(leituraServidor.compareTo("Sair") == 0)
                            terminaWhile = true;
                    }
                }
                
            }
            
            System.out.println("FIM DA CONEXÃO!");
            
            SERVIDOR.close();
            out_cliente.close();
            in_cliente.close();
            in.close();
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
