import java.util.*;

public class Main {
    public static void main(String[] args)
    {
//        ArrayList arrayList=new ArrayList();
//        //System.out.println(arrayList.size());
//        arrayList.add(12);
//        arrayList.add(55);
//        arrayList.add("utku");
//        arrayList.add(2,96);
//        arrayList.addLast(55);
//        arrayList.contains(55);
//        arrayList.remove(3);
//        for (int i=0;i<arrayList.size();i++)
//        {
//            System.out.println(arrayList.get(i));
//        }
//        System.out.println(arrayList.clone());
//        System.out.println(arrayList.getFirst());
//        System.out.println(arrayList.getLast());
//        System.out.println(arrayList.indexOf("utku"));
//        System.out.println(arrayList.set(3,69));
//        Object[]  a=arrayList.toArray();
//        for (int i=0; i<a.length;i++) {
//            System.out.println(a[i]);
//        }
//        for (Object o:arrayList)
//        {
//            System.out.println(Integer.parseInt(o.toString()));
//        }
        //linkedlist
//        LinkedList linkedList=new LinkedList();
//        linkedList.add(65);
//        linkedList.add(96);
//        linkedList.add(32);
//        linkedList.add(21);
//        linkedList.add(45);
//        System.out.println(linkedList.getLast());
//        System.out.println(linkedList.getFirst());
//        linkedList.offer(65);
//        System.out.println(linkedList.peek());
//        System.out.println(linkedList.pop());
//        Iterator iterator=linkedList.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.print(" "+iterator.next());
//        }
//        System.out.println(linkedList);
//
//        LinkedList linkedList1=new LinkedList();
//        linkedList.add("uchbbduv");
//        linkedList.add("jhczbzucb");
//        linkedList.add("jiddjksud");
//        linkedList.add("jsdjkdsj");
//        linkedList.add("jidjksdj");
//        linkedList1.addAll(linkedList);
//        System.out.println(linkedList1);

        //Hashset
//        HashSet <Integer> hashSet=new HashSet<Integer>();
//        hashSet.add(65);
//        hashSet.add(89);
//        hashSet.add(69);
//        hashSet.add(32);
//        hashSet.add(45);
//        hashSet.parallelStream();
//        System.out.println(hashSet);
//        for(Integer i:hashSet)
//        {
//            System.out.print(i+" ");
//        }
//        hashSet.parallelStream().forEach(number-> System.out.println(number + " " + Thread.currentThread().getName()));
//        Iterator iterator=hashSet.iterator();
//        while(iterator.hasNext())
//        {
//          System.out.print(" "+iterator.next());
//        }
//
//
//        //initialization of list/array list using aslist method in Arrays class
//        List <Integer> list= Arrays.asList(45,52,65,96,89);
//         Iterator iterator1= list.iterator();
//         while (iterator1.hasNext())
//         {
//             System.out.println(iterator1.next());
//         }
//
//         //for array list
//        ArrayList<Integer> arrayList1= new ArrayList<>(list);
//        //or  arrayList1.addAll(list);
//        System.out.println(arrayList1);
//
//        //Initializing arraylist using double braces that is anonymous inner class.
//        ArrayList<Integer> arrayList2= new ArrayList<Integer>()
//        {{
//           add(76);
//           add(65);
//        }};
//        System.out.println(arrayList2);
//
//        //remove duplicates from this list
//        List <Integer> list1= Arrays.asList(45,52,65,96,89,45);
//        System.out.println(list1);
//        Set <Integer> set= new HashSet<>(list1);
//        System.out.println(set);
//        //sorting a list
//        Collections.sort(list1);
//        System.out.println(list1);


//sorting on the basis of name as String class as compare to method as well

        //  public int compareTo(Object o) {
        // return name.compareTo(((Student)o).name);
        //OR
//        if (name.compareTo((Student)o).name==0)
//            return  0;
//        else if(name.compareTo(((Student)st).name)>0)
//            return 1;
//        else return -1;
//    }

  //      public int compareTo(Object st)
   //     {
    //        return new Integer ((this.grade).compareTo(((Student)st).getGrade()));
            //OR
            //if (id==compareTo((Student)st).id)
//            return  0;
//        else if(id.compareTo(((Student)st).id)
//            return 1;
//        else return -1;
//    }
    //    }
   // }




        //to sort a user defined object/class use a comparable interface
        //ArrayList<Student>studentArrayList=(ArrayList<Student>) Arrays.asList(new Student(78,"sdsdf","C+"), new Student(98,"usb","A-"));
       // ArrayList<Student> studentArrayList=new ArrayList<>()
       // {{
//            add(new Student(78,"USB",90));
//            add(new Student(41,"Utkarsh", 96));
//            add(new Student(45,"Akash", 85));
//            add(new Student(4,"Swapnil", 80));
//        }};
        //Collections.sort(studentArrayList);
        //System.out.println(studentArrayList);


        //Using list and queue methods of linked list
        List linkedlist1= new LinkedList();
        linkedlist1.add(45);
        linkedlist1.add(5);
        linkedlist1.add(50);linkedlist1.add(10);linkedlist1.add(23);

        //the following method is deprecated to remove the specific object
        //linkedlist1.remove(new Integer(5));

        //linkedlist1.addLast(52);
        //linkedlist1.addFirst(89);
        //System.out.println(linkedlist1.contains(99));
//        for(Object o:linkedlist1)
//        {
//            System.out.print(" "+o);
//        }

//        Queue<Integer> linkedlist2= new LinkedList<Integer>();
//        linkedlist2.offer(55);
//        linkedlist2.offer(96);
//        linkedlist2.offer(9000);
//        linkedlist2.offer(69);
//        linkedlist2.offer(1);
//        System.out.println(linkedlist2.peek());
//        System.out.println(linkedlist2.poll());
//        for(Integer a: linkedlist2)
//        {
//            System.out.print(" "+a);
//        }
//
  //      ListIterator listIterator= linkedlist1.listIterator();
////        Iterator it= linkedlist1.iterator();
//        while(listIterator.hasNext())
//        {
//            System.out.print(" "+listIterator.next());
//        }
//        System.out.println();
//        //list iterator reverses the given list
//        while (listIterator.hasPrevious())
//        {
//            System.out.print(" "+listIterator.previous());
//        }
//        Vector<Integer> v= new Vector<Integer>();
//        v.add(96);
//        v.add(80);
//        v.add(69);
//        v.add(101);
//        v.add(21);
//        v.add(21);
//        v.add(21);
//        v.add(21);
//        System.out.println(v.size());
//        System.out.println(v.capacity());
//        v.set(3,69);
//        System.out.println(v);
//       // v.setSize(5);
//        v.ensureCapacity(5);
//        System.out.println(v.remove(6));
//        System.out.println(v.getFirst());
//        System.out.println(v.equals(linkedlist1));


        //Stack
        Stack stack=new Stack();
        stack.push(42);
        stack.push(2);
        stack.push(14);
        stack.push(0);
        stack.push(8);
        stack.push(74);
        stack.push(36);
        stack.push(97);
        stack.push(37);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search(42));
        System.out.println(stack.empty());
        stack.add(89);
        System.out.println(stack);

    //Arraydeque
        ArrayDeque arrayDeque=new ArrayDeque();
        arrayDeque.add(87);
        arrayDeque.add(11);
        arrayDeque.add(36);arrayDeque.push(56);
        arrayDeque.push(5);
        arrayDeque.push(6);
        arrayDeque.push(1);
        System.out.println(arrayDeque);
        arrayDeque.removeFirst();
        System.out.println(arrayDeque.size());
        System.out.println(arrayDeque.offer(21));
        System.out.println(arrayDeque.removeLastOccurrence(11));
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.element());
        System.out.println(arrayDeque);
        Iterator it=arrayDeque.descendingIterator();
        while(it.hasNext())
        {
            System.out.print(" "+it.next());
        }
        System.out.println();
        System.out.println(arrayDeque.reversed());

        //Priority Queue

        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.add(56);
        priorityQueue.add(45);
        priorityQueue.add(62);
        priorityQueue.add(11);
        priorityQueue.add(32);
        priorityQueue.add(26);
        priorityQueue.add(87);
        System.out.println(priorityQueue.offer(789));
        priorityQueue.offer(963);
        priorityQueue.offer(65);
        System.out.println(priorityQueue.poll());
        //Max heap
        Comparator comparator=Comparator.reverseOrder();
        PriorityQueue priorityQueue1 =new PriorityQueue(comparator);
        priorityQueue1.add(56);
        priorityQueue1.add(45);
        priorityQueue1.add(62);
        priorityQueue1.add(11);
        priorityQueue1.add(1111);
        priorityQueue1.add(32);
        priorityQueue1.add(26);
        priorityQueue1.add(87);
        System.out.println(priorityQueue1.poll());
        System.out.println(priorityQueue1);


    }
}