package ru.tokmakov.shareitserver.item.service;

import ru.tokmakov.item.dto.*;
import ru.tokmakov.shareitserver.item.model.Comment;
import ru.tokmakov.shareitserver.item.model.Item;

import java.util.List;

public interface ItemService {
    Item save(ItemDto itemDto, long userId);

    Item update(long itemId, UpdateItemDto itemDto, long userId);

    ItemWithCommentsDto findById(long itemId);

    List<ItemWithBookingDateDto> allItemsFromUser(long userId);

    List<ItemDto> search(String text);

    CommentDto saveComment(Comment comment, long itemId, long userId);
}
