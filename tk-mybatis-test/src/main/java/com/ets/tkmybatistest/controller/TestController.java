package com.ets.tkmybatistest.controller;

import com.ets.tkmybatistest.entity.DvDevInfo;
import com.ets.tkmybatistest.entity.TrCardOperation;
import com.ets.tkmybatistest.mapper.TrCardOperationMapper;
import com.ets.tkmybatistest.util.PersonEnum;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Encoder;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Id;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/7/11 15:43
**/
@Controller
public class TestController {

    @Autowired
    private TrCardOperationMapper trCardOperationMapper;

    private ApplicationContext applicationContext;

    @RequestMapping("/test1")
    @ResponseBody
    public String testTkMabatis(){

       /* List<TrCardOperation> trCardOperations2 = trCardOperationMapper.selectList();
        System.out.println(trCardOperations2.size());

        //查全部
        List<TrCardOperation> trCardOperations = trCardOperationMapper.selectAll();
        System.out.println("集合里面元素个数是"+trCardOperations.size());
        //查单个
        TrCardOperation trCardOperation = new TrCardOperation();
        trCardOperation.setId(5);
        TrCardOperation trCardOperation1 = trCardOperationMapper.selectOne(trCardOperation);
        System.out.println(trCardOperation1);
        //根据条件查
        Example example = new Example(TrCardOperation.class);
        example.createCriteria().andEqualTo("cardNo","340407").andEqualTo("id",12);
        //如果条件终端再想加条件 得加and()
        example.and().andEqualTo("devSn","123457");
        List<TrCardOperation> trCardOperations1 = trCardOperationMapper.selectByExample(example);
        System.out.println(trCardOperations1);*/
       String s = "==>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(s);
       String s1 = "哈哈哈哈哈";
        String encode = new BASE64Encoder().encode(s1.getBytes());
        System.out.println("加密后的数据为=》"+encode);
        return "成功啦";
    }


    @RequestMapping("/test2")
    @ResponseBody
    public String testPage(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        Example example = new Example(TrCardOperation.class);
        example.setOrderByClause("id");
        List<TrCardOperation> trCardOperaTtionList = trCardOperationMapper.selectByExample(example);
        //通过pageinfo可以获取库里元素信息
        PageInfo pageInfo = new PageInfo(trCardOperaTtionList);
        //库中记录总数
        System.out.println(pageInfo.getTotal());
        //总页数
        System.out.println(pageInfo.getPages());
        //分页查的5条记录
        System.out.println("集合元素数量"+trCardOperaTtionList.size());
        //排序后查出的第一个元素id
        System.out.println(trCardOperaTtionList.get(0).getId());
        return "成功啦";
    }

    @RequestMapping("/test3")
    @ResponseBody
    public String testPage3(){
        DvDevInfo dvDevInfo = new DvDevInfo();
        dvDevInfo.setAccCode(2);
        dvDevInfo.setAccDes("haha");
        dvDevInfo.setId(9);

        Map<Object, Object> map = new HashMap<>();
        BeanMap beanMap = BeanMap.create(dvDevInfo);
        for (Object key : beanMap.keySet()){
            map.put(key+"",beanMap.get(key));
        }

        System.out.println(map);
        return null;
    }


    @Scheduled(cron = "*/15 * * * * ?")
    public void testS(){
        String applicationName = applicationContext.getApplicationName();
        System.out.println(applicationName);
        System.out.println("lalalalal");
    }

}
