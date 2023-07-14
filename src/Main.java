import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi chữ cái latin: ");
        String input = scanner.nextLine();

        List<String> vietnameseCharacters = findVietnameseCharacters(input);
        int count = vietnameseCharacters.size();

        System.out.println("Số lượng chữ cái Tiếng Việt có thể được tạo thành trong chuỗi: " + count);
        System.out.println("Các chữ cái Tiếng Việt: " + vietnameseCharacters);
    }

    private static List<String> findVietnameseCharacters(String input) {
        List<String> vietnameseCharacters = new ArrayList<>();
        vietnameseCharacters.add("ă=aw");
        vietnameseCharacters.add("â=aa");
        vietnameseCharacters.add("đ=dd");
        vietnameseCharacters.add("ê=ee");
        vietnameseCharacters.add("ô=oo");
        vietnameseCharacters.add("ơ=ow");
        vietnameseCharacters.add("ư=w");

        List<String> result = new ArrayList<>();

        for (String character : vietnameseCharacters) {
            String[] mapping = character.split("=");
            String vietnameseChar = mapping[0];
            String latinChar = mapping[1];

            if (input.contains(latinChar)) {
                result.add(vietnameseChar);
            }
        }

        return result;
    }
}
