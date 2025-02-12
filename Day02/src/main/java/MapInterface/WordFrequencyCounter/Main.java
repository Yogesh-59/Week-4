package MapInterface.WordFrequencyCounter;

public class Main {
    public static void main(String[] args) {
        String filePath="C:\\Users\\india\\OneDrive\\Desktop\\Week-4\\Day02\\src\\main\\java\\MapInterface\\WordFrequencyCounter\\Input.txt";
        FrequencyCounter frequency=new FrequencyCounter(filePath);
        frequency.frequencyCounter();
    }
}
