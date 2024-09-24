package AulasPraticas.AulaPratica4.Banco;


    public class Conta {
        //Atributos
        private int numero;
        private Cliente cliente;
        private double saldo;
        private static int contConta;
        private String movimentos;
        //Construtores
        public Conta()
        {

        }

        public Conta(Cliente cliente)
        {
            this.numero = contConta++;
            this.cliente = cliente;
        }

        public Conta(Cliente cliente,double saldo)
        {
            this.numero = contConta++;
            this.cliente = cliente;
            this.saldo = saldo;
        }
        //Métodos
        boolean sacar(double valor){
            if (this.saldo >= valor) {
                this.saldo -= valor;
                this.movimentos += "Saque: R$ " + valor + "\n";
                return true;
            }
            return false;
        }
        
        void depositar(double valor){
            if (valor > 0) {
                saldo += valor;
                movimentos += "Depósito: R$ " + valor + "\n";
            }
        }


        public void transferir(Conta outraConta, double valor) {
            if (this.sacar(valor)) {
                outraConta.depositar(valor);
            }
        }

        public String imprimirConta()
        {
            return "Número: "+this.numero+"\nCliente: "+this.cliente.getNome()+"\nSaldo: "+this.saldo;
        }

        public boolean ehIgual(Conta conta)
        {
            return this.numero == conta.numero && this.cliente.equals(conta.cliente) && this.saldo == conta.saldo;
        }

        public String extrato() {
            return movimentos + "----------------------\nSaldo: R$ " + saldo;
        }

        public Cliente getCliente() {
            return cliente;
        }
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public int getNumero() {
            return numero;
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }

        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
     }

