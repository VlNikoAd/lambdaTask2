package homework2.interfaces;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
