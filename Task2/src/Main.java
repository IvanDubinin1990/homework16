public class Main {
    public static void main(String[] args) {
        //todo  код
        String text = "My favourite clothes are jeans, shirts and sweaters or jackets. " +
                "They are comfortable. And I can wear them in any weather. " +
                "Now I'm wearing jeans, a white shirt and a sweater. But tomorrow is my friend's birthday. " +
                "He invited me to the birthday party. So I shall be in my best. " +
                "My mother bought me a nice suit and new shoes. " +
                "We went to the shop together and chose a grey suit. " +
                "I tried it on. It was my size and suited me well. " +
                "I looked great. Mother paid money for the suit and we brought it home. " +
                "It's a pity I didn't try the shoes on. They were the wrong size. " +
                "So my mother changed them for the bigger size. And now they are OK. " +
                "Frankly speaking, I don't like shopping. There are more interesting things.";

        perenos(text);

    }

    //todo метод
    static boolean checkCountOfWords(String str) {

        boolean isCheck = true;
        int checkCountWords = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                checkCountWords++;
            }
        }
        if (checkCountWords < 99) {
            System.out.println("Количество слов не может быть меньше 100");
            isCheck = false;
        }
        return isCheck;
    }
    static boolean checkCorrectWords (String str) {
        final String ENGLISH_WORDS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz' ,.!?";
        boolean isCheck = true;
        for (int i = 0; i < str.length(); i++) {
            if (!ENGLISH_WORDS.contains(String.valueOf(str.charAt(i)))) {
                isCheck = false;
                System.out.println("Присутствует недопустимый символ");
            }
        }
        return isCheck;
    }

    static void perenos(String str1) {

        boolean isCheck1 = checkCountOfWords(str1);
        boolean isCheck2 = checkCorrectWords(str1);

        if (isCheck1 && isCheck2) {
            String s = str1.replaceAll("[,.]", " ");
            String[] s1 = s.split("[ ]+");

            for (String x : s1) {
                System.out.println(x);
            }
        }
    }
}
