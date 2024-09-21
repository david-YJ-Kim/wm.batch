package com.abs.wfs.batch.data;


import lombok.Getter;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Component
public class ApSharedVariable {

    Environment env;

    @Getter
    private static ApSharedVariable instance;


    @Getter
    ScheduledExecutorService apExecutorService;


    public ApSharedVariable(Environment env) {
        this.env = env;
        instance = this;
    }

    public static ApSharedVariable createInstance(Environment env){
        if(instance == null){
            synchronized (ApSharedVariable.class){
                if(instance == null){
                    instance = new ApSharedVariable(env);
                }
            }
        }

        if(instance.apExecutorService == null){
            instance.apExecutorService = Executors.newScheduledThreadPool(1);
        }

        return instance;
    }


}
