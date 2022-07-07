package io.swagger.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * InlineResponse400
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-07T12:13:39.158Z[GMT]")


public class InlineResponse400 {
    @JsonProperty("paymentError")
    private String paymentError = null;

    public InlineResponse400 paymentError(String paymentError) {
        this.paymentError = paymentError;
        return this;
    }

    /**
     * Get paymentError
     *
     * @return paymentError
     **/
    @Schema(description = "")

    public String getPaymentError() {
        return paymentError;
    }

    public void setPaymentError(String paymentError) {
        this.paymentError = paymentError;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponse400 inlineResponse400 = (InlineResponse400) o;
        return Objects.equals(this.paymentError, inlineResponse400.paymentError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse400 {\n");

        sb.append("    paymentError: ").append(toIndentedString(paymentError)).append("\n");
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
