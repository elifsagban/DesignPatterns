package iterator;


import java.util.Iterator;

import java.util.Iterator;

public class ItemRepository {
    private String[][] items = {{"item1", "item2", "item3", "item4"},
            {"item5", "item6"},
            {"item7", "item8", "item9"}};

    public Iterator getIterator() {
        return new ItemIterator();
    }

    private class ItemIterator implements Iterator {

        private int present_row = 0;
        private int present_column = 0;

        @Override
        public boolean hasNext() {
            if (present_row + 1 == items.length) {
                return present_column < items[present_row].length;
            }
            return present_row < items.length;
        }

        @Override
        public Object next() {
            if (present_column == items[present_row].length) {
                present_column = 0;
                present_row++;
            }
            return items[present_row][present_column++];
        }
    }

    public static void main(String... args){
        ItemRepository itemRepository = new ItemRepository();
        Iterator iterator = itemRepository.getIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}