public class rules implements trafficsignals, roadrule{
    @Override
    public void Green() {
        System.out.println("MEans you can go");
    }

    @Override
    public void Red() {
        System.out.println("Means you should stop");
    }

    @Override
    public void Yellow() {
        System.out.println("Means be ready");
    }

    @Override
    public void rodeforrule() {
        System.out.println("Speed limit is 60kmph");
    }
}
