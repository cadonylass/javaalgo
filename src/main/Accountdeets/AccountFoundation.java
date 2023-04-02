package Accountdeets;
import com.algorand.algosdk.account.Account;
import com.algorand.algosdk.crypto.Address;
import java.util.concurrent.ConcurrentHashMap;

import java.security.NoSuchAlgorithmException;
import java.util.*;


public abstract class AccountFoundation {
    Account acct = new Account();
    private String TwentyWordPassphrase = acct.toMnemonic();
    private Address addy = acct.getAddress();
    ArrayList<Integer> myList = new ArrayList<Integer>();
    Set<String> mySet = new HashSet<String>();
    Map<String, Set<String>> AccountMap = new ConcurrentHashMap<String, Set<String>>();



    protected AccountFoundation() throws NoSuchAlgorithmException {

    }//stacks ands heaps

    public Account createaccount() throws NoSuchAlgorithmException {
            System.out.println("Address: " + acct.getAddress());
            System.out.println("Passphrase: " + acct.toMnemonic());
      return acct;  }

    public Set<String> accountpassphrase(){
        mySet.add(TwentyWordPassphrase);
//System.out.println(mySet);
    return mySet; }


public Map<String, Set<String>> CreateAccountMnemonicMap(){

    AccountMap.put(addy.toString(), accountpassphrase());

   System.out.println(AccountMap);
    return AccountMap;

}

}
