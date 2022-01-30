package ufes.cmp.analisadorlexico.chain.lexico.especificadores;

import ufes.cmp.analisadorlexico.chain.AbstractHandler;
import ufes.cmp.analisadorlexico.model.Token;

public class HandlerProgram extends AbstractHandler {
    
    public HandlerProgram(Token token) {
        super(token);
    }
    
    @Override
    public void executar(Token token) {
        if (token.getSimbolo().toLowerCase().equals("program")) {
            token.setCategoria("Especificador_PROGRAM");
        } else {
            this.setProximo(new HandlerVar(token));
        }
    }
    
    @Override
    public String recuperarErro(Token token) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}