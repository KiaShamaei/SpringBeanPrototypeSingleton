package org.example.component3;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.logging.Level;

@Component
@Getter
@Setter
public class SingletonBean  implements ApplicationContextAware {
    private String name ;
    @Setter(AccessLevel.NONE)
    private ProtoypeBean protoypeBean;
    private ApplicationContext applicationContext ;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       this.applicationContext = applicationContext;
    }

    public ProtoypeBean getProtoypeBean() {
        return applicationContext.getBean(ProtoypeBean.class);
    }
}
