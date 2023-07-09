package HomeWork.Part_2.B_Game;

import java.lang.reflect.*;

public class Homework {
    public static final String ANSI_RESET   = "\u001B[0m";
    public static final String ANSI_BLACK   = "\u001B[30m";
    public static final String ANSI_RED     = "\u001B[31m";
    public static final String ANSI_GREEN   = "\u001B[32m";
    public static final String ANSI_YELLOW  = "\u001B[33m";
    public static final String ANSI_BLUE    = "\u001B[34m";
    public static final String ANSI_PURPLE  = "\u001B[35m";
    public static final String ANSI_CYAN    = "\u001B[36m";
    public static final String ANSI_WHITE   = "\u001B[37m";

    public static void main(String[] args) {
        Render render = new Render();

        // ========== ЗДАНИЯ ==========
        Building building1 = new Building(100);
        building1.setCurrentHealthPoint(74);

        // ========== ГЕРОИ ==========
        Hero hero1 = new Hero(100, 100);
        hero1.setCurrentHealthPoint(66);
        hero1.setCurrentManaPoint(33);

        // ========== НЕЙТРАЛЬНЫЕ ==========
        Neutral neutral1 = new Neutral(100);
        neutral1.setCurrentHealthPoint(15);

        // В консоли должно быть примерно так: Текущий уровень здоровья: 50, максимальный уровень здоровья: 100

        // ========== ЗДАНИЯ ==========
        System.out.println("Здание 1");
        render.showIndicator(building1);

        // ========== ГЕРОИ ==========
        System.out.println("Герой 1");
        render.showIndicator(hero1);

        // ========== НЕЙТРАЛЬНЫЕ ==========
        System.out.println("Нейтральный 1");
        render.showIndicator(neutral1);

        System.out.println(ANSI_RED + "This text has a red background but default text!" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "This text has a green background but default text!" + ANSI_RESET);
    } // End Main

    static class Render {
        /**
         * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
         * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
         * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
         */
        public void showIndicator(Object object) {
            // Не должно быть упоминания конкретных классов!!!
            if (object != null) {
                Class<?> ob = object.getClass();
                for (int i = 0; i < ob.getDeclaredMethods().length; i++) {
                    Method method = ob.getDeclaredMethods()[i];
                    switch (method.getName()) {
                        case "getMaxHealthPoint" -> {
                            try {
                                Object res = method.invoke(object);
                                System.out.println(getColor((int)res) + "Максимальный уровень здоровья: " + res + ANSI_RESET);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        case "getCurrentHealthPoint" -> {
                            try {
                                Object res = method.invoke(object);
                                System.out.println(getColor((int)res) + "Текущий уровень здоровья: " + res + ANSI_RESET);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        case "getMaxManaPoint" -> {
                            try {
                                Object res = method.invoke(object);
                                System.out.println(getColor((int)res) + "Максимальный уровень маны: " + res + ANSI_RESET);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        case "getCurrentManaPoint" -> {
                            try {
                                Object res = method.invoke(object);
                                System.out.println(getColor((int)res) + "Текущий уровень маны: " + res + ANSI_RESET);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    } // end switch
                }
            }
        } // end showIndicator
        private String getColor(int res){
            String color = ANSI_GREEN;
            if (res < 75) color = ANSI_YELLOW;
            if (res < 50) color = ANSI_PURPLE;
            if (res < 25) color = ANSI_RED;
            return color;
        }

    } // End class Render

    static class Building implements HealthImpl {
        private final int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья
        public Building(int maxHealthPoint) {
            this.maxHealthPoint = maxHealthPoint;
            this.currentHealthPoint = maxHealthPoint;
        }
        public void setCurrentHealthPoint(int currentHealthPoint) {
            this.currentHealthPoint = currentHealthPoint;
        }

        // FIXME: 29.06.2023 Дописать нужное
        @Override
        public int getCurrentHealthPoint() {
            return currentHealthPoint;
        }

        @Override
        public int getMaxHealthPoint() {
            return maxHealthPoint;
        }
    } // End class Building

    static class Hero implements HealthImpl, ManaImpl {
        private final int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья
        private final int maxManaPoint; // максимально количество магический энергии
        private int currentManaPoint; // текущее количество магический энергии
        public Hero(int maxHealthPoint, int maxManaPoint) {
            this.maxHealthPoint = maxHealthPoint;
            this.maxManaPoint = maxManaPoint;

            this.currentHealthPoint = maxHealthPoint;
            this.currentManaPoint = maxManaPoint;
        }
        public void setCurrentHealthPoint(int currentHealthPoint) {
            this.currentHealthPoint = currentHealthPoint;
        }
        public void setCurrentManaPoint(int currentManaPoint) {
            this.currentManaPoint = currentManaPoint;
        }

        // FIXME: 29.06.2023 Дописать нужное
        @Override
        public int getCurrentHealthPoint() {
            return currentHealthPoint;
        }
        @Override
        public int getMaxHealthPoint() {
            return maxHealthPoint;
        }
        @Override
        public int getCurrentManaPoint() {
            return currentManaPoint;
        }
        @Override
        public int getMaxManaPoint() {
            return maxManaPoint;
        }
    } // End class Hero

    static class Neutral implements HealthImpl {
        private final int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья
        public Neutral(int maxHealthPoint) {
            this.maxHealthPoint = maxHealthPoint;
            this.currentHealthPoint = maxHealthPoint;
        }
        public void setCurrentHealthPoint(int currentHealthPoint) {
            this.currentHealthPoint = currentHealthPoint;
        }
        // FIXME: 29.06.2023 Дописать нужное
        @Override
        public int getCurrentHealthPoint() {
            return currentHealthPoint;
        }
        @Override
        public int getMaxHealthPoint() {
            return maxHealthPoint;
        }
    } // End class Neutral
}