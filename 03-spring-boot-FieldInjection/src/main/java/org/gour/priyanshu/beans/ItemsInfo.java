package org.gour.priyanshu.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("info")
public class ItemsInfo {

    @Value("${idly.price}")
    public Float idlyPrice;

    @Value("${dosa.price}")
    public Float dosaPrice;

    @Value("${vada.price}")
    public Float vodaPrice;

    @Override
    public String toString() {
        return "ItemsInfo [idlyPrice=" + idlyPrice + ", dosaPrice=" + dosaPrice + ", vodaPrice=" + vodaPrice + "]";
    }

}
