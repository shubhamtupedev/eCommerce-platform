package com.ecommerce.commonlib.dto;

import java.time.LocalDateTime;

public abstract class BaseDto {

    private Long id;

    private String createdBy;

    private LocalDateTime createdDate;

    private String modifiedBy;

    private LocalDateTime modifiedDate;

}
