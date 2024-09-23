package com.abs.wfs.batch.dao.jpa.batchJob.model;

import com.abs.wfs.batch.util.code.BatchJobType;
import com.abs.wfs.batch.util.code.UseStatCd;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "WN_BATCH_JOB")
public class WnBatchJob {

    @Id
    @GenericGenerator(name = "WN_BATCH_JOB_SEQ_GENERATOR", strategy = "com.abs.wfs.batch.util.ObjIdGenerator")
    @GeneratedValue(generator = "WN_BATCH_JOB_SEQ_GENERATOR")
    @Column(name = "OBJ_ID")
    private String objId;

    private String siteId;
    private String jobId;

    @Enumerated(EnumType.STRING)
    private BatchJobType jobTyp;

    private String jobDesc;
    private String invokeUnit;
    private String invokeVal;
    private Long maxOccur;
    private Long crntOccur;
    private String evntNm;
    private String prevEvntNm;
    private String cstmEvntNm;
    private String prevCstmEvntNm;

    @Enumerated(EnumType.STRING)
    private UseStatCd useStatCd;

    private String rsnCd;
    private String trnsCm;
    private Timestamp jobStartDt;
    private String crtUserId;
    private Timestamp crtDt;
    private String mdfyUserId;
    private Timestamp mdfyDt;
    private Timestamp fnlEvntDt;
    private String tid;


    @Builder
    public WnBatchJob(String objId, String siteId, String jobId, BatchJobType jobTyp, String jobDesc, String invokeUnit, String invokeVal, Long maxOccur, Long crntOccur, String evntNm, String prevEvntNm, String cstmEvntNm, String prevCstmEvntNm, UseStatCd useStatCd, String rsnCd, String trnsCm, Timestamp jobStartDt, String crtUserId, Timestamp crtDt, String mdfyUserId, Timestamp mdfyDt, Timestamp fnlEvntDt, String tid) {
        this.objId = objId;
        this.siteId = siteId;
        this.jobId = jobId;
        this.jobTyp = jobTyp;
        this.jobDesc = jobDesc;
        this.invokeUnit = invokeUnit;
        this.invokeVal = invokeVal;
        this.maxOccur = maxOccur;
        this.crntOccur = crntOccur;
        this.evntNm = evntNm;
        this.prevEvntNm = prevEvntNm;
        this.cstmEvntNm = cstmEvntNm;
        this.prevCstmEvntNm = prevCstmEvntNm;
        this.useStatCd = useStatCd;
        this.rsnCd = rsnCd;
        this.trnsCm = trnsCm;
        this.jobStartDt = jobStartDt;
        this.crtUserId = crtUserId;
        this.crtDt = crtDt;
        this.mdfyUserId = mdfyUserId;
        this.mdfyDt = mdfyDt;
        this.fnlEvntDt = fnlEvntDt;
        this.tid = tid;
    }
}
