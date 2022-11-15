package proxyPattern;

public class ScreenDisplay implements Display{
    @Override
    public void print(String content) {
        try{
            Thread.sleep(500); // 출력을 위한 준비작업
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(content);
    }
}
