package ru.tokmakov.shareitserver.request.model;


import ru.tokmakov.request.dto.ItemRequestDto;
import ru.tokmakov.shareitserver.user.model.UserMapper;

public class ItemRequestMapper {
    private ItemRequestMapper() {
    }

    public static ItemRequestDto toDto(ItemRequest itemRequest) {
        ItemRequestDto itemRequestDto = new ItemRequestDto();
        itemRequestDto.setId(itemRequest.getId());
        itemRequestDto.setCreated(itemRequest.getCreated());
        itemRequestDto.setUser(UserMapper.toUserDto(itemRequest.getUser()));
        itemRequestDto.setDescription(itemRequest.getDescription());
        return itemRequestDto;
    }
}
