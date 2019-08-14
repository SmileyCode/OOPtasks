import Theme2.Line;
import Theme2.Point;
import Theme2.Review;
import Theme2.Task3.Departament;
import Theme2.Task3.Employee;
import Theme2.Task5.Album;
import Theme2.Task5.Track;
import Theme3.*;
import Theme3.Task5.Building;
import Theme3.Task5.Flat;
import Theme3.Task5.Floor;
import Theme5.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        House[] houses = {new House(1), new House(5), new House(23)};
        for (House i : houses)
            System.out.println(i.toString());

        Point[] points = {new Point(53,33), new Point(12, 65), new Point(1,5)};
        for (Point i : points)
            System.out.println(i.toString());

        Human[] humans = {new Human("Петя", 123), new Human("Вася", 160), new Human("Коля",195)};
        for(Human i : humans)
            System.out.println(i.toString());

        Review[] reviews = {new Review(169, "отличные задачи!"), new Review(102, "Хорошме задачи"), new Review(23, "Простые задачи")};
        for (Review i : reviews)
            System.out.println(i.toString());

        ManWithName[] men = {new ManWithName("Толя"), new ManWithName("Ваня"), new ManWithName("Женя")};
        men[0].setLastName("Толич");
        men[0].setSecondName("Анатолиевич");
        men[1].setSecondName("Дмитриевич");
        men[2].setLastName("Ложкин");
        for(ManWithName i : men)
            System.out.println(i.toString());

        //=================[ Блок 2 ]=====================

        Line[] lines = {new Line(new Point(1,3), new Point(23,8)), new Line(new Point(5,10), new Point(25,10)), new Line()};
        lines[2].setStart(lines[0].getStart());
        lines[0].getStart().setX(-lines[0].getStart().getX());
        lines[0].getStart().setY(-lines[0].getStart().getY());


        ManWithDad[] manWithDads = {new ManWithDad("Иван","Чудов"), new ManWithDad("Петр","Чудов"), new ManWithDad("Борис","Чудов")};
        manWithDads[1].setFather(manWithDads[0]);
        manWithDads[2].setFather(manWithDads[1]);
        for(ManWithName i : manWithDads)
            System.out.println(i.toString());


        //2.3
        Departament itOtdel = new Departament("IT отдел");
        Employee[] employees = {new Employee("Петров",itOtdel),new Employee("Козлов",itOtdel),new Employee("Сидоров",itOtdel)};
        itOtdel.setChief(employees[1]);
        for(Employee i : employees)
            System.out.println(i.toString());

        //2.4
        Review[] reviews1 = {new Review(169,"Отличные задачи"), new Review((5),"совершенно согласен с этим комментарием"), new Review(0,"что-то я ничего не понял")};
        reviews1[1].setParentReview(reviews[0]);
        reviews1[2].setParentReview(reviews1[1]);
        for (Review i : reviews1)
            System.out.println(i.toString());

        //2.5
        Album kuklovod = new Album("Металлов", "Кукловод");
        Album shosse = new Album("Асид", "Шоссе к ООП");
        Track[] tracks = {new Track("Состояние объектов"), new Track("Шоссе к ООП"), new Track("Одноразовый программист")};
        tracks[0].setAuthor("Янг");
        tracks[2].setAuthor("Бертон");
        tracks[0].setAlbum(shosse);
        tracks[1].setAlbum(shosse);
        tracks[2].setAlbum(kuklovod);
        for (Track i : tracks)
            System.out.println(i.toString());

        //=====[ БЛОК 3 ]
        //3.1
        ManWithManyNames[] manWithManyNames = {new ManWithManyNames(new String[]{"Эрих","Мария"}, "Чудов"), new ManWithManyNames(new String[]{"Петр"},"Чудов"), new ManWithManyNames(new String[]{"Жан","Клод"},"Чудов")};
        manWithManyNames[1].setFather(manWithManyNames[0]);
        manWithManyNames[2].setFather(manWithManyNames[1]);
        for(ManWithManyNames i : manWithManyNames)
            System.out.println(i.toString());

        //3.2
        StudentWithMarks vasya = new StudentWithMarks("Вася", new int[]{3, 4, 5});
        StudentWithMarks petya = new StudentWithMarks("Петя", vasya.getMarks());
        petya.setMarks(new int[]{5, petya.getMarks()[1], petya.getMarks()[2]});
        System.out.println(vasya.toString());
        System.out.println(petya.toString());
        StudentWithMarks andrey = new StudentWithMarks("Андрей", vasya.getMarks());
        vasya.setMarks(new int[]{5, 3, 3});
        System.out.println(andrey.toString());

        //3.3
        StudentWithClasses vasya1 = new StudentWithClasses("Вася",new String[]{"Информатика","Математика","Физика"},new int[]{3,4,5});
        vasya1.setClass(2,"Английский язык",4);
        vasya1.showMarks();
        StudentWithClasses petya1 = new StudentWithClasses("Петя", vasya1.getLessons().clone(), vasya1.getMarks().clone());
        petya1.setClass(1,"Математика",5);
        petya1.showMarks();
        vasya1.showMarks();

        //3.4
        shosse.addTrack(tracks[0]);
        shosse.addTrack(tracks[1]);
        tracks[0].getAlbum().showTracks();

        //3.5
        Building building = new Building();
        building.addFloor(new Floor());
        building.getFloors().get(0).addFlat(new Flat(10,1));
        building.addFloor(new Floor());
        building.getFloors().get(1).addFlat(new Flat(24,2));
        building.getFloors().get(1).addFlat(new Flat(44,3));
        building.getFloors().get(1).addFlat(new Flat(10,4));
        building.addFloor(new Floor());
        building.getFloors().get(2).addFlat(new Flat(74,5));
        building.getFloors().get(2).addFlat(new Flat(65,6));
        building.printInfo();

        //3.6
        City[] cities = {new City("A"),new City("B"),new City("C"),new City("D"),new City("E"),new City("F")};
        cities[0].addTrace(cities[1],5);
        cities[0].addTrace(cities[5],1);
        cities[0].addTrace(cities[3],6);
        cities[1].addTrace(cities[0],5);
        cities[1].addTrace(cities[2],3);
        cities[2].addTrace(cities[1],3);
        cities[2].addTrace(cities[3],4);
        cities[3].addTrace(cities[2],4);
        cities[3].addTrace(cities[4],2);
        cities[3].addTrace(cities[0],6);
        cities[4].addTrace(cities[5],2);
        cities[5].addTrace(cities[1],1);
        cities[5].addTrace(cities[4],2);
        System.out.println(cities[0].showTraces(cities[1]));
        //System.out.println(cities[0]);

        //3.7
        Publication publication = new Publication("Заголовок", "Текст");
        publication.addTag("Тэг1");
        publication.addTag("Тэг2");
        publication.addReview(new Review(123,"Хорошая статья"));
        publication.addReview(new Review(140,"Согласен"));
        publication.getReviews().get(1).setParentReview(publication.getReviews().get(0));
        publication.showPublication();

        //==== [ БЛОК 4 ]
        //4.1
        Pistol pistol = new Pistol(3);
        for (int i = 0; i < 5; i++) {
            pistol.shoot();
        }

        //4.2
        Cat barsik = new Cat("Барсик");
        System.out.println(barsik.toString());
        barsik.mur();
        barsik.mur(3);

        //4.3
        Line newLine = new Line(new Point(1,1), new Point(10,15));
        System.out.println(newLine.length());

        //4.4
        BrokenLine brokenLine = new BrokenLine();
        brokenLine.addLine(new Line(new Point(1,5), new Point(2,8)));
        brokenLine.addLine(new Line(new Point(2,8), new Point(5,3)));
        System.out.println(brokenLine.length());
        brokenLine.addLine(new Line(new Point(5,3), new Point(5,15)));
        brokenLine.addLine(new Line(new Point(5,15), new Point(8,10)));
        System.out.println(brokenLine.length());

        //4.5
        Square square = new Square(new Point(4,4),5);
        BrokenLine brokenLine1 = square.makeBrokenLine();

        //4.6
        Singer singer = new Singer("Певец", "текст песни");
        singer.sing();

        //4.7
        building.getFloors().get(2).getArea();
        building.findFlat(2);
        building.getFloors().get(1).getFlatNumbers();

        //4.8
        StudentWithMarks vasya2 = new StudentWithMarks("Вася", new int[]{3, 4, 5});
        StudentWithMarks petya2 = new StudentWithMarks("Петя", new int[]{5, 5, 5});
        System.out.println(vasya2.median());
        System.out.println(vasya2.onlyGoods());
        System.out.println(petya2.onlyGoods());
    }
}
