package Oct.ex_11102024.police;

public class Cop {
    private int gun;
    private String idCard;

    protected Cop(int gun) {
        this.gun = gun;
    }

    protected void canIshoot(){
        System.out.println("Yes, you can");
    }
}
