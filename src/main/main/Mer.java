package main;

import Accountdeets.AccountFoundation;
import com.algorand.algosdk.account.Account;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Mer extends AccountFoundation {



    protected Mer() throws NoSuchAlgorithmException {
    }


    @Override
    public Account createaccount() throws NoSuchAlgorithmException {
        return super.createaccount();
    }

    public Set<String> accountpassphrase(){

        return super.accountpassphrase();


    }
}
