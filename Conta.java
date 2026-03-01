 public class Conta {
    private String titular;
    private String senha;
    private double saldo;
    private String agencia;
    private int conta;

    public String getTitular() {
        return titular;
    }

public String getSenha() {
    return senha;
}

public void setTitular(String titular) {
    this.titular = titular;
}

public void setSenha(String senha) {
    this.senha = senha;
}

public void setSaldo(double saldo) {
     this.saldo = saldo;
}

public String getAgencia() {
    return agencia;
}

public void setAgencia(String agencia) {
    this.agencia = agencia;
}

public int getConta() {
    return conta;
}

public void setConta(int conta) {
    this.conta = conta;
}

public void deposito(double valor) {
    saldo = saldo + valor;
}

public void saque (double valor){
    saldo = saldo - valor;
}

}
