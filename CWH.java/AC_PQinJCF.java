import java.util.*;
public class AC_PQinJCF {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args){
        //int value less --> High priority(Ascending order)
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        //We want to reverse to descending order
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // pq.add(7);
        // pq.add(1);
        // pq.add(6);
        // pq.add(4);

        // while(!pq.isEmpty()){
        //     System.out.print(pq.peek()+" ");
        //     pq.remove();
        // }

        PriorityQueue<Student> pq1 = new PriorityQueue<>();
        pq1.add(new Student("A", 5));
        pq1.add(new Student("B", 2));
        pq1.add(new Student("D",9));
        pq1.add(new Student("R", 0));

        while(!pq1.isEmpty()){
            System.out.println(pq1.peek().name+"->"+pq1.peek().rank);
            pq1.remove();
        }
    }
}
