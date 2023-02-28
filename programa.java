public class programa {
    public static void main(String[] args) {

        Conta minhaConta;
        Conta minhaConta2;

        minhaConta = new Conta();

        minhaConta.numero=1;
        minhaConta.titular="João Netto";
        minhaConta.saldo=4300;

        minhaConta2 = new Conta();

        minhaConta2.numero=2;
        minhaConta2.titular="Adriana";
        minhaConta2.saldo=1222;

        System.out.println( "dados da conta: \n" + "Número da conta:" + minhaConta.numero + "\nTitular da conta:" + minhaConta.titular + "\nSaldo da conta:" + minhaConta.saldo + "\n" );
        System.out.println( "dados da conta: \n" + "Número da conta:" + minhaConta2.numero + "\nTitular da conta:" + minhaConta2.titular + "\nSaldo da conta:" + minhaConta2.saldo + "\n" );
    }

}
