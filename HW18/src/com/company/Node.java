package com.company;

public class Node<T> {
    private T value;
    private Node following;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getFollowing() {
        return following;
    }

    public void setFollowing(Node following) {
        this.following = following;
    }
}