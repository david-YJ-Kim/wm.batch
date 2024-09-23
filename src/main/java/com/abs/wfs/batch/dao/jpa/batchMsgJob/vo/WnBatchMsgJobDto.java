package com.abs.wfs.batch.dao.jpa.batchMsgJob.vo;


import com.abs.wfs.batch.dao.jpa.batchMsgJob.model.WnBatchMsgJob;
import com.abs.wfs.batch.util.code.BatchJobType;
import com.abs.wfs.batch.util.code.UseStatCd;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class WnBatchMsgJobDto {

    private String siteId;
    private String jobId;
    private BatchJobType jobTyp;
    private String srcSys;
    private String tgtSys;
    private String cid;
    private String payloadFormat;
    private String evntNm;
    private String prevEvntNm;
    private String cstmEvntNm;
    private String prevCstmEvntNm;
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
    public WnBatchMsgJobDto(String siteId, String jobId, BatchJobType jobTyp, String srcSys, String tgtSys, String cid, String payloadFormat, String evntNm, String prevEvntNm, String cstmEvntNm, String prevCstmEvntNm, UseStatCd useStatCd, String rsnCd, String trnsCm, String crtUserId, Timestamp crtDt, String mdfyUserId, Timestamp mdfyDt, Timestamp fnlEvntDt, String tid) {
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

    public WnBatchMsgJob toEntity(){
        return WnBatchMsgJob.builder()
                .siteId(siteId)
                .jobId(jobId)
                .jobTyp(jobTyp)
                .srcSys(srcSys)
                .tgtSys(tgtSys)
                .cid(cid)
                .payloadFormat(payloadFormat)
                .evntNm(evntNm)
                .prevEvntNm(prevEvntNm)
                .cstmEvntNm(cstmEvntNm)
                .prevCstmEvntNm(prevCstmEvntNm)
                .useStatCd(useStatCd)
                .rsnCd(rsnCd)
                .trnsCm(trnsCm)
                .crtDt(crtDt)
                .mdfyDt(mdfyDt)
                .fnlEvntDt(fnlEvntDt)
                .tid(tid)
                .build();
    }
}
