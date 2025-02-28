package com.emre.springcustomexceptions.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError<T> {
    private String id;
    private Date errorTime;
    private T errors;
}
