package io.redos.small.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SharePlate implements Serializable {

    long id;

    String content;

    public SharePlate(String content) {
        this.content = content;
    }
}
