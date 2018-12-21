package FactoryPattern;

public abstract class Pizza {
    private String name;
    private String daugh;
    private String sauce;

    public Pizza(String name){
        this.name=name;
    }
    public void box(){
        System.out.println("box");
    }

    public void cut(){
        System.out.println("cut");
    }

    public void bake(){
        System.out.println("bake");
    }

    public abstract void prepare();

    public void setDaugh(String daugh) {
        this.daugh = daugh;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}
