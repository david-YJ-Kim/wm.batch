package com.abs.wfs.batch.dao.jpa.batchMsgJobPara.vo;

import com.abs.wfs.batch.dao.jpa.batchMsgJobPara.model.WnBatchMsgJobPara;
import com.abs.wfs.batch.util.code.BatchJobType;
import com.abs.wfs.batch.util.code.UseStatCd;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class WnBatchMsgJobParaDto {

    private String siteId;
    private String jobId;
    private BatchJobType jobTyp;
    private String paraNm;
    private String paraQuery;
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
    public WnBatchMsgJobParaDto(String siteId, String jobId, BatchJobType jobTyp, String paraNm, String paraQuery, String evntNm, String prevEvntNm, String cstmEvntNm, String prevCstmEvntNm, UseStatCd useStatCd, String rsnCd, String trnsCm, String crtUserId, Timestamp crtDt, String mdfyUserId, Timestamp mdfyDt, Timestamp fnlEvntDt, String tid) {
        this.siteId = siteId;
        this.jobId = jobId;
        this.jobTyp = jobTyp;
        this.paraNm = paraNm;
        this.paraQuery = paraQuery;
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

    public WnBatchMsgJobPara toEntity(){
        return WnBatchMsgJobPara.builder()
                .siteId(siteId)
                .jobId(jobId)
                .jobTyp(jobTyp)
                .paraNm(paraNm)
                .paraQuery(paraQuery)
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
