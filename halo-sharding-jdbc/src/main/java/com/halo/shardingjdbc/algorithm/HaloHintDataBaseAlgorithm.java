package com.halo.shardingjdbc.algorithm;

import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shoufeng
 */
@Slf4j
public class HaloHintDataBaseAlgorithm implements HintShardingAlgorithm<String> {

    @SneakyThrows
    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, HintShardingValue<String> shardingValue) {

        JsonMapper jsonMapper = new JsonMapper();
        log.info("分库可选集合: {}", jsonMapper.writeValueAsString(availableTargetNames));
        log.info("分库分片参数: {}", shardingValue);
        //自定义逻辑，目前是我这边做的是根据行政区划分库
        List<String> realDbEndNameList = new ArrayList<>(shardingValue.getValues());

        return availableTargetNames.stream().filter(targetName -> {
            for (String realDbEndName : realDbEndNameList) {
                if (targetName.endsWith(realDbEndName)) {
                    return true;
                }
            }
            return false;
        }).collect(Collectors.toList());
    }
}
