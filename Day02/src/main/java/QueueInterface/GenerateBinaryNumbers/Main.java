package QueueInterface.GenerateBinaryNumbers;
public class Main {
    public static void main(String[] args) {
        int num=5;
        BinaryNumberGenerate number=new BinaryNumberGenerate(num);
        System.out.println(number.generateBinaryNum());
    }
}
