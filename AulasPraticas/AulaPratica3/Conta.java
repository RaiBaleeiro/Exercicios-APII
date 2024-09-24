package AulasPraticas.AulaPratica3;


    public class Conta {
        //Atributos
        private int numero;
        private String cliente;
        private double saldo;
        private String movimentos;
        //Construtores
        public Conta()
        {

        }

        public Conta(int numero,String cliente)
        {
            this.numero = numero;
            this.cliente = cliente;
        }

        public Conta(int numero,String cliente,double saldo)
        {
            this.numero = numero;
            this.cliente = cliente;
            this.saldo = saldo;
        }
        //Métodos
        boolean sacar(double valor){
            if (saldo >= valor) {
                saldo -= valor;
                movimentos += "Saque: R$ " + valor + "\n";
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
            return "Número: "+this.numero+"\nCliente: "+this.cliente+"\nSaldo: "+this.saldo;
        }

        public boolean ehIgual(Conta conta)
        {
            return this.numero == conta.numero && this.cliente.equals(conta.cliente) && this.saldo == conta.saldo;
        }

        public String extrato() {
            return movimentos + "----------------------\nSaldo: R$ " + saldo;
        }

        public String getCliente() {
            return cliente;
        }
        public void setCliente(String cliente) {
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
