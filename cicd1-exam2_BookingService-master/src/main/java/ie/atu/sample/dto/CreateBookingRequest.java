package ie.atu.sample.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


public class CreateBookingRequest {
    @NotBlank private String name;
    @NotNull @Positive Long bookingId;
    @NotBlank private String status;
    @NotNull @Positive  private Long count;

}
