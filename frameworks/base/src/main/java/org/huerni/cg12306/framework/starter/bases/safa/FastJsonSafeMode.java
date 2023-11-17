package org.huerni.cg12306.framework.starter.bases.safa;

import org.springframework.beans.factory.InitializingBean;

public class FastJsonSafeMode implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.setProperty("fastjson2.parser.safeMode", "true");
    }
}
