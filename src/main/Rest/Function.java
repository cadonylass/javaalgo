package Rest;

import com.algorand.algosdk.crypto.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;

//
//@JsonPropertyOrder({ "name", "date", "addy", "PriK", "PubK", "PubNE", "PriNE", "tsc", "curr", "cs", "am", "hh", "uni"})
//    public class Function {
//
//
//        @ApiModelProperty(position = 1)
//        private final String name;
//        @ApiModelProperty(position = 2)
//        private final Date date;
//        @ApiModelProperty(position = 3)
//        private final Address addy;
//        @ApiModelProperty(position = 4)
//        private final String PriK;
//        @ApiModelProperty(position = 5)
//        private final Hashtable<Address, String> PubNE;
//        @ApiModelProperty(position = 6)
//        private final Hashtable<Address,String> PriNE;
//        @ApiModelProperty(position = 7)
//        private final String PubK;
////dateofcreation
//
//
//    public Function(final String name, final Date date, final Address addy, final String PriK,
//                        final Hashtable<Address, String> PubNE, final Hashtable<Address, String> PriNE, final String PubK) {
//
//            this.name = name;
//            this.date = date;
//            this.addy = addy;
//            this.PriK= PriK;
//            this.PubNE= PubNE;
//            this.PriNE = PriNE;
//            this.PubK = PubK;
//
//        }
//
//        public String getName() {
//            return name.replaceAll("\\s","");
//        }
//
//        public Date getDate() {
//
//
//            return date;
//        }
//
//        public Address getAddy() {
//            return addy;
//        }
//
//        public String getPriK() {
//
//
//
//        return PriK;
//        }
//        public String getPubK() {
//        return PubK;
//    }
//
//        public Hashtable<Address, String>getPubNE() {
//            return PubNE;
//        }
//
//        public Hashtable<Address, String>getPriNE() {
//            return PriNE;
//        }
//
//
//
//
//
//
//
//        @JsonIgnore
//        // Update function name to include version number
//        public String getUnique_ID() {
//            return this.name + "_v" + PriK;
//        }
//
//        @Override
//        public String toString() {
//            return "Function{" +
//                    "name='" + name + '\'' +
//                    ", date='" + date + '\'' +
//                    ", addy='" + addy + '\'' +
//                    ", PriK='" + PriK + '\'' +
//                    ", PubNE=" + PubNE +
//                    ", PriNE =" + PriNE  +
//                    '}';
//        }
//    }
//
//
