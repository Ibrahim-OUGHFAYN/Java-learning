package partie4;

public class Exercice13{
    public static void main(String[] args) {

        String str = "Bonjour";
        char[] arr = str.toCharArray();

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        str = new String(arr);

        System.out.println(str);
    }
}