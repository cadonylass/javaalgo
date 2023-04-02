package main;

import Accountdeets.AccountFoundation;

import com.algorand.algosdk.account.Account;
import com.algorand.algosdk.crypto.Address;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Hashtable;


    @JsonPropertyOrder({ "name", "who"  })
    public class AccountCreation {
        Mer mert = new Mer();
        @ApiModelProperty(position = 1 )
        private String name;
        @ApiModelProperty(position = 2)
        private String who;

        public AccountCreation() throws NoSuchAlgorithmException {
        }


        public String AccountCreation() throws NoSuchAlgorithmException {
            this.name = name;
            this.who = who;
            try {
                name.toString();
                if (name.isEmpty()) {
                    throw new Exception("name is empty");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                who.toString();
                if (who.isEmpty()) {
                    throw new Exception("name is empty");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


       return "Ran AccountCreation "; }

      //  public
        //useracc.CreateAccountMnemonicMap();
            ;
//            if (who.toString()){{
//
//            }
//            if (function.getPriK().isEmpty()){
//                AddPri(acc);
//            }



//            while (!name.isEmpty()) )
//
//            PubK = pubK;

//            for (String PubNE : function.getPubNE()) {
//                if (!PubK.isEmpty()) {
//                    developers.add(name);
//                }
//            }


//            public Address Addaddy (Account acc) {
//                usraddy = acc.getAddress();
//                System.out.println(usraddy);
//                acc.getAddress().toString();
//                return usraddy;
//            }
//
//        public String AddPri (Account acc) {
//            Prik = acc.toMnemonic();
//           // private final ObjectMapper objMapper = new ObjectMapper();
//            //objMapper.
//        return Prik;
//        }




//
//
//
//
//
//                }
//
//                }
//            }
//
//
// for (String PubK : function.getPubK()) {
//            if (!PubK.isEmpty()) {
//                developers.add(name);
//            }
//        p
//
//            if (PubK.getBytes() > zero {
//                System.out.println("name field is invalid or empty");
//
//            }
//            return "name field is invalid or empty" ;}
//
//        public String getName() {
//            return name.replaceAll("\\s","");
//        }

//        public Date getDate() {
//            return date;
//        }
//
//        public Address getAddy() {
//            return addy;
//        }
//
//        public String getPriK() {
//            return PriK;
//        }
//
//        public Hashtable<Address, String>getPubNE() {
//            return PubNE;
//        }
//
//        public Hashtable<Address, String>getPriNE() {
//            return PriNE;
//        }
//
//        public HashMap<String, Parameter> getInput() {
//            return input;
//        }
//
//        public HashMap<String, Parameter> getOutput() {
//            return output;
//        }
//
//        public Type getType() {
//            return type;
//        }
//
//        public String getLanguage() {
//            return language;
//        }
//
//        public String getsource_code() {
//            return source_code;
//        }
//
//        @JsonIgnore
//        // Update function name to include version number
//        public String getUnique_ID() {
//            return this.name + "_v" + PriK;
//        }






    //    JSONObject json = new JSONObject();
    //Account myAccount1 = new Account();

//
//    Hashtable<Address,String> Pub_e=new Hashtable<Address,String>();
//    Hashtable<Address,String> Pri_e=new Hashtable<Address,String>();
//
//
//    public String createAccount(Account account)  throws Exception {
//        System.out.println(PubNE.put(account.getAddress(), account.toMnemonic()));
//return PubNE.put(account.getAddress(), account.toMnemonic());
//      //  return Pub_Pri.put( myAccount1.getAddress(), myAccount1.toMnemonic() );
//    }
//
//    public String PubNE(String E){
//
//
//    //    return Pub_e.put(myAccount1.getAddress(), E);
//
//
//    }
//
//    public String PriNE(String E){
//
//
//        return  myAccount1.toMnemonic();
//
//
//    }
//
//
//
//    public Address AccountAddy ()  throws Exception {
//        Account myAccount1 = new Account();
//
//
//        return myAccount1.getAddress();
//    }



};



















































































