package ru.nmedvedev.model;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@MongoEntity(collection = "userData")
public class UserDb extends PanacheMongoEntity {

    private Long chatId;
    private String card;
    private Boolean subscribed = false;

}