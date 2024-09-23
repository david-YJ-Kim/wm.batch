package com.abs.wfs.batch.dao.jpa.batchMsgJobPara.model;

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
@Entity(name = "WN_BATCH_MSG_JOB_PARA")
public class WnBatchMsgJobPara {


    @Id
    @GenericGenerator(name = "WN_BATCH_MSG_JOB_PARA_SEQ_GENERATOR", strategy = "com.abs.wfs.batch.util.ObjIdGenerator")
    @GeneratedValue(generator = "WN_BATCH_MSG_JOB_PARA_SEQ_GENERATOR")
    @Column(name = "OBJ_ID")
    private String objId;

    private String siteId;
    private String jobId;

    @Enumerated(EnumType.STRING)
    private BatchJobType jobTyp;

    private String paraNm;
    private String paraQuery;
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
    public WnBatchMsgJobPara(String objId, String siteId, String jobId, BatchJobType jobTyp, String paraNm, String paraQuery, String evntNm, String prevEvntNm, String cstmEvntNm, String prevCstmEvntNm, UseStatCd useStatCd, String rsnCd, String trnsCm, String crtUserId, Timestamp crtDt, String mdfyUserId, Timestamp mdfyDt, Timestamp fnlEvntDt, String tid) {
        this.objId = objId;
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
}
