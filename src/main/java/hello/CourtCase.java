package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by igor on 21.09.16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CourtCase {

    private String date;

    private String judge;

    @JsonProperty("forma")
    private String form;

    private String number;

    private String involved;

    private String description;

    @JsonProperty("add_address")
    private String address;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInvolved() {
        return involved;
    }

    public void setInvolved(String involved) {
        this.involved = involved;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CourtCase{" + "\n" +
                "date=" + date + "\n" +
                "number=" + number + "\n" +
                "involved=" + involved + "\n" +
                "description=" + description + "\n" +
                "judge=" + judge + "\n" +
                "form=" + form + "\n" +
                "address=" + address + "\n" +
                '}';
    }
}
