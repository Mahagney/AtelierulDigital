package Lab4Generics;

public class Book implements CodedItem{
    private String code="code";
    static int index=0;

    public Book(){
        index++;
        code+=index;
    }

    @Override
    public String getCode() {
        return code;
    }
}
