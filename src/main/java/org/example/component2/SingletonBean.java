package org.example.component2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

//@Component
@Getter
@Setter
public abstract class SingletonBean {
    private ProtoypeBean protoypeBean;
    @Lookup
    public abstract ProtoypeBean getPrototype();
}
