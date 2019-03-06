package com.demo.doublelink;

public class DoubleLink<T> {

    public DNode<T> mHead;

    public int mCount;

    private class DNode<T>{
        public DNode prev;
        public DNode next;
        public T value;

        public DNode(T value , DNode prev , DNode next){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
    public DoubleLink(){
        mHead = new DNode(null,null,null);
        mHead.prev = mHead.next = mHead;
        mCount = 0;
    }

    public void appendLast(T t){
        DNode node = new DNode(t , mHead.prev , mHead);
        mHead.prev.next = node;
        mHead.prev = node;
        mCount++;
    }
}
