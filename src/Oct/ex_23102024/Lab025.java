package Oct.ex_23102024;

import java.io.FileNotFoundException;

public class Lab025 {
    private String currency;
    private String amount;

    public Lab025(String currency, String amount) {
        this.currency = currency;
        this.amount = amount;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Integer add(Lab025 bankName) throws FileNotFoundException,Exception {
        if (!bankName.currency.equalsIgnoreCase("INR")) {

            throw new Exception("Currency is mismatch");
           // throw new Error();

        }

        return Integer.valueOf(bankName.amount )+ Integer.valueOf(this.amount);
    }
}


