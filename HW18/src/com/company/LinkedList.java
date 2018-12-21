package com.company;


public class LinkedList<T> implements LinkedListInterface {
    private Node<T> headValue;
    private Node<T> lastValue;
    private int listSize = 0;

    @Override
    public void add(Object value) {
        Node node = new Node<T>();
        node.setValue(value);

        if (listSize != 0) {
            lastValue.setFollowing(node);
        } else {
            headValue = node;
        }
        lastValue = node;
        listSize++;
    }


    @Override
    public void add(Object elementValue, int index) {
        Node newNode = new Node();
        newNode.setValue(elementValue);
        newNode.setFollowing(get(index));
        if (index == 0) {
            headValue = newNode;
        } else {
            get(index - 1).setFollowing(newNode);
        }
        listSize++;
    }

    @Override
    public Node get(int index) {
        int count = 0;
        Node currentNode = headValue;
        while (count < index) {
            currentNode = currentNode.getFollowing();
            count++;
        }
        return currentNode;
    }


    @Override
    public int size() {
        return listSize;
    }

    @Override

    public boolean contains(Object element) {
        Node currentNode = headValue;
        while (currentNode.getFollowing() != null) {
            if (currentNode.getValue().equals(element)) {
                return true;
            }
            currentNode = currentNode.getFollowing();
        }
        return false;
    }



    @Override
    public void remove(int index) {
        Node node = get(index - 1);
        node.setFollowing(get(index).getFollowing());
        listSize--;
    }


    @Override
    public void addAll(LinkedListInterface elements) {
        Node node = get(size() - 1);
        node.setFollowing(elements.get(0));
        listSize += elements.size() - 1;
    }

    @Override
    public void addAll(LinkedListInterface elements, int index) {
        elements.get(elements.size() - 1).setFollowing(get(index));
        if (index == 0) {
            headValue = elements.get(0);
        } else {
            get(index - 1).setFollowing(elements.get(0));
        }
        listSize += elements.size() - 1;
    }
}