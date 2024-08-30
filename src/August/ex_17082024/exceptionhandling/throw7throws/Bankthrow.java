package August.ex_17082024.exceptionhandling.throw7throws;
//throw
//custom expection
public class Bankthrow {
    private String Currency;
    private Integer amt;

    public Bankthrow(String Currency, Integer amt) {
        this.Currency = Currency;
        this.amt = amt;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public Integer getAmt() {
        return amt;
    }

    public void setAmt(Integer amt) {
        this.amt = amt;
    }

    public Integer add(Bankthrow bankname) {
        if (!bankname.Currency.equalsIgnoreCase("INR")){
            try {
                throw new  Exception("not valid");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    Integer sums = this.amt + bankname.amt;//
        return sums;
}
    }