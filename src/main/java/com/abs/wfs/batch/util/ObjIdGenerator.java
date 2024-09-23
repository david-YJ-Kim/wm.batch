package com.abs.wfs.batch.util;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class ObjIdGenerator implements IdentifierGenerator {


    /** Milliseconds String Format */
    public static final String formattedMilDateString = "yyyyMMddHHmmssSSS";




    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

        return ObjIdGenerator.generateRandomKey();
    }


    /**
     * 랜덤 키 생성 메소드
     * @return
     */
    public static String generateRandomKey(){


        return (ObjIdGenerator.getCurrentDateTimeToString().substring(6) + UUID.randomUUID().toString()).replaceAll("-", "");

    }

    /**
     * CurrentDateTime을 String Type으로 리턴.
     */
    public static String getCurrentDateTimeToString() {

        LocalDateTime curDateTime = LocalDateTime.now();

        return curDateTime.format(DateTimeFormatter.ofPattern(formattedMilDateString));
    }
}
