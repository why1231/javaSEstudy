package main.datasutructure;

public class List {
    int data = 0;
    List next = null;
    int index = 0;

    public List(int data) {
        this.data = data;
    }

    public List() {

    }

    public boolean isEmpty() {
        return this.next == null;
    }

    public int add(List head, List node) {
        List temp = head;
        while (true) {
            if (null == temp.next) {
                temp.next = node;
                return node.index;
            }
            temp = temp.next;
            index++;
        }
    }

    public List remove(List head, int index) {
        int count = 0;
        if (isEmpty()) {
            throw new RuntimeException("当前链表为空");
        }
        List temp = head;
        while (true) {
            if ((index - 1) == count) {
                if (null != temp.next) {
                    List result = temp.next;
                    if (temp.next.next == null) {
                        temp.next = null;
                    } else {
                        temp.next = temp.next.next;
                    }
                    return result;
                }
            }else {
                throw new RuntimeException("下标索引已溢出");
            }
            temp = temp.next;
            count++;
        }
    }

    public void list(List head) {
        if (head.isEmpty()) {
            throw new RuntimeException("当前链表为空");
        }
        List temp = head;
        while (true) {
            if (null == temp.next) {
                return;
            }
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
