    public class Main{
    public static void main(String[] args){
    Conta ana1 = new Conta();
        ana1.setTitular("Ana Mara Santiago");
        ana1.setSaldo(1000000000.00);
        ana1.setAgencia("0000");
        ana1.setConta(123456);
        ana1.setSenha("295511");


        System.out.println(ana1.getTitular());
        System.out.println(ana1.getSaldo());
        System.out.println(ana1.getAgencia());
        System.out.println(ana1.getConta());
        System.out.println(ana1.getSenha());
    }
}
