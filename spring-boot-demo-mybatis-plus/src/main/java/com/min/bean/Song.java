package com.min.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data@AllArgsConstructor@NoArgsConstructor
public class Song implements Serializable {
    private Long id;
    private String name;
    private String singer;
}
