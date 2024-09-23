package com.abs.wfs.batch.dao.jpa.batchJob.repository;

import com.abs.wfs.batch.dao.jpa.batchJob.model.WhBatchJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhBatchJobRepository extends JpaRepository<WhBatchJob, String> {
}
