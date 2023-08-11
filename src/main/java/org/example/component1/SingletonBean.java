package org.example.component1;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
@Getter
@Setter
@NoArgsConstructor
public class SingletonBean {
    @Autowired
    private ApplicationContext context;

    public ProtoypeBean doSomthing(){
        //doSomething ...
        return context.getBean(ProtoypeBean.class);
    }
}
