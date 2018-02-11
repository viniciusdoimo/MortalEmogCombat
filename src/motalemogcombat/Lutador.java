/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motalemogcombat ;
/**
 *
 * @author VINICIUS DOIMO
 */
public class Lutador implements AcessaLutador{
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura ,peso;
    
    //Metódo Especial (Construtor)
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    //Metódos Especiais (Setters % Getters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso > 52.2 && this.peso < 120){
            if(this.peso < 70.3){
                this.categoria = "Pena";
            } else if(this.peso  < 83.9){
                this.categoria = "Médio";
            } else{
                this.categoria = "Pesado";
            }
        } else{
            System.out.println("Pesso invalido. ");
        }
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    
    //Metódos Abstratos (assessores)
    @Override
    public void apresentacao() {
        System.out.println("Nome:      " + this.getNome());
        System.out.println("Nacional:  " + this.getNacionalidade());
        System.out.println("Altura:    " + this.getAltura() + "m");
        System.out.println("Peso:      " + this.getPeso() + "kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias:  " + this.getVitorias());
        System.out.println("Derrotas:  " + this.getDerrotas());
        System.out.println("Empates:   " + this.getEmpates());
        System.out.println("---------------------------- \n");
    }   
 
    @Override
    public void status() {
        System.out.println("Nome:      " + this.getNome());
        System.out.println("Peso:      " + this.getCategoria());
        System.out.println("Vitórias:  " + this.getVitorias());
        System.out.println("Derrotas:  " + this.getDerrotas());
        System.out.println("Empates:   " + this.getEmpates());
        System.out.println("---------------------------- \n");
    } 

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perdeLuta() {
        this.setDerrotas(this.getDerrotas()-1);
    }
 
    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
 
}
