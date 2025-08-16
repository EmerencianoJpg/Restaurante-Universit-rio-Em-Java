
package ru;

public class CardapioDados {
    
    //ATRIBUTOS
    
    private String diaSemana, prato, bebida, sobremesa;
    
    //CONSTRUTOR

    public CardapioDados(String diaSemana, String prato, String bebida, String sobremesa) {
        this.diaSemana = diaSemana;
        this.prato = prato;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }
    
    // GETTERS E SETTERS

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getPrato() {
        return prato;
    }

    public String getBebida() {
        return bebida;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }
    
}
