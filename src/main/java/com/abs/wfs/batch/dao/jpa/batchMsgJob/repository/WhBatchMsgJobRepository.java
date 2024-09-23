package com.abs.wfs.batch.dao.jpa.batchMsgJob.repository;

import com.abs.wfs.batch.dao.jpa.batchMsgJob.model.WhBatchMsgJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhBatchMsgJobRepository extends JpaRepository<WhBatchMsgJob, String> {
}
