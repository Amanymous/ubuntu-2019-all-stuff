package com.amanymous;

public interface player {
    abstract void play();
}
class child implements player{
    @Override
    public void play() {
        System.out.println("play to do some physical activity");
    }
}
class musician implements player{
    @Override
    public void play() {
        System.out.println("play to do some physical activity");
    }
}
class actor implements player{
    @Override
    public void play() {
        System.out.println("play to do some physical activity");
    }
}
