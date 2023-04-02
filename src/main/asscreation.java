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

import java.math.BigInteger;

public class asscreation {
    // CREATE ASSET
    // get changing network parameters for each transaction
//    Response < TransactionParametersResponse > resp = client.TransactionParams().execute();
//    if (!resp.isSuccessful()) {
//        throw new Exception(resp.message());
//    }
//    TransactionParametersResponse params = resp.body();
//    if (params == null) {
//        throw new Exception("Params retrieval error");
//    }
//    // params.fee = (long) 1000;
//    // Create the Asset:
//    BigInteger assetTotal = BigInteger.valueOf(10000);
//    boolean defaultFrozen = false;
//    String unitName = "myunit";
//    String assetName = "my longer asset name";
//    String url = "http://this.test.com";
//    String assetMetadataHash = "16efaa3924a6fd9d3a4824799a4ac65d";
//    Address manager = acct2.getAddress();
//    Address reserve = acct2.getAddress();
//    Address freeze = acct2.getAddress();
//    Address clawback = acct2.getAddress();
//    Integer decimals = 0;
//    Transaction tx = Transaction.AssetCreateTransactionBuilder()
//            .sender(acct1.getAddress())
//            .assetTotal(assetTotal)
//            .assetDecimals(decimals)
//            .assetUnitName(unitName)
//            .assetName(assetName).url(url)
//            .metadataHashUTF8(assetMetadataHash)
//            .manager(manager)
//            .reserve(reserve)
//            .freeze(freeze)
//            .defaultFrozen(defaultFrozen)
//            .clawback(clawback)
//            .suggestedParams(params).build();
//
//    // Sign the Transaction with creator account
//    SignedTransaction signedTx = acct1.signTransaction(tx);
//    Long assetID = null;
//    try {
//        String id = submitTransaction(signedTx);
//        System.out.println("Transaction ID: " + id);
//        PendingTransactionResponse pTrx = Utils.waitForConfirmation(client,id,4);
//        System.out.println("Transaction " + id + " confirmed in round " + pTrx.confirmedRound);
//        // Now that the transaction is confirmed we can get the assetID
//        assetID = pTrx.assetIndex;
//        System.out.println("AssetID = " + assetID);
//        printCreatedAsset(acct1, assetID);
//        printAssetHolding(acct1, assetID);
//
//    } catch (Exception e) {
//        e.printStackTrace();
//        return;
//    }
}
