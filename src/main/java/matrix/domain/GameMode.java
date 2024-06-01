package matrix.domain;

public enum GameMode {
    START, END;

    public boolean isStart() {
        return this == START;
    }
}
