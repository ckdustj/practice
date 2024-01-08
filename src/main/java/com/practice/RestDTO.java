package com.practice;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RestDTO {
    private String 가맹점명;
    private String 시군구명;
}
