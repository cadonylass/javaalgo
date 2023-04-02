package Controllers;

import Accountdeets.AccountFoundation;
import main.AccountCreation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;

@RestController
public class Controlla {

    @PostMapping("/Accountmade")
    public ResponseEntity<String> handlePostRequest(@RequestBody AccountFoundation AccountFoundationbody) {
        // Handle the POST request
        String responseBody = "Received request body: " + AccountFoundationbody.CreateAccountMnemonicMap();
        return ResponseEntity.ok(responseBody);
    }

    @PostMapping("/Accountmade2")
    public ResponseEntity<String> PostRequest(@RequestBody AccountCreation AccountCreationbody) throws NoSuchAlgorithmException {
        // Handle the POST request
        String responseBody = "Received request body: " + AccountCreationbody.AccountCreation();
        return ResponseEntity.ok(responseBody);
    }

    @GetMapping("/accountgot")
    public ResponseEntity<String> handleGetRequest() {
        // Handle the GET request
        String responseBody = "This is a GET request";
        return ResponseEntity.ok(responseBody);
    }
}



