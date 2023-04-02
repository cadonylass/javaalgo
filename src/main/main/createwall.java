package main;

import com.algorand.algosdk.account.Account;
import com.algorand.algosdk.crypto.Address;

public interface createwall {
    public  Account createAccount()throws Exception;
    public String printBalance(com.algorand.algosdk.account.Account myAccount)throws Exception;
public String GetAccAddy() throws Exception;
    public String GetAccPri() throws Exception;

}
