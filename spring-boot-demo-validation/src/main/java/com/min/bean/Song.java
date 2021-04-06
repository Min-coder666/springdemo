package com.min.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data@AllArgsConstructor@ToString
public class Song {

    @NotBlank(message = "歌名不能为空")
    private String name;
    @NotBlank
    private String singer;

}
