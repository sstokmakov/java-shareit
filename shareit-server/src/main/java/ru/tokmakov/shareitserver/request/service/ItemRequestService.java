package ru.tokmakov.shareitserver.request.service;

import ru.tokmakov.request.dto.ItemRequestDto;
import ru.tokmakov.shareitserver.request.model.ItemRequest;

import java.util.List;

public interface ItemRequestService {
    ItemRequest save(ItemRequest itemRequest, long userId);

    List<ItemRequestDto> findByUserId(long userId);

    List<ItemRequest> findAll(long userId);

    ItemRequestDto findById(long requestId);
}
