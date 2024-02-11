package oo.lp2;

public enum Color {
    RED("#FF0000", "Vermelho"), GREEN("#00FF00","Verde"),
    BLUE("#0000FF", "Azul"), BLACK("#000000", "Preto");

    private String hexCode;
    private String ptValue;

    Color(String hexCode, String ptValue){
        this.hexCode = hexCode;
        this.ptValue = ptValue;
    }

    public String getHexCode(){
        return hexCode;
    }

    public String getPtValue(){
        return ptValue;
    }
}
