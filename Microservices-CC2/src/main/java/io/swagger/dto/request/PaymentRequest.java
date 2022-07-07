package io.swagger.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.dto.BuyerDto;
import io.swagger.dto.CreditCardDto;
import io.swagger.dto.PaymentOrderDto;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-07T12:13:39.158Z[GMT]")

public class PaymentRequest {
    @JsonProperty("chackoutId")
    private String chackoutId = null;

    @JsonProperty("buyerInfo")
    private BuyerDto buyerInfo = null;

    @JsonProperty("creditCardInfo")
    private CreditCardDto creditCardInfo = null;

    @JsonProperty("paymentOrders")
    @Valid
    private List<PaymentOrderDto> paymentOrders = null;

    public PaymentRequest chackoutId(String chackoutId) {
        this.chackoutId = chackoutId;
        return this;
    }

    /**
     * Get chackoutId
     *
     * @return chackoutId
     **/
    @Schema(example = "6547", description = "")

    public String getChackoutId() {
        return chackoutId;
    }

    public void setChackoutId(String chackoutId) {
        this.chackoutId = chackoutId;
    }

    public PaymentRequest buyerInfo(BuyerDto buyerInfo) {
        this.buyerInfo = buyerInfo;
        return this;
    }

    /**
     * Get buyerInfo
     *
     * @return buyerInfo
     **/
    @Schema(description = "")

    @Valid
    public BuyerDto getBuyerInfo() {
        return buyerInfo;
    }

    public void setBuyerInfo(BuyerDto buyerInfo) {
        this.buyerInfo = buyerInfo;
    }

    public PaymentRequest creditCardInfo(CreditCardDto creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
        return this;
    }

    /**
     * Get creditCardInfo
     *
     * @return creditCardInfo
     **/
    @Schema(description = "")

    @Valid
    public CreditCardDto getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(CreditCardDto creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    public PaymentRequest paymentOrders(List<PaymentOrderDto> paymentOrders) {
        this.paymentOrders = paymentOrders;
        return this;
    }

    public PaymentRequest addPaymentOrdersItem(PaymentOrderDto paymentOrdersItem) {
        if (this.paymentOrders == null) {
            this.paymentOrders = new ArrayList<PaymentOrderDto>();
        }
        this.paymentOrders.add(paymentOrdersItem);
        return this;
    }

    /**
     * Get paymentOrders
     *
     * @return paymentOrders
     **/
    @Schema(description = "")
    @Valid
    public List<PaymentOrderDto> getPaymentOrders() {
        return paymentOrders;
    }

    public void setPaymentOrders(List<PaymentOrderDto> paymentOrders) {
        this.paymentOrders = paymentOrders;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentRequest paymentRequest = (PaymentRequest) o;
        return Objects.equals(this.chackoutId, paymentRequest.chackoutId) &&
                Objects.equals(this.buyerInfo, paymentRequest.buyerInfo) &&
                Objects.equals(this.creditCardInfo, paymentRequest.creditCardInfo) &&
                Objects.equals(this.paymentOrders, paymentRequest.paymentOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chackoutId, buyerInfo, creditCardInfo, paymentOrders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentRequest {\n");

        sb.append("    chackoutId: ").append(toIndentedString(chackoutId)).append("\n");
        sb.append("    buyerInfo: ").append(toIndentedString(buyerInfo)).append("\n");
        sb.append("    creditCardInfo: ").append(toIndentedString(creditCardInfo)).append("\n");
        sb.append("    paymentOrders: ").append(toIndentedString(paymentOrders)).append("\n");
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
