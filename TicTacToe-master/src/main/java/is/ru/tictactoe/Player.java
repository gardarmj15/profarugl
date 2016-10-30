package is.ru.tictactoe;

public class Player {
    private String nickname;
    private String symbol;

    Player(String nickname, String symbol) {
        this.nickname = nickname;
        this.symbol = symbol.substring(0, 1);
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol.substring(0, 1);
    }

    public String getNickname() {
        return nickname;
    }

    public String getSymbol() {
        return symbol;
    }
}
