import java.util.Scanner;

public class DictionaryCommandline {
    DictionaryManagement dictionaryManagement = new DictionaryManagement();
    Dictionary dictionary = new Dictionary();

    public void showAllWord(Dictionary dictionary) {
        System.out.format("%-5s %-50s %-50s \n",
                            "No", "English", "Vietnamese");
        int i = 1;
        for (Word word : dictionary.listWord) {
            System.out.format("%-5s %-50s %-50s \n",
                                i, word.getWord_target(), word.getWord_explain());
            i++;

        }
    }

    public void dictionarySearcher(Dictionary dictionary) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập từ cần tra cứu: ");
        String findWord = sc.nextLine();
        int i = 0;
        System.out.format("%-5s %-50s %-50s \n",
                "No", "English", "Vietnamese");
        for (Word word : dictionary.listWord) {
            if (word.getWord_target().contains(findWord)) {
                System.out.format("%-5s %-50s %-50s \n",
                        i + 1, word.getWord_target(), word.getWord_explain());
            }
            i++;
        }
    }

    public void dictionaryBasic() {
        System.out.println("Danh sách các chức năng: ");
        System.out.println("1. Insert From Commanline");
        System.out.println("2. Show All Word");
        System.out.println("3. Dictionary Lookup");
        System.out.println("4. Exit");
        while (true) {
            System.out.print("\nChọn chức năng: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    dictionaryManagement.insertFromCommandline(dictionary);
                    break;
                case 2:
                    showAllWord(dictionary);
                    break;
                case 3:
                    dictionaryManagement.dictionaryLookup(dictionary);
                    break;
            }
            if (num == 4) {
                break;
            }
        }
    }

    public void dictionaryAdvance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sách các chức năng:");
        System.out.println("1. Insert From File");
        System.out.println("2. Insert From Commandline");
        System.out.println("3. Show All Words");
        System.out.println("4. Dictionary Lookup");
        System.out.println("5. Dictionary Searcher");
        System.out.println("6. Fix Word");
        System.out.println("7. Remove Word");
        System.out.println("8. Write To File");
        System.out.println("9: Exit");
        while (true) {
            System.out.print("\nChọn chức năng: ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    dictionaryManagement.insertFromFile(dictionary);
                    break;
                case 2:
                    dictionaryManagement.insertFromCommandline(dictionary);
                    break;
                case 3:
                    showAllWord(dictionary);
                    break;
                case 4:
                    dictionaryManagement.dictionaryLookup(dictionary);
                    break;
                case 5:
                    dictionarySearcher(dictionary);
                    break;
                case 6:
                    dictionaryManagement.fixWord(dictionary);
                    break;
                case 7:
                    dictionaryManagement.removeWord(dictionary);
                    break;
                case 8:
                    dictionaryManagement.writeToFile(dictionary);
                    break;
            }
            if (num == 9) {
                break;
            }
        }
    }
}
