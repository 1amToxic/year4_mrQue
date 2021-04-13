package adapter;

public class TranslatorAdapter implements VietnameseTarget{
    private JapaneseAdaptee japaneseAdaptee;

    public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
        this.japaneseAdaptee = japaneseAdaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading words ....");
        String vietnamese = this.translate(words);
        japaneseAdaptee.receive(vietnamese);
    }
    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}
