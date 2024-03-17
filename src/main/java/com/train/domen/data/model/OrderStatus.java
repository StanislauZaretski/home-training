package com.train.domen.data.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum OrderStatus {
    NOT_STARTED,
    COMPLETED,
    CANCELED,
    IN_PROGRESS
}
