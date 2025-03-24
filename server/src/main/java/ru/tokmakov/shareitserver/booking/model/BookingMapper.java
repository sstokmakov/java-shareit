package ru.tokmakov.shareitserver.booking.model;


import ru.tokmakov.booking.dto.BookingDto;
import ru.tokmakov.shareitserver.item.model.ItemMapper;
import ru.tokmakov.shareitserver.user.model.UserMapper;

public class BookingMapper {
    private BookingMapper() {
    }

    public static BookingDto toBookingDto(Booking booking) {
        return new BookingDto(booking.getStart(), booking.getEnd(), ItemMapper.toItemDto(booking.getItem()), UserMapper.toUserDto(booking.getBooker()), booking.getStatus());
    }
}
