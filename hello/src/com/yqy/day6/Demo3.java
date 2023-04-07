package com.yqy.day6;

import java.util.ArrayList;

class Movie{
    private String name;
    private double score;
    private String actor;

    public Movie(){

    }

    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Movie m1 = new Movie("《肖申克的救赎》" , 9.7 , "罗") ;
        Movie m2 = new Movie("《霸王别姬》" , 9.7 , "张国荣") ;
        Movie m3 = new Movie("《战狼》" , 10 , "吴京") ;

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        System.out.println(movies);

        for (int i = 0; i < movies.size(); i++) {
            Movie m =movies.get(i);
            System.out.println("电影名称："+m.getName());
            System.out.println("电影评分："+m.getScore());
            System.out.println("电影主演："+m.getActor());
            System.out.println("-------------------");
        }
    }
}
