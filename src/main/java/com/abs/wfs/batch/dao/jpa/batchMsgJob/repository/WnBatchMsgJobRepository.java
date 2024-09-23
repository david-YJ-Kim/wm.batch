package com.abs.wfs.batch.dao.jpa.batchMsgJob.repository;

import com.abs.wfs.batch.dao.jpa.batchMsgJob.model.WnBatchMsgJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WnBatchMsgJobRepository extends JpaRepository<WnBatchMsgJob, String> {
}
