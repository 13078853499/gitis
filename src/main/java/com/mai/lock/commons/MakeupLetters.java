package com.mai.lock.commons;

import java.util.ArrayList;
import java.util.List;

public class MakeupLetters {

    /**
     * 递归实现多数组排列组合
     * @param dataList 字母集合
     * @param index
     * @param resultList
     * @return
     */
    public static List<String[]> makeupLetters(List<String[]> dataList, int index, List<String[]> resultList) throws Exception {
        if (index == dataList.size()) {
            return resultList;
        }

        List<String[]> resultList0 = new ArrayList<String[]>();
        if (index == 0) {
            //第一列数组默认有多少个字母就添加多少个排列数据
            String[] dataArr = dataList.get(0);
            for (String s : dataArr) {
                resultList0.add(new String[]{s});
            }
        } else {
            String[] dataArr = dataList.get(index);
            for (String[] dataArr0 : resultList) {
                for (String s : dataArr) {
                    //复制数组并扩充新元素
                    String[] dataArrCopy = new String[dataArr0.length + 1];
                    System.arraycopy(dataArr0, 0, dataArrCopy, 0, dataArr0.length);
                    dataArrCopy[dataArrCopy.length - 1] = s;
                    //追加到结果集
                    resultList0.add(dataArrCopy);
                }
            }
        }
        return makeupLetters(dataList, ++index, resultList0);
    }

}
