package ru.tokmakov.shareitserver.item.model;


import ru.tokmakov.item.dto.ItemDto;

import java.util.ArrayList;
import java.util.List;

public class ItemMapper {
    private ItemMapper() {

    }

    public static Item dtoToItem(ItemDto itemDto) {
        Item item = new Item();
        item.setName(itemDto.getName());
        item.setDescription(itemDto.getDescription());
        item.setAvailable(itemDto.getAvailable());
        item.setRequestId(itemDto.getRequestId());
        return item;
    }

    public static ItemDto toItemDto(Item item) {
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setName(item.getName());
        itemDto.setDescription(item.getDescription());
        itemDto.setAvailable(item.getAvailable());
        itemDto.setRequestId(item.getRequestId());
        return itemDto;
    }

    public static List<ItemDto> itemsToDtos(List<Item> items) {
        List<ItemDto> itemDtos = new ArrayList<>();
        for (Item item : items) {
            itemDtos.add(ItemMapper.toItemDto(item));
        }
        return itemDtos;
    }
}
