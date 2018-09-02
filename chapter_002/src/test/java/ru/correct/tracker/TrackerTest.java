package ru.correct.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void addNewItemTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", "1");
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void replaceItemTest() {
        Tracker tracker = new Tracker();
        Item first = new Item("1", "testDescription", "test1");
        tracker.add(first);
        Item second = new Item("2", "testDescription2", "test2");
        second.setId(first.getId());
        tracker.replace(first.getId(), second);
        assertThat(tracker.findById(first.getId()).getName(), is("testDescription2"));
    }

    @Test
    public void deleteItemTest() {
        Tracker tracker = new Tracker();
        Item first = new Item("1", "testDescription", "test1");
        tracker.add(first);
        Item second = new Item("2", "testDescription2", "test2");
        tracker.add(second);
        tracker.delete("2");
        assertThat(tracker.findAll()[0], is(first));
    }

    @Test
    public void findAllTest() {
        Tracker tracker = new Tracker();
        Item first = new Item("1", "testDescription", "test1");
        tracker.add(first);
        Item second = new Item("2", "testDescription2", "test2");
        tracker.add(second);
        assertThat(tracker.findAll()[1], is(second));
    }

    @Test
    public void findByNameTest() {
        Tracker tracker = new Tracker();
        Item first = new Item("1", "testDescription", "test1");
        tracker.add(first);
        Item second = new Item("2", "testDescription", "test2");
        tracker.add(second);
        Item third = new Item("3", "Description", "test3");
        tracker.add(third);
        Item[] expect = {first, second};
        Item[] result = tracker.findByName("testDescription");
        assertThat(result, is(expect));
    }

    @Test
    public void findByIdTest() {
        Tracker tracker = new Tracker();
        Item first = new Item("1", "testDescription", "test1");
        tracker.add(first);
        Item second = new Item("2", "testDescription2", "test2");
        tracker.add(second);
        Item third = new Item("3", "Description3", "test3");
        tracker.add(third);
        Item expect = third;
        Item result = tracker.findById("3");
        assertThat(result, is(expect));
    }
}
