package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.configuration.ApiApi;
import io.swagger.dto.request.PaymentRequest;
import io.swagger.dto.response.InlineResponse201;
import io.swagger.mapper.PaymentMapper;
import io.swagger.service.PaymentService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-07T12:13:39.158Z[GMT]")
@RestController
@RequiredArgsConstructor
public class PaymentApi implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentApi.class);

    private final ObjectMapper objectMapper;
    private final HttpServletRequest request;
    private final PaymentService paymentService;


    @Override
    public ResponseEntity<InlineResponse201> payment(@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody PaymentRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                paymentService.add(PaymentMapper.toModel(body));
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\n  \"data\" : \"Payment succeeded.\"\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse201>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }
}
