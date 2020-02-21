package patterns.pizzas;

public abstract class Pizza {
    protected boolean isPrepared = false;
    private boolean isBaked = false;
    private boolean isCut = false;
    private boolean isBoxed = false;
    private String name;

    public abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPrepared() {
        return isPrepared;
    }

    public boolean isBoxed() {
        return isBoxed;
    }

    public boolean isCut() {
        return isCut;
    }

    public boolean isBaked() {
        return isBaked;
    }

    public void bake() {
        isBaked = true;

    }

    public void cut() {
        isCut = true;
    }

    public void box() {
        isBoxed = true;
    }
}