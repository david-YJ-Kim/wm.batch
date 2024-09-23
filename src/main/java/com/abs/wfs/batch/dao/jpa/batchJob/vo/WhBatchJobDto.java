package com.abs.wfs.batch.dao.jpa.batchJob.vo;


import com.abs.wfs.batch.dao.jpa.batchJob.model.WhBatchJob;
import com.abs.wfs.batch.dao.jpa.batchJob.model.WnBatchJob;
import com.abs.wfs.batch.util.code.BatchJobType;
import com.abs.wfs.batch.util.code.UseStatCd;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class WhBatchJobDto {

    private String reObjId;
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
    public WhBatchJobDto(String refObjId, String siteId, String jobId, BatchJobType jobTyp, String jobDesc, String invokeUnit, String invokeVal, Long maxOccur, Long crntOccur, String evntNm, String prevEvntNm, String cstmEvntNm, String prevCstmEvntNm, UseStatCd useStatCd, String rsnCd, String trnsCm, Timestamp jobStartDt, String crtUserId, Timestamp crtDt, String mdfyUserId, Timestamp mdfyDt, Timestamp fnlEvntDt, String tid) {
        this.reObjId = refObjId;
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

    public WhBatchJobDto(WnBatchJob vo) {
        this.reObjId = vo.getObjId();
        this.siteId = vo.getSiteId();
        this.jobId = vo.getJobId();
        this.jobTyp = vo.getJobTyp();
        this.jobDesc = vo.getJobDesc();
        this.invokeUnit = vo.getInvokeUnit();
        this.invokeVal = vo.getInvokeVal();
        this.maxOccur = vo.getMaxOccur();
        this.crntOccur = vo.getCrntOccur();
        this.evntNm = vo.getEvntNm();
        this.prevEvntNm = vo.getPrevEvntNm();
        this.cstmEvntNm = vo.getCstmEvntNm();
        this.prevCstmEvntNm = vo.getPrevCstmEvntNm();
        this.useStatCd = vo.getUseStatCd();
        this.rsnCd = vo.getRsnCd();
        this.trnsCm = vo.getTrnsCm();
        this.jobStartDt = vo.getJobStartDt();
        this.crtUserId = vo.getCrtUserId();
        this.crtDt = vo.getCrtDt();
        this.mdfyUserId = vo.getMdfyUserId();
        this.mdfyDt = vo.getMdfyDt();
        this.fnlEvntDt = vo.getFnlEvntDt();
        this.tid = vo.getTid();
    }

    public WhBatchJob toEntity(){
        return WhBatchJob.builder()
                .refObjId(reObjId)
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
