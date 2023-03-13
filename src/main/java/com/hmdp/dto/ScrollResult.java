package com.hmdp.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ScrollResult {
    private List<?> list;
    private Long minTime;
    private Integer offset;
}
