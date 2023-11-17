package org.huerni.cg12306.framework.starter.bases.init;

import org.springframework.context.ApplicationEvent;

public class ApplicationInitializingEvent extends ApplicationEvent {

    public ApplicationInitializingEvent(Object source) {
        super(source);
    }
}
