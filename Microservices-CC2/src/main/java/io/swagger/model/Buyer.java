package io.swagger.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Buyer
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Buyer {
    private String buyerId;
    private String email;
    private String firstName;
    private String lastName;
    private String city;
    private String address;
    private String phoneNumber;
    private String postIndex;

}
