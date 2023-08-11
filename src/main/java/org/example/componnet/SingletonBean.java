package org.example.componnet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
@Getter
@Setter
@Primary
public class SingletonBean {
    private final ProtoypeBean protoypeBean ;

    public SingletonBean(ProtoypeBean protoypeBean) {
        this.protoypeBean = protoypeBean;
    }
}
