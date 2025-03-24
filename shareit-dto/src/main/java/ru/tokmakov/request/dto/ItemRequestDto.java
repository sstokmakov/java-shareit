package ru.tokmakov.request.dto;

import lombok.Data;
import ru.tokmakov.item.dto.ItemDto;
import ru.tokmakov.user.dto.UserDto;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ItemRequestDto {
    private long id;
    private String description;
    private UserDto user;
    private LocalDateTime created;
    private List<ItemDto> items;
}