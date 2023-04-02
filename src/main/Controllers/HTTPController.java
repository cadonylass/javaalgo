package Controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import main.AccountCreation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.HashMap;

@RestController
public class HTTPController {




        private final ObjectMapper objMapper = new ObjectMapper();


        @ResponseStatus(HttpStatus.CREATED)
        @ApiOperation(value = "Creates a new function in AWS Lambda", code = 201)
        @ApiResponses(value = {
                @ApiResponse(code = 201, message = "Function created successfully", response = String.class),
                @ApiResponse(code = 409, message = "Function failed to upload.", response = String.class)
        })
        @CrossOrigin
        @PostMapping("/account/register")
        public void registerAccount(@RequestBody AccountCreation AccountCreations) throws JsonProcessingException {
            System.out.println("\nNew Account\n===================================================");
            System.out.println(Timestamp.from(Instant.now()) + ": AccountCreation POST received: " +
                    objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(AccountCreations));
            HashMap<String, HashMap<String, Object>> response = new HashMap<>();
            String log = "Empty logs";
            String output = "";
}
}