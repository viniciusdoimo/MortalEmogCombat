/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motalemogcombat;

import java.util.Random;

/**
 *
 * @author VINICIUS DOIMO
 */
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Metódos Públicos

    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
                this.aprovada = true;
                this.desafiado = l1;
                this.desafiante = l2;
                System.out.println("Luta marcada! \n");
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Luta não pode acontecer! \n");
        }
        
    }

    public void lutar() {
        if(this.aprovada){
            System.out.println("---------- DESAFIADOR ------");
            this.desafiante.apresentacao();
            System.out.println("---------- DESAFIADO -------");
            this.desafiado.apresentacao();
            System.out.println("---------- COMBATE ---------");
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            
           switch(vencedor){
               case 0: //Empate
                   System.out.println("Empatou! ");
                   this.desafiado.empatarLuta();
                   this.desafiante.empatarLuta();
                   break;
               case 1: //Desafiado vence
                   this.desafiado.ganharLuta();
                   this.desafiante.perdeLuta();
                   System.out.println("Vencedor: " + this.desafiado.getNome());
                   break;
               case 2: //desafiador vence
                   System.out.println("Vencedor: " + this.desafiante.getNome());
                   this.desafiante.perdeLuta();
                   this.desafiado.perdeLuta();
                   break;
           } 
            System.out.println("---------------------------- \n");
           
        } else{
            System.out.println("A luta não pode acontecer! \n");
        }
    }

    //Metódos Especiais (Geters & Setters)
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
