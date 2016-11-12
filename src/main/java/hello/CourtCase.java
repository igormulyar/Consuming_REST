package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by igor on 21.09.16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CourtCase {

    @JsonProperty("date")
    private String date;

    @JsonProperty("judge")
    private String judge;

    @JsonProperty("forma")
    private String forma;

    @JsonProperty("number")
    private String number;

    @JsonProperty("involved")
    private String involved;

    @JsonProperty("description")
    private String description;

    @JsonProperty("add_address")
    private String add_address;

    public CourtCase(String date, String judge, String forma, String number, String involved, String description, String add_address) {
        this.date = date;
        this.judge = judge;
        this.forma = forma;
        this.number = number;
        this.involved = involved;
        this.description = description;
        this.add_address = add_address;
    }

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

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
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

    public String getAdd_address() {
        return add_address;
    }

    public void setAdd_address(String add_address) {
        this.add_address = add_address;
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
