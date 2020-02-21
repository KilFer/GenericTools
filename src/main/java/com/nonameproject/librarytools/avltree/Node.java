package com.nonameproject.librarytools.avltree;

import java.util.UUID;

public class Node
{
    public Node left, right;
    public int height = 1;
    public long weight;
    public String id;
    public Object object;

    public Node(long pWeight)
    {
        this.weight = pWeight;
        this.id = UUID.randomUUID().toString();
    }

    public Node(long pWeight, Object pObject)
    {
        this.weight = pWeight;
        this.id = UUID.randomUUID().toString();
        this.object = pObject;
    }
}