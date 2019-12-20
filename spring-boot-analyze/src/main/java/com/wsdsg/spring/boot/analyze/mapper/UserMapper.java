package com.wsdsg.spring.boot.analyze.mapper;

import com.wsdsg.spring.boot.analyze.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Author DoubleC
 * @Description TODO
 * @Date 2019/12/11 10:30
 **/
@Mapper
public interface UserMapper {
    User selectUserById(Integer id);

    Integer selectIdMax();

    int addOneUser();
}
