package com.ets.tkmybatistest.mapper;

import com.ets.tkmybatistest.entity.TrCardOperation;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Component
public interface TrCardOperationMapper extends Mapper<TrCardOperation> {

    List<TrCardOperation> selectList();
}