package com.amanymous;

public interface Turner {
    abstract void turn();
}
class leaf implements Turner{
    public void turn(){
        System.out.println("changing colors.");
    }
}
class page implements Turner{
    public void turn(){
        System.out.println("going to next page.");
    }
}
class pancake implements Turner{
    public void turn(){
        System.out.println("flipping.");
    }
}

