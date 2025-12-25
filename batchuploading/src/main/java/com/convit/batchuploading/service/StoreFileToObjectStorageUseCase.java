package com.convit.batchuploading.service;

import com.convit.batchuploading.service.dto.ObjectDTO;

public interface StoreFileToObjectStorageUseCase {

    String store(ObjectDTO objectDTO);

    void createBucketIfDoesNotExist(String bucketName);
}
