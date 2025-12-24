package com.convit.batchuploading.dto;

import java.time.LocalDate;

public record SalesDTO(Long saleId,
                       Long productId,
                       Long customerId,
                       LocalDate saleDate,
                       Double saleAmount,
                       String storeLocation,
                       String country) {


}