package com.icloud.prototype.after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repositoryt = new GithubRepository();
        repositoryt.setUser("twosom");
        repositoryt.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repositoryt);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        var clone = (GithubIssue) githubIssue.clone();
        //TODO clone != githubIssue
        // clone.equals(githubIssue) => true
        // 새로운 인스턴스라서 다르지만 안의 내용은 같기 때문에 equals는 true로 나와야 한다.

        System.out.println(clone.getUrl());

        repositoryt.setUser("keesun");

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository());

        System.out.println(clone.getUrl());
    }
}
