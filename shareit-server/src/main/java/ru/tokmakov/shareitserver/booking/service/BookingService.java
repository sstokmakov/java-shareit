package ru.tokmakov.shareitserver.booking.service;

import ru.tokmakov.booking.dto.BookingDto;
import ru.tokmakov.booking.dto.BookingSaveDto;
import ru.tokmakov.booking.dto.BookingState;
import ru.tokmakov.shareitserver.booking.model.Booking;

import java.util.List;

public interface BookingService {
    Booking save(Long userId, BookingSaveDto bookingSaveDto);

    Booking responseToRequest(long userId, long bookingId, boolean approved);

    BookingDto findBookingById(long userId, long bookingId);

    List<Booking> findAllForUser(long userId, BookingState state);

    List<Booking> findReservations(long userId, BookingState state);
}
