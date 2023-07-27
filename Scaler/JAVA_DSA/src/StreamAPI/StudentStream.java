package StreamAPI;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StudentStream {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        List<Integer>mark1= new ArrayList<>();
        mark1.add(50);
        mark1.add(60);
        mark1.add(70);
        List<Integer>mark2= new ArrayList<>();
        mark2.add(80);
        mark2.add(90);
        mark2.add(100);
        List<Integer>mark3= new ArrayList<>();
        mark3.add(300);
        mark3.add(50);
        mark3.add(40);
        Student stu1=new Student("sachin",25,mark1);
        students.add(stu1);
        students.add(new Student("sinha",30,mark2));
        students.add(new Student("samar",26,mark3));
        Student stu2 = new Student("samay" , 23, mark1);
        LinkedHashMap<Integer, String>
                map1 = students.stream()
                .collect(
                        Collectors
                                .toMap(
                                        Student::getAge,
                                        Student::getName,
                                        (x, y)
                                                -> x + ", " + y,
                                        LinkedHashMap::new));
        System.out.println(map1);
        HashMap<String,Integer>map ;
        map=students.stream().collect(Collectors.toMap(s->s.getName(),s->s.getAge(),(x,y)-> Integer.valueOf(x+","+y), ()->new HashMap<>()));
        System.out.println(map);


//        HashMap<String,List<Integer>>map= new LinkedHashMap<>();
//        for(Student stu:students){
//           map.put(stu.getName(),stu.getMarks());
//        }
//
//        Set<Map.Entry<String,List<Integer>>> entries= map.entrySet();
//        Iterator<Map.Entry<String,List<Integer>>>itr=entries.iterator();
//        while(itr.hasNext()){
//            Map.Entry<String,List<Integer>>entry=itr.next();
//            Integer maxMarks=Collections.max(entry.getValue());
//            System.out.println(entry.getKey()+" "+ maxMarks);
//        }

        /*List<List<Integer>>markslist=students.stream().map(s1->s1.getMarks()).collect(Collectors.toList());
        System.out.println(markslist);
        for(List<Integer>i:markslist){
            Integer maxMarks=Collections.max(i);
            System.out.println(maxMarks);
            Consumer<Integer>con= (m)->{
               if(m==maxMarks){
                   System.out.println(m);
               };

            };
            students.stream().filter(s->con)

        }*/

        /*System.out.println(map.values());
        Iterator<List<Integer>>itr=map.values().iterator();
        while(itr.hasNext()){
            System.out.println(Collections.max(itr.next()));
        }*/


        /*List<Student>student=students.stream().filter(s->s.age>25).collect(Collectors.toList());
        System.out.println(student);*/
//        List<Integer>salaries =students.stream().map(s1->s1.age).collect(Collectors.toList());
//        Comparator<Integer>comp1= Comparator.comparing(s1->s1);
//        Optional<Integer> salary= salaries.stream().max(comp1);
//        System.out.println(salary);
//        students.stream().filter(s1->s1.age==salary.get()).forEach(a1-> System.out.println(a1));
        /*Comparator <Student>comp= (s1,s2)->{
            return s2.age-s1.age;
        };
        List<Student>stu=students.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(stu);
        System.out.println(stu.get(0));*/
    }
}
