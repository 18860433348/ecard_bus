package com.ets.tkmybatistest.mapper;

import com.ets.tkmybatistest.dto.DvDevInfoDto;
import com.ets.tkmybatistest.entity.DvDevInfo;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;


@Component
public interface DvDevInfoMapper extends Mapper<DvDevInfo> {

   void getCustCode(Map<String,String> map);

   List<DvDevInfoDto> queryList();


}