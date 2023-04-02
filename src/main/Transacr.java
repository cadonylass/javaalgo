
//    package com.algorand.javatest.firsttransaction;
import com.algorand.algosdk.account.Account;
import com.algorand.algosdk.crypto.Address;
import com.algorand.algosdk.transaction.SignedTransaction;
import com.algorand.algosdk.transaction.Transaction;
import com.algorand.algosdk.util.Encoder;
import com.algorand.algosdk.v2.client.common.AlgodClient;
import com.algorand.algosdk.v2.client.common.Response;
import com.algorand.algosdk.v2.client.model.NodeStatusResponse;
import com.algorand.algosdk.v2.client.model.PendingTransactionResponse;
import com.algorand.algosdk.v2.client.model.PostTransactionsResponse;
import com.algorand.algosdk.v2.client.model.TransactionParametersResponse;
import com.algorand.algosdk.v2.client.Utils;
import org.json.JSONObject;

    public class Transacr {

        private AlgodClient client = null;

        // utility function to connect to a node
        private AlgodClient connectToNetwork() {
            final String ALGOD_API_ADDR = "localhost";
            final String ALGOD_API_TOKEN = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
            final Integer ALGOD_PORT = 4001;
            AlgodClient client = new AlgodClient(ALGOD_API_ADDR,ALGOD_PORT, ALGOD_API_TOKEN);
            return client;
        }

        private String printBalance(com.algorand.algosdk.account.Account myAccount) throws Exception {
            String myAddress = myAccount.getAddress().toString();
            Response<com.algorand.algosdk.v2.client.model.Account> respAcct = client.AccountInformation(myAccount.getAddress()).execute();
            if (!respAcct.isSuccessful()) {
                throw new Exception(respAcct.message());
            }
            com.algorand.algosdk.v2.client.model.Account accountInfo = respAcct.body();
            System.out.println(String.format("Account Balance: %d microAlgos", accountInfo.amount));
            return myAddress;
        }

        public void gettingStartedExample(Account myAccount) throws Exception {
            if (client == null)
                this.client = connectToNetwork();
            printBalance(myAccount);
            try {
                // Construct the transaction
                final String RECEIVER = "HZ57J3K46JIJXILONBBZOHX6BKPXEM2VVXNRFSUED6DKFD5ZD24PMJ3MVA";
                String note = "Hello World";
                Response<TransactionParametersResponse> resp = client.TransactionParams().execute();
                if (!resp.isSuccessful()) {
                    throw new Exception(resp.message());
                }
                TransactionParametersResponse params = resp.body();
                if (params == null) {
                    throw new Exception("Params retrieval error");
                }
                JSONObject jsonObj = new JSONObject(params.toString());
                System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));
                Transaction txn = Transaction.PaymentTransactionBuilder()
                        .sender(myAccount.getAddress().toString())
                        .note(note.getBytes())
                        .amount(1000000) // 1 algo = 1000000 microalgos
                        .receiver(new Address(RECEIVER))
                        .suggestedParams(params)
                        .build();
                // more code below~
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
