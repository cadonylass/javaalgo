package main;

import com.algorand.algosdk.account.Account;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.NoSuchAlgorithmException;


@SpringBootApplication
public class mainclass {

  //  public static AccountCreation AccountCreationo = new AccountCreation();
    public mainclass() throws NoSuchAlgorithmException {
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(mainclass.class, args);

//        Mer mert = new Mer();
//        mert.createaccount();
//       mert.accountpassphrase();
//mert.CreateAccountMnemonicMap();


//        ObjectMapper objMapper = new ObjectMapper();
//        String json = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(AccountCreationo);
//        System.out.println(json);
//        createwallone walley = new createwallone();
//       // walley.createAccount();
//        Account acce = new Account();
//        String whatis = acce.toString();
//        System.out.println(whatis);
//        walley.createAccount();
      //  walley.GetAccAddy();
//        walley.GetAccPri();
//        walley.Storepri();
//        walley.gettingStartedExample();


        //walley.printBalance();

        //AccountCreation ACC = new AccountCreation() ;
        

//        Account myAccount1 = t.createAccount();
//        System.out.println(myAccount1.getAddress());

    }
}
