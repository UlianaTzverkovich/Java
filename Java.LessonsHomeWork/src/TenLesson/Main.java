package TenLesson;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

    public class Main {
        private final static Random ran = new Random();
        private final static Integer reference = 1000000;
        private final static Integer test = 1000;

        public static void main(String[] args) {
            task_1();
            task_2();
            task_3();
            task_4();
        }

        public static void task_1() {
            System.out.println(uniq(List.of(1, 1, 2, 3)));
        }

        public static void task_2() {
            LocalDateTime timer = LocalDateTime.now();
            List<Integer> arrayList = hydrate(new ArrayList<>());
            System.out.printf("%s : Время заполнения - %s;%n", arrayList.getClass().getName(), timer.until(LocalDateTime.now(), ChronoUnit.MILLIS));

            timer = LocalDateTime.now();
            extract(arrayList);
            System.out.printf("%s : Время выборки - %s;%n", arrayList.getClass().getName(), timer.until(LocalDateTime.now(), ChronoUnit.MILLIS));

            timer = LocalDateTime.now();
            List<Integer> linkedList = hydrate(new LinkedList<>());
            System.out.printf("%s : Время заполнения - %s;%n", linkedList.getClass().getName(), timer.until(LocalDateTime.now(), ChronoUnit.MILLIS));

            timer = LocalDateTime.now();
            extract(linkedList);
            System.out.printf("%s : Время выборки - %s;%n", linkedList.getClass().getName(), timer.until(LocalDateTime.now(), ChronoUnit.MILLIS));

            System.out.println("LinkedList основан на связном списке, ArrayList на массиве =>add и get быстрее в ArrayList.");
        }

        public static void task_3() {
            Map<User, Integer> map = new HashMap<>();
            map.put(new User("Tinky Winky"), 15);
            map.put(new User("Laa-Laa"), 10);
            map.put(new User("Po"), 5);

            Scanner in = new Scanner(System.in);
            System.out.print("Enter player name: ");
            String userName = in.next();

            Integer points = getPoints(map, userName);
            if (points == null)
                System.out.printf("Player \"%s\" not found", userName);
            else
                System.out.printf("The player %s have %s pounds.", userName, points);
        }

        public static void task_4() {
            Map<Integer, Integer> intMap = arrayToMap(new Integer[]{1, 5, 3, 7, 2, 2, 8, 6});
            System.out.println("\n" + intMap);

            Map<String, Integer> strMap = arrayToMap(new String[]{"a", "b", "a", "c", "a", "b", "a"});
            System.out.println(strMap);
        }

        private static <T> Collection<T> uniq(Collection<T> collection) {
            if (collection == null)
                throw new NullPointerException("Параметр не определен");

            return Set.copyOf(collection);
        }

        private static <T extends List<Integer>> T hydrate(List<Integer> list) {
            if (list == null)
                throw new NullPointerException("Параметр не определен");

            for (int i = 0; i < reference; i++) {
                list.add(ran.nextInt());
            }

            return (T) list;
        }

        private static void extract(List<?> list) {
            if (list == null)
                throw new NullPointerException("Параметр не определен");

            for (int i = 0; i < test; i++) {
                list.get(ran.nextInt(reference));
            }
        }

        private static Integer getPoints(Map<User, Integer> map, String userName) {
            final User user = map.keySet().stream().filter(set -> set.getName().equals(userName)).findFirst().orElse(null);
            if (user == null)
                return null;

            return map.get(user);
        }

        private static <K> Map<K, Integer> arrayToMap(K[] kMap) {
            Map<K, Integer> map = new HashMap<>();
            Arrays.stream(kMap).distinct().forEach(item -> map.put(item, (int) Arrays.stream(kMap).filter(k -> k.equals(item)).count()));

            return map;
        }
    }


