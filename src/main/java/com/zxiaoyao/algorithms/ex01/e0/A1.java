package com.zxiaoyao.algorithms.ex01.e0;

/**
 * @Description 欧几里得算法
 * 算法第 1 页
 * @Author hlantian
 * @Date 2021/2/4 12:48
 */
public class A1 {
    public static void main(String[] args) {
        System.out.println(gcd(8, 6));
    }

    /**
     * 计算两个非负整数p和q的最大公约数：
     * 若q是0，则最大公约数为p。
     * 否则，将p除以q得到余数r，p和q的最大公约数即为q和r的最大公约数。
     *
     * @param p p
     * @param q q
     * @return a
     */
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
