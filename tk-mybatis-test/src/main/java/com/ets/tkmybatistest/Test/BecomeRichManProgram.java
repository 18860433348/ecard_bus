package com.ets.tkmybatistest.Test;

import java.util.*;

/**
 * @Author DoubleC
 * @Description TODO
 * @Date 2019/8/20 16:20
 **/
public class BecomeRichManProgram {

    /**
     * 每生成一注幸运号码要计算的注数 如value为100万 就是从100万中选取一注 可更改
     */
    private static final Integer MAX_COUNT = 1000000;

    /**
     * 随机次数 如MAX_COUNT为100万,随机从100万中取一个数字，随机RANDOM_COUNT次,求平均值得出幸运号码所在的key
     * RANDOM_COUNT 不能大于 MAX_COUNT  可更改
     */
    private static final int RANDOM_COUNT = 10000;

    private static int key = 1;

    private static final int RED_MAX = 34;

    private static final int BLUE_MAX = 17;

    private static final int RED_AND_BLUE_MIN = 0;

    private static final int RED_NUM_LENGTH = 6;

    static Map<Integer, Integer> blueMap = new HashMap<>(MAX_COUNT);

    static Map<Integer, Set<Integer>> redMap = new HashMap<>(MAX_COUNT);


    /**
     * 需要生成的幸运号码数量 可更改  money = CYCLE_COUNT * 2
     */
    private static final int CYCLE_COUNT = 5;


    public static void main(String[] args) {

        for (int j = 0; j < CYCLE_COUNT; j++) {
            while (true) {
                if (RANDOM_COUNT > MAX_COUNT) {
                    System.out.println("the RANDOM_COUNT can not greater than MAX_COUNT,please set MAX_COUNT value again");
                    return;
                }

                if (key == 1) {
                    luck();
                }

                int cycleTotal = 0;
                for (int i = 0; i < RANDOM_COUNT; i++) {
                    int oneCountResult = new Random().nextInt(MAX_COUNT);
                    cycleTotal += oneCountResult;
                }
                int averageCycleResult = cycleTotal / RANDOM_COUNT;

                Set<Integer> redNumSet = redMap.get(averageCycleResult);
                Integer blueNum = blueMap.get(averageCycleResult);
                if (redNumSet.contains(blueNum)) {
                    continue;
                }
                Integer[] redNumNullArr = new Integer[RED_NUM_LENGTH];
                Integer[] redNumArr = redNumSet.toArray(redNumNullArr);
                Arrays.sort(redNumArr);
                System.out.println("red ball: "+ Arrays.toString(redNumArr));
                System.out.println("blue ball: " +blueNum);
                System.out.println("<------------------------------I'm the dividing line--------------------------->");
                break;
            }
        }
    }

    private static void luck() {

        while (true) {
            int luckBlueNum = new Random().nextInt(BLUE_MAX);
            if (luckBlueNum == RED_AND_BLUE_MIN) {
                continue;
            }
            if (key > MAX_COUNT) {
                break;
            }
            blueMap.put(key, luckBlueNum);
            key++;
        }

        key = 1;

        do {
            Set<Integer> luckRedNumSet = new HashSet<>();
            while (true) {
                int luckRedNum = new Random().nextInt(RED_MAX);
                if (luckRedNum == RED_AND_BLUE_MIN) {
                    continue;
                }
                luckRedNumSet.add(luckRedNum);
                if (luckRedNumSet.size() == RED_NUM_LENGTH) {
                    redMap.put(key, luckRedNumSet);
                    key++;
                    break;
                }
            }
        } while (key <= MAX_COUNT);
    }
}
