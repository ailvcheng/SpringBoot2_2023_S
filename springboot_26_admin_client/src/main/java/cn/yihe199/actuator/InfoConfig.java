package cn.yihe199.actuator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class InfoConfig implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("runTime", System.currentTimeMillis());
        Map<String, Object> infoMap = new HashMap<>(16);
        infoMap.put("it", "1");
        builder.withDetails(infoMap);

    }
}
