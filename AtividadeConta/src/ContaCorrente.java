public class ContaCorrente {
    private Integer numero;
    private Double saldo = 0.10;
    private boolean status = true;
    private Cliente cliente;

    public ContaCorrente(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Integer getNumero(){
        return this.numero = numero;
    }

    public Double sacar(Double valor){
        if (valor > saldo)
            saldo = 0.0;
        return saldo -= valor;
    }

    public Double consultarSaldo(){
        return saldo;
    }

    public void cancelar(){
        this.status=false;
    }


}
