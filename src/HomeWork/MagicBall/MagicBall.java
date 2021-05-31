package HomeWork.MagicBall;

import java.util.ArrayList;
import java.util.Random;

public class MagicBall {


    ArrayList<String> list = new ArrayList<>();
    public void answer(){
        list.add("It is certain (Бесспорно)");
        list.add("It is decidedly so (Предрешено)");
        list.add("Without a doubt (Никаких сомнений)");
        list.add("Yes — definitely (Определённо да)");
        list.add("You may rely on it (Можешь быть уверен в этом)");

        list.add("As I see it, yes (Мне кажется — «да»)");
        list.add("Most likely (Вероятнее всего)");
        list.add("Outlook good (Хорошие перспективы)");
        list.add("Outlook good (Хорошие перспективы)");
        list.add("Yes (Да)");

        list.add("Reply hazy, try again (Пока не ясно, попробуй снова)");
        list.add("Ask again later (Спроси позже)");
        list.add("Better not tell you now (Лучше не рассказывать)");
        list.add("Cannot predict now (Сейчас нельзя предсказать)");
        list.add("Concentrate and ask again (Сконцентрируйся и спроси опять)");

        list.add("Don’t count on it (Даже не думай)");
        list.add("My reply is no (Мой ответ — «нет»)");
        list.add("My sources say no (По моим данным — «нет»)");
        list.add("Outlook not so good (Перспективы не очень хорошие)");
        list.add("Very doubtful (Весьма сомнительно)");



        Random random = new Random();
        int i = random.nextInt(21);
        System.out.println(list.get(i));


    }



}
