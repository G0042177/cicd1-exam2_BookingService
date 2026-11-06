package ie.atu.sample.service;

import ie.atu.sample.model.Booking;
import ie.atu.sample.repository.BookingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class BookingService {
    private BookingRepository bookingRepository;
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }
    public Booking get(Long id) {
        return bookingRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Booking not found"));

    }
    public Booking create(Booking booking) {
        booking.setId(null);
        return bookingRepository.save(booking);
    }
}
