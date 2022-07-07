package io.swagger.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Buyer entity
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "buyers")
public class BuyerEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String buyerId;
    private String email;
    private String firstName;
    private String lastName;
    private String city;
    private String address;
    private String phoneNumber;
    private String postIndex;

}
