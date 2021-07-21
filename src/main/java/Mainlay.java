import service.PercentService;

public class Mainlay {
    public static void main(String[] args) {
        PercentService percentService=new PercentService();
        System.out.printf(String.valueOf(percentService.openOrClose(333)));
    }
}
