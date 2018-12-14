package Lab4Generics;

public class Main {
    public static void main(String[] args){
        Deposit<Book> deposit= new Deposit<Book>();
        Book b1=new Book();
        Book b2=new Book();

        deposit.depositItem(b1);
        String itemCode= b2.getCode();
        String password = deposit.depositItem(b2);
        Book currentBook=deposit.getItem(password,itemCode);
        System.out.println(currentBook.getCode());

        Deposit<Shoes> sDeposit=new Deposit<Shoes>();
        Shoes s1=new Shoes();
        Shoes s2=new Shoes();

        sDeposit.depositItem(s1);
        String code2=s2.getCode();
        String pass2=sDeposit.depositItem(s2);
        Shoes currentShoes=sDeposit.getItem(pass2,code2);
        System.out.println(currentShoes.getCode());
     }
}
