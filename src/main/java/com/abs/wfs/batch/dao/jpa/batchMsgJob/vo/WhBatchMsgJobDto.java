package com.abs.wfs.batch.dao.jpa.batchMsgJob.vo;


import com.abs.wfs.batch.dao.jpa.batchMsgJob.model.WhBatchMsgJob;
import com.abs.wfs.batch.dao.jpa.batchMsgJob.model.WnBatchMsgJob;
import com.abs.wfs.batch.util.code.BatchJobType;
import com.abs.wfs.batch.util.code.UseStatCd;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class WhBatchMsgJobDto {

    private String refObjId;
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
    public WhBatchMsgJobDto(String refObjId, String siteId, String jobId, BatchJobType jobTyp, String srcSys, String tgtSys, String cid, String payloadFormat, String evntNm, String prevEvntNm, String cstmEvntNm, String prevCstmEvntNm, UseStatCd useStatCd, String rsnCd, String trnsCm, String crtUserId, Timestamp crtDt, String mdfyUserId, Timestamp mdfyDt, Timestamp fnlEvntDt, String tid) {
        this.refObjId = refObjId;
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

    public WhBatchMsgJobDto(WnBatchMsgJob vo) {
        this.refObjId = vo.getObjId();
        this.siteId = vo.getSiteId();
        this.jobId = vo.getJobId();
        this.jobTyp = vo.getJobTyp();
        this.srcSys = vo.getSrcSys();
        this.tgtSys = vo.getTgtSys();
        this.cid = vo.getCid();
        this.payloadFormat = vo.getPayloadFormat();
        this.evntNm = vo.getEvntNm();
        this.prevEvntNm = vo.getPrevEvntNm();
        this.cstmEvntNm = vo.getCstmEvntNm();
        this.prevCstmEvntNm = vo.getPrevCstmEvntNm();
        this.useStatCd = vo.getUseStatCd();
        this.rsnCd = vo.getRsnCd();
        this.trnsCm = vo.getTrnsCm();
        this.crtUserId = vo.getCrtUserId();
        this.crtDt = vo.getCrtDt();
        this.mdfyUserId = vo.getMdfyUserId();
        this.mdfyDt = vo.getMdfyDt();
        this.fnlEvntDt = vo.getFnlEvntDt();
        this.tid = vo.getTid();
    }

    public WhBatchMsgJob toEntity(){
        return WhBatchMsgJob.builder()
                .refObjId(refObjId)
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
