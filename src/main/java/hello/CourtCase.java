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

    public void setDate(String date) {
        this.date = date;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setInvolved(String involved) {
        this.involved = involved;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setAdd_address(String add_address) {
        this.add_address = add_address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourtCase courtCase = (CourtCase) o;

        if (!add_address.equals(courtCase.add_address)) return false;
        if (!date.equals(courtCase.date)) return false;
        if (!description.equals(courtCase.description)) return false;
        if (!forma.equals(courtCase.forma)) return false;
        if (!involved.equals(courtCase.involved)) return false;
        if (!judge.equals(courtCase.judge)) return false;
        if (!number.equals(courtCase.number)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = date.hashCode();
        result = 31 * result + number.hashCode();
        result = 31 * result + involved.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + judge.hashCode();
        result = 31 * result + forma.hashCode();
        result = 31 * result + add_address.hashCode();
        return result;
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
