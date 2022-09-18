/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package terceiraquestao;
import java.util.Scanner;


public class TerceiraQuestao {

    public static void main(String[] args) {

        //definiçao dos superpoderes
        Superpoder Fogo = new Superpoder();
        Fogo.setCategoria(1);
        Fogo.setNome("Fogo");

        Superpoder Gelo = new Superpoder();
        Gelo.setCategoria(2);
        Gelo.setNome("Gelo");

        Superpoder Terra = new Superpoder();
        Terra.setCategoria(3);
        Terra.setNome("Terra");

        Superpoder Ar = new Superpoder();
        Ar.setCategoria(4);
        Ar.setNome("Ar");
        
        //criacao do scanner para leitura de dados
        Scanner s = new Scanner(System.in);

        //criacao do heroi
        SuperHeroi heroi = new SuperHeroi(100);
        System.out.println("Digite o nome do SuperHeroi");
        String nome = s.next();
        heroi.setNome(nome);
        System.out.println("Digite o nome do SuperHeroi na vida real");
        nome = s.next();
        heroi.setNomeVidaReal(nome);

        //exibicao do menu
        System.out.println("Poderes:");
        System.out.println("1 - Fogo");
        System.out.println("2 - Gelo");
        System.out.println("3 - Terra");
        System.out.println("4- Ar");

        int Superpoder;

        for(int i =0; i < 2; i++){

            System.out.println("Escolha o " + (i+1) + " poder para o Heroi");
            Superpoder = s.nextInt();

            switch(Superpoder){
                case 1:
                    heroi.adicionaPoder(Fogo);
                    break;

                case 2:
                    heroi.adicionaPoder(Gelo);
                    break;

                case 3:
                    heroi.adicionaPoder(Terra);
                    break;

                case 4:
                    heroi.adicionaPoder(Ar);
                    break;
                
            }
            
        }
        //criacao do vilao
        Vilao vilao = new Vilao(100);
        System.out.println("Digite o nome do Vilao");
        nome = s.next();
        vilao.setNome(nome);
        int AnosDePrisao;
        System.out.println("Digite os anos de prisao");
        AnosDePrisao = s.nextInt();
        vilao.setAnosDePrisao(AnosDePrisao);

        //exibicao do menu
        System.out.println("Poderes:");
        System.out.println("1 - Fogo");
        System.out.println("2 - Gelo");
        System.out.println("3 - Terra");
        System.out.println("4- Ar");

        for(int i = 0; i < 2; i++){

            System.out.println("Escolha o " + (i+1) + " poder para o Vilao");
            Superpoder = s.nextInt();

            switch(Superpoder){
                case 1:
                    vilao.adicionaPoder(Fogo);
                    break;

                case 2:
                    vilao.adicionaPoder(Gelo);
                    break;

                case 3:
                    vilao.adicionaPoder(Terra);
                    break;

                case 4:
                    vilao.adicionaPoder(Ar);
                    break;
                
            }
            
        }

        System.out.println(heroi.getNome() + " - vida: " + heroi.getVida());
        System.out.println(vilao.getNome() + " - vida: " + vilao.getVida());

        while(true){

            System.out.println(heroi.getNome() + " - Escolha o Superpoder para atacar");
            System.out.println("1 - " + heroi.getSuperpoder(1));
            System.out.println("2 - " + heroi.getSuperpoder(2));
            Superpoder = s.nextInt();
            heroi.atacar(heroi, Superpoder, vilao);

            if(vilao.getVida() == 0)
                break;

            System.out.println(vilao.getNome() + " - vida: " + vilao.getVida());
            
            System.out.println(vilao.getNome() + " - Escolha o Superpoder para atacar");
            System.out.println("1 - " + vilao.getSuperpoder(1));
            System.out.println("2 - " + vilao.getSuperpoder(2));
            Superpoder = s.nextInt();
            vilao.atacar(vilao, Superpoder, heroi);

            if(heroi.getVida() == 0)
                break;
                
            System.out.println(heroi.getNome() + " - vida: " + heroi.getVida());
            
        }

        if(vilao.getVida() == 0){
            System.out.println(vilao.getNome() + " - vida: " + vilao.getVida());
            System.out.println(heroi.getNome() + " venceu!");
        } else{
            System.out.println(heroi.getNome() + " - vida: " + heroi.getVida());
            System.out.println(vilao.getNome() + " venceu!");
        }

        s.close();
    }
    
}
