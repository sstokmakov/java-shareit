package ru.tokmakov.shareitserver.item.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.tokmakov.shareitserver.user.model.User;

@Entity
@Setter
@Getter
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;
    private Boolean available;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner", referencedColumnName = "id")
    private User owner;

    private long requestId;
}