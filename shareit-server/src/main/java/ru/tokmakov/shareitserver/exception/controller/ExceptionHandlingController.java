package ru.tokmakov.shareitserver.exception.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import ru.tokmakov.shareitserver.exception.booking.BookingAccessDeniedException;
import ru.tokmakov.shareitserver.exception.booking.BookingConflictException;
import ru.tokmakov.shareitserver.exception.booking.BookingNotFoundException;
import ru.tokmakov.shareitserver.exception.booking.InvalidBookingPeriodException;
import ru.tokmakov.shareitserver.exception.item.ItemAccessDeniedException;
import ru.tokmakov.shareitserver.exception.item.ItemNotFoundException;
import ru.tokmakov.shareitserver.exception.item.ItemUnavailableException;
import ru.tokmakov.shareitserver.exception.model.ErrorDetails;
import ru.tokmakov.shareitserver.exception.request.ItemRequestNotFoundException;
import ru.tokmakov.shareitserver.exception.user.EmailAlreadyExistException;
import ru.tokmakov.shareitserver.exception.user.UserNotFoundException;

@Slf4j
@ControllerAdvice
public class ExceptionHandlingController {
    private ResponseEntity<ErrorDetails> handleException(Exception e, HttpStatus status, WebRequest request) {
        log.error(e.getMessage(), e);
        ErrorDetails errorDetails = new ErrorDetails(e.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, status);
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler({ItemAccessDeniedException.class, BookingAccessDeniedException.class})
    public ResponseEntity<?> handleFORBIDDENExceptions(Exception e, WebRequest request) {
        return handleException(e, HttpStatus.FORBIDDEN, request);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({ItemUnavailableException.class, InvalidBookingPeriodException.class})
    public ResponseEntity<?> handleBadRequestExceptions(Exception e, WebRequest request) {
        return handleException(e, HttpStatus.BAD_REQUEST, request);
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler({EmailAlreadyExistException.class, BookingConflictException.class})
    public ResponseEntity<?> handleConflictExceptions(Exception e, WebRequest request) {
        return handleException(e, HttpStatus.CONFLICT, request);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({UserNotFoundException.class, ItemNotFoundException.class, BookingNotFoundException.class, ItemRequestNotFoundException.class})
    public ResponseEntity<?> handleNotFoundExceptions(Exception e, WebRequest request) {
        return handleException(e, HttpStatus.NOT_FOUND, request);
    }
}