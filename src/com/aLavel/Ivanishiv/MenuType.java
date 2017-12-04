package com.aLavel.Ivanishiv;

public enum MenuType {
    MAIN_MENU ("Добавте животное из списка: \n 1.Alpaka \n 2.Crocodile \n 3.Elephant \n 4.Lion "),
    ZOO_MENU("Введите имя зоопарка"),
    ZOO_CHOICE_MENU("Выберете способ создания зоопарка: \n 1.Из файла \n 2.Ручками"),
    ADD_ZOO_ANIMAL ("Хотите добавить животных в зоопарк \n 1.Да \n 2.Нет"),
    ADD_ANIMAL_NAME ("Введите имя животного"),
    ADD_ANIMAL_AGE ("Введите возраст животного"),
    SHOW_ANIMAL("Хотите посмотреть животное: \n 1.Да \n 2.Нет ");

    private String menuLine;

    MenuType(String menu) {
        this.menuLine = menu;
    }

    public String getMenuLine() {
        return menuLine;
    }

    public void setMenuLine(String menuLine) {
        this.menuLine = menuLine;
    }
}
