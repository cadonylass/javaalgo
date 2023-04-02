package Rest;
import com.algorand.algosdk.crypto.Address;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import main.AccountCreation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.HashMap;
import java.util.Hashtable;

//
//@RestController
//public class FunctionController {
//    private String usname;
//    private Hashtable<Address, String> PubNE;
//
//    private final ObjectMapper objMapper = new ObjectMapper();
//
//
//    @ResponseStatus(HttpStatus.CREATED)
//    @ApiOperation(value = "Creates a new function in AWS Lambda", code = 201)
//    @ApiResponses(value = {
//            @ApiResponse(code = 201, message = "Function created successfully", response = String.class),
//            @ApiResponse(code = 409, message = "Function failed to upload.", response = String.class)
//    })//The return value is converted through HttpMessageConverter implementations and written to the response. See @ResponseBody.
//    @CrossOrigin
//    @PostMapping("/accountcreation/users")
//    public ResponseEntity<String> register(@RequestBody AccountCreation newFunction) throws JsonProcessingException {
//
////        try {
////            usname =  newFunction.getName();
////            newFunction.
////
////
////            PubNE = newFunction.getPubNE();
////
////        } catch (){
////
////        } finally {
////
////        }
////
//
//
//
//        System.out.println("\nNew Request\n===================================================");
//        System.out.println(Timestamp.from(Instant.now()) + ": New Function POST received: " +
//                objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newFunction));
//        HashMap<String, HashMap<String, Object>> response = new HashMap<>();
//        String log = "Empty logs";
//        String output = "";
//        try {
//            if (Application.flags.get("createLambdaFunc")) {
//                FunctionDeployer func;
//                String language = newFunction.getLanguage().toLowerCase();
//                if (language.contains("python")) {
//                    func = new PythonFunctionDeployer();
//                }
//                else if (language.contains("java")) {
//                    func = new JavaFunctionDeployer();
//                }
//                else {
//                    throw new Exception(Timestamp.from(Instant.now()) + ": Unsupported language specified, check spelling.");
//                }
//                func.zipFunction(newFunction);
//                response.put("lambda", objMapper.readValue(func.uploadFunction(newFunction, "arn:aws:lambda:" + Application.LAMBDA_REGION + ":"
//                        + Application.AccountID + ":function:" + newFunction.getUnique_ID()), HashMap.class));
//            }
//            if (Application.flags.get("registerFunc")) {
//                String anecoResponse = new APIController(Application.getHttpController()).registerFunction(newFunction);
//                response.put("aneco", objMapper.readValue(anecoResponse, HashMap.class));
//                if (anecoResponse != null) {
//                    log = "\n" + new TagUploadedFunction().tagFunction("arn:aws:lambda:" + Application.LAMBDA_REGION + ":"
//                            + Application.AccountID + ":function:" + newFunction.getUnique_ID(), "aneco_registered="
//                            + FunctionDeployer.timeStamp());
//                }
//            }
//            if (Application.flags.get("makeWorker")) {
//                log += SSHConnection.connect(newFunction.getUnique_ID());
//                log += "\nWorker for "+newFunction.getUnique_ID()+" started";
//            }
//            output = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
//        } finally {
//            // Log the response for debugging purposes.
//            System.out.println("\nLambda & AnEco Response\n----------------------\n" + output);
//            System.out.println("\nAdditional Logs\n----------------------\n" + log);
//        }
//        return new ResponseEntity<>(output, HttpStatus.CREATED);
//    }
//
//
//
//
//
//}
