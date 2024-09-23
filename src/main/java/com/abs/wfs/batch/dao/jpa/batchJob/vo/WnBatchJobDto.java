package com.abs.wfs.batch.dao.jpa.batchJob.vo;


import com.abs.wfs.batch.dao.jpa.batchJob.model.WnBatchJob;
import com.abs.wfs.batch.dao.jpa.batchMsgJob.model.WhBatchMsgJob;
import com.abs.wfs.batch.util.code.BatchJobType;
import com.abs.wfs.batch.util.code.UseStatCd;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class WnBatchJobDto {

    private String siteId;
    private String jobId;
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
    public WnBatchJobDto(String siteId, String jobId, BatchJobType jobTyp, String jobDesc, String invokeUnit, String invokeVal, Long maxOccur, Long crntOccur, String evntNm, String prevEvntNm, String cstmEvntNm, String prevCstmEvntNm, UseStatCd useStatCd, String rsnCd, String trnsCm, Timestamp jobStartDt, String crtUserId, Timestamp crtDt, String mdfyUserId, Timestamp mdfyDt, Timestamp fnlEvntDt, String tid) {
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

    public WnBatchJob toEntity(){
        return WnBatchJob.builder()
                .siteId(siteId)
                .jobId(jobId)
                .jobTyp(jobTyp)
                .jobDesc(jobDesc)
                .invokeUnit(invokeUnit)
                .invokeVal(invokeVal)
                .maxOccur(maxOccur)
                .crntOccur(crntOccur)
                .evntNm(evntNm)
                .prevEvntNm(prevEvntNm)
                .cstmEvntNm(cstmEvntNm)
                .prevCstmEvntNm(prevCstmEvntNm)
                .useStatCd(useStatCd)
                .rsnCd(rsnCd)
                .trnsCm(trnsCm)
                .jobStartDt(jobStartDt)
                .crtDt(crtDt)
                .mdfyDt(mdfyDt)
                .fnlEvntDt(fnlEvntDt)
                .tid(tid)
                .build();
    }
}
