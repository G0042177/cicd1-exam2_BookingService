package ie.atu.sample.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class CreateBookingRequest {
    @NotBlank private String name;
    @NotBlank private Long bookingId;
    @NotBlank private String status;
    @NotBlank private Long count;

}
