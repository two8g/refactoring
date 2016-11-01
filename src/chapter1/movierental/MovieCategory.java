package chapter1.movierental;

/**
 * Created by two8g on 16-11-1.
 */
public enum MovieCategory {
    NORMAL(0), CHILDRENS(1), NEW_RELEASE(2);
    int category;

    MovieCategory(int category) {
        this.category = category;
    }
}
