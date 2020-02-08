package patterns.pizzas;

public abstract class Pizza {
    private boolean isPrepared = false;
    private boolean isBaked = false;
    private boolean isCut = false;
    private boolean isBoxed = false;

    public abstract String getName();

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

    public void prepare() {
        isPrepared = true;

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