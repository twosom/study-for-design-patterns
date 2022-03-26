package com.icloud.prototype.after;

import java.util.Objects;

public class GithubIssue implements Cloneable {

    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public void setRepository(GithubRepository repository) {
        this.repository = repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d", this.repository.getUser(), this.repository.getName(), this.id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        var repository = new GithubRepository();
        repository.setUser(this.getRepository().getUser());
        repository.setName(this.getRepository().getName());

        var githubIssue = new GithubIssue(repository);
        githubIssue.setId(this.getId());
        githubIssue.setTitle(this.getTitle());
        return githubIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return getId() == that.getId() && Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getRepository(), that.getRepository());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getRepository());
    }
}
