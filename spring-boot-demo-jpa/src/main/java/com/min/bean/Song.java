package com.min.bean;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data@AllArgsConstructor@NoArgsConstructor@RequiredArgsConstructor
public class Song implements Serializable {

    @NonNull
    @Column(name="name", nullable = false)
    private String name;

    @NonNull
    @Column(name = "singer" , nullable = false)
    private String singer;

    @Id
    @GeneratedValue
    private Long id;

}
