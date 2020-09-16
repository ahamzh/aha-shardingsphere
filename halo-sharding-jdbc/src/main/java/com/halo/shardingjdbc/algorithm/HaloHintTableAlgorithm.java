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
public class HaloHintTableAlgorithm implements HintShardingAlgorithm<Long> {
    @SneakyThrows
    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, HintShardingValue<Long> shardingValue) {
        JsonMapper jsonMapper = new JsonMapper();
        log.info("分表可选集合: {}", jsonMapper.writeValueAsString(availableTargetNames));
        log.info("分表分片参数: {}", shardingValue);
        //自定义逻辑，目前是我这边做的是根据id做分表
        List<Long> tableIndexList = shardingValue.getValues().stream().map(value -> value % 3).distinct().collect(Collectors.toList());
        List<String> allList = new ArrayList<>(availableTargetNames);
        List<String> list = new ArrayList<>();
        for (Long longIndex : tableIndexList) {
            list.add(allList.get(longIndex.intValue()));
        }

        return list;
    }
}
