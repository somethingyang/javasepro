package com.yqy.day5;

class Movie{
    private String name;
    private double score;
    private String actor;

    public Movie() {
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
public class Demo2 {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("长津湖",9.7,"吴京");
        movies[1] = new Movie("我和我的父亲",9.6,"吴京");
        movies[2] = new Movie("扑水少年",9.5,"王川");

        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("电影名："+m.getName());
            System.out.println("评分："+m.getScore());
            System.out.println("演员："+m.getActor());
            System.out.println("-----------------");
        }
    }
}
