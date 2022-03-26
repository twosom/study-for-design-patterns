package com.icloud.prototype.java;

import com.icloud.prototype.after.GithubIssue;
import com.icloud.prototype.after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("twosom");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행되는 것인가.");

        //TODO ModelMapper
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData map = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println("map = " + map);
    }

}
