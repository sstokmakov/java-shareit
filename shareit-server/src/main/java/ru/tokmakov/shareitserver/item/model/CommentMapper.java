package ru.tokmakov.shareitserver.item.model;

import ru.tokmakov.item.dto.CommentDto;

import java.util.ArrayList;
import java.util.List;

public class CommentMapper {
    private CommentMapper() {
    }

    public static CommentDto toCommentDto(Comment comment) {
        return new CommentDto(
                comment.getId(),
                comment.getText(),
                comment.getUser().getName(),
                ItemMapper.toItemDto(comment.getItem()),
                comment.getCreated());
    }

    public static List<CommentDto> commentsToCommentsDto(List<Comment> comments) {
        ArrayList<CommentDto> commentsDtos = new ArrayList<>();
        for (Comment comment : comments) {
            commentsDtos.add(toCommentDto(comment));
        }
        return commentsDtos;
    }
}
