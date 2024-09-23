package com.abs.wfs.batch.dao.jpa.batchJob.repository;

import com.abs.wfs.batch.dao.jpa.batchJob.model.WnBatchJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WnBatchJobRepository extends JpaRepository<WnBatchJob, String> {

}
