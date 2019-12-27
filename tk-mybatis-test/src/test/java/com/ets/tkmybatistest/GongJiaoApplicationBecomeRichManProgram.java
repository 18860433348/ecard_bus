package com.ets.tkmybatistest;



import com.ets.tkmybatistest.mapper.CtCustIdentityMapper;
import com.ets.tkmybatistest.mapper.CtCustInfoMapper;
import com.ets.tkmybatistest.mapper.DvDevInfoMapper;
import com.ets.tkmybatistest.util.DateUtil;
import org.assertj.core.util.Maps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GongJiaoApplicationBecomeRichManProgram {

    @Autowired
    DvDevInfoMapper dvDevInfoMapper;

    @Autowired
    CtCustIdentityMapper ctCustIdentityMapper;

    @Autowired
    CtCustInfoMapper ctCustInfoMapper;


    @Test
    public void run1() {



    }


    public static void main(String[] args){
        test();
    }

    // 测试
    public static void test(){



    }

}
