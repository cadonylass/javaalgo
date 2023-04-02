import com.algorand.algosdk.v2.client.common.AlgodClient;
import main.AccountCreation;

public class To  {

    final private String ALGOD_API_ADDR;
    final private String ALGOD_API_TOKEN;
    final private int ALGOD_PORT;


    public To (String ALGOD_API_ADDR, String ALGOD_API_TOKEN, int ALGOD_PORT  ){

       // super(name);
        this.ALGOD_API_ADDR = ALGOD_API_ADDR;
        this.ALGOD_API_TOKEN = ALGOD_API_TOKEN;
        this.ALGOD_PORT = ALGOD_PORT;
    }

    public AlgodClient connectToNetwork() {

        AlgodClient client = new AlgodClient(ALGOD_API_ADDR,ALGOD_PORT, ALGOD_API_TOKEN);
        return client;
    }

    public String createAccount()  throws Exception {

    return null;}

//    public Account createAccount()  throws Exception {
//
//         Scanner scan = new Scanner(System.in);
//        try {
//            Account myAccount1 = new Account();
//            System.out.println("My Address: " + myAccount1.getAddress());
//            System.out.println("My Passphrase: " + myAccount1.toMnemonic());
//            System.out.println("Navigate to this link and dispense funds:  https://dispenser.testnet.aws.algodev.network?account=" + myAccount1.getAddress().toString());
//
//            System.out.println("PRESS ENTER KEY TO CONTINUE...");
//            scan.nextLine();
//            return myAccount1;
//            // Copy off account and mnemonic
//            // Dispense TestNet Algos to account:
//            // https://dispenser.testnet.aws.algodev.network/
//            // resource:
//            // https://developer.algorand.org/docs/features/accounts/create/#standalone
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new Exception("Account creation error " + e.getMessage() );
//        }

  //  }
}
