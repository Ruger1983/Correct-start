package ru.correct.tracker;

/**
 * position - указатель ячейки для новой заявки
 * метод generateId - генерирует уникальный номера заявки
 * метод add - добавляет заявки в хранилище
 * метод replace - поиск заявки по id и замена данных с сохранением id
 * метод delete - удаляет ячейку массива с заявкой
 * метод findAll - выводит список всех имеющихся заявок
 * метод findByName - ищет заявку по имени
 * метод findById - ищет заявку по Id
 */

public class Tracker {

    private Item[] items = new Item[100];
    private int position = 0;
    long id = 0;

    private String generateId() {
        ++id;
        return String.valueOf(id);
    }

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    public void replace(String id, Item item) {
        for (int i = 0; i < position; i++) {
            if (id.equals(items[i].getId())) {
                item.setId(id);
                this.items[i] = item;
                break;
            }
        }
    }

    public void delete(String id) {
        for (int i = 0; i < items.length; i++) {
            if (id.equals(items[i].getId())) {
                items[i] = null;
                System.arraycopy(items, i + 1, items, i, items.length - i - 1);
                position--;
                break;
            }
        }
    }

    public Item[] findAll() {
        Item[] temp = new Item[position];
        int j = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                temp[j] = items[i];
                j++;
            }
        }
        return temp;
    }

    public Item[] findByName(String key) {
        int counter = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                continue;
            }
            if (key.equals(items[i].getName())) {
                counter++;
            }
        }
        if (counter == 0) {
            return null;
        }
        Item[] temp = new Item[counter];
        int j = 0;
        for (int i = 0; i < items.length; i++) {
            if (key.equals(items[i].getName())) {
                temp[j] = items[i];
                j++;
                if (j == counter) {
                    break;
                }
            }
        }
        return temp;
    }

    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < items.length; i++) {
            if (id.equals(items[i].getId())) {
                result = items[i];
                break;
            }
        }
        return result;
    }
}