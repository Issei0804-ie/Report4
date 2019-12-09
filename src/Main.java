public class Main {
    public static void main(String args[]){
        String str = null;
        try {
            str.length();
        }catch (NullPointerException e){
            System.out.println("ぬるぽ！");
            System.out.println(e.getMessage());
        }
    }
}
