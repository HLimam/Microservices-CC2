package io.swagger.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * CreditCard
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-07T12:13:39.158Z[GMT]")


public class CreditCardDto {
    @JsonProperty("creditCardid")
    private String creditCardid = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("user_name")
    private String userName = null;

    @JsonProperty("cc_number")
    private String ccNumber = null;

    @JsonProperty("cvv")
    private String cvv = null;

    @JsonProperty("expiration_month")
    private Integer expirationMonth = null;

    @JsonProperty("expiration_year")
    private Integer expirationYear = null;

    public CreditCardDto creditCardid(String creditCardid) {
        this.creditCardid = creditCardid;
        return this;
    }

    /**
     * Get creditCardid
     *
     * @return creditCardid
     **/
    @Schema(example = "187493", description = "")

    public String getCreditCardid() {
        return creditCardid;
    }

    public void setCreditCardid(String creditCardid) {
        this.creditCardid = creditCardid;
    }

    public CreditCardDto email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    @Schema(example = "test@example.com", description = "")

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CreditCardDto userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get userName
     *
     * @return userName
     **/
    @Schema(example = "Bob Smith", description = "")

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreditCardDto ccNumber(String ccNumber) {
        this.ccNumber = ccNumber;
        return this;
    }

    /**
     * Get ccNumber
     *
     * @return ccNumber
     **/
    @Schema(example = "5496198584584769", description = "")

    @Size(min = 16, max = 16)
    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public CreditCardDto cvv(String cvv) {
        this.cvv = cvv;
        return this;
    }

    /**
     * Get cvv
     *
     * @return cvv
     **/
    @Schema(example = "123", description = "")

    @Size(min = 3, max = 3)
    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public CreditCardDto expirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
        return this;
    }

    /**
     * Get expirationMonth
     * minimum: 1
     * maximum: 12
     *
     * @return expirationMonth
     **/
    @Schema(example = "4", description = "")

    @Min(1)
    @Max(12)
    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public CreditCardDto expirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
        return this;
    }

    /**
     * Get expirationYear
     * minimum: 1900
     * maximum: 2100
     *
     * @return expirationYear
     **/
    @Schema(example = "2024", description = "")

    @Min(1900)
    @Max(2100)
    public Integer getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditCardDto creditCard = (CreditCardDto) o;
        return Objects.equals(this.creditCardid, creditCard.creditCardid) &&
                Objects.equals(this.email, creditCard.email) &&
                Objects.equals(this.userName, creditCard.userName) &&
                Objects.equals(this.ccNumber, creditCard.ccNumber) &&
                Objects.equals(this.cvv, creditCard.cvv) &&
                Objects.equals(this.expirationMonth, creditCard.expirationMonth) &&
                Objects.equals(this.expirationYear, creditCard.expirationYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditCardid, email, userName, ccNumber, cvv, expirationMonth, expirationYear);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreditCard {\n");

        sb.append("    creditCardid: ").append(toIndentedString(creditCardid)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    ccNumber: ").append(toIndentedString(ccNumber)).append("\n");
        sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
        sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
        sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
