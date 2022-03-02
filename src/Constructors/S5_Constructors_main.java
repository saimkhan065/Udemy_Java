public class S5_Constructors_main {
    public static void main(String[] args) {
        S5_Constrcutors saim_account = new S5_Constrcutors(55305152, 0.0, "Saim Khan", "saimkhan065@gmail.com", "437-972-7695");


        saim_account.deposit(1000.0);
        saim_account.withdraw(200.0);
        System.out.println(saim_account.getBalance());


    }
}
