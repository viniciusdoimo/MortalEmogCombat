/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motalemogcombat;
/**
 *
 * @author VINICIUS DOIMO
 */
public interface AcessaLutador {
    
    public abstract void apresentacao();
    public abstract void status();
    public abstract void ganharLuta();
    public abstract void perdeLuta();
    public abstract void empatarLuta();
}
