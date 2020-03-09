package com.mai.lock.commons;

import java.util.Scanner;

public class CheckDigits {

    /**
     * 判断输入数字是否合法
     * @param scan 从键盘输入的数据
     * @return
     */
    public static String checkDigits(Scanner scan) throws Exception {
        String digits = "";
        //判断输入数字是否合法
        while (true) {
            digits = scan.next();
            if (!digits.matches("[0-9]{1,2}")) {
                System.out.println("输入不合法！只能输入0-99的整数数字,请重新输入：");
            } else {
                break;
            }
        }
        return digits;
    }

}
