package com.yqy.day6;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>();
        score.add(98);
        score.add(98);
        score.add(67);
        score.add(67);
        score.add(67);
        score.add(98);
        score.add(98);
        score.add(50);
        score.add(98);
        for (int i = 0 ; i < score.size() ; i++) {
            int j = score.get(i);
            if (j < 80){
                score.remove(i);
                i--;//删除一个元素后索引会自动前移，所以需要手动将索引减一，或者可以使用从后向前遍历的方法解决这个问题
            }
        }
        System.out.println(score);
    }
}
