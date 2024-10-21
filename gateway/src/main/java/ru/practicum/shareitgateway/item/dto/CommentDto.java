package ru.practicum.shareitgateway.item.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
public class CommentDto {
    private long id;
    private String text;
    private String authorName;
    private Item item;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate created;
}