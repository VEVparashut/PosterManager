import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    String post1 = "Бладшот";
    String post2 = "Вперед";
    String post3 = "Отель Белград";
    String post4 = "Джентельмены";
    String post5 = "Человек-невидимка";
    String post6 = "Тролли. Мировой тур";
    String post7 = "Номер один";
    String post8 = "Аватар";
    String post9 = "Отряд самоубийц";
    String post10 = "Шрек";
    String post11 = "Терминатор";

    @Test
    public void findAllTest() {

        PosterManager manager = new PosterManager();

        manager.addPost(post1);
        manager.addPost(post2);
        manager.addPost(post3);
        manager.addPost(post4);
        manager.addPost(post5);
        manager.addPost(post6);
        manager.addPost(post7);
        manager.addPost(post8);
        manager.addPost(post9);
        manager.addPost(post10);

        String[] axpected = {post1, post2, post3, post4, post5, post6, post7, post8, post9, post10};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(axpected, actual);
    }

    @Test
    public void findAllLimitTest() {

        PosterManager manager = new PosterManager(11);

        manager.addPost(post1);
        manager.addPost(post2);
        manager.addPost(post3);
        manager.addPost(post4);
        manager.addPost(post5);
        manager.addPost(post6);
        manager.addPost(post7);
        manager.addPost(post8);
        manager.addPost(post9);
        manager.addPost(post10);
        manager.addPost(post11);

        String[] axpected = {post1, post2, post3, post4, post5, post6, post7, post8, post9, post10, post11};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(axpected, actual);
    }

    @Test
    public void findLastTest() {

        PosterManager manager = new PosterManager();
        manager.addPost(post1);
        manager.addPost(post2);
        manager.addPost(post3);
        manager.addPost(post4);
        manager.addPost(post5);
        manager.addPost(post6);
        manager.addPost(post7);
        manager.addPost(post8);
        manager.addPost(post9);
        manager.addPost(post10);

        String[] axpected = {post10, post9, post8, post7, post6, post5, post4, post3, post2, post1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(axpected, actual);
    }
}