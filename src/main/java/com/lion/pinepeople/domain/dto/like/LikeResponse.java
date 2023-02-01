package com.lion.pinepeople.domain.dto.like;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class LikeResponse {

    private String message;
    private Long postId;


}
