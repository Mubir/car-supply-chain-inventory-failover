package com.mubir.inventoryfailover.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarInventoryDto {
    private UUID id;
    private OffsetDateTime createDate;
    private OffsetDateTime lastModifiedDate;
    private UUID carId;
    private Integer quantityOnHand;
}
