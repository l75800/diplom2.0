package API;

public class FieldsForApi {
    public String number;
    public int month;
    public int year;
    public String holder;
    public int cvc;

    public FieldsForApi (String number, int month, int year, String holder, int cvc) {
        this.number = number;
        this.month = month;
        this.year = year;
        this.holder = holder;
        this.cvc = cvc;
    }
}
