package com.aha.shardingjdbc.algorithm;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.common.collect.Lists;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author shoufeng
 */
@Slf4j
public class AhaHintAlgorithm implements HintShardingAlgorithm<String> {
    @SneakyThrows
    @Override
    public Collection<String> doSharding(Collection<String> collection, HintShardingValue<String> hintShardingValue) {
        JsonMapper jsonMapper = new JsonMapper();
        log.info("可选集合: {}", jsonMapper.writeValueAsString(collection));
        log.info("分片参数: {}", hintShardingValue);
        //自定义逻辑，目前是我这边做的是不管什么参数都只拿返回第一个

        return Lists.newArrayList(collection.stream().findFirst().get());
    }
}
