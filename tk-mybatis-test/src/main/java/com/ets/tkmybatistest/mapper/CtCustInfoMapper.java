package com.ets.tkmybatistest.mapper;

import com.ets.tkmybatistest.entity.CtCustInfo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Component
public interface CtCustInfoMapper extends Mapper<CtCustInfo> {

    List<CtCustInfo> selectList(List<String> custCodeList);
}