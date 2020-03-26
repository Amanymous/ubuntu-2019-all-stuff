public class queue {
    public static void main(String[] args) {
//        intq q=new intq();
//        q.enqueue(3);
//        q.enqueue(6);
//        q.enqueue(9);
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
        //output:3,6,9

//        for showall
//        q.showAll();

//        output will be same as upper



        Personqueue q=new Personqueue();
        q.enqueue(new Person("aman","272"));
        q.enqueue(new Person("mubashir","266"));
        q.showAll();
//        output:name:amanroll no:272
// name:mubashirroll no:266

    }
}
