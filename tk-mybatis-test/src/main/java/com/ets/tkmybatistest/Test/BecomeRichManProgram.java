package com.ets.tkmybatistest.Test;

import java.util.*;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/8/20 16:20
**/
public class BecomeRichManProgram {

    public static void main(String[] args){
        for (int i =0;i<5;i++){
            luck();
            System.out.println("-----------------------------------我是分割线-------------------------------------------");
        }

    }

    private static void luck(){

        Set<Integer> luckRedNumSet = new HashSet<>();
        Integer luckBlueNum = null;
        while (true){
            if (luckBlueNum == null){
                luckBlueNum = new Random().nextInt(17);
                if (luckBlueNum == 0){
                    luckBlueNum = null;
                    continue;
                }
            }
            Integer luckRedNum = new Random().nextInt(34);
            if (luckRedNum == 0){
                continue;
            }
            luckRedNumSet.add(luckRedNum);
            if (luckRedNumSet.size()==6){
                break;
            }
        }
        Integer[] paramArr = new Integer[6];
        Integer[] luckRedNumArr = luckRedNumSet.toArray(paramArr);
        Arrays.sort(luckRedNumArr);
        System.out.println("红球:"+Arrays.toString(luckRedNumArr));
        System.out.println("篮球:"+luckBlueNum);
    }

}
