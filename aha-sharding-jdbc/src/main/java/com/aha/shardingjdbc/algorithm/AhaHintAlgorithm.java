package com.aha.shardingjdbc.algorithm;

import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.SneakyThrows;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author shoufeng
 */
public class AhaHintAlgorithm implements HintShardingAlgorithm<Long> {
    @SneakyThrows
    @Override
    public Collection<String> doSharding(Collection<String> collection, HintShardingValue<Long> hintShardingValue) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("啊哈的hintShardingValue: " + hintShardingValue);
        JsonMapper jsonMapper = new JsonMapper();
        System.out.println("啊哈的collection: " + jsonMapper.writeValueAsString(collection));
        list.add(collection.stream().findFirst().get());

        return list;
    }
}
