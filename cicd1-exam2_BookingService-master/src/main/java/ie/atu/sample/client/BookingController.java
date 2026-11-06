package ie.atu.sample.client;

import ie.atu.sample.dto.CreateBookingRequest;
import ie.atu.sample.model.Booking;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping("/booking")
public class BookingController {
    private final BookingRepository bookingRepository;
    private final BookingService bookingService;

    public BookingController(BookingRepository bookingRepository, BookingService bookingService) {
        this.bookingRepository = bookingRepository;
        this.bookingService = bookingService;
    }
    @GetMapping
    public List<Booking> all() {
        return bookingRepository.findAll();
    }
    @GetMapping("/{id}")
    public Booking get(@PathVariable Long id) {
        return bookingRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Booking not found"));
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Booking create(@Valid @RequestBody Booking booking) {
        return bookingService.create(booking);
    }
    @PostMapping("/{id}")
    public Booking update(@PathVariable("id") Long id, @Valid @RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }


}
