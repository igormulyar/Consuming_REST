package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by igor on 21.09.16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CourtCase {

    private String date;
    private String judge;
    private String forma;
    private String number;
    private String involved;
    private String description;
    private String add_address;

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
}
