package io.swagger.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Buyer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-07T12:13:39.158Z[GMT]")


public class BuyerDto {
    @JsonProperty("buyerId")
    private String buyerId = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("firstName")
    private String firstName = null;

    @JsonProperty("lastName")
    private String lastName = null;

    @JsonProperty("city")
    private String city = null;

    @JsonProperty("address")
    private String address = null;

    @JsonProperty("phoneNumber")
    private String phoneNumber = null;

    @JsonProperty("postIndex")
    private String postIndex = null;

    public BuyerDto buyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }

    /**
     * Get buyerId
     *
     * @return buyerId
     **/
    @Schema(example = "2", description = "")

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public BuyerDto email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    @Schema(example = "test123@test.com", description = "")

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BuyerDto firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get firstName
     *
     * @return firstName
     **/
    @Schema(example = "John", description = "")

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BuyerDto lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     *
     * @return lastName
     **/
    @Schema(example = "Doe", description = "")

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BuyerDto city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     *
     * @return city
     **/
    @Schema(example = "New York", description = "")

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BuyerDto address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @Schema(example = "Wall Street 1", description = "")

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BuyerDto phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     *
     * @return phoneNumber
     **/
    @Schema(example = "123456", description = "")

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BuyerDto postIndex(String postIndex) {
        this.postIndex = postIndex;
        return this;
    }

    /**
     * Get postIndex
     *
     * @return postIndex
     **/
    @Schema(example = "123456", description = "")

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var buyer = (BuyerDto) o;
        return Objects.equals(this.buyerId, buyer.buyerId) &&
                Objects.equals(this.email, buyer.email) &&
                Objects.equals(this.firstName, buyer.firstName) &&
                Objects.equals(this.lastName, buyer.lastName) &&
                Objects.equals(this.city, buyer.city) &&
                Objects.equals(this.address, buyer.address) &&
                Objects.equals(this.phoneNumber, buyer.phoneNumber) &&
                Objects.equals(this.postIndex, buyer.postIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyerId, email, firstName, lastName, city, address, phoneNumber, postIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Buyer {\n");

        sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    postIndex: ").append(toIndentedString(postIndex)).append("\n");
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
