package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by igor on 21.09.16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CourtCase {

    private String date;
    private String number;
    private String involved;
    private String description;
    private String judge;
    private String forma;
    private String add_address;


    public CourtCase(String date, String number, String involved, String description, String judge, String forma, String add_address) {
        this.date = date;
        this.number = number;
        this.involved = involved;
        this.description = description;
        this.judge = judge;
        this.forma = forma;
        this.add_address = add_address;
    }

    public String getDate() {
        return date;
    }

    public String getJudge() {
        return judge;
    }

    public String getForma() {
        return forma;
    }

    public String getNumber() {
        return number;
    }

    public String getInvolved() {
        return involved;
    }

    public String getDescription() {
        return description;
    }

    public String getAdd_address() {
        return add_address;
    }

    @Override
    public String toString() {
        return "CourtCase{" + "\n" +
                "date=" + date + "\n" +
                "number=" + number + "\n" +
                "involved=" + involved + "\n" +
                "description=" + description + "\n" +
                "judge=" + judge + "\n" +
                "forma=" + forma + "\n" +
                "add_address=" + add_address + "\n" +
                '}';
    }
}
