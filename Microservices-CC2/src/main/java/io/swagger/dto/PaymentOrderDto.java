package io.swagger.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * PaymentOrderDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-07T12:13:39.158Z[GMT]")


public class PaymentOrderDto {
    @JsonProperty("PaymentOrderDtoId")
    private String PaymentOrderDtoId = null;

    @JsonProperty("sellerAccount")
    private String sellerAccount = null;

    @JsonProperty("amount")
    private Double amount = null;

    @JsonProperty("currency")
    private String currency = null;

    public PaymentOrderDto PaymentOrderDtoId(String PaymentOrderDtoId) {
        this.PaymentOrderDtoId = PaymentOrderDtoId;
        return this;
    }

    /**
     * Get PaymentOrderDtoId
     *
     * @return PaymentOrderDtoId
     **/
    @Schema(example = "5896", description = "")

    public String getPaymentOrderDtoId() {
        return PaymentOrderDtoId;
    }

    public void setPaymentOrderDtoId(String PaymentOrderDtoId) {
        this.PaymentOrderDtoId = PaymentOrderDtoId;
    }

    public PaymentOrderDto sellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
        return this;
    }

    /**
     * Get sellerAccount
     *
     * @return sellerAccount
     **/
    @Schema(example = "5694", description = "")

    public String getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public PaymentOrderDto amount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     * minimum: 0
     *
     * @return amount
     **/
    @Schema(example = "200.5", description = "")

    @DecimalMin("0")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentOrderDto currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @Schema(example = "EURO", description = "")

    @Size(min = 2, max = 4)
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentOrderDto PaymentOrderDto = (PaymentOrderDto) o;
        return Objects.equals(this.PaymentOrderDtoId, PaymentOrderDto.PaymentOrderDtoId) &&
                Objects.equals(this.sellerAccount, PaymentOrderDto.sellerAccount) &&
                Objects.equals(this.amount, PaymentOrderDto.amount) &&
                Objects.equals(this.currency, PaymentOrderDto.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PaymentOrderDtoId, sellerAccount, amount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentOrderDto {\n");

        sb.append("    PaymentOrderDtoId: ").append(toIndentedString(PaymentOrderDtoId)).append("\n");
        sb.append("    sellerAccount: ").append(toIndentedString(sellerAccount)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
