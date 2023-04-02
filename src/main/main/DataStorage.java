package main;

import com.algorand.algosdk.account.Account;
import com.algorand.algosdk.crypto.Address;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DataStorage {
    private static Hashtable addynkey = new Hashtable();
    private static createwall init_createwallone;
//    createwallone init_createwallone = new createwallone();
//
//    Hashtable<String, String> addynkey = new Hashtable<>();


    public static Hashtable addkey(Account addy) throws Exception {
        System.out.println("............attempt to store addy and pri to Hashtable for addy " + addy.getAddress());
        try {



            addynkey.put(addy.getAddress(), addy.toMnemonic());
//            Enumeration enu = addynkey.keys();
//            while (enu.hasMoreElements()) {
//
//                // Displaying the enumeration
//                System.out.println(enu.nextElement());
//            }
System.out.println(addy.getAddress() + "successfully stored ");
System.out.println(addynkey);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Cannot add addy or pri to hashtable for addy" + addy.getAddress() + e.getMessage());
        }






        return  addynkey;


    }}
//    Hashtable<Integer, String> ht2
//            = new Hashtable<Integer, String>();
//
//
//
//        ht2.put(4, "four");
//        ht2.put(5, "five");
//        ht2.put(6, "six");
//}
