package com.abs.wfs.batch.dao.jpa.batchMsgJob.model;

import com.abs.wfs.batch.util.code.BatchJobType;
import com.abs.wfs.batch.util.code.UseStatCd;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "WN_BATCH_MSG_JOB")
public class WnBatchMsgJob {


    @Id
    @GenericGenerator(name = "WN_BATCH_MSG_JOB_SEQ_GENERATOR", strategy = "com.abs.wfs.batch.util.ObjIdGenerator")
    @GeneratedValue(generator = "WN_BATCH_MSG_JOB_SEQ_GENERATOR")
    @Column(name = "OBJ_ID")
    private String objId;

    private String siteId;
    private String jobId;

    @Enumerated(EnumType.STRING)
    private BatchJobType jobTyp;

    private String srcSys;
    private String tgtSys;
    private String cid;
    private String payloadFormat;
    private String evntNm;
    private String prevEvntNm;
    private String cstmEvntNm;
    private String prevCstmEvntNm;

    @Enumerated(EnumType.STRING)
    private UseStatCd useStatCd;

    private String rsnCd;
    private String trnsCm;
    private String crtUserId;
    private Timestamp crtDt;
    private String mdfyUserId;
    private Timestamp mdfyDt;
    private Timestamp fnlEvntDt;
    private String tid;

    @Builder
    public WnBatchMsgJob(String objId, String siteId, String jobId, BatchJobType jobTyp, String srcSys, String tgtSys, String cid, String payloadFormat, String evntNm, String prevEvntNm, String cstmEvntNm, String prevCstmEvntNm, UseStatCd useStatCd, String rsnCd, String trnsCm, String crtUserId, Timestamp crtDt, String mdfyUserId, Timestamp mdfyDt, Timestamp fnlEvntDt, String tid) {
        this.objId = objId;
        this.siteId = siteId;
        this.jobId = jobId;
        this.jobTyp = jobTyp;
        this.srcSys = srcSys;
        this.tgtSys = tgtSys;
        this.cid = cid;
        this.payloadFormat = payloadFormat;
        this.evntNm = evntNm;
        this.prevEvntNm = prevEvntNm;
        this.cstmEvntNm = cstmEvntNm;
        this.prevCstmEvntNm = prevCstmEvntNm;
        this.useStatCd = useStatCd;
        this.rsnCd = rsnCd;
        this.trnsCm = trnsCm;
        this.crtUserId = crtUserId;
        this.crtDt = crtDt;
        this.mdfyUserId = mdfyUserId;
        this.mdfyDt = mdfyDt;
        this.fnlEvntDt = fnlEvntDt;
        this.tid = tid;
    }
}
