package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "��� ������ ���� � �����. ������� ������ ������.";
        if ("������, ���.".equals(question)) {
            rsl = "������, �����.";
        }
        if ("����.".equals(question)) {
            rsl = "�� ������ �������.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("������, ���.");
        System.out.println(rsl);
        rsl = DummyBot.answer("����.");
        System.out.println(rsl);
        rsl = DummyBot.answer("������� ����� 2 + 2?");
        System.out.println(rsl);
    }
}